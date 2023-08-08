import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class testqueue {
    public static class cabins2 {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner input = new Scanner(System.in);
            passengers[] cabins2 = new passengers[12];

            cabins2[0] = new passengers();
            cabins2[1] = new passengers();
            cabins2[2] = new passengers();
            cabins2[3] = new passengers();
            cabins2[4] = new passengers();
            cabins2[5] = new passengers();
            cabins2[6] = new passengers();
            cabins2[7] = new passengers();
            cabins2[8] = new passengers();
            cabins2[9] = new passengers();
            cabins2[10] = new passengers();
            cabins2[11] = new passengers();

            String roomName1;
            String roomName2;
            String roomName3;
            String roomName4;
            String roomName5;
            String yorn; // declared the string to add a person
            int expenses;
            int expenses1;
            int expenses2;
            int fullprice = 0;
            int roomNum = 0;
            initialise(cabins2);
            String firstnamequeue;
            String firstnamequeuetwo;
            String firstnamequeuethree;
            String firstnamequeuefour;
            String firstnamequeuefive;
            firstnamequeue = "e";
            firstnamequeuetwo = "e";
            firstnamequeuethree = "e";
            firstnamequeuefour = "e";
            firstnamequeuefive = "e";
            System.out.println("Enter the first name that you want to add to the queue: ");
            firstnamequeue = input.nextLine();
            CircularQueue<String> circularQueue = new CircularQueue(5);
            circularQueue.enqueue(firstnamequeue);
            circularQueue.enqueue(firstnamequeuetwo);
            circularQueue.enqueue(firstnamequeuethree);
            circularQueue.enqueue(firstnamequeuefour);
            circularQueue.enqueue(firstnamequeuefive);
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
                System.out.println("Show the total price of each passenger and price of each passenger(T) ");
                System.out.println("View passengers Ordered alphabetically by name(O)");
                System.out.println("Please enter your option: ");
                String option = input.nextLine();

                if (option.equals("V")) {
                    for (int x = 0; x < 12; x++){
                        if ((cabins2[x].firstname.equals("e") && cabins2[x].lastname.equals("e") && cabins2[x].expenses == 0) && (cabins2[x].firstname1.equals("e") && cabins2[x].lastname2.equals("e") && cabins2[x].expenses1 == 0) && (cabins2[x].firstname2.equals("e") && cabins2[x].lastname2.equals("e") && cabins2[x].expenses2 == 0))
                            System.out.println("Cabin " + x + " is empty");
                        else{
                            System.out.println("cabin " + x + " occupied by " + cabins2[x].firstname + " " + cabins2[x].lastname);
                            System.out.println("Expenses for the cabin " + x + " is " + cabins2[x].expenses +" Dollars");
                            if ((cabins2[x].firstname1.equals("e") && cabins2[x].lastname1.equals("e") && cabins2[x].expenses1 == 0)){
                                System.out.println("Person 2 and 3 are empty");
                            }
                            else{
                                System.out.println("Cabin " + x + " occupied by " + cabins2[x].firstname1 + " " + cabins2[x].lastname1);
                                System.out.println("Expenses for the cabin " + x + " is " + cabins2[x].expenses1 + " Dollars");
                                if (cabins2[x].firstname2.equals("e") && cabins2[x].lastname2.equals("e") && cabins2[x].expenses2 == 0){
                                    System.out.println("Person 3 is empty");
                                }
                                else{
                                    System.out.println("Cabin " + x + " occupied by " + cabins2[x].firstname2 + " " + cabins2[x].lastname2);
                                    System.out.println("Expenses for the cabin " + x + " is " + cabins2[x].expenses2 + " Dollars");
                                }
                            }
                        }
                    }
                }
                else if (option.equals("A")){
                    System.out.println("Enter room number (0-11) or 12 to stop: ");
                    roomNum = input.nextInt();
                    while(true){
                        for (int x = 0; x < 12; x++){
                            if ((cabins2[x].firstname.equals("e")) && (cabins2[x].firstname1.equals("e")) && (cabins2[x].firstname2.equals("e"))){
                                System.out.println("Enter first name for room " + roomNum + ":");
                                roomName1 = input.next();
                                cabins2[roomNum].firstname = roomName1;
                                System.out.println("Enter your last name for room " + roomNum + ":");
                                roomName2 = input.next();
                                cabins2[roomNum].lastname = roomName2;
                                System.out.println("Enter your expenses for room " + roomNum + ":");
                                expenses = input.nextInt();
                                cabins2[roomNum].expenses = expenses;
                                System.out.println("Do you want to add another person(press Y to add and N to abort adding persons): ");
                                yorn = input.next();
                                if (yorn.equals("N")){
                                    break;
                                }
                                else if (yorn.equals("Y")){
                                    System.out.println("Enter first name for room " + roomNum + ":");
                                    roomName3 = input.next();
                                    cabins2[roomNum].firstname1 = roomName3;
                                    System.out.println("Enter your last name for room " + roomNum + ":");
                                    roomName4 = input.next();
                                    cabins2[roomNum].lastname1 = roomName4;
                                    System.out.println("Enter your expenses for room " + roomNum + ":");
                                    expenses1 = input.nextInt();
                                    cabins2[roomNum].expenses1 = expenses1;
                                    System.out.println("Do you want to add another person(press Y to add and N to abort adding persons): ");
                                    yorn = input.next();
                                    if (yorn.equals("N")){
                                        break;
                                    }
                                    else if (yorn.equals("Y")){
                                        System.out.println("Enter first name for room " + roomNum + ":");
                                        roomName4 = input.next();
                                        cabins2[roomNum].firstname2 = roomName4;
                                        System.out.println("Enter your last name for room " + roomNum + ":");
                                        roomName5 = input.next();
                                        cabins2[roomNum].lastname2 = roomName5;
                                        System.out.println("Enter your expenses for room " + roomNum + ":");
                                        expenses2 = input.nextInt();
                                        cabins2[roomNum].expenses2 = expenses2;
                                        break;
                                    }
                                }
                            }
                            if (!(cabins2[x].firstname.equals("e")) && (cabins2[x].firstname1.equals("e")) && (cabins2[x].firstname2.equals("e"))){
                                if ((cabins2[x].firstname.equals("e")) && (cabins2[x].firstname1.equals("e")) && (cabins2[x].firstname2.equals("e"))){
                                    System.out.println("Enter first name for room " + roomNum + ":");
                                    roomName1 = input.next();
                                    cabins2[roomNum].firstname = roomName1;
                                    System.out.println("Enter your last name for room " + roomNum + ":");
                                    roomName2 = input.next();
                                    cabins2[roomNum].lastname = roomName2;
                                    System.out.println("Enter your expenses for room " + roomNum + ":");
                                    expenses = input.nextInt();
                                    cabins2[roomNum].expenses = expenses;
                                    System.out.println("Do you want to add another person(press Y to add and N to abort adding persons): ");
                                    yorn = input.next();
                                    if (yorn.equals("N")){
                                        break;
                                    }
                                    else if (yorn.equals("Y")){
                                        System.out.println("Enter first name for room " + roomNum + ":");
                                        roomName3 = input.next();
                                        cabins2[roomNum].firstname1 = roomName3;
                                        System.out.println("Enter your last name for room " + roomNum + ":");
                                        roomName4 = input.next();
                                        cabins2[roomNum].lastname1 = roomName4;
                                        System.out.println("Enter your expenses for room " + roomNum + ":");
                                        expenses1 = input.nextInt();
                                        cabins2[roomNum].expenses1 = expenses1;
                                        System.out.println("Do you want to add another person(press Y to add and N to abort adding persons): ");
                                        yorn = input.next();
                                        if (yorn.equals("N")){
                                            break;
                                        }
                                        else if (yorn.equals("Y")){
                                            System.out.println("Enter first name for room " + roomNum + ":");
                                            roomName4 = input.next();
                                            cabins2[roomNum].firstname2 = roomName4;
                                            System.out.println("Enter your last name for room " + roomNum + ":");
                                            roomName5 = input.next();
                                            cabins2[roomNum].lastname2 = roomName5;
                                            System.out.println("Enter your expenses for room " + roomNum + ":");
                                            expenses2 = input.nextInt();
                                            cabins2[roomNum].expenses2 = expenses2;
                                            break;
                                        }
                                    }
                                }
                            }
                            if ((cabins2[x].firstname.equals("e")) && !(cabins2[x].firstname1.equals("e")) && (cabins2[x].firstname2.equals("e"))){
                                if ((cabins2[x].firstname.equals("e")) && (cabins2[x].firstname1.equals("e")) && (cabins2[x].firstname2.equals("e"))){
                                    System.out.println("Enter first name for room " + roomNum + ":");
                                    roomName1 = input.next();
                                    cabins2[roomNum].firstname = roomName1;
                                    System.out.println("Enter your last name for room " + roomNum + ":");
                                    roomName2 = input.next();
                                    cabins2[roomNum].lastname = roomName2;
                                    System.out.println("Enter your expenses for room " + roomNum + ":");
                                    expenses = input.nextInt();
                                    cabins2[roomNum].expenses = expenses;
                                    System.out.println("Do you want to add another person(press Y to add and N to abort adding persons): ");
                                    yorn = input.next();
                                    if (yorn.equals("N")){
                                        break;
                                    }
                                    else if (yorn.equals("Y")){
                                        System.out.println("Enter first name for room " + roomNum + ":");
                                        roomName4 = input.next();
                                        cabins2[roomNum].firstname2 = roomName4;
                                        System.out.println("Enter your last name for room " + roomNum + ":");
                                        roomName5 = input.next();
                                        cabins2[roomNum].lastname2 = roomName5;
                                        System.out.println("Enter your expenses for room " + roomNum + ":");
                                        expenses2 = input.nextInt();
                                        cabins2[roomNum].expenses2 = expenses2;
                                        break;
                                    }
                                }
                            }
                        }
                        // Maximum 3 enters of names

                    }
                }
                else if (option.equals("E")){
                    for (int x = 0; x < 12; x++){
                        if (cabins2[x].firstname.equals("e") && cabins2[x].lastname.equals("e") && cabins2[x].expenses == 0)
                            System.out.println(x + "is empty");
                    }
                }
                else if (option.equals("D")){
                    System.out.println("Enter the First name of the customer you want to remove: ");
                    String namefirst = input.nextLine();
                    for (int x = 0; x < 12; x++){
                        if (cabins2[x].firstname.equals(namefirst) || cabins2[x].lastname.equals(namefirst)){
                            cabins2[x].firstname = "e";
                            cabins2[x].lastname = "e";
                            cabins2[x].expenses = 0;
                        }
                        else if (cabins2[x].firstname1.equals(namefirst) || cabins2[x].lastname1.equals(namefirst)){
                            cabins2[x].firstname1 = "e";
                            cabins2[x].lastname1 = "e";
                            cabins2[x].expenses1 = 0;
                        }
                        else if (cabins2[x].firstname2.equals(namefirst) || cabins2[x].lastname2.equals(namefirst)){
                            cabins2[x].firstname2 = "e";
                            cabins2[x].lastname2 = "e";
                            cabins2[x].expenses2 = 0;
                        }
                    }
                }
                else if (option.equals("F")){
                    System.out.println("Enter the name of the customer you want to search: ");
                    String name = input.nextLine();
                    for (int x = 0; x < 12; x++){
                        if (cabins2[x].firstname.equals(name) || cabins2[x].lastname.equals(name)){
                            System.out.println("Cabin " + x + " is occupied by " + name);
                        }
                    }
                }
                else if (option.equals("S")){
                    try {
                        FileWriter mywrite = new FileWriter("data.txt");
                        for (int x = 0; x < 12; x++){
                            if (cabins2[x].firstname.equals("e")){
                                mywrite.write("Cabin " + x + " is empty");
                                mywrite.write(" \n");
                            }
                            else {
                                mywrite.write("Cabin " + x + " is occupied by " + cabins2[x].firstname + " " + cabins2[x].lastname);
                                mywrite.write("Expenses for person 1 is: "+ " " + cabins2[x].expenses);
                                mywrite.write("\n");
                                mywrite.write("Cabin " + x + " is occupied by " + cabins2[x].firstname1 + " " + cabins2[x].lastname1);
                                mywrite.write("Expenses for person 1 is:  "+ " " + cabins2[x].expenses1);
                                mywrite.write("\n");
                                mywrite.write("Cabin " + x + " is occupied by " + cabins2[x].firstname2 + " " + cabins2[x].lastname2);
                                mywrite.write("Expenses for person 1 is:  " + " " + cabins2[x].expenses2);
                                mywrite.write("\n");
                            }
                        }
                        mywrite.close();
                    } catch (IOException e) {
                        System.out.println("an error has occurred");
                        e.printStackTrace();
                    }
                }
                else if (option.equals("L")){
                    File readfile = new File("readdata.txt");
                    Scanner readata = new Scanner(readfile);
                    String fileline;
                    while (readata.hasNext()){
                        fileline = readata.nextLine();
                        System.out.println(fileline);
                    }
                }
                else if (option.equals("O")){
                    String temp;
                    for (int x = 0; x < 12; x++){
                        for (int y = x + 1; y < 12; y++){
                            if (cabins2[x].firstname.compareTo((cabins2[y].firstname)) > 0){
                                temp = (cabins2[x].firstname);
                                cabins2[x].firstname = cabins2[y].firstname;
                                (cabins2[y].firstname) = temp;
                            }
                            else if (cabins2[x].firstname1.compareTo(cabins2[y].firstname1) > 0){
                                temp = (cabins2[x].firstname1);
                                cabins2[x].firstname1 = cabins2[y].firstname1;
                                (cabins2[y].firstname1) = temp;
                            }
                            else if (cabins2[x].firstname2.compareTo(cabins2[y].firstname2) > 0){
                                temp = (cabins2[x].firstname2);
                                cabins2[x].firstname2 = cabins2[y].firstname2;
                                cabins2[y].firstname2 = temp;
                            }
                        }
                    }
                    for (int x = 0; x < 12; x++){
                        if (!cabins2[x].firstname.equals("e")){
                            System.out.println(cabins2[x].firstname + " ");
                        }
                        else if ( !cabins2[x].firstname1.equals("e")){
                            System.out.println(cabins2[x].firstname1 + " ");
                        }
                        else if (!cabins2[x].firstname2.equals("e")){
                            System.out.println(cabins2[x].firstname2 + " ");
                        }
                    }
                }
                else if (option.equals("T")){
                    for (int x = 0; x < 12; x++){
                        if (!(cabins2[x].expenses == 0)){
                            System.out.println("Expenses for " + cabins2[x].firstname + " is " + cabins2[x].expenses);
                            fullprice += cabins2[x].expenses;
                            if (!(cabins2[x].expenses1 == 0) ){
                                System.out.println("Expenses for " + cabins2[x].firstname1  + " is " + cabins2[x].expenses1);
                                fullprice += cabins2[x].expenses1;
                                if (!(cabins2[x].expenses2 == 0)){
                                    System.out.println("Expenses for " + cabins2[x].firstname2  + " is " + cabins2[x].expenses2);
                                    fullprice += cabins2[x].expenses2;
                                }
                            }
                        }
                    }
                    System.out.println("Full price: " + fullprice);
                }
                // myHotel[roomNum].setName(roomName);
            }
        }
        private static void initialise(passengers[] hotelRef) {
            for (int x = 0; x < 12; x++ ) {
                hotelRef[x].firstname = "e";
                hotelRef[x].lastname = "e";
                hotelRef[x].expenses = 0;
                hotelRef[x].firstname1 = "e";
                hotelRef[x].lastname1 = "e";
                hotelRef[x].expenses1 = 0;
                hotelRef[x].firstname2 = "e";
                hotelRef[x].lastname2 = "e";
                hotelRef[x].expenses2 = 0;
                System.out.println("initilise ");
            }
        }
    }

}
//implementation of Circular Queue using Generics
class CircularQueue<E> {

