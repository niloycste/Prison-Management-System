<?php

include_once "connection.php";


if(!mysqli_connect_errno())
{
	$prisoners = mysqli_query($con,"SELECT * FROM prisoner ORDER BY prisoner_id");

	mysqli_close($con);

}
?>
<center><h1> Prisoner List </h1></center>
<center><p> This is a list for prisoners who are registered here </p><center>

<table>
	<thead>
		<th>ID</th>
		<th>Name</th>
		<th>Gender</th>
		<th>Criminal Type</th>
		<th>Age</th>
		<th>Arrival Date</th>
		<th>Allocated cell</th>
		<th>Crime Type</th>
		<th>Blood Group</th>
		<th>Address</th>
		<th>Case No.</th>
		
		<th></th>
	</thead>
	<tbody>
		<?php
		$sl_no=1;
	 foreach($prisoners as $prisoner){ ?>


				<tr>

				<td><?php echo $prisoner['prisoner_id'];?></td>

				<td><?php echo $prisoner['first_name'].' '.$prisoner['last_name'];?></td>

				<td><?php echo $prisoner['gender'];?></td>

				<td><?php echo $prisoner['criminal_type'];?></td>

				<td><?php echo $prisoner['age'];?></td>

				<td><?php echo $prisoner['arrival_date'];?></td>

				<td><?php echo $prisoner['allocated_cell'];?></td>

				<td><?php echo $prisoner['crime_type'];?></td>

				<td><?php echo $prisoner['blood_group'];?></td>

				<td><?php echo $prisoner['address'];?></td>

				<td><?php echo $prisoner['case_no'];?></td>

				

				</tr>
				<?php
				$sl_no++;
	};?>
	</tbody>


</table>

