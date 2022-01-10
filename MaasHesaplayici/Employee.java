
public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, int salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public void run(){
        System.out.println("Adı : " +this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma saati : "+this.workHours);
        System.out.println("Başlangıç yılı : "+this.hireYear);
        System.out.println("Vergi : " +tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " +raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş : "+(this.salary +this.bonus()-this.tax()));
        System.out.println("Toplam maaş : " +(this.salary + this.raiseSalary()));
    }
    public double tax(){
        if(salary>1000)
            return this.salary * 0.03;
        else
            return 0;
    }
    public double bonus(){
        if(this.workHours>40)
            return (this.workHours-40)*30;
        else
            return 0;
    }
    public double raiseSalary(){
        double artis;
        if(2022 - hireYear > 19){
            return this.salary * 0.15;
        }
        else if(2022 - this.hireYear > 9 && 2022 - this.hireYear <=19){
            return this.salary*0.1;
        }
        else{
            return this.salary*0.05;
        }
    }
}
