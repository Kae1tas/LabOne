import java.util.Scanner;

class Sotrudnik1{
    String fam, im, otch, doljnost;
    int oklad;
}

public class Firma1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество сотрудников => ");
        int kol = sc.nextInt();
        sc.nextLine();
        Sotrudnik1[] sotr = new Sotrudnik1[kol];
        System.out.println("Введите информацию о каждом сотруднике: ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Sotrudnik1();
            System.out.print("Введите фамилию " + (i + 1) + " сотрудника => ");
            sotr[i].fam = sc.nextLine();

            System.out.print("Введите его имя => ");
            sotr[i].im = sc.nextLine();

            System.out.print("Введите его отчество => ");
            sotr[i].otch = sc.nextLine();

            System.out.print("Введите его должность => ");
            sotr[i].doljnost = sc.nextLine();

            System.out.print("Введите его оклад => ");
            sotr[i].oklad = sc.nextInt();
            sc.nextLine(); //очистка буфера
        } // end for

        // Вывод информации о сотрудниках
        System.out.println("\n Сотрудники фирмы: \n фам \t имя \t отч \t должность \tОклад");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].fam + "\t" + sotr[i].im + "\t" + sotr[i].otch + "\t " + sotr[i].doljnost + "\t\t" + sotr[i].oklad);
        }

    }
}