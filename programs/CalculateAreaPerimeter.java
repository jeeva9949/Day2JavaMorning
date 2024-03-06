public class CalculateAreaPerimeter {
    public static void main(String[] args){
        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);

        double area  = length * breadth ;
        double perimeter =  2 * (length + breadth);


        System.out.println(area);
        System.out.println(perimeter);
    }
}
