package com.daw.onepiece.dao.interfaces;

import java.util.ArrayList;
import java.util.Date;

import com.daw.onepiece.dtos.PirataDTO;

public interface IPirataDAO {
	public ArrayList<PirataDTO> listarTodosLosPiratas();

	public ArrayList<PirataDTO> listarPiratasConFiltros(Integer id, String nombrePirata, String frutaDiablo,
			int activoInt);

	public int insertarPirata(String nombrePirata, String frutaDiablo, Date fecha, int idIsla, int activoInt);
}
