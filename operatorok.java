import java.util.Scanner;

public class operatorok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az első stringet: ");
        String sztring1 = scanner.nextLine();

        System.out.println("Adj meg két karaktert: ");
        char karakter1 = scanner.next().charAt(0);
        char karakter2 = scanner.next().charAt(0);

        System.out.println("Adj meg két int értéket: ");
        int szam1 = scanner.nextInt();
        int szam2 = scanner.nextInt();

        System.out.println("Adj meg két double értéket: ");
        double db1 = scanner.nextDouble();
        double db2 = scanner.nextDouble();

        System.out.println("String és a két karakter: " + sztring1 + karakter1 + karakter2);
        System.out.println("A két integer osztása: " + szam1/szam2);
        System.out.println("A két double értéke: " + db1 + db2);
        System.out.println("Double kivonása az egyik integerből: " + (szam2 - db2));
        System.out.println("A másik integer összeszorzása a double számmal: " + (szam1 * db1));
    }
}