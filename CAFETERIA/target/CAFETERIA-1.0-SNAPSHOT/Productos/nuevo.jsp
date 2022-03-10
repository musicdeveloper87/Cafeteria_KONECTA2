<%-- 
    Document   : nuevo
    Created on : 9/03/2022, 09:09:44 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CAFETERIA</title>
    </head>
    <body>
        <h2>Nuevo Registro</h2>
        <br/><br/>
        <form action="" method="POST"autocomplete="off">
           
             <p>
                id:
                <input cod="id"name="id"type="number" />
            </p>
             <p>
                nombre:
                <input cod="nombre"name="nombre"type="text" />
            </p>
             <p>
                referencia:
                <input cod="referencia"name="referencia"type="text" />
            </p>
             <p>
                precio:
                <input cod="precio"name="precio"type="number" />
            </p>
             <p>
                peso:
                <input cod="peso"name="peso"type="number" />
            </p>
             <p>
                categoria:
                <input cod="categoria"name="categoria"type="text" />
            </p>
             <p>
                existencia:
                <input cod="existencia"name="existencia"type="number" />
            </p>
             <p>
                fecha:
                <input cod="fecha"name="fecha"type="text" />
            </p>
            <button cod= "guardar" name="guardar" type="submit">GUARDAR</button>
        </form>
    </body>
</html>
