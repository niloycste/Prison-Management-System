<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>prisoner Registration</title>
    <link rel="stylesheet" href="css/form style.css" />
  </head>
  <body>
      <div id="main-content"class="clearfix">
   <center> <h1>Prisoner Registration</h1></center>

    <form class="PrisonerRegistration"  method="post" action="save_prisoner.php">

     

      <p>
        <strong>Last Name</strong><br/>
        <input type="text" name="last_name" >
      </p>

	 <p>
        <strong>First Name</strong><br/>
        <input type="text" name="first_name" >
      </p>


<p>
        <strong>Gender</strong><br/>
        <input type="radio" name="gender" value="Male" checked="checked" />Male &nbsp;
        <input type="radio" name="gender" value="Female" />Female &nbsp;
      </p>

       <p>
        <strong>Age</strong><br/>
        <input type="text" name="age" >
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
        <strong>address</strong><br/>
        <input type="text" name="address" >
      </p>

 	<p>
        <strong>Criminal Type</strong><br/>
        <input type="radio" name="criminal_type" value="New" checked="checked" />New &nbsp;
        <input type="radio" name="criminal_type" value="Old" />Old &nbsp;
      </p>

      <p>
        <strong>Crime Type</strong><br/>
        <input type="radio" name="crime_type" value="Murder" checked="checked" />Murder &nbsp;
        <input type="radio" name="crime_type" value="Rape" />Rape &nbsp;
        <input type="radio" name="crime_type" value="Robbery" />Robbery &nbsp;
        <input type="radio" name="crime_type" value="fordgery" />fordgery &nbsp;
      </p>

      <p>
        <strong>Arraival Date</strong><br/>
        <input type="date" name="arrival_date" >
      </p>

     

     

      <p>
        <strong>Allocatd Cell</strong><br/>
        <input type="text" name="allocated_cell" >
      </p>

     

      <p>
        <strong>Case no</strong><br/>
        <input type="text" name="case_no" >
      </p>
     
     <p>
        <input type="submit" name="submit" value="Submit"/>
      </p>

    </form>

  </body>
</html>
