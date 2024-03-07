
//1. Write a program to check if the letter 'e' is present in the word 'Umbrella'.

public class CheckingLetter {
    public static void main(String[] args){
        String Word = "jeeva";
        int count = 0;
        for (int i=0;i<Word.length();i++) {
            if ( Word.charAt(i) == 'e' || Word.charAt(i) == 'E'){
                System.out.println("e is Present ");
                count +=1;
                break;
            }
        }
        if (count == 0){
            System.out.println("e is not present");
        }
    }
}
