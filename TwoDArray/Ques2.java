package TwoDArray;

public class Ques2 {
    public static void main(String args[]){
        int [][] numbers = {
            {2,4,7},
            {6,3,9}

        };

        int max = numbers[0][0];

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                 if(numbers [i][j] > max){
                    max = numbers [i][j]; 
                 }
            }
        }

        System.out.print(max );
    }
}
