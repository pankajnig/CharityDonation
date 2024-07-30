package com.donation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.donation.model.Root;
import com.donation.dao.AccountDao;
import com.donation.model.Account;
import com.donation.model.AccountDTO;
import com.donation.model.ApprovedConsent;
import com.donation.model.Balance;
import com.donation.model.ConsentResponse;
import com.donation.model.TokenResponse;
import com.donation.model.Userdetails;

@Service
@EntityScan( basePackages = {"com.donation.model"} )
public class AccountService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	public AccountDao accountdao;
	
	
	
public List<AccountDTO> getAccountDetails(String customerId) {
		
	List<AccountDTO> us =accountdao.getAccounts(customerId);
		if(us!= null) {
		return us;		
	}
		
		return null;
	}
	
	
	
	public String getToken() throws JSONException {
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		
		String body = "grant_type=client_credentials&client_id=b-MnxLBfATPcwFcQDA3RcdD-tHAb4xZPC2TD8Q0vDy8=&client_secret=0Ry5QYXcY5oJlso14LgtRCZ2YaE3PuQ4vVeLv6rYads=&scope=accounts";
		HttpEntity<String> request = 
			      new HttpEntity<String>(body,headers);
		
		JSONObject JsonObject = new JSONObject();
		JsonObject.put("id", 1);
		JsonObject.put("name", "John");
		ResponseEntity<TokenResponse> person = restTemplate.exchange("https://ob.sandbox.natwest.com/token", HttpMethod.POST,request, TokenResponse.class);
		System.out.println(person.getBody().getAccess_token());
		return person.getBody().getAccess_token();
	}
	
	public String getConsent(String accessToken) {
		
		
		
		HttpHeaders headers1 = new HttpHeaders();
		headers1.add("Content-Type", "application/json");
		headers1.add("Authorization", "Bearer "+accessToken);
		
		String body = "{\r\n"
				+ "  \"Data\": {\r\n"
				+ "    \"Permissions\": [\r\n"
				+ "      \"ReadAccountsDetail\",\r\n"
				+ "      \"ReadBalances\",\r\n"
				+ "      \"ReadTransactionsCredits\",\r\n"
				+ "      \"ReadTransactionsDebits\",\r\n"
				+ "      \"ReadTransactionsDetail\"\r\n"
				+ "    ]\r\n"
				+ "  },\r\n"
				+ "  \"Risk\": {}\r\n"
				+ "}";
		
		HttpEntity<String> request2 = 
			      new HttpEntity<String>(body,headers1);
		
		
		ResponseEntity<ConsentResponse> person = restTemplate.exchange("https://ob.sandbox.natwest.com/open-banking/v3.1/aisp/account-access-consents",  HttpMethod.POST,request2, ConsentResponse.class);
		return person.getBody().getData().getConsentId().toString();
	
	}
	
	public String approveConsent(String consentId) throws JSONException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		
		String url = "https://api.sandbox.natwest.com/authorize";
		
		String urlTemplate = UriComponentsBuilder.fromHttpUrl(url)
		        .queryParam("client_id", "{client_id}")
		        .queryParam("response_type", "{response_type}")
		        .queryParam("scope", "{scope}")
		        .queryParam("redirect_uri", "{redirect_uri}")
		        .queryParam("request", "{request}")
		        .queryParam("authorization_mode", "{authorization_mode}")
		        .queryParam("authorization_result", "{authorization_result}")
		        .queryParam("authorization_username", "{authorization_username}")
		        .queryParam("authorization_accounts", "{authorization_accounts}")
		        .encode()
		        .toUriString();
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("client_id", "b-MnxLBfATPcwFcQDA3RcdD-tHAb4xZPC2TD8Q0vDy8=");
		params.put("response_type", "code id_token");
		params.put("scope", "openid accounts");
		params.put("redirect_uri", "https://ac6a335b-409d-444a-83c1-a9001148dd6b.example.org/redirect");
		params.put("request", consentId);
		params.put("authorization_mode", "AUTO_POSTMAN");
		params.put("authorization_result", "APPROVED");
		params.put("authorization_username", "djefferson@ac6a335b-409d-444a-83c1-a9001148dd6b.example.org");
		params.put("authorization_accounts", "*");
		
		HttpEntity<String> request = 
			      new HttpEntity<String>(headers);
		
		ResponseEntity<ApprovedConsent> person = restTemplate.exchange(urlTemplate, HttpMethod.GET,request, ApprovedConsent.class,params);
		System.out.println(person.getBody().getRedirectUri());
		
		
		String code = person.getBody().getRedirectUri().substring(71, 107);
		
		return code;
	
	}
	
	public String getRefreshToken(String consentCode) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		
		String body = "client_id=b-MnxLBfATPcwFcQDA3RcdD-tHAb4xZPC2TD8Q0vDy8=&client_secret=0Ry5QYXcY5oJlso14LgtRCZ2YaE3PuQ4vVeLv6rYads=&redirect_uri=https://ac6a335b-409d-444a-83c1-a9001148dd6b.example.org/redirect&grant_type=authorization_code&code="+consentCode;
		HttpEntity<String> request = 
			      new HttpEntity<String>(body,headers);
		
		
		ResponseEntity<TokenResponse> person = restTemplate.exchange("https://ob.sandbox.natwest.com/token", HttpMethod.POST,request, TokenResponse.class);
		System.out.println(person.getBody().getAccess_token());
		return person.getBody().getAccess_token();
		
	}
	
	public List<Account> getAccounts(String token) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Authorization", "Bearer "+token);
		
		HttpEntity<String> request = 
			      new HttpEntity<String>(headers);
		
		
		ResponseEntity<Root> person = restTemplate.exchange("https://ob.sandbox.natwest.com/open-banking/v3.1/aisp/accounts", HttpMethod.GET,request, Root.class);
		System.out.println(person.getBody().getData().getAccountList().get(0).getAccountId());
		return person.getBody().getData().getAccountList();
		
	}
	
public List<Balance> getBalances(String token,String accountId) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Authorization", "Bearer "+token);
		
		HttpEntity<String> request = 
			      new HttpEntity<String>(headers);
		
		
		ResponseEntity<Root> person = restTemplate.exchange("https://ob.sandbox.natwest.com/open-banking/v3.1/aisp/accounts/"+accountId+"/balances", HttpMethod.GET,request, Root.class);
		//System.out.println(person.getBody().getData().getAccountList().get(0).getAccountId());
		return person.getBody().getData().getBalance();
		
	}

}
