package Bean;
/*
 * Developed By Rohit Pisipaty (G01084064)
 */




import java.io.Serializable;

public class StudentBean implements Serializable {

	/**
	 * 
	 * Instance Variables
	 * 
	 */
	private String name;
	private String streetaddress;
	private String mobile;
	private String zipcode;
	private String city;
	private String state;
	private String email;
	private String URL;
	private String dos;
	private String gradmonth;
	private String option;
	private String box;
	private String recommend;
	private String feedback;
	private String numbers;
	private String StudentID;
	
	public StudentBean() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return streetaddress;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.streetaddress = address;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zipcode;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zipcode = zip;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return URL;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.URL = url;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return dos;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.dos = date;
	}

	/**
	 * @return the month
	 */
	public String getMonth() {
		return gradmonth;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.gradmonth = month;
	}

	/**
	 * @return the interest
	 */
	public String getInterest() {
		return box;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(String interest) {
		this.box = interest;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return mobile;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.mobile = tel;
	}

	/**
	 * @return the info
	 */
	public String getInfo() {
		return option;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.option = info;
	}

	/**
	 * @return the dropdown
	 */
	public String getDropdown() {
		return recommend;
	}

	/**
	 * @param dropdown the dropdown to set
	 */
	public void setDropdown(String dropdown) {
		this.recommend = dropdown;
	}

	/**
	 * @return the textarea
	 */
	public String getTextarea() {
		return feedback;
	}

	/**
	 * @param textarea the textarea to set
	 */
	public void setTextarea(String textarea) {
		this.feedback = textarea;
	}

	/**
	 * @return the raffle
	 */
	public String getRaffle() {
		return numbers;
	}

	/**
	 * @param raffle the raffle to set
	 */
	public void setRaffle(String raffle) {
		this.numbers = raffle;
	}

	/**
	 * @return the stuID
	 */
	public String getStuID() {
		return StudentID;
	}

	/**
	 * @param stuID the stuID to set
	 */
	public void setStuID(String stuID) {
		this.StudentID = stuID;
	}

}
