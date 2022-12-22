import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        ArrayList<String> lastNameList = new ArrayList<>();
        ArrayList<String> firstNameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<String> sexList = new ArrayList<>();
        boolean contunue = true;

        while(contunue) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите вашу Фамилию: ");
            String lastName = input.nextLine();
            lastNameList.add(lastName);
            System.out.println("Введите ваше Имя: ");
            String firstName = input.nextLine();
            firstNameList.add(firstName);
            System.out.println("Введите ваш возраст: ");
            Integer age = Integer.valueOf(input.nextLine());
            ageList.add(age);
            System.out.println("Введите ваш пол (м/ж): ");
            String sex = input.nextLine();
            sexList.add(sex);
            System.out.println("Продолжить ввод пользователей? (да/нет): ");
            String continueInput = input.nextLine();
            if (continueInput.equals("нет")) {
                contunue = false;
            }
        }

        System.out.println("Изначальные данные:");
        for (int i = 0; i < ageList.size(); i++) {
            System.out.println(lastNameList.get(i) + " " + firstNameList.get(i) + ", " + ageList.get(i) + ", " + sexList.get(i));
        }

        ArrayList<Integer> sortedAgeList = new ArrayList<>(ageList);
        Collections.sort(sortedAgeList);
        ArrayList<String> sortedLastNameList = new ArrayList<>();
        ArrayList<String> sortedFirstNameList = new ArrayList<>();
        ArrayList<String> sortedSexList = new ArrayList<>();
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < sortedAgeList.size(); i++) {
            indexList.add(ageList.indexOf(sortedAgeList.get(i)));
        }

        System.out.println("\nСортированные по возрасту пользователей данные:");
        for (int i = 0; i < indexList.size(); i++) {
            sortedLastNameList.add(lastNameList.get(indexList.get(i)));
            sortedFirstNameList.add(firstNameList.get(indexList.get(i)));
            sortedSexList.add(sexList.get(indexList.get(i)));
            System.out.println(sortedLastNameList.get(i) + " " + sortedFirstNameList.get(i) + ", " + sortedAgeList.get(i) + ", " + sortedSexList.get(i));
        }


    }
}
