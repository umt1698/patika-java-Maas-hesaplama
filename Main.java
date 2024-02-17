import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Adı: ");
        String isim = scan.nextLine();

        System.out.println("Maaşı: ");
        double maas = scan.nextDouble();

        System.out.println("Çalışma Saati: ");
        int calismaSaati = scan.nextInt();

        System.out.println("Başlangıç Yılı: ");
        int baslangicYili = scan.nextInt();

        Employee e1 = new Employee(isim, maas, calismaSaati, baslangicYili);

        e1.ToString();




    }
}
