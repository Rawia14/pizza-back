package fr.idformation.pizzaback.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.pizzaback.domain.Line;
import fr.idformation.pizzaback.repository.ILineRepository;
import fr.idformation.pizzaback.service.ILineService;

@Service
public class LineService implements ILineService {

	/** repository for the order lines. */
	private final ILineRepository lineRepo;

	@Autowired
	public LineService(ILineRepository lineRepo) {
		this.lineRepo = lineRepo;
	}

	@Override
	public List<Line> getAll() {
		return lineRepo.findAll();
	}

	@Override
	public Line getOne(Short id) {
		Optional<Line> optionalLine = lineRepo.findById(id);
		return optionalLine.orElse(null);
	}
}
