
public class Cheers {
        public static void main(String[] args) {
        
                String name = args [0];
                int num = Integer.parseInt(args[1]);
                int length = name.length();
                String anLet = "AEFHILMNORSX";
                name = name.toUpperCase();
                for (int i=0; i < length ; i++ ){
                        char letter = name.charAt(i);

                         if (anLet.indexOf(letter) == -1) {
                                System.out.println("Give me a  " + letter + ": " + letter + "!"); 
                        }
                        else {
                                System.out.println("Give me an " + letter + ": " + letter + "!");                }

                        }
                System.out.println("what does that spell? ");

                for (int i = 0; i < num; i++){
                        System.out.println(name + "!!!");
                }



        }
}
