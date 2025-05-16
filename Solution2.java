package Theme2;

class Solution2 {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int left = 0;
        int right = x / 2;
        while(left <= right){
            int middle = (left + right) / 2;
            long current = (long) middle * middle;
            if(current == x){
                return middle;
            } else if(current < x){
                left = middle + 1;
            } else{
                right = middle - 1;
            }
        }
        return left - 1;
    }
}

