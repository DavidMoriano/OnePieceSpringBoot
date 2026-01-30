package com.daw.onepiece.servicio.interfaces;

import java.util.ArrayList;
import java.util.Date;

import com.daw.onepiece.dtos.PirataDTO;

public interface IPirataService {
	ArrayList<PirataDTO> listarTodosPiratasService();

	ArrayList<PirataDTO> listarPiratasFiltros(Integer id, String nombrePirata, String frutaDiablo, int activoInt);

	int insertarPirata(String nombrePirata, String frutaDiablo, Date fechaFiltro, int idIsla, int activoInt);

	int actualizarPirata(Integer id, String nombrePirata, String frutaDiablo, String idIsla, Date fechaFiltro, int activo);
}
