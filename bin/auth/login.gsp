<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="wrapper fadeInDown">
  <div id="formContent">

    <div class="title">
        <h2>Acessar sistema</h2>
    </div>
    <!-- Login Form -->
    <g:form action="acessar">
        <g:textField type="text" id="usuario" class="usuario" name="usuario" value="" placeholder="usuario" />
        <g:textField type="password" id="senha" class="senha" name="senha" value="" placeholder="senha"/>
        <g:submitButton name="login" class="acessar" value="${message(code: 'default.button.acessar.label', default: 'Acessar')}" />
    </g:form>

    <!-- Register Form -->
    <div id="formFooter">
      <g:link class="registrar" action="register">Registrar nova conta</g:link>
    </div>

  </div>
</div>