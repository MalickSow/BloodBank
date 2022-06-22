<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Requests</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
		<jsp:include page="nav.jsp"/>
		<section id="main">
			<div class="container-fluid">
				<div class="row">
				<div class="col-md-3">
					<jsp:include page="sidemenu.jsp"/>
				</div>
				
				
				<div class="col-md-9">
					<div class="panel panel-default spacing">
						<div class="panel-heading">
                  			<h3 class="panel-title breadcrumb">Latest Request</h3>
                		</div>
						<div class="panel-body">
							<table class="table table-striped table-hover">
								<tr>
                      				<th>Name</th>
                      				<th>Email</th>
                      				<th>Phone</th>
                      				<th>Location</th>
                      				<th>blood type</th>
                      				<th>Action</th>
                    			</tr>
                    			
                    			<tr>
                      				<td>Ahmed Camara</td>
                      				<td>camara@gmail.com</td>
                      				<td>01601114249</td>
                      				<td>Abidjan</td>
                      				<td>A+</td>
                      				<td><a href="#">Accept</a>| <a href="#">Cancel</a></td>
                    			</tr>
                    			
                    			<tr>
                      				<td>Ahmed Camara</td>
                      				<td>camara@gmail.com</td>
                      				<td>01601114249</td>
                      				<td>Abidjan</td>
                      				<td>A+</td>
                      				<td><a href="#">Accept</a>| <a href="#">Cancel</a></td>
                    			</tr>
							</table>
						</div>
					</div>
				</div>
				</div>
			</div>
		</section>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
		
</body>
</html>