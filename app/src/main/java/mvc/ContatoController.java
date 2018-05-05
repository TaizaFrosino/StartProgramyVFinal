package mvc;

import android.content.Context;

import java.util.List;

/**
 * Created by rafaelcidrao on 05/05/2018.
 */

public class ContatoController {

    public ContatoController(Context context){
        //Integração com o banco de dados

    }

    public boolean create(Contato contato){

        return true;
    }

    public int totalDeContatos(){
        return 0;
    }

    public List<Contato> listarContatos(){

        return null;
    }

    public Contato buscarPeloID(int contatoID){

        return null;
    }

    public boolean update(Contato contato){

        return true;
    }

    public boolean delete(int contatosID){

        return true;
    }

}
