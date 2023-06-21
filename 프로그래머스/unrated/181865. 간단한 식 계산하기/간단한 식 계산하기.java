class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] p = binomial.split(" ");
        int a = Integer.parseInt(p[0]);
        int b = Integer.parseInt(p[2]);
        String op = p[1];
        
        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        }
        
        return answer;
    }
}
