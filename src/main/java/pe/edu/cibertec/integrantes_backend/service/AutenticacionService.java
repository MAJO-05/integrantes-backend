package pe.edu.cibertec.integrantes_backend.service;

import pe.edu.cibertec.integrantes_backend.dto.IntegrantesResponseDTO;
import pe.edu.cibertec.integrantes_backend.dto.LoginResquestDTO;

import java.io.IOException;
import java.util.List;

public interface AutenticacionService {

    String[] validarAlumno(LoginResquestDTO loginResquestDTO) throws IOException;
    List<IntegrantesResponseDTO> listarIntegrantes() throws IOException;
}
