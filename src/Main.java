import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("-----WELCOME-----");
        System.out.println();


        Scanner scanner = new Scanner(System.in);

        int numPerson;
        System.out.print("Enter total person count : ");
        numPerson = scanner.nextInt();
        System.out.println();

        String[] nameArray = new String[numPerson];
        long[] incArray = new long[numPerson];


        for (int i = 0; i < nameArray.length; i++) {

            System.out.println("enter name " + (i + 1) + ":");
            nameArray[i] = scanner.next();

            System.out.println("Enter " + nameArray[i] + "'s " + "Annual Income : ");


            incArray[i] = scanner.nextLong();
            System.out.println();
        }

        for (int j = 0; j < numPerson; j++) {
            calculateTax(nameArray[j], incArray[j]);
        }
    }

        public static void calculateTax (String name, long annualIncome) {
            double tax;
            if (annualIncome >= 300000){
                tax = annualIncome * 0.20;
            }
            else if (annualIncome >= 100000){
                tax=annualIncome*0.10;
            }
                else{
                    tax = 0;
            }
            System.out.println(name + " : " + '\u20B9' + tax);

        }
}
