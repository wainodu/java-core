package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }
        Arrays.sort(nums);
        for (int i: nums){
            System.out.println(i);
        }
        int min = 0;
        for (int i: nums){
            if (min > i){
                min = i;
            }
        }
        System.out.println("Min value = " + min);
        for (int i = 0; i < nums.length; i++){
            if (min == nums[i]){
                System.out.println(i);
            }
        }
    }
}
