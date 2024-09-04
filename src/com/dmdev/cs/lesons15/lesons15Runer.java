package com.dmdev.cs.lesons15;

public class lesons15Runer {
    public static void main(String[] args) {
        int month = 2;

       String result = switch (month){
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Month is not invalid";
        };
        System.out.println(result);

//        switch (month){
//            case 12, 1, 2 -> System.out.println("Winter");
//            case 3, 4, 5 -> System.out.println("Spring");
//            case 6, 7, 8 -> System.out.println("Summer");
//            case 9, 10, 11 -> System.out.println("Autumn");
//            default -> System.out.println("Month is not invalid");
//       }
    }
}
