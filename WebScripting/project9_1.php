<?php

$randNumber = rand(5, 20);
$color = true;
$space = 500 / $randNumber;

$myImage = imagecreate(500, 500);
$bege = imagecolorallocate($myImage, 245, 241, 222);
$green = imagecolorallocate($myImage, 46, 49, 138);
$blue = imagecolorallocate($myImage, 46, 229, 138);



for ($i = 490; $i >= 0; $i = $i - $space) {
    if ($color == true) {
        imagefilledellipse($myImage, 250, 250, $i, $i, $blue );
        $color = false;
    } else {
        imagefilledellipse($myImage, 250, 250, $i, $i, $green);
        $color = true;
    }
}

header("Content-type: image/png");
imagepng($myImage);
imagedestroy($myImage);
?>
