package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Regie;
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
public class RegieTest {
    @Autowired
    RegieRepository regieRepository;
    @Autowired
    RegieController regieController;
    @Test
    public void RetreiveAllRegie(){
        List<Regie> regies = regieController.getAllRegie();
        assertNotNull(regies);
    }
    @Test
    public void addRegie(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
       // Regie regie=new Regie ("Wajdi",dateTime,"PM","Site","IDRA","IDM","tache","duree","etat","charge","Commentaire",null,null);
        //regieController.addRegie(regie);
    }
    @Test
    public void updateRegie(){
        Regie regie=regieRepository.findById(30L).get();
        regie.setDemandeur("HELLO");
        Regie Regieupdated= regieRepository.save(regie);
    }
    @Test
    public void DeleteRegie() {
        regieController.removeRegie(60L);
    }
}
