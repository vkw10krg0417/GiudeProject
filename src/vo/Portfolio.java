package vo;

public class Portfolio {
	private int portfolio;
	private String member_id;
	private String portfolio_title;
	private String price;
	private int hour ;
	private int max_people;
	private String content;
	private String photo1;
	private String photo2;
	private String photo3;
	private String photo4;
	private String photo5;
	
	public Portfolio() {}
	
	public Portfolio(int portfolio, String member_id, String portfolio_title, String price, int hour, int max_people,
			String content, String photo1, String photo2, String photo3, String photo4, String photo5) {
		this.portfolio = portfolio;
		this.member_id = member_id;
		this.portfolio_title = portfolio_title;
		this.price = price;
		this.hour = hour;
		this.max_people = max_people;
		this.content = content;
		this.photo1 = photo1;
		this.photo2 = photo2;
		this.photo3 = photo3;
		this.photo4 = photo4;
		this.photo5 = photo5;
	}

	public int getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(int portfolio) {
		this.portfolio = portfolio;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getPortfolio_title() {
		return portfolio_title;
	}

	public void setPortfolio_title(String portfolio_title) {
		this.portfolio_title = portfolio_title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMax_people() {
		return max_people;
	}

	public void setMax_people(int max_people) {
		this.max_people = max_people;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public String getPhoto3() {
		return photo3;
	}

	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}

	public String getPhoto4() {
		return photo4;
	}

	public void setPhoto4(String photo4) {
		this.photo4 = photo4;
	}

	public String getPhoto5() {
		return photo5;
	}

	public void setPhoto5(String photo5) {
		this.photo5 = photo5;
	}

	@Override
	public String toString() {
		return "Portfolio [portfolio=" + portfolio + ", member_id=" + member_id + ", portfolio_title=" + portfolio_title
				+ ", price=" + price + ", hour=" + hour + ", max_people=" + max_people + ", content=" + content
				+ ", photo1=" + photo1 + ", photo2=" + photo2 + ", photo3=" + photo3 + ", photo4=" + photo4
				+ ", photo5=" + photo5 + "]";
	}
	
}
