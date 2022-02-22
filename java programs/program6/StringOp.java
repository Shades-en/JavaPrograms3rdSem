package program6;

import java.util.Scanner;
import java.util.Arrays;

class StringOp{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1.Make a substring");
    System.out.println("2.Count occurences");
    System.out.println("3.replace string");
    System.out.println("4.Sort a string");
    System.out.println("5.compare string");
    System.out.println("6.Concatenate");
    System.out.println("7.exit");
    while(true){
        System.out.println("Enter a choice");
        int ch = sc.nextInt();
        sc.nextLine();
        switch(ch){
            case 1:
                System.out.println("Enter a string");
                String str= sc.next();
                System.out.println("Enter the position you want to make the substring");
                int n = sc.nextInt();
                System.out.println("Enter the characters to take out ");
                int m= sc.nextInt();
                String str2= str.substring(n-1,m+n-1);
                System.out.println("new substring= "+str2);
                break;
            
            case 2:
                
                System.out.println("Enter a complete string");
                str2 = sc.nextLine();
                System.out.println("Enter a word you want to count");
                String word= sc.nextLine();
                String [] strArr=str2.split(" ");
                int count=0;
                for(int i=0;i<strArr.length;i++){
                    if(strArr[i].equals(word)){
                        count++;
                    }
                }
                System.out.println("Total= "+count);
                break;
            
            case 3:
                System.out.println("Enter a string");
                String str4= sc.nextLine();
                System.out.println("Enter a word to replace");
                String word1=sc.next();
                System.out.println("Enter a word to replace it with");
                String word2 = sc.next();
                String replaced= str4.replace(word1, word2);
                System.out.println("New word = "+replaced);
                break;

            case 4:
                System.out.println("Enter a string");
                String str5= sc.nextLine();
                str5=str5.toLowerCase();
                char [] arr= str5.toCharArray();
                Arrays.sort(arr);
                String new_string= new String(arr);
                System.out.println("Result= "+new_string);
                break;

            case 5:
                System.out.println("Enter a string");
                String str6= sc.next();
                System.out.println("Enter a string2");
                String str7= sc.next();
                boolean val= str6.equalsIgnoreCase(str7);
                if(val){
                    System.out.println("strings equal");
                }
                else{
                    System.out.println("Not equal");
                }
                break;

            case 6:
                System.out.println("Enter a string");
                String str8= sc.next();
                System.out.println("Enter a string2");
                String str9= sc.next();
                String str10= str8.concat(str9);
                System.out.println("new string = "+str10);
                break;

            case 7:
                System.exit(0);
        }
    }
    }
}