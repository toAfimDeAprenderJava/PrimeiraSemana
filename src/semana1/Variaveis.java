//Nome: Pedro Henrique Vieira do Nascimento - ID:717474package semana1;/** *  Como fazer o pull reuest: https://blog.da2k.com.br/2015/02/04/git-e-github-do-clone-ao-pull-request/ *  Descreva 5 tipos de variaveis  e associe 10 variavel com algum dado compativel com ela. *   *  Armazene a descrição da variavel em uma variavel e imprima as variaveis no console do seguinte modo: * * *  nomeDaVariavel: + variavelExplicação + tipoDaVariavel  * * *  Dica: Procure ser simples, Variaveis de ambiente não se aplicam nessa semana. *  Dica2: Para mostrar algo no console procure entender o metodo "print" * */public class Variaveis {    public static void main(String[] args) {        String nome = "Pedro", sobrenome = "Nascimento";        int idade = 18, telefone = 959608813;        double altura = 1.78, peso 61.3;        boolean trabalha = true, estuda = true;        char masculino = 'M', feminino = 'F';        System.out.println(nome + sobrenome + " - String - Poderá receber letras, números e símbolos");        System.out.println(idade + ", " + telefone + " - int - Poderá receber números inteiros positivos ou negativos");        System.out.println(altura + ", " + peso + " - double - Poderá receber números reais, isto é, com casas decimais, positivos ou negativos");        System.out.println(trabalha + ", " + estuda + " - boolean - Poderá receber verdadeiro (1) ou falso (0)");        System.out.println(masculino + ", "+ feminino + " - char - Poderá receber letras, números e símbolos, utilizando '' ");    }}