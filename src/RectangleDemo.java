import java.util.Scanner;

class RectangleArea{
    static float sideA, sideB,result;

    static void getData(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the length of the side a:\n");
        sideA = myObj.nextFloat();
        System.out.println("Enter the length of the side b:\n");
        sideB = myObj.nextFloat();
        computeField();

    }
    static float computeField(){
        result = sideA*sideB;
        return result;




    }
    static void fieldDisplay(){
        System.out.println("the RectangleArea of the Rectangle with side a "+sideA+" and side b "+sideB+" is : "+result);


    }

}

public class RectangleDemo {

    public static void main(String[] args) {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();



    }
}
