<!DOCTYPE html>
<html style="font-size: 16px;" lang="en"><head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <head>
    <link rel="stylesheet" href="/views/Login.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </head>
    <title>Home</title>
    <header>
 <div style="background-color: #281d46; height: 70px; width: 100%;">
  <div style="height: 100px; width: 100px;">
 <img height=50 width=200 alt="image"  src="https://seeklogo.com/images/N/natwest-logo-FA71B898B1-seeklogo.com.png"> 
     </div>
  <div>

  </div>
 </div>
    </header>
    <body>
    
    <div style="border: 3px solid #fff; padding: 20px;">
    <div style="width: 50%;float: left; padding: 20px; align-content:center;">
    <p>
    Bring your innovative ideas to life with our APIs
    </p>
    </div>
    <div style="float: left; padding: 50px; margin-left: 10%;">
    <div style="width: 50%;   padding-left: 20%;">
    <img style="align-content: center;" height=210 width=180 alt="image"  src="https://companieslogo.com/img/orig/NWG_BIG-2ae1cc68.png"> 
    
    </div>
    <div>

      <form style="margin-top: 10%" action="Login" method="post">
        <div class="form-group" width=100px>
          <label for="exampleInputEmail1">Email address</label>
          <input name="username" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="customer Id">
          <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Password</label>
          <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
        </div>
        <div class="form-group form-check">
          <input type="checkbox" class="form-check-input" id="exampleCheck1">
          <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        <button type="submit" class="btn btn-primary" value="/Login">Submit</button>
      </form>

    </div>
     
    </div>
    </div>
    </body>
    
   
  
</html>