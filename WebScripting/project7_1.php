<?php

$n = rand(1, 10);
//print($n);
switch ($n) {
	case '2':
		print("<a href='http://www.pace.edu/'>Pace web site</a>");
		break;
	case '4':
		print("<a href='https://www.yahoo.com/'>Yahoo web site</a>");
		break;
	case '6':
		print("<a href='http://www.monster.com/'>Monster web site</a>");
		break;
	case '8':
		print("<a href='http://www.microsoft.com/en-us/default.aspx'>Microsoft web site</a>");
		break;

	default:
		print("<a href='http://www.google.com/'>Google web site</a>");
		break;
}

?>
