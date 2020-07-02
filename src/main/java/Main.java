import java.util.Random;
import org.apache.log4j.Logger;

public class Main {

    static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        int[] value = {1,2,3};
        int[] weight = {10,2,1};

        RandNum num = new RandNum(value, weight);

        for (int i = 0; i < 10; i++) {
            LOGGER.info(num.getRandomNumberWeights()+" - randNum - "+num.getRandNum());
        }
    }
}


