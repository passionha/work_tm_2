package kr.byweb.tm.user.anlysStd.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.byweb.tm.user.anlysStd.dao.AnlysStdDao;
import kr.byweb.tm.user.anlysStd.model.AnlysStd;
import kr.byweb.tm.user.anlysStd.svc.AnlysStdService;

@Service
public class AnlysStdServiceImpl implements AnlysStdService{
	
	@Autowired
	private AnlysStdDao anlysStdDao;
	
	@Override
	public AnlysStd getAnlysStdList() {
		AnlysStd anlysStd = anlysStdDao.getAnlysStdList();
		return anlysStd;
	}

}
