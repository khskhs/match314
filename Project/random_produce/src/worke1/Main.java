package worke1;

import java.io.File;
import java.io.FileWriter;
import com.google.gson.Gson;
public class Main {
	public static void main(String[] args) throws Exception {
		
		File output =new File(System.getProperty("user.dir")+"\\input_data.txt");
		if(!output.exists())
			output.createNewFile();
		FileWriter writer =new FileWriter(output);
		Produce p=new Produce(150,10);
		Gson g=new Gson();
		Input i =p.produce();
		String s=g.toJson(i);
		s=JsonFormatTool.formatJson(s);
		writer.write(s);
		writer.flush();
		writer.close();
	}

}
