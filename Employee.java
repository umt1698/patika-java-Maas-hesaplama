public class Employee {
    String name ;
    double salary ;
    int workHours ;
    int hireYear ;

    public Employee(String name, double salary,
                    int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(double maas){
        if(maas<1000){
            return 0;
        }
        else {
            return maas*0.03 ;
        }
    }

    public double bonus(int calismaSaati){
        if(calismaSaati<=40){
            return 0;
        }
        else {
            return (calismaSaati-40)*30;
        }
    }

    public double raiseSalary(int baslangicYil){
        int calismaSuresi = 2021 - baslangicYil;

        if (calismaSuresi<10){
            return (this.salary)*(0.05);
        }
        else if(calismaSuresi>=10 && calismaSuresi<20){
            return (this.salary)*(0.1);
        }
        else {
            return (this.salary)*(0.15);
        }

    }

    public void ToString() {
        System.out.println("Vergi :"+tax(this.salary));
        System.out.println("Bonus :"+bonus(this.workHours));
        System.out.println("Maaş Artışı :"+raiseSalary(this.hireYear));
        double tax = tax(this.salary);
        double bonus = bonus(this.workHours);
        double artanMaas = raiseSalary(this.hireYear);
        System.out.println("Vergi ve Bonuslar ile birlikte :"+(this.salary+bonus-tax));
        System.out.println("Toplam Maaş :"+ (this.salary+bonus-tax+artanMaas));
    }
}






