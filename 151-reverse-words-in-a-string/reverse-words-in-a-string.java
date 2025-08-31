class Solution {
    public String reverseWords(String s) {
        s += " "; // Add space at end to capture last word
        Stack<String> st = new Stack<>();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {  
                if (!str.equals("")) {
                    st.push(str);  
                    str = "";
                }
            } else {
                str += s.charAt(i); 
            }
        }

        String ans = "";
        while (st.size() > 1) {
            ans += st.pop() + " "; 
        }

        if (!st.isEmpty()) {
            ans += st.pop(); 
        }

        return ans; 
    }
}
