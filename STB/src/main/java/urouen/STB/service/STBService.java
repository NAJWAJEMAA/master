package urouen.STB.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.File;
import java.net.URL;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import urouen.STB.model.EquipeType;
import urouen.STB.model.StbType;

public class STBService implements STBServiceInterface {
	private final EntityManager em;
	 private List<StbType> stbs;
	
	public STBService()  {
		this.stbs = new LinkedList<StbType>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
				persistanceName(this.getClass().getClassLoader().getResource("META-INF/persistence.xml")));
		this.em = emf.createEntityManager();
		System.err.println(this.getClass().getClassLoader().getResource("META-INF/persistence.xml"));
	}
	
	public boolean addStb(StbType stb) {

        try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(stb);
			et.commit();
			return true;
		} catch (Exception e) {
			em.clear();
			if (em.isOpen())
				em.close();
			return false;
		}
    }
	
	 @SuppressWarnings("unchecked")
	public List<StbType> getStbs() {
	       try {
				EntityTransaction et = em.getTransaction();
				et.begin();
				stbs = em.createQuery("SELECT s FROM StbType s").getResultList();
				et.commit();
				return stbs;
			} catch (Exception e) {
				em.clear();
				if (em.isOpen())
					em.close();
				return null;
			}

	    }
	 
	 public void setStbs(List<StbType> stbs) {
	        this.stbs = stbs;
	    }
	
	 public List<StbType> searchStbById(int id) {
	        List<StbType> st = new ArrayList<StbType>();
	        for (StbType stb : getStbs()) {
	            if (stb.getId().equals(id)) {
	                st.add(stb);
	            }
	        }
	        return st;
	    }
	
	
	public EquipeType ListEquipe(StbType stb){	
		return stb.getEquipe();
		
	}
	
	
	
	
	
	  private String persistanceName(URL url) {
			try {
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(new File(url.getPath()));
				doc.getDocumentElement().normalize();
				NodeList nList = doc.getElementsByTagName("persistence-unit");
				Node nNode = nList.item(0);
				Element eElement = (Element) nNode;
				return eElement.getAttribute("name");
			} catch (Exception e) {
				return e.toString();

			}

	  }
}
