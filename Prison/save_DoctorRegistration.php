<?php

include_once "connection.php";

$sql="INSERT INTO prison_doctor

(last_name,first_name,speciality,gender,salary,religion,blood_group,phone,joining_date)

VALUES('".$_POST['last_name']."','".$_POST['first_name']."','".$_POST['speciality']."','".$_POST['gender']."','".$_POST['salary']."',
       '".$_POST['religion']."','".$_POST['blood_group']."','".$_POST['phone']."','".$_POST['joining_date']."');";

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
