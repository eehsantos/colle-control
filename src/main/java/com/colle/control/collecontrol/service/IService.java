package com.colle.control.collecontrol.service;

public interface IService<T> {

    void inserir (T domain);

    void alterar (T domain);

    void deletar (T domain);

    T visualizar (T domain);

    Boolean existe (T domain);
}
