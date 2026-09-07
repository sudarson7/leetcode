class Solution {
    public boolean isAnagram(String s, String t) {
        int a=s.length();
        int b=t.length();
        char[]c=s.toCharArray();
        char[]d=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)){
            return true;
        }
        else{
            return false;
        }
    }
}