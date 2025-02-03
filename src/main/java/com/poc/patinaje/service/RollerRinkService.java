package com.poc.patinaje.service;

import com.poc.patinaje.model.RollerRink;
import com.poc.patinaje.repository.RollerRinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RollerRinkService {

    private final RollerRinkRepository rollerRinkRepository;

    public RollerRinkService(RollerRinkRepository rollerRinkRepository) {
        this.rollerRinkRepository = rollerRinkRepository;
    }

    // Obtener todas las pistas de patinaje
    public List<RollerRink> findAll() {
        return rollerRinkRepository.findAll();
    }

    // Obtener una pista de patinaje por su ID
    public Optional<RollerRink> findById(Long id) {
        return rollerRinkRepository.findById(id);
    }

    // Guardar o actualizar una pista de patinaje
    public RollerRink save(RollerRink rollerRink) {
        return rollerRinkRepository.save(rollerRink);
    }

    // Eliminar una pista de patinaje por su ID
    public void deleteById(Long id) {
        rollerRinkRepository.deleteById(id);
    }
}
