package main;

import static com.pruebas.bd.Conexion.openConnection;

import java.util.HashMap;
import java.util.Map;

import config.CrudConfig;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrudConfig config = new CrudConfig();
		String pathReport = "C:\\Users\\formacion\\report4.jrxml";

		
		try {
			Map parameters = new HashMap();
			JasperReport jr = JasperCompileManager.compileReport(config.getPropiedad("JasperReport"));
			JasperPrint jp = JasperFillManager.fillReport(jr,parameters,openConnection()); 
			// Exporta el informe a PDF
			JasperExportManager.exportReportToPdfFile(jp, "C:\\Users\\formacion");
			// Para visualizar el pdf directamente desde java
			JasperViewer.viewReport(jp, false);

		}catch(Exception s) {
			s.printStackTrace();
		}
	}

}
