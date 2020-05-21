<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Insert title here</title>
</head>
 <script src="http://code.jquery.com/jquery-latest.js"> </script>
  <script type="text/javascript">
     $(document).ready(function(){
       
          $.post('ServeletHistorialUsuario',{

          }, function(response){
          let datos = JSON.parse(response);
          console.log(datos[0][3]);
          var tabladatos = document.getElementById('tablaDatos');
           
          //for(var i=0; i<datos.length; i++)
          for(let item of datos){
        	  if(item[2]==null || item[2]==undefined){
        		  item[2]="NO DISPONIBLE";
        	  }
          
            tabladatos.innerHTML += `
            
            	<td>${item[0]}</td>
                <td>${item[1]}</td>
                <td>${item[2]}</td>
                <td>${item[3]}</td>
                <td>${item[4]}</td>
            

            `

           }

         

         });
     
     });
   </script>
<body>
   <table class ="table table-dark" id="tablaDatos">
   <thead>
    <th>ID HISTORIAL</th>
     <th>ID USUARIOS</th>
      <th>FECHA</th>
       <th>NOMBRE USUARIO</th>
       <th>APELLIDO USUARIO</th>
   </thead>
   <tbody>
   
   </tbody>
   
   </table>

</body>
</html>