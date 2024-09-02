<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script type="text/javascript"></script>
</head>
<body>
    <script>
        const nota=prompt('Digite a sua Nota:');
        if(nota >= 70 && nota<=100){
            alert('aprovado.')
        }
        else if (nota >=60 && nota <70){
            alert('recuperação.')
        }
        else if (nota > 100){
            alert('Esta nota não existe')
        }
        else{
            alert('reprovado.')
        }
    </script>
    
</body>
</html>
