public class LargestAndsmallest {
    public static void main(String[] args){
        int[] array = {4, 2, 7, 1, 9, 5};

        int MaxElement = array[0];
        int minElement = array[0];

        for (int i: array){
            if (MaxElement<i){
                MaxElement = i;
            }
        }

        for(int j :array){
            if (minElement>j){
                minElement = j;
            }
        }
        System.out.println("largest Number "+MaxElement);
        System.out.println("Smallest Element "+minElement);
    }
}
