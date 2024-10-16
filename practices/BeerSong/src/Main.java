public class Main {
    public static void main(String[] args) {
        int beerNum = 99;
        String word;

        while (beerNum > 0) {
            // Correctly determine the word for the current number of beers
            if (beerNum == 1) {
                word = "bottle";
            } else {
                word = "bottles";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");

            beerNum = beerNum - 1;

            // Display the next number of bottles or end message
            if (beerNum > 0) {
                if (beerNum == 1) {
                    word = "bottle";
                } else {
                    word = "bottles";
                }
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
