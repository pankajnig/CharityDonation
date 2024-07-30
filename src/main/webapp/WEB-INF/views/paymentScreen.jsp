<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en" xmlns="https://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org">
<%@page isELIgnored="false" %>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <head>
    <script type="text/javascript" src="/Scripts/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="/views/Login.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    
</head>
    <title>Home</title>
    <header>
 <div style="background-color: #281d46; height: 50px; width: 100%;">
  <div style="height: 100px; width: 100px;">
 <img height=50 width=200 alt="image"  src="https://seeklogo.com/images/N/natwest-logo-FA71B898B1-seeklogo.com.png"> 
     </div>
  <div>
 
  </div>
 </div>
    </header>
    <body>
   
    </body>
    <div class="d-flex bd-highlight">
   <div style="width: 50%; height:50%; seeklogo.com.png');">
      
    
   </div> 
   
 <div style="padding-left:20%; padding-right: 20%; padding-top: 50px;">

<form>
  <div class="form-group" action="submitpayment" method="post">
    <label for="formGroupExampleInput">From Account</label>
    <input onkeypress='validateNumber(event)' style="width: 170%;" type="text" class="form-control" id="formGroupExampleInput" placeholder="${fromAccount}" disabled>
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput1">To Account</label>
    <input onkeypress='validateNumber(event)' style="width: 170%;" type="password" class="form-control" id="formGroupExampleInput1" placeholder="To Account Number">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Confirm To Account</label>
    <input onkeypress='validateNumber(event)' style="width: 170%;" type="text" class="form-control" id="formGroupExampleInput2" placeholder="To Account Number">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput3">Bank Code</label>
    <input type="text" class="form-control" id="formGroupExampleInput3" placeholder="Bank Code">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput4">Amount</label>
    <input onkeypress='validateNumber(event)' type="text" class="form-control" id="formGroupExampleInput4" placeholder="Amount" oninput="copyInputValue()">
  </div>
  <h3><label for="formGroupExampleInput5">Want to Donate some money</label></h3>

  <div class="d-flex flex-column bd-highlight mb-3">
    <label>Select Any</label>
    <label>
      <input type="checkbox" class="radio" value="1" name="fooby[1][]"  />  NGO1</label>
    <label>
      <input type="checkbox" class="radio" value="1" name="fooby[1][]" />  NGO2</label>
    <label>
      <input type="checkbox" class="radio" value="1" name="fooby[1][]" />  NGO3</label>
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput6">Amount</label>
    <input onkeypress='validateNumber(event)' type="text" class="form-control" id="formGroupExampleInput6" value="0" oninput="copyInputValue()">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput7">Total Amount</label>
    <input onkeypress='validateNumber(event)' type="text" class="form-control" id="formGroupExampleInput7" placeholder="Amount" disabled>
  </div>
  <button type="submit" class="btn btn-primary" style="width: 200px;" value="/submitpayment">Submit</button>

</form>
<script>
// the selector will match all input controls of type :checkbox
// and attach a click event handler 
$("input:checkbox").on('click', function() {
  // in the handler, 'this' refers to the box clicked on
  var $box = $(this);
  if ($box.is(":checked")) {
    // the name of the box is retrieved using the .attr() method
    // as it is assumed and expected to be immutable
    var group = "input:checkbox[name='" + $box.attr("name") + "']";
    // the checked state of the group/box on the other hand will change
    // and the current value is retrieved using .prop() method
    $(group).prop("checked", false);
    $box.prop("checked", true);
  } else {
    $box.prop("checked", false);
  }
});
</script>

<script>
  function validateNumber(evt) {
  var theEvent = evt || window.event;

  // Handle paste
  if (theEvent.type === 'paste') {
      key = event.clipboardData.getData('text/plain');
  } else {
  // Handle key press
      var key = theEvent.keyCode || theEvent.which;
      key = String.fromCharCode(key);
  }
  var regex = /[0-9]|\./;
  if( !regex.test(key) ) {
    theEvent.returnValue = false;
    if(theEvent.preventDefault) theEvent.preventDefault();
  }
}

function copyInputValue() {
let text1 = document.getElementById('formGroupExampleInput4').value;
let text2 = document.getElementById('formGroupExampleInput6').value;
if (text2 == null) {
  text2='0';
} 
let z = parseInt(text1) + parseInt(text2);       
        document.getElementById('formGroupExampleInput7').value = z;
}
</script>

</div>
</div>
</html>