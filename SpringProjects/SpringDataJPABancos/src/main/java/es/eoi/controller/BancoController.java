package es.eoi.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.dto.BancoDto;
import es.eoi.entity.Banco;
import es.eoi.service.BancoService;

@RestController
@RequestMapping(value="/banco")
public class BancoController {

	@Autowired
	private BancoService bncserv;
	@Autowired 
	private ModelMapper modelmapper;

	@PostMapping
	public BancoDto crearBanco(@RequestBody BancoDto dto) {
			Banco banco = modelmapper.map(dto, Banco.class);
			return modelmapper.map(bncserv.InsertarBanco(banco), BancoDto.class);
	}

	@DeleteMapping(value = "/{nombre}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeBanco(@PathVariable(value = "nombre") String nombre) {

		bncserv.removeBancobyName(nombre);

	}
	@GetMapping
	public List<BancoDto> mostrarBancos() {
		Type listType = new TypeToken<List<BancoDto>>() {}.getType();
		List<BancoDto> listbancdto = modelmapper.map(bncserv.MostrarBancos(), listType);
		return listbancdto;
	}

	@PutMapping(value = "/update")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public BancoDto updateBanco(@RequestBody BancoDto bancodto) {
		Banco banco = modelmapper.map(bancodto,Banco.class);
		return modelmapper.map(bncserv.updateBanco(banco), BancoDto.class);

	}
	@RequestMapping(value="/name/{nombre}",method = RequestMethod.GET)
	public BancoDto selectBanco(@PathVariable (value = "nombre") String nombre) {
		System.out.println("Entra en el select");
		BancoDto bancdto=modelmapper.map(bncserv.buscarBancobyName(nombre), BancoDto.class);
		//BeanUtils.copyProperties(bancdto,bncserv.buscarBanco(nombre)); OTRA FORMA DE PASAR EL DTO
		return bancdto;

	}
	@GetMapping(value="/id/{id}")
	public BancoDto selectBancoId(@PathVariable (value = "id") int id) {
		System.out.println("Entra en el select "+ id);
		BancoDto bancdto=modelmapper.map(bncserv.buscarBancobyId(id).get(), BancoDto.class);
		//BeanUtils.copyProperties(bancdto,bncserv.buscarBanco(nombre)); OTRA FORMA DE PASAR EL DTO
		return bancdto;

	}
}
