function validaLogin(){
    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    document.getElementById("dadosUser").innerHTML = `<b>${user.name}</b> (${user.racf})`;
    document.getElementById("fotoUser").innerHTML = `<img src='../img/${user.linkfoto}' width='130'></img>`;

    buscarAgente();
    buscarTop10();
}

function buscarAgente(){
    fetch("http://localhost:8080/agentes/all")
        .then(res => res.json())
        .then(res => exibirAgente(res))
}

function exibirAgente(lista){
    let opcoes='';
    opcoes = opcoes + `<option value = ''> Selecione o agente</option>`;
    for (let i = 0; i < lista.length; i++){
        opcoes = opcoes + `<option value = ${lista[i].idAgente}> ${lista[i].nomeAgente}</option>`;
    }
    document.getElementById("selAgente").innerHTML = opcoes;
}


function validaSelecao(){
    let agente = document.getElementById("selAgente");
    let id = agente[agente.selectedIndex].value;

    localStorage.setItem("showAgente", JSON.stringify(id));
    window.location = "dashboard.html";
}

function tratarRetorno(res){
        retorno.json().then(res => acessoDashboard(retorno));
}

function acessoDashboard(resultado){
    localStorage.setItem("showAgente", JSON.stringify(resultado));
    window.location = "dashboard.html";
}

function logout(){
    localStorage.removeItem("userLogged");
    window.location = "index.html"
}

function buscarTop10(){
    fetch("http://localhost:8080/agentes/all")
        .then(res => res.json())
        .then(res => exibirTop10(res))
}

function exibirTop10(lista){
    let tabela = "<h4>Top 10 Parceiros</h4> <br> <table class='table table-striped' border='1'> <thead> <tr> <th scope='col' width='60%'>Parceiro</th> <th scope='col' width='40%'>Volume Transacional</th> </tr>"
    for (let i = 0; i < lista.length; i++){
        tabela = tabela + `<tr> <td>${lista[i].nomeAgente}</td>  <td>${lista[i].volumeTransacional}</td> </tr>`
    }
    tabela = tabela + "<table>"
    document.getElementById("dadosTop10").innerHTML = tabela;
}