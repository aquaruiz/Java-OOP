package bookShop;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book(String author, String title, double price) throws Exception {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
	}
	
	public String getTitle() {
		return title;
	}
	
	private void setTitle(String title) throws Exception {
		if (title.length() < 3) {
			throw new Exception("Title not valid!");
		}
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	private void setAuthor(String author) throws Exception {
		if (author.contains(" ")) {
			String[] authorNames = author.split(" ");
			String SecondAuthorName = authorNames[1];
			
			if (Character.isDigit(SecondAuthorName.charAt(0))) {
				throw new Exception("Author not valid!");
			}
		}
		
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	
	protected void setPrice(double price) throws Exception {
		if (price <= 0) {
			throw new Exception("Price not valid!");
		}
		
		this.price = price;
	}
	
	@Override
	public String toString() {
	    final StringBuilder sb = new StringBuilder();
	    sb.append("Type: ").append(this.getClass().getSimpleName())
	            .append(System.lineSeparator())
	            .append("Title: ").append(this.getTitle())
	            .append(System.lineSeparator())
	            .append("Author: ").append(this.getAuthor())
	            .append(System.lineSeparator())
	            .append("Price: ").append(String.format("%.1f", this.getPrice()))
	            .append(System.lineSeparator());
	    return sb.toString();
	}
}