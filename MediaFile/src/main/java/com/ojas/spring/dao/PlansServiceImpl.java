package com.ojas.spring.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.spring.entity.Plans;
import com.ojas.spring.entity.PlansHistory;
import com.ojas.spring.repositry.HistoryRepo;
import com.ojas.spring.repositry.PlansRepositry;

@Service
public class PlansServiceImpl implements PlansServiceDao {
	@Autowired
	private PlansRepositry repo;
	@Autowired
	private HistoryRepo repo1;

	@Override
	public Plans create(Plans plans) {

//		PlansHistory history = new PlansHistory();
//		LocalDateTime nowDateTime = LocalDateTime.now();
//		plans.setPublisheddate(nowDateTime);
//		history.setPublisheddate(nowDateTime);
//		
//		Plans save = repo.save(plans);
//		BeanUtils.copyProperties(save, history);
//		repo.save(plans);
		plans.setPublisheddate(LocalDateTime.now());

		Plans pl = repo.save(plans);

		PlansHistory plansHistory = new PlansHistory();
		plansHistory.setId(pl.getId());
		plansHistory.setPlanName(pl.getPlanName());
		plansHistory.setPrice(pl.getPrice());
		plansHistory.setStorage(pl.getStorage());
		plansHistory.setDiscription(pl.getDiscription());
		plansHistory.setPublisheddate(LocalDateTime.now());

		repo1.save(plansHistory);

		return pl;
	}

	@Override
	public List<Plans> viewAll() {

		return repo.findAll();
	}

	@Override
	public Optional<Plans> getById(int id) {

		return repo.findById(id);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);

	}

	@Override
	public Plans update(Plans plans) {
		plans.setPublisheddate(LocalDateTime.now());

		Plans pl = repo.save(plans);

		PlansHistory plansHistory = new PlansHistory();
		plansHistory.setId(pl.getId());
		plansHistory.setPlanName(pl.getPlanName());
		plansHistory.setPrice(pl.getPrice());
		plansHistory.setStorage(pl.getStorage());
		plansHistory.setDiscription(pl.getDiscription());
		plansHistory.setPublisheddate(LocalDateTime.now());

		repo1.save(plansHistory);

		return pl;
	}

}
