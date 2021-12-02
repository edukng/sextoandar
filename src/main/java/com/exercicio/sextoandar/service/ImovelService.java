package com.exercicio.sextoandar.service;

import com.exercicio.sextoandar.entity.Imovel;
import com.exercicio.sextoandar.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImovelService {

    @Autowired
    ImovelRepository imovel;


    public List<Imovel> retornaImoveis(){
        return imovel.findAll();
    }

    public Imovel cadastraImovel(Imovel imovelParam){
        return imovel.save(imovelParam);
    }
}
