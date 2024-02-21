//Andrew Schutzbach
//a java program made to validate credit/debit cards
import java.util.Scanner;

public class CardValidation {

    public static void main(String[] args) {

        //Variables used
        long cardNumber = 1;
        int [] cardArray;
        Scanner input = new Scanner(System.in);
        String cardAsString;
        int evenCount;
        int oddCount;
        int result = 0;


        while (cardNumber != 0) {

            //Returns values back to 0
            evenCount = 0;
            oddCount = 0;

            //Asks user to enter a valid card number
            System.out.println("Please enter a valid credit card or type 0 to quit");

            //Gets card number
            cardNumber = input.nextLong();
            //Gets string version of card for length
            cardAsString = String.valueOf(cardNumber);

            //Gets info for cards with 16 numbers
            if (cardAsString.length() == 16) {
                cardArray = new int[16];
                //Takes numbers of cards and puts them in an array
                for(int i = 0; i < cardAsString.length(); i++) {
                    cardArray[i] = Character.getNumericValue(cardAsString.charAt(i));
                }

                //Checks for valid company numbers
                if ((cardArray[0] == 4) || (cardArray[0] == 5) || (cardArray[0] == 6) || (cardArray[0] == 3 && cardArray[1] == 7)) {

                    //Gets every even number from right to left and multiplies them by 2
                    for (int i = 14; i >= 0; i -= 2) {
                        if (cardArray[i] * 2 < 10) {
                            evenCount += cardArray[i] * 2;
                        } else {
                            result = cardArray[i] * 2;
                            result = result / 10 + result % 10;
                            evenCount += result;
                        }
                    }

                    //Gets every odd number from right to left
                    for (int i = 15; i >= 0; i -= 2) {
                        oddCount += cardArray[i];
                    }

                    //Takes results from even and odd counts. Then adds them together
                    result = evenCount + oddCount;

                    //If divisible by 10 the card number is valid
                    if (result % 10 == 0) {
                        System.out.println("This is a valid credit card!");
                    } else {
                        System.out.println("That is not a vaild card.");
                    }
                } else {
                    System.out.println("This is not a vaild card");
                }

            }
            //Gets info for cards with 15 numbers
            else if (cardAsString.length() == 15) {

                cardArray = new int[15];
                for(int i = 0; i < cardAsString.length(); i++) {
                    cardArray[i] = Character.getNumericValue(cardAsString.charAt(i));
                }

                //Checks for valid company numbers
                if ((cardArray[0] == 4) || (cardArray[0] == 5) || (cardArray[0] == 6) || (cardArray[0] == 3 && cardArray[1] == 7)) {

                    //Gets every even number from right to left and multiplies them by 2
                    for (int i = 13; i >= 0; i -= 2) {
                        if (cardArray[i] * 2 < 10) {
                            evenCount += cardArray[i] * 2;
                        } else {
                            result = cardArray[i] * 2;
                            result = result / 10 + result % 10;
                            evenCount += result;
                        }
                    }

                    //Gets every odd number from right to left
                    for (int i = 14; i >= 0; i -= 2) {
                        oddCount += cardArray[i];
                    }

                    //Takes results from even and odd counts. Then adds them together
                    result = evenCount + oddCount;

                    //If divisible by 10 the card number is valid
                    if (result % 10 == 0) {
                        System.out.println("This is a valid credit card!");
                    } else {
                        System.out.println("That is not a vaild card.");
                    }
                } else {
                    System.out.println("That is not a vaild card.");
                }

            }
            //Gets info for cards with 14 numbers
            else if (cardAsString.length() == 14) {
                cardArray = new int[14];
                for(int i = 0; i < cardAsString.length(); i++) {
                    cardArray[i] = Character.getNumericValue(cardAsString.charAt(i));
                }
                //Checks for valid company numbers
                if ((cardArray[0] == 4) || (cardArray[0] == 5) || (cardArray[0] == 6) || (cardArray[0] == 3 && cardArray[1] == 7)) {

                    //Gets every even number from right to left and multiplies them by 2
                    for (int i = 12; i >= 0; i -= 2) {
                        if (cardArray[i] * 2 < 10) {
                            evenCount += cardArray[i] * 2;
                        } else {
                            result = cardArray[i] * 2;
                            result = result / 10 + result % 10;
                            evenCount += result;
                        }
                    }

                    //Gets every odd number from right to left
                    for (int i = 13; i >= 0; i -= 2) {
                        oddCount += cardArray[i];
                    }

                    //Takes results from even and odd counts. Then adds them together
                    result = evenCount + oddCount;

                    //If divisible by 10 the card number is valid
                    if (result % 10 == 0) {
                        System.out.println("This is a valid credit card!");
                    } else {
                        System.out.println("That is not a vaild card.");
                    }
                } else {
                    System.out.println("That is not a vaild card.");
                }

            }
            //When user enters 0 program ends
            else if (cardNumber == 0) {

            }
            //If the card number isn't between 13 and 16 tells user card is invalid
            else {
                System.out.println("That is not a vaild card.");
            }

        }

    }

}