<?php

include_once "connection.php";

$sql="INSERT INTO duty_officer

(last_name,first_name,rank,gender,blood_group,salary,religion,joining_date,working_shift,contact_no)

VALUES('".$_POST['last_name']."','".$_POST['first_name']."','".$_POST['rank']."','".$_POST['gender']."','".$_POST['blood_group']."',
       '".$_POST['salary']."','".$_POST['religion']."','".$_POST['joining_date']."','".$_POST['working_shift']."','".$_POST['contact_no']."');";

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
