import java.util.*;

public class recursion {
    public static int fibonacci(int number){
        if(number == 0 || number == 1){
            return 1;
        }else{
            return fibonacci(number-1) + fibonacci(number-2);
        }
    }

    public static int factorial(int number){
        if( number == 0 ){
            return 1;
        }else{
            return number * factorial(number-1);
        }
    }

    public static int sum(int number){
        if( number == 0 ){
            return 1;
        }else{
            return number + sum(number-1);
        }
    }

    public static int power(int numberOne , int numberTwo){
        if(numberTwo == 0 ){
            return 1;
        }else{
            return numberOne * power(numberOne,numberTwo-1);
        }
    }

    public static void printEndFirst(int number){
        if(number == 0){
            System.out.print(number);
        }else{
            System.out.print(number + (" "));
            printEndFirst(number-1);
        }
    }

    public static void printFirstEnd(int number){
        if(number == 0){
            System.out.print(number);
        }else{
            printFirstEnd(number-1);
            System.out.print(number);
        }System.out.print(" ");
    }

    public static void towerOFHanoi(int neededElement , int firstDisk , int secondDisk , int thirdDisk){
        if(neededElement >= 1){
            towerOFHanoi(neededElement-1 , firstDisk , thirdDisk , secondDisk);
            System.out.println("Send " + (neededElement) + " from " + (firstDisk) + " to : " + (thirdDisk));
            towerOFHanoi(neededElement-1 , secondDisk , firstDisk ,  thirdDisk);
        }
    }

    public static int linearSearch(int arr[] , int element , int counter){
        if(arr[counter] == element){
            return counter;
        }else if(counter > arr.length){
            return -1;
        }else{
           return linearSearch(arr,element,counter+1);
        }
    }

    public static int binarySearch(int arr[] , int left , int right , int element ){
        if(left <= right){
            int middle = (left + right) / 2;

            if(arr[middle] == element){
                return middle;
            
            } else if(arr[middle] > element){
                return binarySearch(arr , left , middle-1 , element );
            
            }else{
                return binarySearch(arr , middle+1 , right , element );
            }

        }else{
            return -1;
        }
    }

    public static void sortData(int arr[]){
        int min;
        for(int outer = 0 ; outer < arr.length ; outer++){
            min = outer;
            for(int inner = outer + 1 ; inner < arr.length ; inner++){
                if(arr[inner] < arr[min]){
                    min = inner;
                }
            }
            swap(outer,min,arr);
        }
    }

    public static void swap(int first , int last , int arr[]){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


    public static void main(String[] args) {
        System.out.println("The fibonacci of 8: " + (fibonacci(8)));
        System.out.println("The factorial of 8: " + (factorial(8)));

        System.out.println("The result of 2 to the power of 8: " + (power(2,8)));
        System.out.println("The sum of 8: " + (sum(8)));
        printFirstEnd(5);
    
    }
}