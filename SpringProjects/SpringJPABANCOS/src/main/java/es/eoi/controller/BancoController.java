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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping(params={"nombre","ciudad"})
	public Banco crearBanco(@RequestParam (value="nombre") String nombre, @RequestParam (value="ciudad")String ciudad) {
			
			Banco banco=new Banco(nombre,ciudad);
			return bncserv.InsertarBanco(banco);
	}

	@DeleteMapping(value = "/{nombre}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public boolean removeBanco(@PathVariable(value = "nombre") String nombre) {

		return bncserv.removeBanco(nombre);

	}
	@GetMapping
	public List<BancoDto> mostrarBancos() {
		Type listType = new TypeToken<List<BancoDto>>() {}.getType();
		List<BancoDto> listbancdto = modelmapper.map(bncserv.MostrarBancos(), listType);
		return listbancdto;
	}

	@PutMapping(value = "/{oldnombre}", params= {"newname","ciudad"})
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public boolean updateBanco(@PathVariable(value = "oldnombre") String oldnombre, 
			@RequestParam(value = "newname") String newname,@RequestParam(value = "ciudad") String ciudad) {

		return bncserv.updateBanco(oldnombre, newname, ciudad);

	}
	@RequestMapping(value="/{nombre}",method = RequestMethod.GET)
	public BancoDto selectBanco(@PathVariable (value = "nombre") String nombre) {
		System.out.println("Entra en el select");
		BancoDto bancdto=modelmapper.map(bncserv.buscarBanco(nombre), BancoDto.class);
		//BeanUtils.copyProperties(bancdto,bncserv.buscarBanco(nombre)); OTRA FORMA DE PASAR EL DTO
		return bancdto;

	}
}
