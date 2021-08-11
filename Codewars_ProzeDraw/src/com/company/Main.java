package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fixed Tests");
        System.out.println("Test #1");
        String st = "";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
//        System.out.println(Rank.nthRank(st, we, 4));
//        System.out.println("Should be: No participants");

//        System.out.println(" ");
//        System.out.println("Test #2");
//        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
//        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
//        System.out.println(Rank.nthRank(st, we, 8));
//        System.out.println("Should be: Not enough participants");
//
//        System.out.println(" ");
//        System.out.println("Test #3");
//        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
//        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
//        System.out.println(Rank.nthRank(st, we, 4));
//        System.out.println("Should be: Benjamin");

        System.out.println(" ");
        System.out.println("Test #4");
        st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        we = new Integer[] {1, 3, 5, 5, 3, 6};
        System.out.println(Rank.nthRank(st, we, 2));
        System.out.println("Should be: Matthew");
    }


    public static class Rank {
        public static String nthRank(String st, Integer[] we, int n) {

            int som;
            int searchedResult;
            ArrayList<LeaderList> myLeaderList;
            String[] arrOfSt = st.toUpperCase().split(",",0);
            int[] leaderBoards = new int[arrOfSt.length];
            int[] leaders = new int[arrOfSt.length];
            char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

            for (int i = 0; i < lengthOfName(st); i++) {
                som = 0;
                char[] tempChar = arrOfSt[i].toCharArray();
                System.out.println(arrOfSt[i]);
                som = tempChar.length;

//                for (int j = 0; j < tempChar.length; j++) {
////                    System.out.println(tempChar[j]);
//                    for (int k = 0; k < letters.length; k++) {
//                        if (letters[k] == tempChar [j]) {
//                            som += k+1;
//                        }
//                    }
//                }
//
////                W tym miejscu mamy już wynik z ldugosci imienia + wagi poszczegolnych liter
////                Teraz trzeba przemnożyć to przez wagę z tablicy we
//                som = we[i] * som;
//                System.out.println(som);
//                leaders[i] = som;
//                leaderBoards[i] = som;

                for (int j = 0; j < tempChar.length; j++) {
//                    System.out.println(tempChar[j]);
                    for (int k = 0; k < letters.length; k++) {
                        if (letters[k] == tempChar [j]) {
                            som += k+1;
                        }
                    }
                }
                som = we[i] * som;
                LeaderList leaderList = new LeaderList("testName", 999);
                leaderList.createRow(arrOfSt[i], som);
                


            }

//            posortowana tablica wyników
            sortArray(leaderBoards);
            searchedResult = leaderBoards[n-1];
            System.out.println("Searched result is: " + searchedResult);





            System.out.println("**********************************************");



            System.out.println("**********************************************");


//            Trzeba tu znaleźć osobę, która miała wynik leaderboards[n-1]
//            Tu jest kod na to jak się powtarzają osoby

            for (int i = 0; i < leaders.length; i++) {
                for (int j = i+1; j < leaders.length-1; j++) {
                    if(leaders[i] == leaders[j]) {
                        System.out.println("Pierwsza osoba to: " + arrOfSt[i]);
                        System.out.println("Druga osoba to: " + arrOfSt[j]);
                        return arrOfSt[j];
                    }
                }
            }

//          Tu jest kod jak osoby się nie powtarzają

            for (int i = 0; i < leaders.length; i++) {

                if(leaders[i] == searchedResult) {
                    return arrOfSt[i];
                }
            }

//            for (int i = 0; i < lengthOfName(st) ; i++) {
//                som = 0;
//                char[] tempChar = arrOfSt[i].toCharArray();
//                som = tempChar.length;
//
//                for (int j = 0; j < tempChar.length; j++) {
//                    for (int k = 0; k < letters.length; k++) {
//                        if (letters[k] == tempChar [j]) {
//                            som += k+1;
//                        }
//                    }
//                }
//
//                som = we[i] * som;
//
//                if(som == result) {
//                    return arrOfSt[i];
//                }
//            }



            if (st.equals("")) {
                return "No participants";
            } else if (n > arrOfSt.length) {
                return "Not enough participants";
            } else {
                return "Sth went wrong!";
            }
        }

        public static int lengthOfName(String st) {

            if (st.equals("")) {
                return 0;
            } else {
                String[] arrOfSt = st.toUpperCase().split(",",0);

//                for (int i = 0; i < arrOfSt.length; i++) {
//                    System.out.println(arrOfSt[i]);
//                }

                return arrOfSt.length;
            }
        }

        public static void sortArray (int[] leaderBoards) {
////            int maxValue = 0;
////            int index = 0;
////            for(int i=0;i<leaderBoard.length;i++){
////                if(leaderBoard[i] > maxValue){
////                    maxValue = leaderBoard[i];
////                }
////            }
////            System.out.println("Max value: " + maxValue);
////
////            for (int i = 0; i < leaderBoard.length; i++) {
////                if (leaderBoard[i] == maxValue) {
////                    index = i;
////                }
////            }
//

            Arrays.sort(leaderBoards);

                for (int i = 0; i < leaderBoards.length / 2; i++) {
                int temp = leaderBoards[i];
                leaderBoards[i] = leaderBoards[leaderBoards.length - 1 - i];
                leaderBoards[leaderBoards.length - 1 - i] = temp;
            }
//
        }

        public static class LeaderList {
            private String name;
            private int score;

            public LeaderList(String name, int score) {
                this.name = name;
                this.score = score;
            }

            public LeaderList createRow (String name, int score) {
                return new LeaderList(name, score);
            }

            ArrayList<String> leaderBoardList = new ArrayList<>();

            public ArrayList<String> getLeaderList() {
                return leaderBoardList;
            }



        }

    }
}

