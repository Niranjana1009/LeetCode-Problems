//approach 1 - simulate flow
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

//approach 2 - based on parity
class Solution {
    public String winningPlayer(int x, int y) {
        int turn = Math.min(x, y/4);
        return (turn % 2 == 1) ? "Alice": "Bob";
    }
}
