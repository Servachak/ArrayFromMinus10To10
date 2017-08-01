/**
 * Created by adavi on 01.08.2017.
 */
public class BuildArray {

    public int[] arrayBild(int n){

        int arr[]  = new int[n];
        for (int i = 0; i < arr.length; i++){

            arr[i] = (int) (Math.random() * (22) - 11);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public int [] equalsArray(int arr[]){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = (int) (Math.random() * (22) - 11);


            }
            System.out.print(arr[i] + " ");
        }return arr;
    }

    public int[] numberSingArray(int []arr){
        int countMinus = 0;
        int countPlus = 0;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                countMinus++;
                if (countMinus > arr.length / 2){
                    arr[i]*= -1;
                }
            }else if (arr[i] > 0){
                countPlus++;
                if (countPlus > arr.length / 2){
                    arr[i]*= -1;
                }
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(countMinus + " - Від'ємні знаки");
        System.out.println(countPlus + " - Плюсові знаки");
        return arr;
    }
    public void readArray(int arr[]){
        System.out.print("Новий масив: ");
        for (int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " ");
        }
    }

}
