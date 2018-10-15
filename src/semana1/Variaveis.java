package semana1;

/**
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
    	String stringDesc="String: Armazena uma cadeia de caracteres. Sua defini��o � String nomeDaString=\"Aqui tem string\";.";
String intDesc="Int: Vari�vel do tipo primitivo, armazena um valor inteiro. N�o s�o usadas aspas em sua defini��o, assim: \n int dedosDaMinhaMao=5;";
String floatDesc="Float: Vari�vel do tipo primitivo, armazena n�meros decimais, possui precis�o simples. � necess�rio adicionar um \"f\" ao final do valor definido sempre que este for um decimal, caso contr�rio ocorrer� um erro de precis�o.";
String doubleDesc="Double: Tamb�m uma vari�vel de tipo primitivo, com dupla precis�o contra o float.";
String charDesc="Char: Recebe um �nico caractere. Quando n�o recebe um n�mero, sua defini��o � feita com aspas simples, inclusive nos caracteres de escape.";


System.out.println(stringDesc);
System.out.println(intDesc);
System.out.println(floatDesc);
System.out.println(doubleDesc);
System.out.println(charDesc);

System.out.println("-------- Strings --------");
String nome="Jo�o Lucio";
String empresa="Cognizant";
String mensagem="O rato roeu a roupa do rei de roma";
String poema="Escrevo essa estrofe \n Numa noite estrelada \n Pois isso � um exerc�cio \n Do curso de java";
String conselho="\t indente seu c�digo";
String falatorio="Ouvi dizer que \"Sintaxe Java � mais f�cil que sintaxe de Python\"";
String apresentacao="Muito prazer! Meu nome � " + nome;
String minhasTarefas="Escrever um System.out.println pra cada uma dessas strings";
String oQueVouFazer="Juntar tudo numa string s� e mandar printar";
String aiesta=nome + "\n" + empresa + "\n" + mensagem + "\n" + poema + "\n" + conselho + "\n" + falatorio + "\n" + apresentacao + "\n" + minhasTarefas + "\n" + oQueVouFazer;
System.out.println(aiesta);
System.out.println("--------Int--------");
int ladosDeUmaBola=2;
int quantosCarasExistem=1;
int vezesSalarioCaiMinhaConta=150;
int quantasSeraoQuandoAprenderJava=vezesSalarioCaiMinhaConta*2;
int meuVoto=0;
int quantosIntsFaltamPraEuDefinir=4;
int iPhoneAtual=10;
int proximoIPhone=iPhoneAtual+1;
int eAgora=quantosIntsFaltamPraEuDefinir-1;
int intNaoProcessaNumerosMaioresQue=2147483647;

System.out.println("Por que a bola tem " + ladosDeUmaBola + " lados?");
System.out.println("Deve ser porque s� existe " + quantosCarasExistem + " cara.");
System.out.println("Que n�o sou eu, mas por m�s, o sal�rio cai " + vezesSalarioCaiMinhaConta + " vezes na minha conta.");
System.out.println("N�o � pouco, mas quando aprender Java, cair� " + quantasSeraoQuandoAprenderJava + " vezes.");
System.out.println("No segundo turno entre 0 e 00, permanecerei com o " + meuVoto + ".");
System.out.println("Espero que essa quantidade toda de ints pra declarar realmente sirvam pra adquirir flu�ncia, ainda faltam " + quantosIntsFaltamPraEuDefinir + ".");
System.out.println("Tenho um Iphone " + iPhoneAtual + ", mas j� n�o me serve mais. Espero que o " + proximoIPhone + " n�o demore.");
System.out.println("E agora? Ainda faltam " + eAgora + "ints...");
System.out.println("Claro que n�o falta tudo isso. Vamos acabar logo, at� o int no Java tem limite e � " + intNaoProcessaNumerosMaioresQue + ".");
System.out.println("--------Float--------");
float horasTrabalhadas=8f;
float rotacoesPorMinuto=33.5f;
float rotacaoAntiga=78;
float tamanhoDoDisquete=3.5f;
float horasDoProjeto=32.8f;
float media=horasDoProjeto/horasTrabalhadas;
float limite=340282347f;
String floatPrint=horasTrabalhadas + "\n" + rotacoesPorMinuto + "\n" + rotacaoAntiga + "\n" + tamanhoDoDisquete + "\n" + horasDoProjeto + "\n" + media + "\n" + limite;
System.out.println(floatPrint);
System.out.println("--------Double--------");
double meuSalario=8500;
double garotasQueSaiEmSetembro=30;
double despesasComEncontros=meuSalario/garotasQueSaiEmSetembro;
double tiposPrimitivos=8;
double populacaoBrasileira=2085000;
double tamanhoDoBrasil=8516000;
double espacoParaCadaBrasileiro=tamanhoDoBrasil/populacaoBrasileira;
double doubleELegalAteChegarEm=494065645841246544e-324;
double oQueAconteceQuandoOLimiteEUltrapassado=doubleELegalAteChegarEm+1; //isso foi diferente do que eu mesmo esperava
double quandoVoceRealmentePassaDoLimite=doubleELegalAteChegarEm*2; //E esse foi completamente diferente
String doublePrint=meuSalario + "\n" + garotasQueSaiEmSetembro + "\n" + despesasComEncontros + "\n" + tiposPrimitivos + "\n" + populacaoBrasileira + "\n" + tamanhoDoBrasil + "\n" + espacoParaCadaBrasileiro + "\n" + doubleELegalAteChegarEm + "\n" + oQueAconteceQuandoOLimiteEUltrapassado + "\n" + quandoVoceRealmentePassaDoLimite;
System.out.println(doublePrint);
System.out.println("--------Char--------");
char sOuN='s';
char index=6;
char pulaLinha='\n';
char marcaRegistrada='\u2122';
String charPrint=sOuN + "\n" + index + "\n" + pulaLinha + "\n" + marcaRegistrada;
System.out.println(charPrint);
System.out.println("--------");
}
}

    }
}

