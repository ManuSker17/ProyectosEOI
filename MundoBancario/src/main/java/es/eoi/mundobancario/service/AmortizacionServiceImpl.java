package es.eoi.mundobancario.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.mundobancario.entity.Amortizacion;
import es.eoi.mundobancario.entity.Prestamo;
import es.eoi.mundobancario.repository.AmortizacionRepository;

@Service
public class AmortizacionServiceImpl implements AmortizacionService {

	@Autowired
	AmortizacionRepository amortrepo;

	@Override
	public List<Amortizacion> MostrarAmortizacion() {
		return amortrepo.findAll();
	}

	@Override
	public void CrearAmortizaciones(List<Amortizacion> listAmortizaciones) {
		for (Amortizacion amortizacion2 : listAmortizaciones) {
			amortrepo.save(amortizacion2);

		}
	}

	@Override
	public Amortizacion CrearAmortizacion(Amortizacion amortizacion) {
		return amortrepo.save(amortizacion);
	}

	@Override
	public Optional<Amortizacion> buscarAmortizacion(int id) {

		return amortrepo.findById(id);

	}

	@Override
	public Amortizacion updateAmortizacion(Amortizacion amortizacion) {
		return amortrepo.save(amortizacion);
	}

	@Override
	public void removeAmortizacion(int id) {
		amortrepo.deleteById(id);
	}

	@Override
	public List<Amortizacion> BuscarAmortizacionesByPrestamo(Prestamo prestamo) {
		return amortrepo.findAllByPrestamo(prestamo);
	}

	@Override
	public List<Amortizacion> calcularAmortizacion(Prestamo prestamo) {

		float importeAmortizacion = prestamo.getImporte() / prestamo.getPlazos();

		List<Amortizacion> listaAmortizaciones = new ArrayList<Amortizacion>();
		for (int i = 0; i < prestamo.getPlazos(); i++) {
			Amortizacion amortizacion = new Amortizacion();

			Calendar cal = Calendar.getInstance();
			cal.setTime(prestamo.getFecha());
			cal.add(Calendar.MONTH, 1 + i);
			Date fechaAmortizacion = cal.getTime();

			amortizacion.setFecha(fechaAmortizacion);
			amortizacion.setImporte(importeAmortizacion);
			amortizacion.setPrestamo(prestamo);
			listaAmortizaciones.add(amortizacion);
		}

		return listaAmortizaciones;

	}

}