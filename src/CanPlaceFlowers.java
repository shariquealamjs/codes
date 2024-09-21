public class CanPlaceFlowers {
    public static void main(String[] args) {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        int []  flowerbed = new int[]{1,0,0,0,1,0,0};
        int n = 2;
        System.out.println(canPlaceFlowers.canPlaceFlowers(flowerbed,n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int length = flowerbed.length;
        if(n==0)
            return true;
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == length - 1 || flowerbed[i + 1] == 0) && n>0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n == 0;
    }
}
