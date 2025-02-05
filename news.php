<?php
$apiUrl = "https://apinp.com/news/api.php";
$response = file_get_contents($apiUrl);
$data = json_decode($response, true);
print_r($data);

?>