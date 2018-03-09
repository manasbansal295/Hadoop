package dateudf1;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class DateUDF extends UDF{


	private Text result = new Text();
	public Text evaluate(Text str) {
		if(str == null) {
			return null;
		}
		result.set("String type Date is "+str.toString());
		return result;
	}
	public Text evaluate(java.sql.Date dateobj) {
		if(dateobj == null) {
			return null;
		}
	//	result.set(StringUtils.strip(str.toString()));
		result.set("Date Obj Val is "+dateobj.toString());
		return result;
	}
}
