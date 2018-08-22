package gob.mef.hcardenas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UsuarioResource {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/rest/usuario/client")
	public String usuario(@RequestParam(value="id", defaultValue="1") String id) {
		String url ="http://hcardenas-server/rest/usuario/server?id=" + id;
		//String url ="http://localhost:8071/rest/hola/server";
		return restTemplate.getForObject(url,String.class);
	}
}
