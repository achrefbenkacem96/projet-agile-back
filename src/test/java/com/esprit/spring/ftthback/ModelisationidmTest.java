package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Modelisationidm;
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
public class ModelisationidmTest {
    @Autowired
    ModelisationidmRepository modelisationidmRepository;
            @Autowired
    ModelisationidmController modelisationidmController;
    @Test
    public void RetreiveAllModelidm(){
        List<Modelisationidm> modelisationidms = modelisationidmController.getAllmodelisationidm();
        assertNotNull(modelisationidms);
    }

    @Test
    public void addModelisationidm(){
        java.util.Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
        //Modelisationidm modelisationidm=new Modelisationidm ("IDRA","IDM","NLR","Tache","WAJDI",dateTime,"PM","PBO",5,"Audit","CHARGE","Commentaire","Etat","Commune",null,null);
        //modelisationidmController.addModelisationidm(modelisationidm);
    }
    @Test
    public void updateModelisation(){
        Modelisationidm modelisationidm=modelisationidmRepository.findById(24L).get();
        modelisationidm.setDemandeur("HELLO");
        Modelisationidm modelisationidmupdated= modelisationidmRepository.save(modelisationidm);
    }
    @Test
    public void DeleteModelisationidm() {
        modelisationidmController.removeModelisationidm(25L);

    }
}
