<!DOCTYPE html>

<html>

<head>

  <title>Tela Inicial</title>
  
<style>
    body {
	background-color:#ADD8E6
		}

    #Login-box{
	background-color: #2F4F4F;
	width:380px;
	height:260px;
	margin:140px auto 0px;
	border-radius:5px;
	} 


    #Login-interno{
	width:360px;
	height:240px;
	background-color: white;
	position:absolute;
	margin:10px;
	border-radius:5px;
	box-shadow:0px opx 5px black;
	Overflow: hidden;
	
		}


     #Titulo-login{
		background-color: #B0C4DE;
		height:45px;
		text-align:center;
		font:bold 14px/45px sans-serif;
	        border-top-left-radius:5px;
		border-top-right-radius:5px; 
		border-bottom:1px solid #E0FFFF;
		
		  }

	
	.input-div{
		padding:5px;
		background-color:#f2f5f7;
		border-radius: 3px;
		  }

	
	.input-div input{
			width:310px;
			height:35px;
			padding-left:5px
			font: noraml 13px sans-serif;
			color:#aeaeae;
			border-radius: 3px;
			border: 1px solid #bfc4c6;
			outline:nome;		
	
			}
	

	.input-div:hover{
			background:#bfc4c6;	
			}

	.input-div:hover input{
				border-color:#7d6cdd;
				
				}
	#input senha{
		margin-top:-10px;	
		}

	

</style>  

</head>

<body>

	<div id="Login-box"> 
	<div id="Login-interno"> 	
	<div id="Titulo-login"> ESTAFACIL 
	
	<div class="input-div" id="input-usuario">	
	<input type="text" value="Usuario ou Email">
	</div>
		
	<div class="input-div" id="input-senha">	
	<input type="text" value="Senha">
	</div>	


	<div id="botoes">

	<a href="Pagina.html"> 				
	<input type="button" name="botao-ok" value="Ok">
	</a>

	<input type="button" name="botao-cancelar" value="Cancelar">
	
	<a href="Cadastro.html">
	<input type="submit" value="Cadastre-se">
	</a>

	<div id="lembrar-senha"><input type="checkbox"/> Lembrar minha senha		
	

	
	</div>	
	</div>	
	</div>
	</div>
	</div>
	
	


</body>
</html>
