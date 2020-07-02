import java.util.stream.IntStream;
import java.util.concurrent.ThreadLocalRandom;


public class RandNum {
    private int[] value;
    private int[] weight;
    private int sum;
    private int randNum;

    public RandNum(int[] value, int[] weight) {
        this.value = value;
        this.weight = weight;
        this.sum = IntStream.of(weight).sum();
    }

    public int getRandomNumberWeights(){
        this.randNum = ThreadLocalRandom.current().nextInt(1,sum+1);
        int[] tempArr = new int[weight.length];
        int num = 0;

        for (int i = 0; i < value.length; i++) {
            if(i==0){
                tempArr[0] = weight[0];
                continue;
            }
            tempArr[i] = tempArr[i-1] + weight[i];
        }

        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] > this.randNum){
                num = value[i];
                break;
            }
        }

        return num;
    }
    public int getRandNum() {
        return this.randNum;
    }
}
