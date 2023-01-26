<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
Nait Moodle Website
<img src="/QrCodeImageGeneratorServlet?url=https://moodle.nait.ca&imageSize=200" alt="NAIT Moodle">
Youtube
<img src="/QrCodeImageGeneratorServlet?url=https://www.youtube.com" alt="Youtube">
<h2>QR Code Generator</h2>
<form method="post" action="/QrCodeImageGeneratorServlet">
    <div>
        <label for="url">URL for QrCode</label>
        <input type="url" id="url" name="url" size="100"/>
        <div>
            <input type="checkbox" id="download" name="download"/>
            <label for="download">Download QrCodeImage</label>
            <button type="submit">Show me the QRCode</button>

        </div>
    </div>
</form>
</body>
</html>