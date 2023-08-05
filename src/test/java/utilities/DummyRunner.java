package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojos.MyPojo;

public class DummyRunner
{
	public static void main(String[] args) throws Exception
	{
		//Check "PropertiesFileUtility" class
		String x=PropertiesFileUtility.getValueInPropertiesFile("qauri");
		System.out.println(x);
		//check "TextFilesUtility" class
		String[] y=TextFilesUtility.getValuesOfLine("src\\test\\resources\\sources\\testdata.txt",3);
		for(String z:y)
		{
			System.out.println(z);
		}
		//Check "ExcelFilesUtility" class
		ExcelFilesUtility obj=new ExcelFilesUtility("src\\test\\resources\\sources\\testdata.xlsx");
		obj.openSheet("Sheet1");
		for(int i=0;i<obj.getRowsCount();i++)
		{
			for(int j=0;j<obj.getColumnscount();j++)
			{
				String z=obj.getCellValue(i,j);
				System.out.print(z+" ");
			}
			System.out.println();
		}
		obj.setCellValue(3, 3, "5"); //refresh your project to see updated values in excel file
		obj.saveAndCloseExcel();
		//Check "POJO" class for Serialization 
		MyPojo p=new MyPojo();
		p.setUserId(10);
		p.setTitle("hi");
		p.setBody("how are you?");
		ObjectMapper om=new ObjectMapper();
		System.out.println(om.writeValueAsString(p));
		//Check "POJO" class for De-serialization 
		String jsonpayload=
			"{\"id\":0,\"userId\":10,\"title\":\"hi\",\"body\":\"how are you?\"}";
		MyPojo m=om.readValue(jsonpayload, MyPojo.class);
		System.out.println(m.getUserId());
		System.out.println(m.getId());
		System.out.println(m.getBody());
		System.out.println(m.getTitle());
	}
}
