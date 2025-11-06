<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário de Contato</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f3f3;
            margin: 0;
            background: url('form.jpeg') no-repeat center center fixed;
            background-size: cover;
            padding: 20px;
        }
        
        .container {
            background: white;
            max-width: 500px;
            margin: 50px auto;
            padding: 50px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        input, textarea, button {
            width: 100%;
            margin-top: 10px;
            padding: 10px;
            font-size: 1rem;
        }
        button {
            background: #007bff;
            color: white;
            border: none;
            cursor: pointer;
            padding: 10px;
        }
        button:hover {
            background: #0056b3;
        }
        .resultado {
            margin-top: 20px;
            padding: 10px;
            background: #e9ffe9;
            border: 1px solid #b2ffb2;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Formulário de Contato</h2>

        <form method="POST" action="">
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome" required>

            <label for="email">E-mail:</label>
            <input type="email" id="email" name="email" required>

            <label for="mensagem">Mensagem:</label>
            <textarea id="mensagem" name="mensagem" rows="5" required></textarea>

            <button type="submit" name="enviar">Enviar</button>
        </form>

        <?php
        if (isset($_POST['enviar'])) {
            $nome = htmlspecialchars($_POST['nome']);
            $email = htmlspecialchars($_POST['email']);
            $mensagem = htmlspecialchars($_POST['mensagem']);

            echo "<div class='resultado'>";
            echo "<h3>Dados enviados:</h3>";
            echo "<p><strong>Nome:</strong> $nome</p>";
            echo "<p><strong>E-mail:</strong> $email</p>";
            echo "<p><strong>Mensagem:</strong> $mensagem</p>";
            echo "</div>";
        }
        ?>
    </div>
</body>
</html>
