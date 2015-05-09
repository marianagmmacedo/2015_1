<?php
  mysql_connect("localhost", "root", "") or die(mysql_error());			//(1)
  
  mysql_query("CREATE DATABASE myDatabase");						//(2)

  mysql_query("USE myDatabase");								//(3)

  mysql_query("CREATE TABLE myTable (firstname VARCHAR(20), " .			//(4)
    "lastname VARCHAR(20), birthdate DATE, dependents INT, ss VARCHAR(11))"); 	

  mysql_query("LOAD DATA LOCAL INFILE 'http://localhost/CIT336/names.txt' INTO TABLE myTable") //(5)
    or die(mysql_error());
 
  
  //if(!(isset($_POST["firstname"]) && isset($_POST["lastname"]))){
    $f = $_POST["firstname"];
    $l = $_POST["lastname"];
    $b = $_POST["birthdate"];
    $d = $_POST["dependents"];
    $ss = $_POST["ssn"];
    mysql_query(" INSERT INTO myTable  (firstname , lastname , birthdate , dependents , ss )
                      VALUES ('".$f ."' , '" .$l . "' , '".$b."' , '".$d."', '".$ss."') " );

   
  //}

  $s = mysql_query("SELECT * FROM myTable ORDER BY lastname");                 //(6)
              
  $rows=mysql_numrows($s);                                                     //(7)

  print "<pre>First Name     Last Name      Birth date        " .          
    "Number of Dependents    Social secority number\n</pre>";

  for($i = 0; $i < $rows; $i++){
    $f=str_pad(mysql_result($s,$i,"firstname"), 15, " ");              //(8)
    $l=str_pad(mysql_result($s,$i,"lastname"), 15, " ");
    $b=str_pad(mysql_result($s,$i,"birthdate"), 25, " ");
    $d=str_pad(mysql_result($s,$i,"dependents"), 18, " ");
    $ss=mysql_result($s,$i,"ss");
    print " <pre>" . $f . $l . $b . $d . $ss . "\n</pre>";
  }

  mysql_query("DROP DATABASE myDatabase") or die(mysql_error());	 	     //(9)
  mysql_close();							                       //(10)
?>
