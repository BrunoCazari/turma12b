function validaLogin(){
    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    //document.getElementById("dadosUser").innerHTML = user.name + " : " + user.email;
    document.getElementById("dadosUser").innerHTML = `<b>${user.nome}</b> (${user.email})`;

    buscarUsuario();
}


function logout(){
    localStorage.removeItem("userLogged");
    window.location = "index.html"
}

function buscarAnuncio(){
    //let id = document.getElementById("userId").value;
    let user = document.getElementById("selUser");
    let id = user[user.selectedIndex].value;

    fetch("http://localhost:8080/user/id/" + id)
        .then(res => tratarResposta(res));
}

function tratarResposta(res){
    if(res.status == 200){
        res.json().then(res => exibirDados(res));
    } else {
        document.getElementById("dadosAnuncio").innerHTML = "Usuário não encontrado";
    }
}

function exibirDados(dados){
    let anuncios = dados.anuncios;
    let tabela = "<table border='1'> <tr> <th>Id</th> <th>Descrição</th> <th>Valor</th> </tr>"

    if(anuncios.length == 0){
        document.getElementById("dadosAnuncio").innerHTML = "Usuário não possui anuncios";
    }else{
        for (let i = 0; i < anuncios.length; i++){
            tabela = tabela + `<tr> <td>${anuncios[i].id}</td>  <td>${anuncios[i].name}</td>  <td>${anuncios[i].valor}</td> </tr>`
        }
        tabela = tabela + "<table>"
        document.getElementById("dadosAnuncio").innerHTML = tabela;
    }

    console.log(dados);
}

function buscarUsuario(){
    fetch("http://localhost:8080/user/all")
        .then(res => res.json())
        .then(res => exibirUsers(res))
}

function exibirUsers(lista){
    let opcoes='';
    for (let i = 0; i < lista.length; i++){
        opcoes = opcoes + `<option value = ${lista[i].id}> ${lista[i].name}</option>`;
    }
    document.getElementById("selUser").innerHTML = opcoes;
}