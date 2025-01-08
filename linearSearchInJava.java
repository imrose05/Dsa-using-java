/*
  Pseudocode for the linear Search 
  process iinearSearch(A:list of items,target:items to search for)
  n=length(A)
  for i from 0 to n-1
  if(A[i]== target then)
  return i
  end if
  end for
  end process
  
 */

import java.util.Scanner;

public class linearSearchInJava {

    public static int linearSearch(int [] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;

            }
        }
        return -1;

    }
    public static void main(String args[]){
       /* it is the method for the values what we assigned at the run time !
        int nums[]={2,4,6,8,10,12,14};
        int target=8;
        int result=linearSearch(nums, target);
        
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size=sc.nextInt();

        int nums[]=new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            System.out.print("Element"+(i+1)+":");
            nums[i]=sc.nextInt();

        }
        System.out.println("Enter the target value search for :");
        int target=sc.nextInt();

        int result=linearSearch(nums, target);


        if(result!=-1){
            System.out.println("Element which you are searching for is at the index no:"+result);
        }
        else{
            System.out.println("Element you are searching for is not present in the array/list");
        }

    }
    
}
