<?php

include_once "connection.php";

$sql="INSERT INTO visitors

(last_name,first_name,mobile,address,arrival_date,arrival_time,visited_to)

VALUES('".$_POST['last_name']."','".$_POST['first_name']."','".$_POST['mobile']."','".$_POST['address']."','".$_POST['arrival_date']."',
       '".$_POST['arrival_time']."','".$_POST['visited_to']."');";

 if(mysqli_query($con, $sql)){
  ?>


	<h1>Member Added Successfully!</h1>

<?php

}
else
{
	echo "Error: ". $sql . "<br>" . mysqli_error($con);

}
mysqli_close($con);

 ?>
