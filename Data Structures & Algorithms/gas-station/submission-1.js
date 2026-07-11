class Solution {
    /**
     * @param {number[]} gas
     * @param {number[]} cost
     * @return {number}
     */
    canCompleteCircuit(gas, cost) {
        let totalGas = 0;
        let totalCost = 0;
        let n = gas.length ;

        for(let i = 0 ;i< n ;i++){
            totalGas+= gas[i];
            totalCost += cost[i];
        }
        if(totalGas<totalCost) return -1 ;
        let start = 0;
        let tank = 0;
        for(let i = 0; i< n ;i++){
            tank += gas[i]- cost[i] ;
            if(tank<0){
                start = i+1 ;
                tank = 0;
            }
        }
        return start;
    }
}
