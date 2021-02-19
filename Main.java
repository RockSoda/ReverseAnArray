public class Main
{
    //Reverse takes an array of ints revers it.
    
    /*private static void toLast(int[] input, int size){
        
        for(int i = 0; i < size-1; i++){
            int tmp = input[i];
            input[i] = input[i+1];
            input[i+1]  = tmp;
        }
    }
    private static void reverse(int[] input){
        int size = input.length;
        
        while(size > 0){
            toLast(input, size);
            size--;
        }
    }*/
    
    private static void reverse(int[] input, int left, int right){
        if(left < right && left < right-1){
            int tmp = input[left];
            input[left] = input[right];
            input[right] = tmp;
            reverse(input, left+1, right-1);
        }
    }
    
	public static void main(String[] args) {
	    int[] input = new int[]{1, 2, 3};
	    //reverse(input);
	    reverse(input, 0, input.length-1);
	    for(int i : input){
	        System.out.println(i);
	    }
	}
}
