function recuperar(event){
    let email = document.getElementById("inputEmail").value;
    event.preventDefault(); // evita o comportamento padrão do formulário
    alert("Enviado email para " + email);
    window.location = "agentes.html";
}


function voltar(event){
    event.preventDefault(); // evita o comportamento padrão do formulário
    window.location = "index.html";
}