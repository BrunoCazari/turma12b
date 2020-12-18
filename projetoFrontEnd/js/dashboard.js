function validaLogin(){
    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    //document.getElementById("dadosUser").innerHTML = user.name + " : " + user.email;
    document.getElementById("dadosUser").innerHTML = `<b>${user.name}</b> (${user.racf})`;

    carregaAgente();
    carregaVolumeAgente();
}

function carregaAgente(){
    let agenteTxt = localStorage.getItem("showAgente");

    let agente = JSON.parse(agenteTxt);

    document.getElementById("dadosAgente").innerHTML = `<h3>${agente}<h3>`; 

    fetch("http://localhost:8080/transacao/idtotal/" + agente)
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
    document.getElementById("dadosAgente").innerHTML = `<h3>${dados[1]} / ${dados[2]}<h3>`;    
 
}

function voltar(event){
    event.preventDefault(); // evita o comportamento padrão do formulário
    window.location = "agentes.html";
}

function logout(){
    localStorage.removeItem("userLogged");
    window.location = "index.html"
}


function carregaVolumeAgente(){
    let agenteTxt = localStorage.getItem("showAgente");

    let agente = JSON.parse(agenteTxt);

    //document.getElementById("sucessoVolume").innerHTML = `<h3>${agenteTxt}<h3>`; 

    fetch("http://localhost:8080/transacao/id/" + agente)
    .then(res => tratarRetornoVolume(res));
}

function tratarRetornoVolume(res){
/*     let tipo ='';
    let total = 0;

    res.forEach(element => {
        let res = element.split(",");
        total += parseInt(res[2]);
        switch (res[1]){
            case '0':
                tipo = 'sucesso';
                break;
            case '1':
                tipo = 'falha';
                break;
            case '2':
                tipo = 'fraude';
                break;
        }      
        document.getElementById("sucessoVolume").innerHTML = `<p>${res[2]}</p>`;
    }); */
    if(res.status == 200){
        res.json().then(res => exibirDadosVolume(res));
    }else{
        document.getElementById("dadosAgente").innerHTML = `<h5>Não existem dados para exibição<h5>`;
    }

}  

function exibirDadosVolume(volume){
    
document.getElementById("sucessoVolume").innerHTML = `<h3>${volume[0].count}<h3>`;    
document.getElementById("falhaVolume").innerHTML = `<h3>${volume[1].count}<h3>`; 
document.getElementById("fraudeVolume").innerHTML = `<h3>${volume[2].count}<h3>`; 
}