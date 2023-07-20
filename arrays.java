public class arrays{
    public static int buy_and_sell_stock(int arr[]){
        int min_price=Integer.MAX_VALUE;
        int total_profit=0;
        int profit_if_sold_today=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min_price){
                min_price=arr[i];
            }

            profit_if_sold_today=arr[i]-min_price;
            if(total_profit<profit_if_sold_today){
                total_profit=profit_if_sold_today;
            }
        }
        return total_profit;
    }
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        System.out.println(buy_and_sell_stock(arr));
    }
}

/*approach
 * 
 * we have to buy a stock with min.. price so initially we take the value of min_price is 
 * MAX after that we run a loop by which we find the min_price
 * after that we will check the profit if sold today on each iteration 
 * if total profit is less than profit if sold today so we update the value and return the total profit
 */