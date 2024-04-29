package br.com.alura.sreenmatch.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
