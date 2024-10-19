
import java.time.LocalTime;
import java.util.Scanner;

class Flight extends Airport {

    private void flight_upcoming(String flights[][], String flightNum, int size) {
        LocalTime currentTime = LocalTime.now();
        for (int i = 0; i < size; i++) {
            LocalTime arrivalTime = LocalTime.parse(flights[i][3]);
            System.out.println("Arrival time:" + arrivalTime);
            if (flights[i][0].equals(flightNum) && arrivalTime.isAfter(currentTime)) {
                System.out.println("Yes, Flight " + flights[i][0] + " is upcoming.");
                return;
            } else {
                System.out.println("\nNo, Flight " + flights[i][0] + " is not upcoming. \n");
            }
        }
    }

    public void isupcoming(String flights[][], String flightNum, int size) {
        flight_upcoming(flights, flightNum, size);
    }

    public void dep_time(String flightNum, String flights[][], String dep_time, int size) {
        for (int i = 0; i < size; i++) {
            if (flights[i][0].equals(flightNum)) {
                flights[i][2] = dep_time;
                System.out.println("Updated Details of Flight Number: " + flightNum);
                System.out.println("Flight Destination: " + flights[i][1]);
                System.out.println("Departure Time: " + flights[i][2]);
                System.out.println("Arrival Time: " + flights[i][3] + "\n");
                return;
            }
        }
        System.out.println("Flight not found.");
    }

    public void arrival_time(String flightNum, String flights[][], String arr_time, int size) {
        for (int i = 0; i < size; i++) {
            if (flights[i][0].equals(flightNum)) {
                flights[i][3] = arr_time;
                System.out.println("Updated Details of Flight Number: " + flightNum);
                System.out.println("Flight Destination: " + flights[i][1]);
                System.out.println("Departure Time: " + flights[i][2]);
                System.out.println("Arrival Time: " + flights[i][3] + "\n");
                return;
            }
        }
        System.out.println("Flight not found.");
    }
}

class Airport {

    private StringBuffer destination, dep_time, arrival_time, flight_no;
    private StringBuffer airport_name;
    private String flights[][] = new String[55][4];
    private String upcommingFlights[][] = new String[55][4];
    public int size = 0;

    public void add_flight(String flightNum, String flightDestination, String departureTime, String arrivaltime) {
        flights[size][0] = flightNum;
        flights[size][1] = flightDestination;
        flights[size][2] = departureTime;
        flights[size][3] = arrivaltime;
        System.out.println("Flight Added Successfully\n");
        size++;
    }

    public String[] adds(String flightNum) {
        for (int i = 0; i < size; i++) {
            if (flights[i][0].equals(flightNum)) {
                return new String[]{flights[i][0], flights[i][1], flights[i][2], flights[i][3]};
            }
        }
        System.out.println("Flight not found.");
        return null; // Return null if flight is not found
    }

    private void find_flight(String flightNum) {
        for (int i = 0; i < size; i++) {
            if (flights[i][0].equals(flightNum)) {
                System.out.println("Details of Flight Number: " + flightNum);
                System.out.println("Flight Destination: " + flights[i][1]);
                System.out.println("Departure Time: " + flights[i][2]);
                System.out.println("Arrival Time: " + flights[i][3] + "\n");
                return;
            }
        }
        System.out.println("Flight not found.");
    }

    public void search_flight(String flightNum) {
        find_flight(flightNum);
    }

    public void remove_flight(String flightNum) {
        int flag = -1;
        for (int i = 0; i < size; i++) {
            if (flights[i][0].equals(flightNum)) {
                flag = i;
                break;
            }
        }
        if (flag != -1) {
            for (int i = flag; i < size - 1; i++) {
                flights[i] = flights[i + 1];
            }
            flights[size - 1] = null;
            size--;
            System.out.println("Flight " + flightNum + " has been removed.");
        } else {
            System.out.println("Flight not found.");
        }
    }

