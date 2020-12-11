function validar(){
    let nome;
    nome = document.getElementById("nome").value;

    console.log('Você digitou ' + nome);

    document.getElementById("resultado").innerHTML = "<p>Olá " + nome + "</p>";
}