package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Creationidm;
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
public class CreationidmTest {
    @Autowired
    CreationidmRepository creationidmRepository;
    @Autowired
    CreationidmController creationidmController;
    @Test
    public void RetreiveAllCreationidm(){
        List<Creationidm> creationidms = creationidmController.getAllCreationidm();
        assertNotNull(creationidms);
    }
    @Test
    public void addCreationidm(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
        //Creationidm creationidm=new Creationidm ("Wajdi",dateTime,"ADRESSE","IDRA","IDM",5,"VILLE", 1152,10,"CHARGE","COMMENTAIRE",null,null);
        //creationidmController.addCreationidm(creationidm);
    }
    @Test
    public void updateFsc(){
        Creationidm creationidm=creationidmRepository.findById(45L).get();
        creationidm.setDemandeur("HELLO");
        Creationidm creationidmupdated= creationidmRepository.save(creationidm);
    }
    @Test
    public void DeleteCreationidm() {
        creationidmController.removeCreationidm(49L);

    }
}
