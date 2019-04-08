<?php

include_once "connection.php";


if(!mysqli_connect_errno())
{
	$employees = mysqli_query($con,"SELECT * FROM employee ORDER BY employee_id");

	mysqli_close($con);

}
?>
<center><h1>Employee List </h1></center>
<center><p> This is a list for Duty employees who are registered here </p><center>

<table>
	<thead>
		<th>ID</th>
		<th>Name</th>
		
		<th>Gender</th>
		<th>age</th>
		<th>Religion</th>
		<th>Blood Group</th>
		<th>Department Name</th>
		
		<th>Joining Date</th>
		<th>Phone</th>
		<th>Salary</th>
	
		
		<th></th>
	</thead>
	<tbody>
		<?php
		$sl_no=1;
	 foreach($employees as $employee){ ?>


				<tr>

				<td><?php echo $employee['employee_id'];?></td>

				<td><?php echo $employee['first_name'].' '.$employee['last_name'];?></td>

				<td><?php echo $employee['gender'];?></td>

				<td><?php echo $employee['age'];?></td>

				<td><?php echo $employee['religion'];?></td>

				<td><?php echo $employee['blood_group'];?></td>

				<td><?php echo $employee['department_name'];?></td>

				<td><?php echo $employee['joining_date'];?></td>

				<td><?php echo $employee['phone'];?></td>

				<td><?php echo $employee['salary'];?></td>

				

				

				</tr>
				<?php
				$sl_no++;
	};?>
	</tbody>


</table>

