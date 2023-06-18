class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int[] answer2 = new int[num_list.length];
        int count = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i < n) {
                answer[i] = num_list[i];
            } else {
                answer2[count] = num_list[i];
                count++;
            }
        }

        for (int num : answer) {
            answer2[count] = num;
            count++;
        }

        return answer2;
    }
}