    public void upcoming_flight() {
        int flag = 0;
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        for (int i = 0; i < size; i++) {
            LocalTime arrivalTime = LocalTime.parse(flights[i][3]);
            if (arrivalTime.isAfter(currentTime)) {
                System.out.println("-----------------------------");
                System.out.println("Upcoming Flight: " + flights[i][0]);
                System.out.println("Flight Destination: " + flights[i][1]);
                System.out.println("Departure Time: " + flights[i][2]);
                System.out.println("Arrival Time: " + flights[i][3] + "\n");
                System.out.println("-----------------------------");
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("No Upcoming Flights \n");
        }
    }

    public void completed_flight() {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        for (int i = 0; i < size; i++) {
            LocalTime arrivalTime = LocalTime.parse(flights[i][3]);
            if (arrivalTime.isBefore(currentTime)) {
                System.out.println("-----------------------------");
                System.out.println("Upcoming Flight: " + flights[i][0]);
                System.out.println("Flight Destination: " + flights[i][1]);
                System.out.println("Departure Time: " + flights[i][2]);
                System.out.println("Arrival Time: " + flights[i][3] + "\n");
                System.out.println("-----------------------------");
            }
        }
    }

    public String[][] getFlights() {
        return flights;
    }

    public void display_details_all_flight() {
        if (size == 0) {
            System.out.println("No flights available.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("-----------------------------");
            System.out.println("Flight Number: " + flights[i][0]);
            System.out.println("Flight Destination: " + flights[i][1]);
            System.out.println("Departure Time: " + flights[i][2]);
            System.out.println("Arrival Time: " + flights[i][3]);
            System.out.println("-----------------------------");
        }
    }
}

class ques4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Airport obj = new Airport();
        Flight obj1 = new Flight();
        String arrivaltime, departureTime, flightDestination, flightNum;
        while (true) {
            System.out.println("Please select an operation you want to perform :");
            System.out.println("1. Add Flight ");
            System.out.println("2. Remove Flight ");
            System.out.println("3. Check Upcoming Flights ");
            System.out.println("4. Check Completed Flights");
            System.out.println("5. Check details of all Flights ");
            System.out.println("6. Check Flight using Flight number ");
            System.out.println("7: Check if Flight is upcomming ");
            System.out.println("8: Update Arrival Time ");
            System.out.println("9: Update Departure Time ");
            System.out.println("10: Exit ");
            int choice = sc.nextInt();
            // Switch case for user choice
            switch (choice) {
                case 1:
                    String temp = sc.nextLine();
                    System.out.print("\nEnter Flight Number: ");
                    flightNum = sc.nextLine();
                    System.out.print("\nEnter Destination: ");
                    flightDestination = sc.nextLine();
                    System.out.print("\nEnter Departure Time: ");
                    departureTime = sc.nextLine();
                    System.out.print("\nEnter Arrival Time: ");
                    arrivaltime = sc.nextLine();
                    obj.add_flight(flightNum, flightDestination, departureTime, arrivaltime);
                    break;
                case 2:
                    System.out.print("\nEnter Flight Number: ");
                    temp = sc.nextLine();
                    flightNum = sc.nextLine();
                    obj.remove_flight(flightNum);
                    break;
                case 3:
                    obj.upcoming_flight();
                    break;
                case 4:
                    obj.completed_flight();
                    return;
                case 5:
                    obj.display_details_all_flight();
                    break;
                case 6:
                    temp = sc.nextLine();
                    System.out.print("\nEnter Flight Number: ");
                    flightNum = sc.nextLine();
                    obj.search_flight(flightNum);
                    break;
                case 7:
                    temp = sc.nextLine();
                    System.out.print("\nEnter Flight Number: ");
                    flightNum = sc.nextLine();
                    obj1.isupcoming(obj.getFlights(), flightNum, obj.size);
                    break;
                case 8:
                    temp = sc.nextLine();
                    System.out.print("\nEnter Flight Number: ");
                    flightNum = sc.nextLine();
                    System.out.print("\nEnter Arrival Time: ");
                    arrivaltime = sc.nextLine();
                    obj1.arrival_time(flightNum, obj.getFlights(), arrivaltime, obj.size);
                    break;
                case 9:
                    temp = sc.nextLine();
                    System.out.print("\nEnter Flight Number: ");
                    flightNum = sc.nextLine();
                    System.out.print("\nEnter Departure Time: ");
                    departureTime = sc.nextLine();
                    obj1.dep_time(flightNum, obj.getFlights(), departureTime, obj.size);
                    break;
                case 10:
                    System.out.print("\nEnter Flight Number: ");
                    flightNum = sc.nextLine();
                    String[] flightDetails = obj.adds(flightNum);
                    if (flightDetails != null) {
                        System.out.println("Flight Details:");
                        System.out.println("Flight Number: " + flightDetails[0]);
                        System.out.println("Flight Destination: " + flightDetails[1]);
                        System.out.println("Departure Time: " + flightDetails[2]);
                        System.out.println("Arrival Time: " + flightDetails[3]);
                    }
                    break;
                default:
                    System.out.println("\nInvalid Choice. Please try again.");
                    continue;
            }
        }

    }
}
