<?php
$m = rand(1,13);
$n = rand(1,13);
if($m%2!=0){
	$m++;
}
$n = $m/2;


for ($i = 1; $i <= $n ; $i++) { 
	$aux = $i*10;
	print("<span style=\"font-size:$aux\">Hello</span><br />");

}
for ($i=$n+1; $i >= 1; $i--) { 
	$aux = $i*10;
	print("<span style=\"font-size:$aux\">Hello</span><br />");
}


?>




