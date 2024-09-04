package com.dmdev.cs.lesons16;

/**
 * Дан порядковый месяц. Вывести на консоль пару года, к которой относится месяц
 */

public class Task1 {
    public static void main(String[] args) {
        int mounth = 7;

        if (mounth == 12 || mounth == 1 || mounth == 2) {
            System.out.println("Winner");
        } else if (3 <= mounth && mounth <= 5 ) {
            System.out.println("Spring");
        } else if ( 6 <= mounth &&  mounth <= 8) {
            System.out.println("Summer");
        } else if (9 <= mounth && mounth <= 11) {
            System.out.println("Autum");
        } else {
            System.out.println("Mounth is not invalid " + mounth);
        }

    }


}
//       var result = switch (mounth){
//            case 12,1,2 -> ("Winner");
//           case 3,4,5 -> ("Spring");
//           case 6,7,8 -> ("Summer");
//           case 9,10,11 -> ("Autumn");
//           default -> ("Mounth is not invalid");
//        };
//        System.out.println(result);
//    }

