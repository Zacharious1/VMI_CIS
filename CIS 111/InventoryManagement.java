import java.util.Scanner;

/**********
 * CIS111L Project #2
 * DUE: December 12 1600 - FIRM DEADLINE
 * Submit this javafile to canvas
 *
 */

public class InventoryManagement {
    final static int CAPACITY = 10;
    static String[] productName = new String[CAPACITY];
    static String[] productManufacturer = new String[CAPACITY];
    static int[] productSerialNumber = new int[CAPACITY];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // number of products in array
        int count = 0;
        int menu;
        while((menu = getMenuItem(input)) != 5) {
            if(menu == 1) {
                int pos = getNextPosition(productSerialNumber);
                if(pos == -1) {
                    System.out.println("\t<WARNING>Reach Maximum Capacity. Cannot Add More Product");
                    continue;
                } else {
                    String name = getProductName(input);
                    String manufacturer = getProductManufacturer(input);
                    int sn = getProductSerialNumber(input, productSerialNumber);
                    productName[pos] = name;
                    productManufacturer[pos] = manufacturer;
                    productSerialNumber[pos] = sn;
                    count++;
                    System.out.println("\t***Product(" + name + ") Inserted\n");
                }
            } else if(menu == 2) {
                int sn = getSerialNumber(input);
                for(int i=0; i<productSerialNumber.length;i++) {
                    if(sn == productSerialNumber[i]) {
                        productName[i] = null;
                        productManufacturer[i] = null;
                        productSerialNumber[i] = 0;
                        count--;
                        System.out.println("\t***Product(Serial Number: " + sn + ") removed from System\n");
                        break;
                    }
                }


            } else if(menu == 3) {
                /*
                 * Search Element
                 * 1. Display Menu - Search by Name, Search by Manufacturer, Search By Serial Number
                 * 2. get user selection
                 * 3. based on the user selection, search from corresponding array
                 * 4. display product(s) information
                 */
                System.out.println("1. Name    2. Manufacturer    3. Serial Number" );
                int selection = input.nextInt();
                if (selection == 1) {
                    System.out.println("[Enter Name] ");
                    Scanner sc = new Scanner(System.in);
                    String search = sc.nextLine();
                    searchProductByName(search, productName);
                }
                if (selection == 2) {
                    System.out.println("[Enter Manufacturer Name] ");
                    Scanner sc = new Scanner(System.in);
                    String search = sc.nextLine();
                    searchProductByManufacturer(search, productManufacturer);
                }
                if (selection == 3) {
                    System.out.println("[Enter Serial Number] ");
                    Scanner sc = new Scanner(System.in);
                    int search = sc.nextInt();
                    searchProductBySerialNumber(search, productSerialNumber);
                } else if (selection > 3){
                    System.out.println("Please enter a valid number: ");
                    selection = input.nextInt();
                }



            } else if(menu == 4) {
                /*
                 * Display all Product
                 * 1. for all product in array
                 * 2. if serial number is not zero(0), then display Name, Manufacture and Serial Number
                 */
                for (int i = 0; i < count; i++) {
                    if (productSerialNumber[i] != 0) {
                        displayProductByName(productName[i], productManufacturer[i], productSerialNumber[i]);
                    }
                }
            }
        }

        System.out.println("\n************** Thank you for using our system!! ************");
    }

    public static int getMenuItem(Scanner input) {

        System.out.println("******* Main Menu ***********");
        System.out.println("1. Insert Product\t2. Remove Product\t"
                + "3. Search Product\t4.Display All Product\t5.Exit");

        while(true) {
            System.out.print("[Enter] ");
            int n = input.nextInt();
            input.nextLine();
            if(n>0 && n <6)
                return n;

            System.out.println("\t<WARNING>Invalid Selection. Try Again");
        }
    }

    public static int getSerialNumber(Scanner input) {
        System.out.print("\tEnter Product Serial Number: ");
        int sn = input.nextInt();
        return sn;
    }

    public static String getProductName(Scanner input) {
        System.out.print("\tEnter Product Name: ");
        String name = input.nextLine();
        return name;
    }

    public static String getProductManufacturer(Scanner input) {
        System.out.print("\tEnter Product Name: ");
        String manufacturer = input.nextLine();
        return manufacturer;
    }


    public static int getProductSerialNumber(Scanner input, int[] existing) {
        int sn;
        while(true) {
            boolean errorflag = false;
            System.out.print("\tEnter Product Serial Number: ");
            sn = input.nextInt();
            for(int e: existing){
                if(sn == e) {
                    System.out.println("\t\t<WARNING> Serial Number [" + sn + "] already exists. Try Again");
                    errorflag=true;
                    break;
                }
            }
            if(errorflag == false)
                break;
        }
        return sn;
    }

    public static int getNextPosition(int[] arr) {
        for(int i=0; i<arr.length;i++) {
            if(arr[i] == 0)
                return i;
        }
        /* -1 means no available spot */
        return -1;
    }
    public static void displayProductByName(String name, String manufacturer, int serialNumber) {
        System.out.println(serialNumber + " : " + name + " by " + manufacturer);
    }

    public static void searchProductByName(String name, String[] productName)
    {
        for (int i = 0; i < productName.length; i++) {
            if (productName[i] != null) {
                if (productName[i].equals(name))
                    System.out.println(productSerialNumber[i] + " : " + productName[i] + " by " + productManufacturer[i]);
            }
        }
    }

    public static void searchProductByManufacturer(String manufacturer, String[] productManufacturer)
    {
        for (int i = 0; i < productManufacturer.length; i++)
            if (productManufacturer[i] != null) {
                if (productManufacturer[i].equals(manufacturer)) {
                    System.out.println(productSerialNumber[i] + " : " + productName[i] + " by " + productManufacturer[i]);
                }
            }
    }

    public static void searchProductBySerialNumber(int sn, int[] productSerialNumber)
    {
        for (int i = 0; i < productSerialNumber.length; i++){

            if (productSerialNumber[i] == sn)
                System.out.println(productSerialNumber[i] +" : " + productName[i] + " by " + productManufacturer[i]);

        }
    }

}
