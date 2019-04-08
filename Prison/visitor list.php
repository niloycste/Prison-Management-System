<?php

include_once "connection.php";


if(!mysqli_connect_errno())
{
	$doctors = mysqli_query($con,"SELECT * FROM visitors ORDER BY visitor_id");

	mysqli_close($con);

}
?>
<center><h1>Duty doctors List </h1></center>
<center><p> This is a list for Duty doctors who are registered here </p><center>

<table>
	<thead>
		<th>ID</th>
		<th>Name</th>
		<th>Mobile</th>
		<th>Address</th>
		<th>Arrival Date</th>
		<th>Arrival Time</th>
		<th>Visited To Prisoner (ID)</th>
		
		
		<th></th>
	</thead>
	<tbody>
		<?php
		$sl_no=1;
	 foreach($doctors as $doctor){ ?>


				<tr>

				<td><?php echo $doctor['visitor_id'];?></td>

				<td><?php echo $doctor['first_name'].' '.$doctor['last_name'];?></td>

				<td><?php echo $doctor['mobile'];?></td>

				<td><?php echo $doctor['address'];?></td>
				
				<td><?php echo $doctor['arrival_date'];?></td>

				

				<td><?php echo $doctor['arrival_time'];?></td>

				
				
				<td><?php echo $doctor['visited_to'];?></td>
				
				
				

				

				

				</tr>
				<?php
				$sl_no++;
	};?>
	</tbody>


</table>

