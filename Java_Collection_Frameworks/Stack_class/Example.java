import java.util.Stack;
public class Example{
    public static void main(String [] args){
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(3);
        st.push(6);

        System.out.println(st); //[10, 20, 3, 6]

        st.pop();
        System.out.println(st); //[10, 20, 3]

        System.out.println(st.peek());  //3
        System.out.println(st);   //[10, 20, 3]

        System.out.println(st.search(20));  //2
    }
}