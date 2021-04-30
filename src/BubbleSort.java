public class BubbleSort {
    private int[] myIntArray = new int[5];
    private int nextIndex;

    boolean insert(int num){
        boolean isInserted = false;
        if (nextIndex < myIntArray.length){
            myIntArray[nextIndex++] = num;
            isInserted = true;
        }
        return isInserted;
    }

    // Bubble Sort Algorithm Start here
    void BubbleSortM(){
        int n = myIntArray.length;
        for (int i=0; i < n-1; i++){
            boolean isSwapped = false;
            for (int j=0; j<n-1-i; j++){
                if (myIntArray[j] > myIntArray[j+1]) {
                    int temp = myIntArray[j];
                    myIntArray[j] = myIntArray[j+1];
                    myIntArray[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }    

    void treverse(){
        for(int i=0; i<myIntArray.length; i++){
            System.out.println(i+1 + " :: " + myIntArray[i]);
        }
    }

}