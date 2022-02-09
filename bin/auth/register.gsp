<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="wrapper fadeInDown">
  <div id="formContent">

    <div class="title">
        <h2>Registrar nova conta</h2>
    </div>
    <!-- Register Form -->
    <g:form action="salvar">
        <g:textField type="text" id="login" class="usuario" name="usuario" value="${Usuario?.usuario}" placeholder="usuario" />
        <g:textField type="password" id="password" class="senha" name="senha" value="${Usuario?.senha}" placeholder="senha"/>
        <g:submitButton name="register" class="salvar" value="Register" />
    </g:form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <g:link class="login" action="login">Logar</g:link>
    </div>

  </div>
</div>