/*
Problem Statement
Write a Java program to print the unique characters present in the given string in the same sequence as they appear
(the first occurrence) in the input.
Condition:
All the characters should be in lowercase only.
Input:
xperience
Output:
xperinc
*/
import java.util.*;
//public class Unique
//{
//    public static void main(String args[])
//    {
//        String temp="";
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        for(int i=0;i<str.length();i++)
//        {
//            if(!temp.contains(Character.toString(str.charAt(i))))
//            {
//                temp = temp + str.charAt(i);
//            }
//        }
//        System.out.println(temp);
//
//    }
//}
public class Unique
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String flg = " ";
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i]== arr[j] ) //aafhs
                {
                    flg = flg + arr[i];

                }
            }
        }
        System.out.print(flg);
    }
}