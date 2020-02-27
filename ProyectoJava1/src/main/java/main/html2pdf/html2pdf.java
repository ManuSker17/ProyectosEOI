package main.html2pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import com.itextpdf.html2pdf.HtmlConverter;

import config.CrudConfig;

public class html2pdf {

	public static void base64html2pdf(String cod) {

		
		byte[] decoded = Base64.getDecoder().decode(cod);
		String htmlstring = new String(decoded);
		
		
        File pdfDest = new File("output.pdf");
        
        try {
        //ConverterProperties converterProperties = new ConverterProperties();
        HtmlConverter.convertToPdf(htmlstring,new FileOutputStream(pdfDest));
        }catch(Exception s) {
        	s.printStackTrace();
        }
	}
}
