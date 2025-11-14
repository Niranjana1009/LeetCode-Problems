class Solution {
    public String winningPlayer(int x, int y) {
        boolean flag=true;
        while(x>1 && y>4){
            flag=!flag;
            x-=1;
            y-=4;
        }
        return flag?"Bob":"Alice";
    }
}