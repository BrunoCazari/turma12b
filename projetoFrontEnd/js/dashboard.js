function validaLogin(){
    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    //document.getElementById("dadosUser").innerHTML = user.name + " : " + user.email;
    document.getElementById("dadosUser").innerHTML = `<b>${user.name}</b> (${user.racf})`;

    carregaAgente();
}

function carregaAgente(){
    let agenteTxt = localStorage.getItem("showAgente");

    let agente = JSON.parse(agenteTxt);

    fetch("http://localhost:8080/agentes/id/" + agente)
    .then(res => tratarRetorno(res));
}

function tratarRetorno(res){
        if(res.status == 200){
            res.json().then(res => exibirDados(res));
        }else{
            document.getElementById("dadosAgente").innerHTML = `<h5>Não existem dados para exibição<h5>`;
        }
    }  

function exibirDados(dados){
    document.getElementById("dadosAgente").innerHTML = `<h5>${dados[1]} / ${dados[2]}<h5>`;    
 
}

function voltar(event){
    event.preventDefault(); // evita o comportamento padrão do formulário
    window.location = "agentes.html";
}

function logout(){
    localStorage.removeItem("userLogged");
    window.location = "index.html"
}