public class MaxAreaContainer {

    public static void main(String[] args) {
        //int height[] = new int[]{1,8,6,2,5,4,8,3,7};
        int height[] = new int[]{5,4,3,2,1};
        MaxAreaContainer maxAreaContainer = new MaxAreaContainer();
        System.out.println(maxAreaContainer.maxArea(height));
    }
    public int maxArea(int[] height){
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while(left<right){
            int width = right - left;
            int min_height = height[left]<height[right]?height[left]:height[right];
            int currentArea = min_height * width;
            maxArea = currentArea>maxArea?currentArea:maxArea;
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
