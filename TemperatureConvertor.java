package temperature.convertor;

/**
 *
 * @author Sham
 */
import java.util.*;
public class TemperatureConvertor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Preferred Conversion:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Kelvin\n3. Kelvin to Celsius\n4. Celsius to Kelvin\n5. Kelvin to Fahrenheit\n6. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Celsius Temperature:");
                double tempc = sc.nextDouble();
                System.out.printf("The Corresponding Fahrenheit temperature is %.2f \n",((tempc * (9.0/5.0)) + 32.0));
                break;
            case 2:
                System.out.println("Enter Fahrenheit Temperature:");
                double tempf = sc.nextDouble();
                System.out.printf("The Corresponding Kelvin Temperature is %.2f \n",(((tempf - 32.0) * (5.0/9.0))+273.15));
                break;
            case 3:
                System.out.println("Enter Kelvin Temperature:");
                double tempk = sc.nextDouble();
                System.out.printf("The Corresponding Celsius Temperature is %.2f \n",(tempk - 273.15));
                break;
            case 4:
                System.out.println("Enter Celsius Temperature:");
                double tempcel = sc.nextDouble();
                System.out.printf("The Corresponding Kelvin Temperature is %.2f \n",(tempcel + 273.15));
                break;
            case 5:
                System.out.println("Enter Kelvin Temperature:");
                double tempkel = sc.nextDouble();
                System.out.printf("The Corresponding Fahrenheit Temperature is %.2f \n",(((tempkel - 273.15) * (9.0/5.0)) + 32.0));
                break;
            case 6:
                System.out.println("Enter Fahrenheit Temperature:");
                double tempfah = sc.nextDouble();
                System.out.printf("The Corresponding Celcius Temperature is %.2f \n",((tempfah - 32.0) * (5.0/9.0)));
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }
        
    }
}