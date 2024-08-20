package poo2.estoque.service;

import java.util.List;

public abstract class BaseServico<TRepositorio, TDominio> {
    protected TRepositorio repo;
    public abstract List<TDominio> Browse();
    public abstract TDominio Read(Long codigo);
    public abstract TDominio Edit(TDominio obj);
    public abstract TDominio Add(TDominio obj);
    public abstract TDominio Delete(Long codigo);
}
