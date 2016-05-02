<html>
<body>
	<!-- JAX-RS @MatrixParam example ######################################## -->
    <!-- TITLE -->
	<h1>Jersey RESTful Web Application!</h1>
	
	<!-- TXT -->
	<p>Testing the API created using this logic: 
		<a href="http://www.mkyong.com/webservices/jax-rs/jax-rs-matrixparam-example/">MatrixParam Example</a>
	</p><br/>
	
	<!-- LINKS -->
	<h3>/projWS_001_template</h3>
	<a href="http://localhost:8085/projWS_001_template/">WEB API (index)</a><br/><br/>
	
	<h3>/projWS_001_template/more-params</h3>
	<p>In above URI, the matrix parameter is author=americo, separate by a semi colon ;</p>
	<a href="http://localhost:8085/projWS_001_template/americolib/ws/2011/">MatrixParam multiple PARAMETERS 1</a><br/><br/>	
	<a href="http://localhost:8085/projWS_001_template/americolib/ws/2011;author=americo">MatrixParam multiple PARAMETERS 2</a><br/><br/>	
	<a href="http://localhost:8085/projWS_001_template/americolib/ws/2011;author=tomas;country=portugal">MatrixParam multiple PARAMETERS 3</a><br/><br/>	
	<a href="http://localhost:8085/projWS_001_template/americolib/ws/2011;country=malaysia;author=ana">MatrixParam multiple PARAMETERS 4</a><br/><br/>	
	   
    <!-- JAX-RS @FormParam example ######################################## -->
    <!-- FORM: binding between html and java classes -->  
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
    
    <!-- Get HTTP header in JAX-RS ######################################## -->
    <!-- TITLE -->
	<h1>Jersey RESTful Web Application!</h1>
	
	<!-- TXT -->
	<p>Testing the API created using this logic: 
		<a href="http://www.mkyong.com/webservices/jax-rs/get-http-header-in-jax-rs/">HeaderParam  Example</a>
	</p><br/>
	
	<!-- LINKS -->
	<h3>/projWS_001_template</h3>
	<a href="http://localhost:8085/projWS_001_template/">WEB API (index)</a><br/><br/>
	
	<h3>/projWS_001_template/more-params</h3>
	<p>In this example, it gets the browser user-agent from request header</p>
	<a href="http://localhost:8085/projWS_001_template/americolib/ws/get1/">HeaderParam 1</a><br/><br/>	
	<a href="http://localhost:8085/projWS_001_template/americolib/ws/get2/">HeaderParam 2</a><br/><br/>	

  	<!-- Download text file from JAX-RS ######################################## -->
    <!-- TITLE -->
	<h1>Jersey RESTful Web Application!</h1>
	
	<!-- TXT -->
	<p>Testing the API created using this logic: 
		<a href="http://www.mkyong.com/webservices/jax-rs/download-text-file-from-jax-rs/">Download Text File Example</a>
	</p><br/>
	
	<!-- LINKS -->
	<h3>/projWS_001_template</h3>
	<a href="http://localhost:8085/projWS_001_template/">WEB API (index)</a><br/><br/>
	
	<h3>/projWS_001_template/americolib/ws/file/get/</h3>
	<a href="http://localhost:8085/projWS_001_template/americolib/ws/file/get">Download Text File</a><br/><br/>	

	<!-- Download image file from JAX-RS ######################################## -->
    <!-- TITLE -->
	<h1>Jersey RESTful Web Application!</h1>
	
	<!-- TXT -->
	<p>Testing the API created using this logic: 
		<a href="http://www.mkyong.com/webservices/jax-rs/download-image-file-from-jax-rs/">Download Image File Example</a>
	</p><br/>
	
	<!-- LINKS -->
	<h3>/projWS_001_template</h3>
	<a href="http://localhost:8085/projWS_001_template/">WEB API (index)</a><br/><br/>
	
	<h3>/projWS_001_template/americolib/ws/image/get/</h3>
	<a href="http://localhost:8085/projWS_001_template/americolib/ws/image/get">Download Image File</a><br/><br/>	

    
    
</body>
</html>
