package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Modelisationpbo;
import com.esprit.spring.ftthback.models.Region;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ModelisationpboTest {
    @Autowired
    ModelisationpboRepository modelisationpboRepository;
    @Autowired
    ModelisationpboController modelisationpboController;
    @Test
    public void RetreiveAllModelpbo(){
        List<Modelisationpbo> modelisationpbos = modelisationpboController.getAllModelisationpbo();
        assertNotNull(modelisationpbos);
    }


    @Test
    public void addModelisationpbo(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
        //Modelisationpbo modelisationpbo=new Modelisationpbo ("Wajdi",dateTime,"COMMUNE","PM","PBO",5,"Tache","Etat","Audit","CHARGE","Commentaire","emprise",null,null);
        //modelisationpboController.addModelisationpbo(modelisationpbo);
    }
    @Test
    public void updateModelisationpbo(){
        Modelisationpbo modelisationpbo=modelisationpboRepository.findById(26L).get();
        modelisationpbo.setDemandeur("HELLO");
        Modelisationpbo modelisationpboupdated= modelisationpboRepository.save(modelisationpbo);
    }
    @Test
    public void DeleteModelisationpbo() {
        modelisationpboController.removeModelisationpbo(27L);

    }
}
