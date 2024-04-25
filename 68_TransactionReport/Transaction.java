class Transaction {
    //variables for transaction
    String itemName;
    String itemDescription;
    double itemCost;
    double itemSalePrice;
    double itemProfit;
    double itemMargin;
    //method
    public Transaction(String itemName, String itemDescription, double itemCost, double itemSalePrice,double itemProfit, double itemMargin ) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCost = itemCost;
        this.itemSalePrice = itemSalePrice;
        this.itemProfit = itemProfit;
        this.itemMargin = itemMargin;

    }
    //getters nad setters
    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemCost() {
        return itemCost;
    }

    public double getItemSalePrice() {
        return itemSalePrice;
    }

    public double getItemProfit() {
        return itemProfit;
    }
    // item margin cacualtion- might not be correct 
    public double getItemMargin() {
        return (itemProfit - itemCost) / itemProfit * 100;
    }
}
















}
