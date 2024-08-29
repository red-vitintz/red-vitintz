<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<form class="formulario">
Nome Completo: <input type="text" id="nom" placeholder="Digite seu Nome"/> <br/><br/>
Data de nascimento: <input type="date" id="dat" placeholder="DD/MM/AAAA"/> <br/> <br/>
Insira o seu CPF: <input type="number" id="num" placeholder="000.000.000-00"/> <br/><br/>
Insira o seu Telefone: <input type="tel" id="te" placeholder="(DDD) 00000-0000"/>
<input id="botao" type="submit" value="Enviar">
</form>

    
</body>
</html>

*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;

}
form{
    text-align: center;
}
#botao{
    margin: 20px 200px;
    background-color: chartreuse;
    text-align: center;
    font-size: 12px;
}
#nom{
    padding: 8px 80px;
}
input{
    padding: 5px 0px;
    background-color: cornflowerblue;
}
#te{
    text-align: center;
}
