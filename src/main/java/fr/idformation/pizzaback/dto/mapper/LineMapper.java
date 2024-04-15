package fr.idformation.pizzaback.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.pizzaback.domain.Line;
import fr.idformation.pizzaback.dto.LineDTO;

public class LineMapper {
	public static List<LineDTO> linesToDtos(final List<Line> Lines) {
		List<LineDTO> dtos = null;

		if (Lines != null) {
			dtos = new ArrayList<>();
			for (Line line : Lines) {
				dtos.add(lineToDto(line));
			}
		}

		return dtos;
	}

	public static LineDTO lineToDto(final Line Line) {

		LineDTO dto = null;

		if (Line != null) {
			dto = new LineDTO();

			dto.setId(Line.getId());
			dto.setOrd_id(Line.getOrd_id());
			dto.setPiz_id(Line.getPiz_id());
			dto.setQuantity(Line.getQuantity());

		}

		return dto;
	}

	public static List<LineDTO> linesToDtos1(List<Line> all) {
		// TODO Auto-generated method stub
		return null;
	}

}
