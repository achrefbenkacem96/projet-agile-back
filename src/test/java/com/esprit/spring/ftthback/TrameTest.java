package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Region;
import com.esprit.spring.ftthback.models.Trame;
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
public class TrameTest {
    @Autowired
    TrameController trameController;
    @Autowired
    TrameRepository trameRepository;
    @Test
    public void RetreiveAllTrame(){
        List<Trame> trames = trameController.getAllTrame();
        assertNotNull(trames);
    }

    @Test
    public void addTrame(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
        //Trame trame=new Trame ("Wajdi",dateTime,5,"EXT","Libellevoie","typevoie","nomvoie",1152,"Ville",5,"Charge","Commentaire",null,null
        //);
        //trameController.addTrame(trame);
    }
    @Test
    public void updateTrame(){
        Trame trame=trameRepository.findById(46L).get();
        trame.setDemandeur("HELLO");
        Trame Trameupdated= trameRepository.save(trame);
    }
    @Test
    public void DeleteTrame() {
        trameController.removeTrame(47L);
    }
}
