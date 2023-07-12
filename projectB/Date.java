package projectB;

public class Date {

	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {

		if (Date.dateOK(month, day, year)) {

			this.month = month;
			this.day = day;
			this.year = year;

		} else {

			this.month = 1;
			this.day = 1;
			this.year = 1900;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static boolean dateOK(int month, int day, int year) {
		if (month >= 1 && month <= 12 && day >= 1 && day <= 31 && year >= 1000 && year <= 9999)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return month + "-" + day + "-" + year;
	}

}
