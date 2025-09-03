class Solution {
    // public static String sortString(String str){
    //     char c[]= str.toCharArray();
    //     Arrays.sort(c);
    //     return new String(c);
    // }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int count[] = new int[26];
        for(char ch: s.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            count[ch-'a']--;
        }

        for(int val:count){
            if(val!=0){
                return false;
            }
        }

       
        return true;
        
    }
}