class Solution {
    public double average(int[] salary) {
        int N=salary.length;
        int min=salary[0],max=0,total=0;
        for(int i=0;i<N;i++){
            total+=salary[i];
            min=Math.min(salary[i],min);
            max=Math.max(salary[i],max);
        }
        return (total-min-max)/(N-2);
    }
}