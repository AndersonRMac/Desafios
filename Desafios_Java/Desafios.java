import java.util.HashSet;
import java.util.Set;

public class Desafios {
    public static void main(String[] args) {


        Desafios d = new Desafios();
        d.itens_repetidos("abcde");
        d.CalculaMedia(new int[]{10, 20, 30});
    }
    /*
    Conte o número de duplicatas
    Escreva uma função que retornará a contagem de caracteres alfabéticos distintos, sem distinção entre maiúsculas e minúsculas,
    e dígitos numéricos que ocorrem mais de uma vez na string de entrada.
    Pode-se presumir que a string de entrada contém apenas alfabetos (maiúsculas e minúsculas) e dígitos numéricos.
     */
    public int itens_repetidos(String texto){

        String texto_novo = texto.toLowerCase();
        Set<Character>itens_repetidos = new HashSet<>();
        Set<Character>itens_unicos = new HashSet<>();

        for (char c: texto_novo.toCharArray()){
            if (itens_unicos.contains(c)){
                itens_repetidos.add(c);
            }else{
                itens_unicos.add(c);
            }
        }

        System.out.println(itens_repetidos.size());
        return itens_repetidos.size();
    }

    /*
    Verifique se uma string tem a mesma quantidade de 'x's e 'o's.
    O método deve retornar um booleano e não diferenciar maiúsculas de minúsculas.
    A string pode conter qualquer caractere.
     */

    public boolean verify_x_o(String string){
        boolean its_ok = false;

        String tudo_minusculo = string.toLowerCase();
        Long conta_X = tudo_minusculo.chars().filter(ch -> ch == 'x').count();
        Long conta_o = tudo_minusculo.chars().filter(ch -> ch =='o').count();
        if (conta_X == conta_o) its_ok = true;
        else its_ok = false;
        return its_ok;
    }

    /*
    Define a function that takes an integer argument and returns a logical value true or false depending on if the integer is a prime.
Per Wikipedia, a prime number ( or a prime ) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     */

    public boolean isPrimo(Integer numero){
        if (numero % 1 == 0 || numero % numero == 0) return true;
        else return false;
    }

    public Integer CalculaMedia(int[] numeros){

        int soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        int media = soma / numeros.length;
        System.out.println("A média dos números do array é: " + media);
        return media;
    }
}
