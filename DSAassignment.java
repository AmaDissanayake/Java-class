/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsaassignment;
class PApp
{
    public void PrintArray (int array[])                                        //Method for print values
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(" "+array[i]);
        }
         System.out.println("");
    }
    public void method_sort(int[]arr)                                           //Method for sort the numbers from min to max
    {
        for(int i = 0; i< arr.length - 1; i++)
        {
            int index = i;
            for(int j=i + 1; j < arr.length; j++)
            {
                if (arr[j]<arr[index])
                {
                    index = j;                                                  //searching for the lowest number
                }
            } 
            int MinNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = MinNumber;           
        }
    }

        public void binarySearch (int arr[], int first, int last, int key)      //Method for Search
    {
        int mid = (first + last)/2;                                             //Get mid value
        while (first<=last)                                                     //Comparison of Mid Value and Key/FindValue
        {
            if(arr[mid]<key)                                                    //Set new start index
            {
                first = mid + 1;
            }
            else if (arr[mid] == key)                                           //If the value is found in the array list                     
            {
                System.out.println("Element is found at index: "+ mid);         //Display at what index the key/find value is
                break;                                                          //Stopping search (Gets out from the exisitng conditions)
            }
            else 
            {
                last = mid -1;                                                  //Setting the last index
            }
            mid = (first + last)/2;                                             //Again getting the mid index
        }
        if (first>last)
        {
        System.out.println("Element is not Found!");
}
}      
}        
         
public class DSAassignment {
    
    public static void main(String[] args) {
        int FindKey = 60;                                                       //Find element
        
        int Array[]={44,01,12,56,70,125,74,99,10,120};                          //Unordered array list
        
        PApp obj=new PApp();
        obj.PrintArray(Array);
        
        obj.method_sort(Array);                                                 //ordered list
        obj.PrintArray(Array);
        
        obj.binarySearch(Array,0,Array.length-1,FindKey);                       //calling the search method
        
    }
}