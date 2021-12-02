package com.exercicio.sextoandar.controller;

import com.exercicio.sextoandar.entity.Imovel;
import com.exercicio.sextoandar.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    ImovelService imoveis;

    @GetMapping()
    public List<Imovel> imoveis() {
        return imoveis.retornaImoveis();
    }

    @PostMapping("/cadastra")
    public ResponseEntity<Imovel> cadastraImovel(@RequestBody Imovel imovelParam){
        return new ResponseEntity<>(imoveis.cadastraImovel(imovelParam), HttpStatus.CREATED);
    }
}
