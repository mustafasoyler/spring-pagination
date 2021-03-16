package com.mustafa.api;

import com.mustafa.model.Cars;
import com.mustafa.repo.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarsApi {

    @Autowired
    private CarsRepository carsRepository;

    @GetMapping
    public Page<Cars> pagination(@RequestParam Integer pageSize,@RequestParam Integer page){

        Pageable pageable= PageRequest.of(page,pageSize);
        return carsRepository.findAll(pageable);
    }
}
