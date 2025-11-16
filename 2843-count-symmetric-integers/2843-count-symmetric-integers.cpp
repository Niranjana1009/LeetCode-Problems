class Solution {
public:
    bool sum(int num,int mult) {
        int n1=num/mult,n2=num%mult,sum1=0,sum2=0;
        while(n1>0){
            sum1+=(n1%10);
            n1/=10;
        }
        while(n2>0){
            sum2+=(n2%10);
            n2/=10;
        }
        return sum1==sum2;
    }
    int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++){
            int count=0;
            for(int j=i;j>0;j/=10){
                count++;
            }
            if(count>=2 && count%2==0 && sum(i,pow(10,count/2))){
                cout<<i<<" ";
                ans++;
            }
        }
        cout<<sum(1203,100);
        return ans;
    }
    
};