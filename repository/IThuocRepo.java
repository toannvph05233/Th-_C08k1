package repository;

import com.vn.models.Thuoc;
import org.springframework.data.repository.CrudRepository;

public interface IThuocRepo extends CrudRepository<Thuoc, Integer> {
    public Thuoc findByMaSo(int maSo);

}
