package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {
//	private SimpleDateFormat f;
//	private Date d;

	public static void main(String[] args) {
		Today today = new Today();
		 SimpleDateFormat f = new SimpleDateFormat("yy-MM-dd");
		 Date d = new Date();
		

		System.out.println(f.format(d));
	}

}
