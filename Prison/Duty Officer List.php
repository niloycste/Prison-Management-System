<?php

include_once "connection.php";


if(!mysqli_connect_errno())
{
	$officers = mysqli_query($con,"SELECT * FROM duty_officer ORDER BY officer_id");

	mysqli_close($con);

}
?>
<center><h1>Duty Officers List </h1></center>
<center><p> This is a list for Duty Officers who are registered here </p><center>

<table>
	<thead>
		<th>ID</th>
		<th>Name</th>
		<th>Rank</th>
		<th>Gender</th>
		<th>Blood Group</th>
		<th>Salary</th>
		<th>Religion</th>
		<th>Joining Date</th>
		<th>Working Shift</th>
		<th>Contact No</th>
	
		
		<th></th>
	</thead>
	<tbody>
		<?php
		$sl_no=1;
	 foreach($officers as $officer){ ?>


				<tr>

				<td><?php echo $officer['officer_id'];?></td>

				<td><?php echo $officer['first_name'].' '.$officer['last_name'];?></td>

				<td><?php echo $officer['rank'];?></td>

				<td><?php echo $officer['gender'];?></td>

				<td><?php echo $officer['blood_group'];?></td>

				<td><?php echo $officer['salary'];?></td>

				<td><?php echo $officer['religion'];?></td>

				<td><?php echo $officer['joining_date'];?></td>

				<td><?php echo $officer['working_shift'];?></td>

				<td><?php echo $officer['contact_no'];?></td>

				

				

				</tr>
				<?php
				$sl_no++;
	};?>
	</tbody>


</table>

