<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Doctor  Registration</title>
    <link rel="stylesheet" href="css/form style.css" />
  </head>
  <body>
      <div id="main-content"class="clearfix">
   <center> <h1>Doctor  Registration</h1></center>

    <form class="DoctorRegistration"  method="post" action="save_DoctorRegistration.php">

     

      <p>
        <strong>Last Name</strong><br/>
        <input type="text" name="last_name" >
      </p>

	 <p>
        <strong>First Name</strong><br/>
        <input type="text" name="first_name" >
      </p>

	<p>
        <strong>Speciality</strong><br/>
        <input type="text" name="speciality" >
      </p>

	  
	<p>
        <strong>Gender</strong><br/>
        <input type="radio" name="gender" value="Male" checked="checked" />Male &nbsp;
        <input type="radio" name="gender" value="Female" />Female &nbsp;
      </p>

	  
       <p>
        <strong>Salary</strong><br/>
        <input type="text" name="salary" >
      </p>

	  
	  
		<p>
        <strong>Religion</strong><br/>
        <input type="radio" name="religion" value="Islam" checked="checked" />Islam &nbsp;
        <input type="radio" name="religion" value="Hindu" />Hindu &nbsp;
        <input type="radio" name="religion" value="Buddha" />Buddha &nbsp;
        <input type="radio" name="religion" value="Christian" />Christian &nbsp;
		</p>

      <p>
        <strong>Blood Group</strong><br/>
       <select name="blood_group">
         <option value="A Positive">A Positive</option>
         <option value="A Negative">A Negative</option>
         <option value="A Unknown">A Unknown</option>
         <option value="B Positive">B Positive</option>
         <option value="B Negative">B Negative</option>
         <option value="B Unknown">B Unknown</option>
         <option value="AB Positive">AB Positive</option>
         <option value="AB Negative">AB Negative</option>
         <option value="AB Unknown">AB Unknown</option>
         <option value="O Positive">O Positive</option>
         <option value="O Negative">O Negative</option>
         <option value="O Unknown">O Unknown</option>
         <option value="Unknown">Unknown</option>
       </select>
     </p>

     
 	<p>
        <strong>Contact NO</strong><br/>
        <input type="text" name="phone" >
      </p>

     

      <p>
        <strong>Joining Date</strong><br/>
        <input type="date" name="joining_date" >
      </p>

     

     

      
     <p>
        <input type="submit" name="submit" value="Submit"/>
      </p>

    </form>

  </body>
</html>
