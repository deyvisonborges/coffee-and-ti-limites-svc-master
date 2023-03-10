package br.com.coffeeandit.service;


import br.com.coffeeandit.entity.LimiteDiario;
import br.com.coffeeandit.repository.LimiteDiarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LimiteDiarioService {

    LimiteDiarioRepository limiteDiarioRepository;

    public LimiteDiarioService(LimiteDiarioRepository limiteDiarioRepository) {
        this.limiteDiarioRepository = limiteDiarioRepository;
    }

    public Optional<LimiteDiario> findById(Long id) {
        return limiteDiarioRepository.findById(id);
    }


}
