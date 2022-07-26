package io.shoppingcart.shoppingcatalogservice.models;

public class Catalog {
	
	private int catalogId;
	private String productname;
	private String quantity;
	private int rating;
	private int price;
	
	public Catalog(int catalogId, String productname, String quantity, int rating, int price) {
		super();
		this.catalogId = catalogId;
		this.productname = productname;
		this.quantity = quantity;
		this.rating = rating;
		this.price = price;
	}

	public int getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
