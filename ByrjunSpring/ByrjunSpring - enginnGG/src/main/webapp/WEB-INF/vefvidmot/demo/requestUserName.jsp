<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <title>What is your name?</title>
    </head>
    <body>

        <h1>What is your name?</h1>

        <form method="POST" action="/demo/who">
            What is your name? <input name="name" type="text" placeholder="Name" />
            <button type="submit">Send</button>
        </form>

    </body>

</html>