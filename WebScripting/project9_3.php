<?php
 
  $message = "";
  if(isset($_POST["name"]) && isset($_POST["password"])){
	  
	  $name = $_POST["name"];
	  $password = $_POST["password"];
	  
		if(isset($_POST["register"])){
			if(isset($_COOKIE[$name])){
				$message = "You were registered before";
			}else{
				setcookie($name, $password, time()+60*60);
				$message = "WELCOME";
			}
			
		}
		if(isset($_POST["login"])){
			if(isset($_COOKIE[$name])){
				if($password == $_COOKIE[$name]){
				 	$message = "You are logged in";
				}else{
					$message = "Password is wrong";
				}
			}else{
				$message = "You have to register";
			}
				
			
			 
			
		}
  }
 
  
  

  print ("<html>\n" .
    "<head><title>Processing Cookies</title></head>\n" .
        "<body bgcolor=\"#fdf5e6\">\n" .
        "<h1 align=\"center\"> ". 
        "<form action=\"http://localhost/CIT336/proj9.php\" method=\"post\">" . 
        " <center> <br> <br> " . 
        "User Name:<input name=\"name\" type=\"text\" value=\"\"><br>". 
        "Password:&nbsp;&nbsp;<input name=\"password\" type=\"password\" value=\"\"><br><br><input name=\"register\" type=\"Submit\" value=\"Register\">" . 
        "<input name=\"login\" type=\"Submit\"    value=\"  Login  \"></center></form>". $message."</h1>\n" ."</body></html>");
?> 






