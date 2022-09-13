package br.edu.ifms.detran.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.detran.model.Carro;
import br.edu.ifms.detran.model.Infracao;
import br.edu.ifms.detran.model.Multa;
import br.edu.ifms.detran.repository.CarroRepository;
import br.edu.ifms.detran.repository.InfracaoRepository;
import br.edu.ifms.detran.repository.MultaRepository;

@Service
public class DBService {

	@Autowired
	private CarroRepository carro;
	
	@Autowired
	private InfracaoRepository infracao;
	
	@Autowired
	private MultaRepository multa;

	//criando objeto carro,
	public void instantiateTestDatabase() throws ParseException {
		
		Carro car1 = new Carro(null, "Fusca", "Volks", "TGU 8912");
		Carro car2 = new Carro(null, "Civic", "hONDA", "kjh 7593");
		Carro car3 = new Carro(null, "ftios", "Toyota", "JTK 8998");
		Carro car4 = new Carro(null, "Compass", "Jeep", "GRT 8789");
		Carro car5 = new Carro(null, "Sandero", "Renault", "PLS 9012");
		
		
		Infracao i1 = new Infracao(null, "Ultrapassagem em faixa continua", 10, 199.0f);
		Infracao i2 = new Infracao(null, "faixa amarela", 5, 100.0f);
		Infracao i3 = new Infracao(null, "Velocidade acima do paraltido", 7, 199.0f);
		Infracao i4 = new Infracao(null, "Estacionamento proibido", 3, 70.0f);
		Infracao i5 = new Infracao(null, "Faixa de pedreste", 10, 199.0f);
		Infracao i6 = new Infracao(null, "Dirigir com celular", 10, 199.0f);
		Infracao i7 = new Infracao(null, "Gila dupla", 10, 199.0f);
		Infracao i8 = new Infracao(null, "Sinal Vermelho", 10, 199.0f);
		Infracao i9 = new Infracao(null, "Dirigir alcolizado", 10, 199.0f);
		
		//dando o valor e a ifrancao
		Multa m1 = new Multa(null, "Corumba", 2022, car2, i5);
		Multa m2 = new Multa(null, "Corumba", 2022, car2, i9);
		Multa m3 = new Multa(null, "Ladario", 2019, car3, i5);
		Multa m4 = new Multa(null, "Campo Grande", 2020, car1, i4);
		Multa m5 = new Multa(null, "Miranda", 2015, car5, i7);
		Multa m6 = new Multa(null, "Corumba", 2020, car4, i9);
		Multa m7 = new Multa(null, "Aquidauana", 2021, car5, i8);
		Multa m8 = new Multa(null, "Coxim", 2017, car3, i2);
		Multa m9 = new Multa(null, "Bonito", 2000, car1, i1);
		Multa m10 = new Multa(null, "Corumba", 2021, car3, i7);
		
		//coletado as multas
		car1.getMultas().addAll(Arrays.asList(m4, m9));
		car2.getMultas().addAll(Arrays.asList(m1, m2));
		car3.getMultas().addAll(Arrays.asList(m3,m8, m10));
		car4.getMultas().addAll(Arrays.asList(m6));
		car5.getMultas().addAll(Arrays.asList(m5, m7));


		
		i1.getMultas().addAll(Arrays.asList(m9));
		i2.getMultas().addAll(Arrays.asList(m8));
		//i3.getMultas().addAll(Arrays.asList(m9));
		i4.getMultas().addAll(Arrays.asList(m4));
		i5.getMultas().addAll(Arrays.asList(m1, m3));
		//i6.getMultas().addAll(Arrays.asList(m1));
		i7.getMultas().addAll(Arrays.asList(m5, m10));
		i8.getMultas().addAll(Arrays.asList(m7));
		i9.getMultas().addAll(Arrays.asList(m2, m6));

		
		//imprimir 
		infracao.saveAll(Arrays.asList(i1,i2,i3,i4,i5,i6,i7,i8,i9));
		carro.saveAll(Arrays.asList(car1,car2,car3,car4,car5));
		
		multa.saveAll(Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10));
		
		
	}
}