    private int currentSize; //Current Circular Queue Size
    private final E[] circularQueueElements;
    private int maxSize; //Circular Queue maximum size

    private int rear;//rear position of Circular queue(new element enqueued at rear).
    private int front; //front position of Circular queue(element will be dequeued from front).

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        circularQueueElements = (E[]) new Object[this.maxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }

    /**
     * Enqueue elements to rear.
     */
    public void enqueue(E item) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Circular Queue is full. Element cannot be added");
        }
        else {
            rear = (rear + 1) % circularQueueElements.length;
            circularQueueElements[rear] = item;
            currentSize++;

            if (front == -1) {
                front = rear;
            }
        }
    }

    /**
     * Dequeue element from Front.
     */
    public E dequeue() throws QueueEmptyException {
        E deQueuedElement;
        if (isEmpty()) {
            throw new QueueEmptyException("Circular Queue is empty. Element cannot be retrieved");
        }
        else {
            deQueuedElement = circularQueueElements[front];
            circularQueueElements[front] = null;
            front = (front + 1) % circularQueueElements.length;
            currentSize--;
        }
        return deQueuedElement;
    }

    /**
     * Check if queue is full.
     */
    public boolean isFull() {
        return (currentSize == circularQueueElements.length);
    }

    /**
     * Check if Queue is empty.
     */
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    @Override
    public String toString() {
        return "CircularQueue [" + Arrays.toString(circularQueueElements) + "]";
    }

}

class QueueFullException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public QueueFullException() {
        super();
    }

    public QueueFullException(String message) {
        super(message);
    }

}

class QueueEmptyException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }

}

