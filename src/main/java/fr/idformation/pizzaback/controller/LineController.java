package fr.idformation.pizzaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.pizzaback.dto.LineDTO;
import fr.idformation.pizzaback.dto.mapper.LineMapper;
import fr.idformation.pizzaback.service.ILineService;

@RestController
@RequestMapping("/line")
public class LineController {
	/** service for lines. */
	@Autowired
	private ILineService lineService;

	/**
	 * @return all types
	 */
	@GetMapping("/")
	public List<LineDTO> getAll() {
		return LineMapper.linesToDtos(lineService.getAll());
	}

}
