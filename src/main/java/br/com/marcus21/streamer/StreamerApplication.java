package br.com.marcus21.streamer;

import br.com.marcus21.streamer.models.DadosEpisodio;
import br.com.marcus21.streamer.models.DadosSerie;
import br.com.marcus21.streamer.models.DadosTemporada;
import br.com.marcus21.streamer.principal.Principal;
import br.com.marcus21.streamer.services.ConsumoAPI;
import br.com.marcus21.streamer.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StreamerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StreamerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibirMenu();

	}
}
