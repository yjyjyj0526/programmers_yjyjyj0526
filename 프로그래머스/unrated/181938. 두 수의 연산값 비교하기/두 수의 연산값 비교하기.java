class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a_string = Integer.toString(a);
        String b_string = Integer.toString(b);
        int answer2 = 2*a*b;
        String answer_string = a_string + b_string;
        String answer2_string = Integer.toString(answer2);

        if (Integer.parseInt(answer_string) > Integer.parseInt(answer2_string)) {
            answer = Integer.parseInt(answer_string);
        } else{
            answer = Integer.parseInt(answer2_string);
        }
        return answer;
    }
}