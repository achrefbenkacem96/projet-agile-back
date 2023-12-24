package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Racco;
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
public class RaccoTest {
    @Autowired
    RaccoController raccoController;
    @Autowired
    RaccoRepository raccoRepository;
    @Test
    public void RetreiveAllRacco(){
        List<Racco> raccos = raccoController.getAllRacco();
        assertNotNull(raccos);
    }


    @Test
    public void addRacco(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
        //Racco racco=new Racco ("Wajdi","REFPAV","IDRA",5,"IDMEUBLE",5,"Action","Pbo",5,"Commentaire","Charge","majnetworks", "Majsadirah","anciempm","nouveaupm",dateTime,null,null);
        //raccoController.addRacco(racco);
    }
    @Test
    public void updateRacco(){
        Racco racco=raccoRepository.findById(28L).get();
        racco.setDemandeur("HELLO");
        Racco Raccoupdated= raccoRepository.save(racco);
    }
    @Test
    public void DeleteRacco() {
        raccoController.removeRacco(29L);

    }

}
