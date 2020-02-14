<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<script type = "text/javascript">

      function validate() {
      
         if(document.getElementById("customerNum").value == "" ) { 	
            document.getElementById("div1").innerHTML="Please Enter Customer Number!! it should not be null!!";
            document.getElementById("div1").style.color="Red";
            document.getElementById("customerNum").focus() ;
            return false;    
         }else{
        	 document.getElementById("div1").innerHTML="";
         }
         
         var z =  document.getElementById("customerNum").value;
         if(!z.match(/^\d+$/))
             {
             document.getElementById("div1").innerHTML="Enter valid Customer Number Allowed input:0-9 !";
             document.getElementById("div1").style.color="Red";
             return false;
             }else{
            	 document.getElementById("div1").innerHTML="";
             }
         
         if(document.getElementById("customerName").value == "" ) {
            document.getElementById("div2").innerHTML="Please Enter Customer Name, it should not be null!!";
            document.getElementById("div2").style.color="Red";
            document.getElementById("customerName").focus() ;
            return false;
         }else{
        	 document.getElementById("div2").innerHTML="";
         }
         
         var v= document.getElementById("customerName").value;
         if(!v.match(/^[A-Za-z]+$/))
         {
         document.getElementById("div2").innerHTML="Please enter characters only for name!";
         document.getElementById("div2").style.color="Red";
         return false;
         }else{
        	 document.getElementById("div2").innerHTML=""; 
         }
         
        if (document.getElementById("gender1").checked == false && document.getElementById("gender2").checked == false && document.getElementById("gender3").checked == false) {
        	 document.getElementById("div3").innerHTML="Please provide your gender!";
             document.getElementById("div3").style.color="Red";
             return false;
        }else{
        	 document.getElementById("div3").innerHTML="";
        } 
         
         if( document.getElementById("customercity").value == "select" ) {
             document.getElementById("div4").innerHTML="Please provide your city!";
             document.getElementById("div4").style.color="Red";
             return false;
          }else{
        	  document.getElementById("div4").innerHTML="";
        	}
         if((document.getElementById("hobby1").checked == false) && (document.getElementById("hobby2").checked == false) && (document.getElementById("hobby3").checked == false)) {
             document.getElementById("div5").innerHTML="Please provide hobbies!";
             document.getElementById("div5").style.color="Red";
             return false;
          }else{
        	  document.getElementById("div5").innerHTML="";
          }
        
         return( true );
      }
  
</script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Skyblue">

<H3><span style="color:Green">REGISTRATION PAGE</span></H3>
<form action="registration1" name="myForm" onsubmit = "return(validate());">
Customer  Num::<input type="text" placeholder="Please Enter Number" id="customerNum" name="cnum"/><span id="div1"></span></br>    
Customer Name::<input type="text" placeholder="Please Enter Name" id="customerName" name="cname"> <span id="div2"></span> </br> 
Gender:: <input type="radio" id="gender1"  name="gender" value="male"> Male  
         <input type="radio" id="gender2" name="gender" value="Female"> Female 
         <input type="radio" id="gender3" name="gender" value="other"> Other <span id="div3"></span> <br>    
City :: <select id ="customercity" name="city" >  <br>       
         <option value="select">[choose yours city]</option> 
         <option value="hyd">Hyderabad</option>
         <option value="Vizag">Vizag</option>
         <option value="chennai">chennai</option>
         <option value="pune">pune</option>
         <option value="Goa">Goa</option> 
         </select>   <span id="div4"></span><br>    
Hobbies:: <input type="checkbox" id ="hobby1" name="hobbies1" value="sleeping"> Sleeping<br>

          <input type="checkbox" id ="hobby2" name="hobbies2" value="listening music"> listening<br>

          <input type="checkbox" id ="hobby3" name="hobbies3" value="Gym" > gym<span id="div5"></span> <br><br>         

<input type="submit" value="submit">

<br>  <br>  

<% if(request.getAttribute("SuccessMsg")!=null){
%>
<span style="color:green"><%= request.getAttribute("SuccessMsg") %></span>

<%
}
%>

<% if(request.getAttribute("errorMsg")!=null){
%>
<span style="color:red"><%= request.getAttribute("errorMsg") %></span>

<%
}
%>
<a href="Home">Redirect to Home page </a>
</form>

</body>
</html>