public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    private static void task3() {String firstName= "Иванов";
        String middleName= "Семён";
        String lastName= "Семёнович";
        String fullName= firstName +" "+ middleName+" "+lastName;

        fullName= fullName.replace("ё", "е");


        System.out.println( "Данные ФИО сотрудника —  "+fullName );
    }

    private static void task2() {String firstName= "Иванов";
        String middleName= "Иван";
        String lastName= "Иванович";
        String fullName= firstName +" "+ middleName+" "+lastName;
        fullName= fullName.replace("Иванов Иван Иванович","ИВАНОВ ИВАН ИВАНОВИЧ" );
        System.out.println( "Данные ФИО сотрудника для заполнения отчета — "+fullName );
    }

    private static void task1() {
        String firstName= "Иванов";
        String middleName= "Иван";
        String lastName= "Иванович";
        String fullName= firstName +" "+ middleName+" "+lastName;
        System.out.println("ФИО сотрудника — "+fullName);}
}