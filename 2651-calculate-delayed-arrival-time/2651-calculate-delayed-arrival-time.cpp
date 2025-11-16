class Solution {
public:
    int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time=(arrivalTime+delayedTime)%24;
        return time;
    }
};