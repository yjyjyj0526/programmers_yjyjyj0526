class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int[] query : queries) { 
            int i = query[0];
            int j = query[1];
            
            int x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
        }
        answer = arr;
        return answer;
    }
}
