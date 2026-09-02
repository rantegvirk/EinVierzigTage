// Richest customer wealth (simple row add)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxmoney = 0;

        for (int i=0; i<accounts.length; i++){
            int sum = 0;
            for (int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if (sum>maxmoney){
                maxmoney = sum;
            }
        }
        return maxmoney;

    }
}
