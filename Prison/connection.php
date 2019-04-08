<?php
$db['hostname'] = "localhost";
$db['username'] = "root";
$db['password'] = "";
$db['database'] = "prison";

// Create connection
$con = mysqli_connect($db['hostname'],$db['username'],$db['password'],$db['database']);

// Check connection
if (mysqli_connect_errno())
{
    echo "Failed to connect to Mysql: " . Mysqli_connect_error();
}
?>
