<html>
<body>
   	<!-- JAX-RS @FormParam example ######################################## -->
    <!-- FORM: binding between html and java classes --> 
        <!-- TITLE -->
	<h1>Jersey RESTful Web Application!</h1>
	
	<!-- TXT -->
	<p>Testing the API created using this logic: 
		<a href="http://www.mkyong.com/webservices/jax-rs/jax-rs-formparam-example/">FormParam  Example</a>
	</p><br/>
	
	<!-- LINKS -->
	<h3>/projWS_001_template</h3>
	<a href="http://localhost:8085/projWS_005_FormParam/">WEB API (index)</a><br/><br/>
	
     
    <h1>JAX-RS @FormQuery Testing</h1>

	<form action="americolib/ws/add" method="post">
		<p>
			Name : <input type="text" name="name" />
		</p>
		<p>
			Age : <input type="text" name="age" />
		</p>
		<input type="submit" value="Add User" />
	</form>
</body>
</html>
