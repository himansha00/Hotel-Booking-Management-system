import java.util.Scanner;

public class cabins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        passengers[] cabins = new passengers[12];
        cabins[0] = new passengers();
        cabins[1] = new passengers();
        cabins[2] = new passengers();
        cabins[3] = new passengers();
        cabins[4] = new passengers();
        cabins[5] = new passengers();
        cabins[6] = new passengers();
        cabins[7] = new passengers();
        cabins[8] = new passengers();
        cabins[9] = new passengers();
        cabins[10] = new passengers();
        cabins[11] = new passengers();
        int cabinNum = 0;
        String cabinfirstName;
        String cabinlastName;
        int cabinExpenses;
        initialised(cabins);
        while (cabinNum < 12){
            System.out.println("Menu");
            System.out.println("Add Customer to cabin(A)");
            System.out.println("View All cabins(V)");
            System.out.println("Display Empty cabins(E)");
            System.out.println("Delete customer from cabin(D)");
            System.out.println("Find cabin from customer name(F)");
            System.out.println("Store program data into file(S)");
            System.out.println("Load program data from file(L)");
            System.out.println("View passengers Ordered alphabetically by name(O)");
            System.out.println("Please enter your option: ");
            String option = input.nextLine();
            if (option.equals("A")) {
                System.out.println("Enter a cabin number you want to enter (0 - 11): ");
                cabinNum = input.nextInt();
                System.out.println("Enter the last name for room" + cabinNum + ":");
                cabinlastName = input.nextLine();
                cabins[cabinNum].lastname = cabinlastName;
                System.out.println("Enter the first name for room" + cabinNum + ":");
                cabinfirstName = input.nextLine();
                cabins[cabinNum].firstname = cabinfirstName;
                System.out.println("Enter expenses for room " + cabinNum + ":");
                cabinExpenses = input.nextInt();
                cabins[cabinNum].expenses = cabinExpenses;
            }
            else if(option.equals("V")){
                for (int x = 0; x < 12; x++){
                     if (cabins[x].firstname.equals("e") && cabins[x].lastname.equals("f") && cabins[x].expenses == 0){
                        System.out.println("Room " + x + " is empty");
                    }
                    else{
                        System.out.println("Your first name is :" + cabins[x].firstname);
                        System.out.println("Your last name is: " + cabins[x].lastname);
                        System.out.println("Your expenses are: " + cabins[x].expenses);
                    }
                }
            }
        }
    }
    private static void initialised (passengers[] cabinRef){
        for (int x = 0; x < 12; x++){
            cabinRef[x].firstname = "e";
            cabinRef[x].lastname = "f";
            cabinRef[x].expenses = 0;
        }
    }
}
