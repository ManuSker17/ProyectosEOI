package es.eoi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.repository.HelloWorldRepository;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	private HelloWorldRepository repository;

	@Override
	public String saluda() {
		return repository.saluda();
	}	

}
