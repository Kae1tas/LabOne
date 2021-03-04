import java.util.Scanner;
class Sotrudnik{
    String fam, im, otch, doljnost;
    int countChild;
    Child []chi=null;
}
class Child {
    String name;
    int age;
}

public class Firma {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество сотрудников");
        int count = sc.nextInt();
        sc.nextLine();
        Sotrudnik[] sotr = new Sotrudnik[count];

        for (int i = 0; i < count ; i++){
            System.out.println("Введите информацию о " + (i + 1) + " сотруднике");
            sotr[i] = new Sotrudnik();
            System.out.println("Введите фамилию");
            sotr[i].fam = sc.nextLine();
            System.out.println("Введите имя");
            sotr[i].im = sc.nextLine();
            System.out.println("Введите отчество");
            sotr[i].otch = sc.nextLine();
            System.out.println("Введите должность");
            sotr[i].doljnost = sc.nextLine();
            System.out.println("Введите количество детей");
            sotr[i].countChild = sc.nextInt();
            sc.nextLine();
            if(sotr[i].countChild!=0){
                sotr[i].chi = new Child[sotr[i].countChild];
                for (int j = 0; j < sotr[i].countChild; j++) {
                    sotr[i].chi[j] = new Child();

                    System.out.print("Введите имя "+(j+1)+" ребенка => ");
                    sotr[i].chi[j].name = sc.nextLine();

                    System.out.print("Введите его возраст => ");
                    sotr[i].chi[j].age = sc.nextInt();
                    sc.nextLine();
                }
            }
        }

        System.out.println("\n Сотрудники фирмы: \n фам \t имя \t отч \t должность \tОклад");
        for (Sotrudnik s:sotr){
            System.out.print(s.fam+ "\t"+s.im + "\t"+s.otch + "\t "+s.doljnost);
            System.out.println("\n Дети: ");
            for (Child r : s.chi)
                System.out.println("\t\t\t"+ r.name+ "\t\t"+ r.age);
        System.out.println(" ");
        }
    }
}
