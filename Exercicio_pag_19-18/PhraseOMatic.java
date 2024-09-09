public class PhraseOMatic{
   public static void main (String[] args) {

     //declara três string

     String[] wordsOne = {"laranja", "mamão","maçã" ,"limão" ,"banana"};
     String[] wordsTwo = {"como", "guardo", "trituro", "faço vitamina com"};
     String[] word = {"a","ela"};

     //Extrai tamanho das duas string

     int length_one = wordsOne.length;
     int length_two = wordsTwo.length;

     java.util.Random randomGenerator = new java.util.Random();

     //Utiliza randomGenerator para escolher dentro das strings de forma aleatoria de acordo com Tamanho

     int one_random = randomGenerator.nextInt(length_one);

     if(wordsOne[one_random].contains("ão"))
     {
       length_two = length_two - 1;
       word[0] = "o"; 
       word[1] = "ele";
     };

     int two_random = randomGenerator.nextInt(length_two);

     //resultado
     System.out.println(" Com " + word[0] + " "  +  wordsOne[one_random] + " eu " + wordsTwo[two_random] + " " + word[1]);
  }
}