package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Creationsadirah;
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
public class CreationSadirahTest {
    @Autowired
    CreationsadirahController creationsadirahController;
    @Autowired
    CreationsadirahRepository creationsadirahRepository;


   @Test
   public void RetreiveAllCreationsadirah(){
       List<Creationsadirah> creationsadirahs = creationsadirahController.getAllCreationsadirah();
       assertNotNull(creationsadirahs);
   }
    @Test
    public void addCreationsadirah(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
       // Creationsadirah creationsadirahs=new Creationsadirah ("Wajdi",dateTime,"Pm","pav","poche","etatsadirah","etat", "COMMENTAIRE",null,null,null);
        //creationsadirahController.addCreationsadirah(creationsadirahs);
    }
    @Test
    public void updateCreationsadirah(){
        Creationsadirah creationsadirah =creationsadirahRepository.findById(51L).get();
        creationsadirah.setDemandeur("HELLO");
        Creationsadirah creationsadirahupdated= creationsadirahRepository.save(creationsadirah);
    }
    @Test
    public void DeleteCreationsadirah() {
        creationsadirahController.removeCreationsadirah(52L);

    }
}
