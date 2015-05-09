<?php

	$arr = array();
	$file = fopen("inventory.txt","r")or die("File does not exist in the current folder.");
  
	$n = fgets($file);
    $names[0] = fgets($file);
	$names[1] = fgets($file);
	$price[0] = fgets($file);
	$price[1] = fgets($file);
	$avail[0] = fgets($file);
	$avail[1] = fgets($file);
	fclose($file);
	
	for($i = 0; $i < $n; $i++){
		$order[$i] = rand(1,10);
	}
	for($j = 0; $j < $n; $j++){
		$avail[$j] = $avail[$j] - $order[$j];
	}
	
	for($k = 0; $k < $n; $k++){
		print $names[$k]. " " . $order[$k]. " " .$price[$k]. " " .$order[$k]*$price[$k]. " <br />";
		
	}
		
	$file = fopen("inventory.txt","w")or 
    die("You do not have enough space or you have no permission to write here.");
  
	fputs($file, $n);
	fputs($file,  $names[0]);
	fputs($file,  $names[1]);
	fputs($file,  $price[0]);
	fputs($file,  $price[1]);
	fputs($file,  $avail[0]);
	fputs($file,  "\n" . $avail[1]);
	fclose($file);
	
	print "OK";
  
  
?>


