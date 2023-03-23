import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number,total=0,k=0;
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        for(int i =0;i<=number;i++){
            if(i % 12 == 0){
                total += i;
                k++;
            }
        }
        if(k>0){
            System.out.println("Average = "+(total/k));
        }else{
            System.out.println("There is no divisible number");
        }

    }
}

