package Math.AveragesOfNumbers;

class Averages {

    static double[] averages(int[] numbers) {
        if(numbers == null || numbers.length == 0){
            return new double[]{};
        }

        double[] out = new double[numbers.length -1];
        for(int x = 0; x < numbers.length-1; x++){
            out[x] = ((double) numbers[x] + (double) numbers[x+1]) / 2;
        }

        return out;
    }
}
