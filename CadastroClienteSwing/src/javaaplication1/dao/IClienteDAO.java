package javaapplication1.dao;

import javaapplication1.domain.Cliente;

public interface IClienteDAO {
    Boolean cadastrar(Cliente var1);

    void excluir(Long var1);

    void alterar(Cliente var1);

    Cliente consultar(Long var1);

    Collection<Cliente> buscarTodos();
}
