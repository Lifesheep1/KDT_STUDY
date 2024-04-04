package com.jungmin;

public class I_DaysInMonth {
    public int daysInMonth(int month) {
        // TODO:
//        switch (month){
//            case 1:
//                return 31;
//            case 2:
//                return 28;
//            case 3:
//                return 31;
//            case 4:
//                return 30;
//            case 5:
//                return 31;
//            case 6:
//                return 30;
//            case 7:
//                return 31;
//            case 8:
//                return 31;
//            case 9:
//                return 30;
//            case 10:
//                return 31;
//            case 11:
//                return 30;
//            default:
//                return 31;
//        }
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 28;
        }
    }
}
