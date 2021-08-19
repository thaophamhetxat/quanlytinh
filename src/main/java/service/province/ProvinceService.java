package service.province;

import moduls.Province;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Optional;

public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceService provinceRepo;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepo.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepo.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepo.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepo.remove(id);
    }
}
