package bit_Manipulation;

public class getIthBit {
    public static int getIthBit(int n,int i) {
        int bitmask = 1<<i;   //jo ith bit chaiye uski jagah 1 ko shift kar do aur and(&) nikalo  agr 0 hoga to 1 ke sath milkar zero dega agr 1 hoga to one ke sath milar one dega.

        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,3));
        
    }
    
}
