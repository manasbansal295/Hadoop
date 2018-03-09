

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class ReplaceNum1 extends UDF {
private Text result = new Text();

public Text evaluate(String str, String str1, String str2) {

String rep = str.replace(str1, str2);
result.set(rep);
return result;

}

}