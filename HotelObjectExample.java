import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HotelObjectExample {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n***************************************");
        System.out.println("***** " + "\033[1;93m" + "CRUISE SHIP BOARDING SYSTEM" + "\033[0m" + " *****");
        System.out.println("***************************************\n");
        Scanner input = new Scanner(System.in);
        Room[] myHotel = new Room[12];
        myHotel[0] = new Room();
        myHotel[1] = new Room();
        myHotel[2] = new Room();
        myHotel[3] = new Room();
        myHotel[4] = new Room();
        myHotel[5] = new Room();
        myHotel[6] = new Room();
        myHotel[7] = new Room();
        myHotel[8] = new Room();
        myHotel[9] = new Room();
        myHotel[10] = new Room();
        myHotel[11] = new Room();
        String roomName;
        int roomNum = 0;
        initialise(myHotel);
        while (roomNum < 12) {
            //menu input
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
            switch (option) {
                case "V":
                case "v":
                    for (int x = 0; x < 12; x++) {
                        if (myHotel[x].mainName.equals("e"))
                            System.out.println("room " + x + " is empty");
                        else {
                            System.out.println("room " + x + " occupied by " + myHotel[x].mainName);
                            // System.out.println("room " + x + " occupied by " + myHotel[x].getName());
                        }//from this you can view all your rooms
                    }
                    break;
                case "A":
                case "a":
                    System.out.println("Enter room number (0-11) or 12 to stop: ");
                    //error with 12
                    roomNum = input.nextInt();
                    System.out.println("Enter name for room " + roomNum + ":");
                    roomName = input.next();
                    myHotel[roomNum].mainName = roomName;
                    //in here you can add

                    break;
                case "E":
                case "e":
                    for (int x = 0; x < 12; x++) {
                        if (myHotel[x].mainName.equals("e"))
                            System.out.println(x + "is empty");
                    }//in here you can look for empty cabins
                    break;
                case "D":
                case "d":{
                    System.out.println("Enter the name of the customer you want to remove: ");
                    String name = input.nextLine();
                    for (int x = 0; x < 12; x++) {
                        if (myHotel[x].mainName.equals(name)) {
                            myHotel[x].mainName = "e";
                        }//in here you can delete
                    }
                    break;
                }
                case "F":
                case "f":
                    System.out.println("Enter the name of the customer you want to search: ");
                    String name = input.nextLine();
                    for (int x = 0; x < 12; x++) {
                        if (myHotel[x].mainName.equals(name)) {
                            System.out.println(x + " is occupied by " + name);
                        }// in here you can find the cabin
                    }
                    break;

                case "S":
                case "s":
                    try {
                        FileWriter mywrite = new FileWriter("data.txt");
                        for (int x = 0; x < 12; x++) {
                            if (myHotel[x].mainName.equals("e")) {
                                mywrite.write("Room " + x + " is empty");
                                mywrite.write(" \n");
                            } else {
                                mywrite.write("Room " + x + " is occupied by " + myHotel[x].mainName);
                                mywrite.write("\n");
                            }
                        }
                        mywrite.close();
                    } catch (IOException e) {
                        System.out.println("an error has occurred");
                        e.printStackTrace();
                        //exception when writing the file
                    }
                    break;
                case "L":
                case "l":
                    File readfile = new File("readdata.txt");
                    Scanner readata = new Scanner(readfile);
                    String fileline;
                    while (readata.hasNext()) {
                        fileline = readata.nextLine();
                        System.out.println(fileline);
                    }// loading the file
                    break;
                case "O":
                case "o":
                    String temp;
                    for (int x = 0; x < 12; x++) {
                        for (int y = x + 1; y < 12; y++) {
                            if (myHotel[x].mainName.compareTo((myHotel[y].mainName)) > 0) {
                                temp = (myHotel[x].mainName);
                                myHotel[x].mainName = myHotel[y].mainName;
                                (myHotel[y].mainName) = temp;
                            }// in here you can alphabatically order it
                        }
                    }
                    for (int x = 0; x < 12; x++) {
                        if (!myHotel[x].mainName.equals("e"))
                            System.out.println(myHotel[x].mainName);
                    }
                    break;
                default:
                    System.out.println("You have entertered a invalid input");
            }
            // myHotel[roomNum].setName(roomName);
        }
    }
    private static void initialise(Room[] hotelRef) {
        for (int x = 0; x < 12; x++ ) hotelRef[x].mainName = "e";
        System.out.println( "initilise ");
    }
}
