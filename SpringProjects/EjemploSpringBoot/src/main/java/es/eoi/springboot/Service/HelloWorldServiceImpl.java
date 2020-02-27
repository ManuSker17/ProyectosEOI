package es.eoi.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.springboot.repository.HelloWorldRepository;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	private HelloWorldRepository hrepo;
	@Override
	public String helloWorld() {

		return hrepo.helloWorld();
	}

}
