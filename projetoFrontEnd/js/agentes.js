function validaLogin(){
/*     let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    document.getElementById("dadosUser").innerHTML = `<b>${user.nome}</b> (${user.email})`; */

    buscarAgente();
}

function buscarAgente(){
    fetch("http://localhost:8080/agFinanceiro/all")
        .then(res => res.json())
        .then(res => exibirAgente(res))
}

function exibirAgente(lista){
    let opcoes='';
    for (let i = 0; i < lista.length; i++){
        opcoes = opcoes + `<option value = ${lista[i].id_agente}> ${lista[i].nome_agente}</option>`;
    }
    document.getElementById("selAgente").innerHTML = opcoes;
}


function buscarTransacao(){
    let agente = document.getElementById("selAgente");
    let id = agente[agente.selectedIndex].value;

    fetch("http://localhost:8080/agFinanceiro/id/" + id)
        .then(res => acessoDashboard(res));

/*         localStorage.setItem("agenteLogged", JSON.stringify(id));
        window.location = "dashboard.html";   */      
}


function acessoDashboard(id){
    localStorage.setItem("agenteLogged", JSON.stringify(id));
    window.location = "dashboard.html";
}

function tratarResposta(res){
    if(res.status == 200){
        res.json().then(res => exibirDados(res));
    }
}

function exibirDados(dados){
    let agente = dados.agente;
    let tabela = "Top 10 Parceiros<br> <table class='table table-striped'> <tr> <th scope='col'>Parceiros</th> <th scope='col'>Volume Transacional</th> </tr>"

    if(parceiros.length == 0){
        document.getElementById("top10agente").innerHTML = "Usuário não possui anuncios";
    }else{
        for (let i = 0; i < parceiros.length; i++){
            tabela = tabela + `<tr> <td>${parceiros[i].nome_agente}</td>  <td>${parceiros[i].volume_transacional}</td> </tr>`
        }
        tabela = tabela + "</table>"
        document.getElementById("top10agente").innerHTML = tabela;
    }

    console.log(dados);
}