import java.util.Enumeration;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bam.entity.Article;
import com.bam.entity.Client;
import com.bam.entity.Panier;
import com.bam.managedBean.PanierCtrl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class PanierCtrlTest {
	

	@Autowired
	PanierCtrl panierCtrl;
	
	@Test
	public void test(){		
		
		for(Article a: panierCtrl.getPanierArticles(0)) System.out.println(a);
		
		System.out.println("==================================================");
		
		Panier panier = new Panier();
		panier.setIdpanier(0);
		
		Client client = new Client();
		client.setPrenom("Hans");
		client.setNom("Dooh");
		client.getPaniers().add(panier);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
		session.setAttribute("cli", client);
		Enumeration e = session.getAttributeNames();
		while (e.hasMoreElements())
		{
		  String attr = (String)e.nextElement();
		  System.err.println("      attr  = "+ attr);
		  Object value = session.getAttribute(attr);
		  System.err.println("      value = "+ value);
		}
		System.out.println("==================================================");
		
		Client n = (Client) session.getAttribute("cli");
		
//		for(Article a: panierCtrl.getPanierArticles(n.getPaniers().)) System.out.println(a);
		
		
		
		
		//Assert.assertNotNull(panier);
	}

}
