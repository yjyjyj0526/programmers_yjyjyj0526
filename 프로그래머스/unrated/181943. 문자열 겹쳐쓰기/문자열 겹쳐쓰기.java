class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String a = my_string.substring(0, s);
        String b = overwrite_string;
        String c = my_string.substring(s + overwrite_string.length());
        answer = a.concat(b).concat(c);
        return answer;
    }
}