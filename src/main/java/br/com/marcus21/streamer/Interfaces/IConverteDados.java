package br.com.marcus21.streamer.Interfaces;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe );
}
