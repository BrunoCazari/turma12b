/* var empresa=" Gama Academy";
var mensagem="Sejam bem vindos - ";
alert(mensagem+empresa);*/

// alert("Sejam bem vindos a nossa página de JavaScript");

/*var nome=prompt("Seja bem vindo, por favor ditgite o seu nome","Insira o seu nome completo");
alert("Bem vindo "+nome+" a escola Gama Academy");*/

function mensagem(){
    alert("Você ganhou duas horas gratuítas do curso de CSS");

}

function validar(){
    var nome=formuser.nome.value;
    var email=formuser.email.value;

    if(nome==""){
        alert("O preenchimento do campo nome é obrigatório");
        formuser.nome.focus();
        return false;
    }
    
    if(email=="" || email.indexOf('@')==-1){
        alert("O preenchimento do campo email é obrigatório");
        formuser.email.focus();
        return false; 
    }

    alert("Preado(a) "+ nome+ " estaremos lhe enviando o nosso portifólio do curso da Gama Academy para o seu email "+email);

}