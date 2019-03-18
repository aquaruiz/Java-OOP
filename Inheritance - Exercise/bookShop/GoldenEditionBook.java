package bookShop;

public class GoldenEditionBook extends Book {

	public GoldenEditionBook(String title, String author, double price) throws Exception {
		super(title, author, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}
	
	@Override
	protected void setPrice(double price) throws Exception {
		super.setPrice(price * 1.3);
	}
}
