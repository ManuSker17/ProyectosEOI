package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;

import config.CrudConfig;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrudConfig config = new CrudConfig();
		

		String base64 =config.getPropiedad("numero1");

		byte[] decoded = Base64.getDecoder().decode(base64);
		String htmlstring = new String(decoded);
		
		
        File pdfDest = new File("output.pdf");
         // pdfHTML specific code
        
        
//        ConverterProperties converterProperties = new ConverterProperties();
//        HtmlConverter.convertToPdf(new FileInputStream(htmlSource), 
//       new FileOutputStream(pdfDest), converterProperties);
        
        //HtmlConverter.convertToPdf(new FileInputStream(htmlSource), new FileOutputStream(pdfDest), converterProperties);
        
        try {
        ConverterProperties converterProperties = new ConverterProperties();
        HtmlConverter.convertToPdf(htmlstring,new FileOutputStream(pdfDest));
        }catch(Exception s) {
        	s.printStackTrace();
        }
        //HtmlConverter.convertToPdf(htmlstring,new FileOutputStream(pdfDest),converterProperties);

	}

}
