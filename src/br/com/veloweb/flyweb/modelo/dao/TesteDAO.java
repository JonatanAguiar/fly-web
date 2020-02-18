package br.com.veloweb.flyweb.modelo.dao;



import br.com.veloweb.flyweb.modelo.Aviao;
import br.com.veloweb.flyweb.modelo.Cidade;
import br.com.veloweb.flyweb.modelo.Pais;
import br.com.veloweb.flyweb.modelo.Rota;
import br.com.veloweb.flyweb.modelo.Voo;

 

public class TesteDAO {

 

    public static void main(String[] args) {

 

        AviaoDAO aviao = new AviaoDAO();
        Aviao av = new Aviao();
        CidadeDAO cidade = new CidadeDAO();
        Cidade cid = new Cidade();
        PaisDAO pais = new PaisDAO();
        Pais ps = new Pais();
        RotaDAO rota = new RotaDAO();
        Rota rot = new Rota();
        VooDAO voo = new VooDAO();
        Voo vo = new Voo();
        
        ps.setNome("Rússia");
        System.out.println("test4");
        pais.save(ps);
        System.out.println("test3");
        System.out.println(ps.toString());
        

 

    }

 

}