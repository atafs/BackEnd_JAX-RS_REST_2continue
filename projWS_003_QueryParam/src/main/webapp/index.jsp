<html>
<body>
    <!-- TITLE -->
	<h1>Jersey RESTful Web Application!</h1>
	
	
	<!-- TXT -->
	<p>Testing the API created using this logic: 
		<a href="http://www.mkyong.com/webservices/jax-rs/jax-rs-pathparam-example/">PathParam Example</a>
		<a href="http://www.mkyong.com/webservices/jax-rs/jax-rs-queryparam-example/">QueryParam Example</a>
	</p><br/>
	
	<!-- LINKS -->
	<h3>/projWS_003_QueryParam</h3>
	<a href="http://localhost:8085/projWS_003_QueryParam/">WEB API (index)</a><br/><br/>
	
	<h3>/projWS_003_QueryParam/americolib/ws/2011/06/30</h3>
	<p>Example to inject multiple parameters into Java method.</p>
	<a href="http://localhost:8085/projWS_003_QueryParam/americolib/ws/2011/06/30">PathParam multiple PARAMETERS</a><br/><br/>	
		
	<h3>/projWS_003_QueryParam/americolib/ws/query1?from=100&to=200&orderBy=age&orderBy=name</h3>
	<p>In JAX-RS, you can use QueryParam annotation to inject URI query parameter into Java method. for example</p>
	<a href="http://localhost:8085/projWS_003_QueryParam/americolib/ws/query1?from=100&to=200&orderBy=age&orderBy=name">FROM, TO and ORDER BY statements</a><br/><br/>	

	<h3>/projWS_003_QueryParam/americolib/ws/query2?from=100&to=200&orderBy=age&orderBy=name</h3>
	<p>Alternatively, you can get the query parameters grammatically, via Context UriInfo. See equivalent version below</p>
	<a href="http://localhost:8085/projWS_003_QueryParam/americolib/ws/query2?from=100&to=200&orderBy=age&orderBy=name">FROM, TO and ORDER BY statements (programmatic)</a><br/><br/>	
	
	<h3>/projWS_003_QueryParam/americolib/ws/query3</h3>
	<p>DefaultValue is good for optional parameter.</p>
	<a href="http://localhost:8085/projWS_003_QueryParam/americolib/ws/query3">FROM, TO and ORDER BY statements (default)</a><br/><br/>	
	




</body>
</html>
