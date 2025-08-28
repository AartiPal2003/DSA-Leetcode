class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> MappingMap= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char original=s.charAt(i);
            char replace=t.charAt(i);

            if(!MappingMap.containsKey(original)){
                if(!MappingMap.containsValue(replace)){
                    MappingMap.put(original,replace);
                }
                else{
                    return false;
                }
            }
            else{
                char Mapped= MappingMap.get(original);
                if(Mapped != replace){
                    return false;
                }
            }
        }

     return true;   
    }
}