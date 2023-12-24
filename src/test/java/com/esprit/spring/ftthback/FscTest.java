package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Fsc;
import com.esprit.spring.ftthback.models.Region;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class FscTest {
    @Autowired
    FscRepository fscRepository;
    @Autowired
    FscController fscController;
    @Test
     public void RetreiveAllCreationidm(){
        List<Fsc> fscs = fscController.getAllFsc();
        assertNotNull(fscs);
    }
   @Test
    public void addFsc(){

       Date dateTime = new Date( "08/07/2019" );
       Region region= new Region( "paris");
        //Fsc fsc=new Fsc ("WAJDI","REF","TACHE","RAMI","COMMENTAIRE", dateTime );
       //fscController.addFsc(fsc);
   }
   @Test
   public void updateFsc(){
        Fsc fsc=fscRepository.findById(8L).get();
        fsc.setDemandeur("HELLO");
        Fsc fscupdated= fscRepository.save(fsc);
   }
   @Test
    public void DeleteFsc() {
       fscController.removefsc(16L);

   }
}
