function fazerLogin(event){
    event.preventDefault(); // evita o comportamento padrão do formulário

    let user = document.getElementById("inputUser").value;
    let password = document.getElementById("inputPassword").value;

    console.log('Você digitou ' + user + " : " + password);

/*     document.getElementById("resultado").innerHTML = "<p>Olá " + nome + "</p>"; */

// Construindo o objeto javascript para enviar
    let loginMsg = {
        email:user,
        cpf:user,
        password:password
    }

// Construindo a mensagem que será enviada ao Backend
// method - indica o método que será utilizado (GET, POST, DELETE, ...)
// body - corpo da mensagem, o que deve ser enviado
// headers - informando o conteúdo da mensagem
    let msg = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers:{
            'Content-type':'application/json'
        }
    }

    //fetch envia a mensagem para o servidor
    fetch("http://localhost:8080/user/login", msg)
        .then(res => tratarRetorno(res)) //quando a resposta voltar...
}

res => tratarRetorno(res)

function tratarRetorno(retorno){
    if (retorno.status == 200){
        document.getElementById("resultado").innerHTML = "Login com sucesso!";
        retorno.json().then(res => acessoPermitido(res));
    } else {
        document.getElementById("resultado").innerHTML = "Falha no login!";
    }

    console.log(retorno)
}

function acessoPermitido(user){
    localStorage.setItem("userLogged", JSON.stringify(user));
    window.location = "interna.html";
}