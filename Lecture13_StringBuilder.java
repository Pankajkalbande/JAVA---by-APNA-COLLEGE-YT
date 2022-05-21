public class Lecture13_StringBuilder {
    public static void main(String[] args) {
        
        // String in java are Immutable 
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // chat at 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0,'s');
        System.out.println(sb);

        // insert 
        sb.insert(0,"P");
        System.out.println(sb);

        // delete the char at index
        sb.delete(0, 1);
        System.out.println(sb);

        StringBuilder st = new StringBuilder("hello");
        // st.append("e");
        // st.append("l");
        // st.append("l");
        // st.append("o");
        // System.out.println(st);
        // System.out.println(st.length());
        // System.out.println(st.reverse());

        // reverse string 
        System.out.println("------ Reversing the stirng -------");
        for(int i=0; i<st.length()/2; i++){
            int front = i;
            int back = st.length()-1-i;

            char frontChar = st.charAt(front);
            char backChar = st.charAt(back);

            st.setCharAt(front, backChar);
            st.setCharAt(back, frontChar);
        }
        System.out.println(st);
    }
    
}
