<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <title>Logueo</title>
    </head>
    
    <body>
        <div class="container col-lg-3">

            <form method="POST" action="ServeletUser">
             <div class="form-group text-center">
                 <p><strong>Verificar Usuario</strong></p>
             </div>  
             <div class="form-group text-center">
                 <label>Usuario Registrado</label>
                 <input type="text" placeholder="Ingrese su usuario" name="txtUsuario" class="form-control">
             </div>

             <div class ="form-group text-center">
                 <label>Contraseña</label>
                 <input type="password"  placeholder="**********" name="txtClave" class="form-control">
             </div> 
               <input type="submit"  value="Verificar" id="btnIngresar" class="btn btn-danger btn-block">
               
            </form>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</html>

	