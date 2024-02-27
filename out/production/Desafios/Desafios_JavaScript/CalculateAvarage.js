function mediaNumeros(array) {
    if (array.length === 0) {
        return 0;
    }

    let soma = 0;
    for (let i = 0; i < array.length; i++) {
        soma += array[i];
    }
    return soma / array.length
}

var meuArray = [10,20,30]   //resposta = 20
var media = mediaNumeros(meuArray);
console.log("A média dos numeros é: " + media);

