class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 1; i < numLog.length; i++) {
            int youngjun = numLog[i] - numLog[i - 1];
            
            if (youngjun == 1) {
                answer += "w";
            } else if (youngjun == -1) {
                answer += "s";
            } else if (youngjun == 10) {
                answer += "d";
            } else if (youngjun == -10) {
                answer += "a";
            }
        }
        
        return answer;
    }
}
