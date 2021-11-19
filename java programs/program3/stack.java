package program3;

import java.util.*;

public class stack {
    int top;
    int size;
    int s[];

    public stack(int size, int top){
        this.size=size;
        this.top=top;
        this.s=new int[size];
    }

    void push(int item){
        if(top==size-1){
            System.out.println("Stack overflow");
            return;
        }
        s[++top]=item;
        return;
    }

    int pop(){
        return s[top--];
    }

    void display(){
        if(top==-1){
            System.out.println("stack underflow");
            return;
        }
        System.out.println("The stack eleme4ents are");
        for(int i=top;i>=0;i--){
            System.out.println(s[i]);            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int item;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size");
        int size = sc.nextInt();
        stack st = new stack(size, -1);
        System.out.println("1.Push 2.Pop 3.Display 4.exit");
        while(true){
            System.out.println("Enter a choice");
            int ch = sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter an element to push into stack");
                        item = sc.nextInt();
                        st.push(item);
                        break;
                
                case 2:if(st.top==-1){
                        System.out.println("stack underflow");
                    }
                    else{
                        System.out.println("The deleted item is " + st.pop());
                    }
                    break;

                case 3:st.display();
                    break;

                case 4: System.exit(0);

                default: System.out.println("Wrong choice");
                break;
            }
        }
    }
}
