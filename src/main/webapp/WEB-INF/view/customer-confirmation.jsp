<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x" %>

<!DOCTYPE html>
<html>
<head>
    <title>STUDENT-CONFIRMATION </title>
</head>
<body>
    STUDENT CONFIRMED: ${customer.firstName} ${customer.lastName}
    <br><br>
    Free Passes : ${customer.freePasses}
    <br><br>
    PostalCode : ${customer.postalCode}
    <br><br>
    courseCode : ${customer.courseCode}

</body>
</html>