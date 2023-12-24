package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Identificationimmeuble;
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
public class IdentificationimmeubleTest {
    @Autowired
    IdentificationimmeubleRepository identificationimmeubleRepository;
    @Autowired
    IdentificationimmeubleController identificationimmeubleController;
    @Test
    public void RetreiveAllIdimm(){
        List<Identificationimmeuble> identificationimmeubles = identificationimmeubleController.getAllIdentificationimmeuble();
        assertNotNull(identificationimmeubles);
    }

    @Test
    public void addIdimm(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
      //  Identificationimmeuble identificationimmeuble=new Identificationimmeuble ("Wajdi",dateTime,"Refimm","Adresse","Charge","Etat","Commentaire",null,null);
        //identificationimmeubleController.addIdentificationimmeuble(identificationimmeuble);
    }
    @Test
    public void updateIdimm(){
        Identificationimmeuble identificationimmeuble=identificationimmeubleRepository.findById(22L).get();
        identificationimmeuble.setDemandeur("HELLO");
        Identificationimmeuble Idimmupdated= identificationimmeubleRepository.save(identificationimmeuble);
    }
    @Test
    public void DeleteIdimm() {
        identificationimmeubleController.removeIdentificationimmeuble(23L);

    }
}
