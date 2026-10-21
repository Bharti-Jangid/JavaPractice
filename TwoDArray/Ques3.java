package TwoDArray;
public class Ques3 {
    public static void main(String args[]){
        int [][] numbers = {
            {7,3,4},
            {5,9,1}
        };
        int min = numbers[0][0];

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(numbers [i][j] < min){
                    min = numbers [i][j];
                }
            }
            
        }
        System.out.println(min);
    }
}
