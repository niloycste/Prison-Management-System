<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Visitor  Registration</title>
    <link rel="stylesheet" href="css/form style.css" />
  </head>
  <body>
      <div id="main-content"class="clearfix">
   <center> <h1>Visitor  Registration</h1></center>

    <form class="visitorRegistration"  method="post" action="save_visitorRegistration.php">

     

      <p>
        <strong>Last Name</strong><br/>
        <input type="text" name="last_name" >
      </p>

	 <p>
        <strong>First Name</strong><br/>
        <input type="text" name="first_name" >
      </p>

	<p>
        <strong>Mobile</strong><br/>
        <input type="text" name="mobile" >
      </p>
		
		<p>
        <strong>Address</strong><br/>
        <input type="text" name="address" >
      </p>


      <p>
        <strong>Arrival Date</strong><br/>
        <input type="date" name="arrival_date" >
      </p>
		
		<p>
        <strong>Arrival Time</strong><br/>
        <input type="text" name="arrival_time" >
      </p>

     <p>
        <strong>Visited To</strong><br/>
        <input type="text" name="visited_to" >
      </p>

     

      
     <p>
        <input type="submit" name="submit" value="Submit"/>
      </p>

    </form>

  </body>
</html>
