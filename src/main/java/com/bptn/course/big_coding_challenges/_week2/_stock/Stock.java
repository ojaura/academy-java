package com.bptn.course.big_coding_challenges._week2._stock;

public class Stock {
	
	//Declare instance variables
	private String tickerSymbol;
	private String companyName;
	private int price;
	private double percentChange;
	private int totalShares;
	private long marketCap;
	
	//Constructor
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0;
		this.marketCap = totalShares * price;
	}
	
	//Class Methods
	public void adjustPrice(int change) {
		this.price += change;
		double change_as_a_double = change;
		this.percentChange = (change_as_a_double / price) * 100;
		this.marketCap = totalShares * price;
	}
	
	public String toString() {
		return "Ticker Symbol: " + tickerSymbol +
				"\nCompany: " + companyName + 
				"\nCurrent Price: $" + price + " (" +
				percentChange + "%)" + "\nMarket Cap: $" +
				marketCap;
	}
	
	// Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }

}
