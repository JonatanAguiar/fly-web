package br.com.veloweb.flyweb.acao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.veloweb.flyweb.modelo.Aviao;
import br.com.veloweb.flyweb.modelo.Banco;
import br.com.veloweb.flyweb.modelo.Cidade;
import br.com.veloweb.flyweb.modelo.Rota;
import br.com.veloweb.flyweb.modelo.Voo;

public class VooCadastra implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		Voo voo = new Voo();
		Aviao aviao = new Aviao();
		Rota rota = new Rota();
		Banco banco = new Banco();

		aviao = banco.getAviaoId(Integer.parseInt(request.getParameter("aviao")));
		voo.setAviao(aviao);

		List<Cidade> escala = new ArrayList<Cidade>();
		List<Integer> idEscala = new ArrayList<Integer>(3);

		if (request.getParameter("escala1") != null) {
			idEscala.add(Integer.parseInt(request.getParameter("escala1")));
			idEscala.add(Integer.parseInt(request.getParameter("escala2")));
			idEscala.add(Integer.parseInt(request.getParameter("escala3")));
			idEscala.forEach(i -> {
				if (i != 0) {
					Cidade cidade = new Cidade();
					cidade = banco.getCidadeId(i);
					escala.add(cidade);
				}
			});
		}

		voo.setEscalas(escala);

		String data = request.getParameter("data");
		String hora = request.getParameter("hora");
		String dataEHora = data + " " + hora;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime horario = LocalDateTime.parse(dataEHora, formatter);

		voo.setDataEHora(horario);
		rota = banco.getRotaId(Integer.parseInt(request.getParameter("idDaRota")));
		voo.setRota(rota);

		banco.adicionaVoo(voo);

		return "redirect:VoosLista";
	}

}
