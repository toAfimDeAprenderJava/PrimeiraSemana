package semana1;

/**
 *  Como fazer o pull reuest: https://blog.da2k.com.br/2015/02/04/git-e-github-do-clone-ao-pull-request/
 *  Descreva 5 tipos de variaveis  e associe 10 variavel com algum dado compativel com ela.
 *  
 *  Armazene a descrição da variavel em uma variavel e imprima as variaveis no console do seguinte modo:
 *
 *
 *  nomeDaVariavel: + variavelExplicação + tipoDaVariavel 
 *
 *
 *  Dica: Procure ser simples, Variaveis de ambiente não se aplicam nessa semana.
 *  Dica2: Para mostrar algo no console procure entender o metodo "print"
 *
 */

public class Variaveis {


    public static void main(String[] args) {

        int varInt = 15;
        long varLong = 444444444;
        double varDouble = 3.55;
        char varChar = 'C';
        boolean varBoolean = true;

        int varIntDois = 31;
        long varLongDois = 33131;
        double varDoubleDois = 533.55;
        char varCharDois = 'U';
        boolean varBooleanDois = false;

        System.out.println("Nome da variavel 'varInt' | Explicacao da Variavel: Variavel responsável por armazezar tipos inteiros ex: 1,2 3..etc | Tipo da variavel: int | conteudo da variavel "+ varInt);
        System.out.println("Nome da variavel 'varLong' | Explicacao da Variavel: Variavel responsável por armazezar tipos inteiros com maior range que o 'int' | Tipo da variavel 'long' | conteudo da variavel " + varLong);
        System.out.println("Nome da variavel 'varDouble' | Explicacao da Variavel: Variavel responsável por armazenar tipos de dados de ponto flutuante ex: 2.55  'double' | Tipo da variavel 'double' | conteudo da variavel "+ varDouble);
        System.out.println("Nome da variavel 'varChar'  | Explicacao da Variavel: Variavel responsável por armazenar um caractere ex: A, B, C | Tipo da variavel 'char' | conteudo da variavel "+ varChar );
        System.out.println("Nome da variavel 'varDouble'  | Explicacao da Variavel:  Variavel responsavel por armazenar tipo booleanos Verdadeiro (true) e Falso (false) | Tipo da variavel 'boolean' | Conteudo da variavel "+ varBoolean);

        System.out.println("Nome da variavel 'varIntDois' | Explicacao da Variavel: Variavel responsável por armazezar tipos inteiros ex: 1,2 3..etc | Tipo da variavel: int | conteudo da variavel "+ varIntDois);
        System.out.println("Nome da variavel 'varLongDois' | Explicacao da Variavel: Variavel responsável por armazezar tipos inteiros com maior range que o 'int' | Tipo da variavel 'long' | conteudo da variavel " + varLongDois);
        System.out.println("Nome da variavel 'varDoubleDois' | Explicacao da Variavel: Variavel responsável por armazenar tipos de dados de ponto flutuante ex: 2.55  'double' | Tipo da variavel 'double' | conteudo da variavel "+ varDoubleDois);
        System.out.println("Nome da variavel 'varCharDois'  | Explicacao da Variavel: Variavel responsável por armazenar um caractere ex: A, B, C | Tipo da variavel 'char' | conteudo da variavel "+ varCharDois );
        System.out.println("Nome da variavel 'varDoubleDois'  | Explicacao da Variavel:  Variavel responsavel por armazenar tipo booleanos Verdadeiro (true) e Falso (false) | Tipo da variavel 'boolean' | Conteudo da variavel "+ varBooleanDois);
    }
}
