public class Main {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("Input number");
            String result = theDotCom.checkYourSelf(guess);
            numOfGuess ++;

            if(result.equals("Sunk")){
                isAlive = false;
                System.out.println("You needed " + numOfGuess + " try");
            }
        }
    }
}
