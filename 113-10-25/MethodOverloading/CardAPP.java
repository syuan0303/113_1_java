package edu.shu.edu.syuan;
import java.util.Scanner;
import edu.shu.edu.syuan.*;

public class CardAPP {
    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A001", 500, 0),
                new CashCard("A002", 300, 0),
                new CashCard("A003", 1000, 1),
                //new CashCard("A004", 2000, 2),
                //new CashCard("A005", 3000, 3)


        };

        Scanner input = new Scanner(System.in);

       // for(var card : cards) {
        //    System.out.printf("為(%s, %d, %d)儲值:",
         //           card.getNumber(), card.getBalance(), card.getBalance());
        //    card.store(input.nextInt());

        //    System.out.printf("明細(%s, %d, %d)%n",
        //            card.getNumber(), card.getBalance(), card.getBalance());
        }
        for(int i = 0;i<cards.lenght;i++){
            System.out.printf("為(%s,%d,%d)儲值:"
            card[i].getNumber(),card[i].getBalance(),card[i].getBouns());
            if(i % 2==0){

                card[i].store(input.nextInt());

            }
            else{

                card[i].store(input.next(),input.nextInt());

            }
            System.out.printf("明細(%s, %d, %d)%n";
            card[i].getNumber(),card[i].getBalance(),card[i].getBouns());
    }

    card[1].charge(number:"A002",money:500);
    System.out.printf("明細(%s,%d,%d)%n";
        cards[1].getNumber(),card[1].getBalance(),card[1].getBouns());
    card[1].charge(number:"A002",money:100,bonus:1);
    System.out.printf("明細(%s,%d,%d)%n";
        cards[1].getNumber(),cards[1].getBalance(),cards[1].getBouns());
}

