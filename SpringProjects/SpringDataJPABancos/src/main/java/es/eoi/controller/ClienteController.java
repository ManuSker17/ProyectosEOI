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

import es.eoi.dto.ClienteDto;
import es.eoi.entity.Cliente;
import es.eoi.service.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clientserv;
	@Autowired
	private ModelMapper modelmapper;

	@PostMapping
	public ClienteDto crearCliente(@RequestBody ClienteDto dto) {
		Cliente cliente = modelmapper.map(dto, Cliente.class);
		return modelmapper.map(clientserv.InsertarCliente(cliente), ClienteDto.class);
	}

	@DeleteMapping(value = "/{dni}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeCliente(@PathVariable(value = "dni") String dni) {

		clientserv.removeCliente(dni);

	}

	@GetMapping
	public List<ClienteDto> mostrarCliente() {
		Type listType = new TypeToken<List<ClienteDto>>() {
		}.getType();
		List<ClienteDto> listbancdto = modelmapper.map(clientserv.MostrarCliente(), listType);
		return listbancdto;
	}

	@PutMapping(value = "/update")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public ClienteDto updateCliente(@RequestBody ClienteDto clientdto) {
		Cliente cliente = modelmapper.map(clientdto, Cliente.class);
		return modelmapper.map(clientserv.updateCliente(cliente), ClienteDto.class);

	}

	@RequestMapping(value = "/{dni}", method = RequestMethod.GET)
	public ClienteDto selectCliente(@PathVariable(value = "dni") String dni) {
		ClienteDto clientdto = modelmapper.map(clientserv.buscarCliente(dni).get(), ClienteDto.class);
		// BeanUtils.copyProperties(bancdto,bncserv.buscarBanco(nombre)); OTRA FORMA DE
		// PASAR EL DTO
		return clientdto;

	}
}
