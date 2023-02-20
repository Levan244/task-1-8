public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 (){
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println( cat);
        var paper = 763789;
        paper = paper +4;
        System.out.println(paper);


    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var waightOfBoxer1 = 78.2;
        System.out.println("вес 1-го боксера:" + waightOfBoxer1 +"кг");
        var waightOfBoxer2 = 82.7;
        System.out.println("вес 2-го боксера:" + waightOfBoxer2 +"кг");
        var totalWaight = waightOfBoxer1 + waightOfBoxer2;
        System.out.println("Общий вес:" + totalWaight +"кг");
        var difference = waightOfBoxer2 -waightOfBoxer1;
        System.out.println("Разница в весе:" + difference + "кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var waightOfBoxer1 = 78.2;
        System.out.println("вес 1-го боксера:" + waightOfBoxer1 +"кг");
        var waightOfBoxer2 = 82.7;
        System.out.println("вес 2-го боксера:" + waightOfBoxer2 +"кг");
        var difference = (waightOfBoxer2 % waightOfBoxer1) ;
        System.out.println("Разница в весе:" + difference + "кг");

    }
    public static void task8(){
        System.out.println("Задача 8");
        var workHours = 640;
        System.out.println("Часов работы:" + workHours);
        var houersWorks = 8;
        System.out.println("Каждый работает по " + houersWorks + "ч.");
        var employee = workHours / houersWorks;
        System.out.println("Всего работает:" + employee + "чел." );
        var employee2 = employee + 94;
        System.out.println("В компании работает :" + employee2 + "чел.");
        var houersWorks2 = workHours / employee2;
        System.out.println("Если в компании работает" + " "+ employee2 + " " +"чел. то всего:" + houersWorks2 + "" +"часов работы может быть поделено между сотрудниками");



    }





}