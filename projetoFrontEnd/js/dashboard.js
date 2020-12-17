function carregaAgente(){
    let agenteTxt = localStorage.getItem("agenteLogged");

    if(!agenteTxt){
        window.location = "agente.html";
    }

    let agente = JSON.parse(agenteTxt);

    //document.getElementById("dadosUser").innerHTML = user.name + " : " + user.email;
    document.getElementById("dadosAgente").innerHTML = `<b>${agente.nome_agente}</b> (${agente.volume_transacional})`;

}

function voltar(){
    window.location = "agente.html";
}