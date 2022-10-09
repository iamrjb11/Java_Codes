
class Permutation {
    public void permutation(int[] nums,int index,List<List<Integer>> ans){
        if(index == nums.length-1 ){
            List<Integer> ds=new ArrayList<>();
            System.out.print("-> ");
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" "); 
                ds.add(nums[i]);
            }
            System.out.println();
            ans.add(ds);
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            //show(nums);
            permutation(nums,index+1,ans);
            swap(nums,index,i);//rearrange data(previous form)
            //show(nums);
            
            
        }
    }
    public void swap(int[] nums,int index,int i){
        int t=nums[i];
            nums[i]=nums[index];
            nums[index]=t;
    }
    public void show(int[] nums){
        for(int i=0;i<nums.length;i++){
         System.out.print(nums[i]+" ");   
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        List<List<Integer>> ans=new ArrayList<>();
        int[] nums={1,2,3};
        Solution ob=new Solution ();
        ob.permutation(nums,0,ans);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
