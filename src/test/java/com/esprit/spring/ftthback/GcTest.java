package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Gc;
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
public class GcTest {
    @Autowired
    GcController gcController;
    @Autowired
    GcRepository gcRepository;
    @Test
    public void RetreiveAllGc(){
        List<Gc> gcs = gcController.getAllgc();
        assertNotNull(gcs);
    }
    @Test
    public void addGc(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
       // Gc gc=new Gc ("Wajdi","adressegc",5,5,"Action","charge",dateTime,"etat","Commentaire",null);
        //gcController.addgc(gc);
    }
   @Test
    public void updateGc(){
        Gc gcs=gcRepository.findById(20L).get();
        gcs.setDemandeur("HELLO");
        Gc gcupdated= gcRepository.save(gcs);
    }
    @Test
    public void DeleteGc() {
        gcController.removegc(21L);

    }
}
