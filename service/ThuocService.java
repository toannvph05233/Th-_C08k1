package service;

import com.vn.models.Thuoc;
import com.vn.repositorys.impl.IThuocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThuocService {
    @Autowired
    IThuocRepo iThuocRepo;


    public List<Thuoc> findAll() {
        return ((List<Thuoc>) iThuocRepo.findAll());
    }


    public Thuoc findById(int maSo) {
        return iThuocRepo.findByMaSo(maSo);
    }


    public void save(Thuoc object) {
        iThuocRepo.save(object);
    }


    public void remove(Thuoc object) {
        iThuocRepo.delete(object);
    }
}


