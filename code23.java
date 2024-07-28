import java.util.Scanner;
class code23{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the variables to use the calculator");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("now choose a wise choise between 1 - 4 (addition,sub,mul,div)");
        int no = scanner.nextInt();
        switch(no){
            case 1:
                System.out.printf("So you have choosen addition huh? Here is the answer you seeked for <3 %d",a+b);
                break;
            case 2:
                System.out.printf("So you have choosen subtraction huh? Here is the answer you seeked for <3 %d",a-b);
                break;
            case 3:
                System.out.printf("So you have choosen multiplication huh? Here is the answer you seeked for <3 %d",a*b);
                break;
            case 4:
                System.out.printf("So you have choosen division huh? Here is the answer you seeked for <3 %d",a/b);
                break;
        }
    }
}   