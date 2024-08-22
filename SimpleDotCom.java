

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "By";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Sunk";
        }
        System.out.println(result);
        return  result;
    }

}
