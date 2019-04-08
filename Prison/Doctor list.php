<?php

include_once "connection.php";


if(!mysqli_connect_errno())
{
	$doctors = mysqli_query($con,"SELECT * FROM prison_doctor ORDER BY doctor_id");

	mysqli_close($con);

}
?>
<center><h1>Duty doctors List </h1></center>
<center><p> This is a list for Duty doctors who are registered here </p><center>

<table>
	<thead>
		<th>ID</th>
		<th>Name</th>
		<th>Specitality</th>
		<th>Gender</th>
		<th>Salary</th>
		<th>Religion</th>
		<th>Blood Group</th>
		<th>Phone</th>
		<th>Joining Date</th>
	
		
		<th></th>
	</thead>
	<tbody>
		<?php
		$sl_no=1;
	 foreach($doctors as $doctor){ ?>


				<tr>

				<td><?php echo $doctor['doctor_id'];?></td>

				<td><?php echo $doctor['first_name'].' '.$doctor['last_name'];?></td>

				<td><?php echo $doctor['speciality'];?></td>

				<td><?php echo $doctor['gender'];?></td>

				

				<td><?php echo $doctor['salary'];?></td>

				
				
				<td><?php echo $doctor['religion'];?></td>
				
				<td><?php echo $doctor['blood_group'];?></td>
				
				<td><?php echo $doctor['phone'];?></td>

				<td><?php echo $doctor['joining_date'];?></td>

				

				

				

				</tr>
				<?php
				$sl_no++;
	};?>
	</tbody>


</table>

