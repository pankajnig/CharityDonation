<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <script type="text/javascript" src="/Scripts/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />
  <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
<link href="https://fonts.googleapis.com/css2?family=Source+Serif+4:wght@300&display=swap" rel="stylesheet">
    <title>Natwest</title>
  </head>
  <header>
    
  </header>
  <body>
    <nav class="navbar navbar-expand-lg navbar-light sticky-top" style="background-color: white; border-width: thin; border-color: gainsboro; ">
        <div class="container-fluid">
          <a class="navbar-brand" href="#" style="font-family: 'Source Serif 4', Light 300; color: rgb(20, 90, 219); text-decoration: underline; font-weight: bold;">
          <img height=50 width=200 alt="image"  src="https://seeklogo.com/images/N/natwest-logo-FA71B898B1-seeklogo.com.png"> 
 
          
          </a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent" style="justify-content: right;">
           <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/Donation/">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="Aboutus">About Us</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="true">
                    Services
                </a>
                 <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="">Loan</a></li>
                  <li><a class="dropdown-item" href="GST">Mortgages</a></li>
                 </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="Contactus">Contact us</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <section class="pt-4 pt-md-11">
      
      
      <div class="container" style="padding-bottom:10%">
  <div class="row">
    <div class="col" style="width:80%">
      <div>
            <div class="col-12 col-sm-6 col-md-8">
  
              <!-- Image -->
              <img alt="" class="img-fluid mb-6 mb-md-0 animate__bounceIn" src="<c:url value="/resources/images/5024147.jpg" />">
  
            </div>
            <div class="col-12 col-sm-6 col-md-12">
  
              <!-- Heading -->
              <h1 class="display-6 font-weight-light">Select Payment Type<br>
                <span class="text-primary">Select Any of the type of payment to send money to someone</span>
              </h1>
  
            </div>
          </div> <!-- / .row -->
        </div> <!-- / .container -->
    
    <div class="col" >
     <div class="container" >
          
        
        
		 <div style="width:100%;">
		 <div class="col-12 col-md-12 order-md-8">
      <div id="carddiv">
        <div class="col-sm-10" style="padding: 20px;"><div class="card" style="width: 100%;  margin-left: 10%"><div class="card-body"><h5 class="card-title">Faster Payment</h5><p class="card-text">${accountList[0].nickname}</p><p class="card-text">${accountList[0].balance}</p><a href="#" class="btn btn-primary" onclick="showdata(${accountList[0].accountId})">Select Account</a></div></div></div>
        <div class="col-sm-10" style="padding: 20px;"><div class="card" style="width: 100%;  margin-left: 10%"><div class="card-body"><h5 class="card-title">Future Dates Payment</h5><p class="card-text">${accountList[0].nickname}</p><p class="card-text">${accountList[0].balance}</p><button class="btn btn-primary" onclick="showdata(${accountList[0].accountId})">Select Account</button></div></div></div>
		<div>
		<form action="makepayment" method="post">
  <div style="padding-left:12%" class="form-group">
   
  <button style="width:200px" type="submit" class="btn btn-primary" value="/makepayment">Submit</button>
</div>
</form>
		</div>
</div>
      </div>
</div>
    
        </div>
    </div>
 
  </div>
  </div>

      
      
        
      <section style="background-color: #CCCCFF; border-top: gray;">
          <div class="row mx-5 d-flex justify-content-center">
              <div class="col mt-3 mb-3">
                  <div>
                      <h5>QUICK LINKS</h5>
                  </div>
                <ul class="list-group" style="border:0px">
                    <li class="list-group-item btl"><a class="flink" href=#>About Us</a></li>
                    <li class="list-group-item btl"><a class="flink" href=#>Contact Us</a></li>
                    <li class="list-group-item btl"><a class="flink" href=#>Terms of Service</a></li>
                    <li class="list-group-item btl"><a class="flink" href=#>Privacy Policy</a></li>
                  </ul>
              </div>
              <div class="col mt-3 mb-3">
                <div>
                    <h5>REGISTRATION</h5>
                </div>
              <ul class="list-group" style="border:0px">
                  <li class="list-group-item btl"><a class="flink" href=#>Loans</a></li>
                  <li class="list-group-item btl"><a class="flink" href=#>Mortgages</a></li>
                  <li class="list-group-item btl"><a class="flink" href=#>Cards</a></li>
                  </ul>
            </div>
            <div class="col mt-3 mb-3">
                <div>
                    <h5>SERVICES</h5>
                </div>
              <ul class="list-group" style="border:0px">
                  <li class="list-group-item btl"><a class="flink" href=#>Credit Card</a></li>
                  <li class="list-group-item btl"><a class="flink" href=#>Debit Card</a></li>
                  <li class="list-group-item btl"><a class="flink" href=#>Openbanking</a></li>
                  <li class="list-group-item btl"><a class="flink" href=#>Direct Payment</a></li>
                  <li class="list-group-item btl"><a class="flink" href=#>CIBA</a></li>
                </ul>
            </div>
            <div class="col mt-3 mb-3">
                <div>
                    <h5>CONTACT US</h5>
                </div>
              <ul class="list-group" style="border:0px">
                  <li class="list-group-item btl">Address: STREE-1, </li>
                  <li class="list-group-item btl">Ph : 0751 - 4343432</li>
                  <li class="list-group-item btl">Email: Pankaj.ngm@gmail.com</li>
                </ul>
            </div>
          </div>
      </section>

      <section style="height: 20px; background-color: gainsboro;">
          <div class="container">
              <div class="row">@Copyright Reserved for Natwest pvt ltd.</div>
          </div>
      </section>

      <style>
          .btl{
              border:0px;
              padding:1px;
              font-size: 13px;
              font-family: 'PT Sans Narrow', sans-serif;
              background-color: #CCCCFF;
          }
          .flink{
              color: black;
          }
      </style>


      <!-- <h1 class="animate__animated animate__bounce">An animated element</h1> -->

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
    <script src="https://cdn.linearicons.com/free/1.0.0/svgembedder.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <script>
      AOS.init();
    </script>
    <script>
function showdata(data) {
	fetch('http://localhost:8080/Donation/selectaccount', {
		  method: 'POST',
		  body: data
		}).then(res => res.json())
		  .then(res => console.log(res));
console.log("fds")
}
</script>


    
</body>
</html>