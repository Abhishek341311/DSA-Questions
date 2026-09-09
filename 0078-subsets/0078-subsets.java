// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {

//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<List<Integer>> lists = new ArrayList<>();

//         fun(nums, 0, list, lists);
//         return lists;
//     }

//     void fun(int[] arr, int idx, ArrayList<Integer> list, ArrayList<List<Integer>> lists){

//         if(idx == arr.length){
//             lists.add(new ArrayList<>(list));
//             return;
//         }

//         list.add(arr[idx]);
//         fun(arr, idx + 1, list, lists);

//         list.remove(list.size() - 1);

//         fun(arr, idx + 1, list, lists);

//     }
// }






class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        int n = nums.length;
        int m = (1<<n);

        List<List<Integer>> lists = new ArrayList<>();

        for(int i = 0; i < m; i++){
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < n; j++){
                if((i>>j) % 2 == 1) list.add(nums[j]);
            }
            lists.add(list);
        }   

        return lists;        
    }

}