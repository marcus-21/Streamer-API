package br.com.marcus21.streamer;

import br.com.marcus21.streamer.models.DadosSerie;
import br.com.marcus21.streamer.services.ConsumoAPI;
import br.com.marcus21.streamer.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StreamerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json,DadosSerie.class);
		System.out.println(dados);

	}
}
