<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.util.stream.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript">
	
	function getPlanValue(){
		
		
		if(document.getElementById("plan").value==1){
			document.getElementById("amount").value="199";
		}
		else if(document.getElementById("plan").value==2){
			document.getElementById("amount").value="299";
		}
		else
			document.getElementById("amount").value="399";
		
	}

</script>

<title>Sun NetWork</title>
</head>
<body>
<%! String phoneNumber; Integer plan=1; %>
<%
	Cookie[] ckys = request.getCookies();
	List<Cookie> ckyList = Arrays.asList(ckys);
	
	List<String> ckyName = ckyList.stream().filter(cky->cky.getName().equals("phoneNumber")).map(cky->cky.getValue()).collect(Collectors.toList());
	
	if(ckyName.size()>0){
		phoneNumber =  ckyName.get(0);
	}
	else
		phoneNumber = " " ;
	
	
	
	 ckyName = ckyList.stream().filter(cky->cky.getName().equals("plan")).map(cky->cky.getValue()).collect(Collectors.toList());
	if(ckyName.size()>0){
		plan = Integer.parseInt(ckyName.get(0));
	}
	
	
%>
<%@include file="title.html" %>
<%@include file="planList.html" %>

	<div class="form-group col-sm-6 ">
	<form action="Success.jsp" style="font-size:18px"><br/>
	<label for="">Phone Number</label> <br/>
	<input type="text" class="form-control" name="phoneNumber" id="phoneNumber" value=<%=phoneNumber %> placeholder="Enter 10 digit PhoneNumber" required="required"  /><br/>
	<label for="">Select Plan</label><br/>
	<select class="form-control" name="plan" id="plan" onchange="getPlanValue()">
		<option value="1" <%if(plan==1) out.println("selected"); %> >Plan1</option>
		<option value="2" <%if(plan==2) out.println("selected"); %> >Plan2</option>
		<option value="3" <%if(plan==3) out.println("selected"); %> >Plan3</option>
	</select><br/>
	<label for="">Amount</label><br/>
	
	<input class="form-control" type="text" id="amount" value="199" required="required"/><br/>
	<input type="submit" class="btn btn-success" value="Recharge"/>
	</form>
	
	</div>
</body>
</html>