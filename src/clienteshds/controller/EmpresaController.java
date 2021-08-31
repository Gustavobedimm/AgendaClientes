package clienteshds.controller;

import clienteshds.DAO.EmpresaDAO;
import clienteshds.modelo.Empresa;


public class EmpresaController {

    public boolean valida(Empresa empresa) {
        if(empresa.getCnpj().equals("  .   .   /    -  ")){
            return false;
        }
        return true;
    }
    public void adiciona(Empresa empresa) throws ClassNotFoundException{
        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.AdicionarEmpresa(empresa);
    }
    public void altera(Empresa empresa){
        
    }
    public void exclui(Empresa empresa){
        
    }
    public void consulta(Empresa empresa){
        
    }
}
