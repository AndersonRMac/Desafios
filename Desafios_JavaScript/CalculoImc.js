function imc(peso, altura) {

    calculoImc = peso / altura**2

    if ( calculoImc <= 18.5 ) {
        console.log("Abaixo do peso");
        return "Abaixo do peso";
    }else if (calculoImc <= 25.0) {
        console.log("Normal");
        return "Normal";
    }else if (calculoImc <= 30.0) {
        console.log("Excesso de Peso");
        return "Excesso de Peso";
    } else if (calculoImc > 30.0) {
        console.log("Obeso");
        return "Obeso"; 
    }
}


imc(80, 1.73);