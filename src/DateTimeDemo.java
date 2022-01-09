import java.sql.Timestamp;
import java.util.Date;

public class DateTimeDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date simpleDate = new Date();
		System.out.println("Date is "+ simpleDate);//using java util
		System.out.println("Using sql "+ new Timestamp(simpleDate.getTime()));
	}

}
