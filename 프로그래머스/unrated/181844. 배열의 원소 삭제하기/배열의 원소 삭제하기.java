import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i<arr.length; i++){                               boolean a = false;
          for(int j=0; j<delete_list.length; j++){
                if (arr[i] == delete_list[j]){
                    a = true;
                    break;
                    
                }
            } 
                if(a==false){
                    answer.add(arr[i]);
                }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}