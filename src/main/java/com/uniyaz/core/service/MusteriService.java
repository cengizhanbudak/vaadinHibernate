package com.uniyaz.core.service;

import com.uniyaz.core.dao.MusteriDao;
import com.uniyaz.core.domain.Musteri;
import com.uniyaz.core.domain.Urun;

import java.util.List;

public class MusteriService {
    MusteriDao musteriDao=new MusteriDao();

    public void saveMusteri(Musteri musteri) {

        musteriDao.saveMusteri(musteri);
    }

    public List<Musteri> findAllHql() {
        return musteriDao.findAllHql();
    }



    public void deleteMusteri(Musteri musteri) {

    musteriDao.deleteMusteri(musteri);
    }
}
