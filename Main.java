//Doğa Kayra Yılmazarslan
public class Main {

    public static void main(String[] args){
        int[] array = {1,3,4,7,8,9};
        FloorAndCeilCalculator floorAndCeilCalculator = new FloorAndCeilCalculator();
        for (int number = 0; number <= 10; number++)
        {
            System.out.println("Number is: " + number + " Ceiling is: " + floorAndCeilCalculator.findCeiling(number, array, 0, array.length-1) + " Floor is: " +
                    floorAndCeilCalculator.findFloor(number,array,0, array.length-1));
        }
    }
}
