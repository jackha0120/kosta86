package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExamToday {
	private SimpleDateFormat format;
	private Date date;

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String printToDate() {
		return format.format(date);

	}
}
