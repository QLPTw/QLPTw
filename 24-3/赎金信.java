class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hashmap=new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char temp=magazine.charAt(i);
            if(!hashmap.containsKey(temp)){
                hashmap.put(temp,1);
            }else {
                hashmap.put(temp,hashmap.get(temp)+1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char temp=ransomNote.charAt(i);
            if(!hashmap.containsKey(temp)){
                return false;
            } else if (hashmap.get(temp)<1){
                return false;
            }else {
                hashmap.put(temp,hashmap.get(temp)-1);
            }
        }
        return true;
    }
}