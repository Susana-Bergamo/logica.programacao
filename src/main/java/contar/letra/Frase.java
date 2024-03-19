package contar.letra;

public class Frase {

    public static void main(String [] args) {

        String frase = "Eu sou a pessoa mais incrível que eu posso ser, e através do meu esforço vou conquistar o que já é MEU.";
        char letra ='a';
        int contarLetra =1;

        //remover caracteres especial
        frase = frase.replaceAll("[^a-zA-z]","");

        for(int i =0 ; i < frase.length() ; i ++) {

            if(frase.charAt(i) == letra) {
                contarLetra++;
            }
        }

        System.out.println("Há " + contarLetra + " letras 'a' na frase.");
    }

}
