class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int c=n;
        while(c>0){
            int digit=c%10;
            sum+=digit;
            p*=digit;
            c/=10;
        }
        System.out.print(p +" "+ sum);
        if(n%(sum+p)!=0)
            return false;
        else
        return true;
    }
}