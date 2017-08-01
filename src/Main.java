/**
 * Created by adavi on 01.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        BuildArray array = new BuildArray();

        int [] myArray = array.arrayBild(12);

       int []notZeroArray =  array.equalsArray(myArray);

       int [] equalsArray = array.numberSingArray(notZeroArray);

       array.readArray(equalsArray);

    }
}
