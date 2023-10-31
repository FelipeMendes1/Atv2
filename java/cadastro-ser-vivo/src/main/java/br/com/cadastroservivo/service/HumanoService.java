package br.com.cadastroservivo.service;

import br.com.cadastroservivo.model.Humano;

import java.util.List;

public interface HumanoService {
    void createHumano(List<Humano> humanos);
    void getHumanos(List<Humano> humanos);
    void removeHumano(List<Humano> humanos);
}
