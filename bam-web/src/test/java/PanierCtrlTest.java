import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bam.entity.Article;
import com.bam.managedBean.PanierCtrl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class PanierCtrlTest {
	

	
	PanierCtrl panierCtrl = new PanierCtrl();
	
	@Test
	public void test(){		
		
		for(Article a: panierCtrl.getPanierArticles(0)) System.out.println(a);
		
		//Assert.assertNotNull(panier);
	}

}
