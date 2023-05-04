//Doğa Kayra Yılmazarslan
public class FloorAndCeilCalculator {

    public int findCeiling(int number, int[] array, int low, int high){
        if (array.length == 0) {
            return -1;
        }

        if (number <= array[low]) {
            return array[low];
        }

        if (number > array[high]) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(number == array[mid]){
            return array[mid];
        }

        if(number > array[mid]){
            return findCeiling(number,array,mid + 1, high);
        }

        else{
            return findCeiling(number,array,low,mid);
        }

    }
    public int findFloor(int number, int[] array, int low, int high){
        if (array.length == 0) {
            return -1;
        }

        if (number < array[low]) {
            return -1;
        }

        if (number >= array[high]) {
            return array[high];
        }

        int mid = (low + high) / 2;

        if (mid == low) {
            return array[low];
        }

        if(number == array[mid]){
            return array[mid];
        }

        else if(array[mid] < number){
            return findFloor(number,array,mid, high);
        }

        else{
            return findFloor(number,array,low,mid - 1);
        }

    }
}
