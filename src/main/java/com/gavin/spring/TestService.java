package com.gavin.spring;

import com.gavin.spring.jpa.entity.TblTest;
import com.gavin.spring.jpa.entity.TblTestIdentity;
import com.gavin.spring.jpa.repository.TestTableRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestService implements InitializingBean {

    @Autowired
    private TestTableRepository testTableRepository;


    @Override
    public void afterPropertiesSet() throws Exception {
        Optional<TblTest> test = testTableRepository.findById(new TblTest(3,2,2));
        System.out.println(test);
    }
}
