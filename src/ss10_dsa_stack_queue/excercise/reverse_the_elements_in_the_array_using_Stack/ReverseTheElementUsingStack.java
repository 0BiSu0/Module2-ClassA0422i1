package ss10_dsa_stack_queue.excercise.reverse_the_elements_in_the_array_using_Stack;

public class ReverseTheElementUsingStack {
    static class Stack{
        int size;
        int top;
        char[] a;
        boolean isEmpty(){
            return (top < 0);
        }
        Stack(int n){
            top = -1;
            size = n;
            a = new char[size];
        }
        boolean push(char x){
            if (top >= size){
                System.out.println("Stack Overflow");
                return false;
            }else {
                a[++top] = x;
                return true;
            }
        }
        char pop(){
            if (top < 0){
                System.out.println("Stack Underflow");
                return 0;
            }else {
                char x = a[top--];
                return x;
            }
        }
    }
    static class Main{
        public static void reverse(StringBuffer str){
            int n = str.length();
            Stack obj = new Stack(n);
            int i;
            for (i = 0; i< n; i++){
                obj.push(str.charAt(i));
                for (i = 0; i < n; i++){
                    char ch = obj.pop();
                    str.setCharAt(i, ch);
                }
            }
        }
        public static void main(String args[]){
            StringBuffer s = new StringBuffer("CodeGymRaising the bar");
            reverse(s);
            System.out.println("Reversed string is" + s);
        }
    }
}