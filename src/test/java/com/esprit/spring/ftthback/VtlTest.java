package com.esprit.spring.ftthback;

import com.esprit.spring.ftthback.models.Region;
import com.esprit.spring.ftthback.models.Vtl;
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
public class VtlTest {
    @Autowired
    VtlRepository vtlRepository;
    @Autowired
    VtlController vtlController;
    @Test
    public void RetreiveAllVtl(){
        List<Vtl> vtls = vtlController.getAllVtl();
        assertNotNull(vtls);
    }

    @Test
    public void addVtl(){
        Date dateTime = new Date( "08/07/2019" );
        Region region= new Region( "paris");
    //    Vtl vtl=new Vtl ("Wajdi",dateTime,"ABSI",6,"PM","Modelisation","APD","PDS","DOE","etatsite","Charge","Commentaire",null,null);
      //  vtlController.addVtl(vtl);
    }
    @Test
    public void updateVtl(){
        Vtl vtl=vtlRepository.findById(38L).get();
        vtl.setDemandeur("HELLO");
        Vtl vtlupdated= vtlRepository.save(vtl);
    }
    @Test
    public void DeleteVtl() {
        vtlController.removeVtl(39L);
    }
}
