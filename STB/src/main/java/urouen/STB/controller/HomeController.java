package urouen.STB.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



import urouen.STB.model.*;
import urouen.STB.service.STBService;



@Controller
public class HomeController {
	STBService service=new STBService();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String display(Model model) throws JAXBException {
	
    
     ContactType contact=new ContactType("M.","Saval","Arnaud");
	 ClientType client=new ClientType("Universite de Rouen",contact,76130);

	 ArrayList<ContactType> membre=new  ArrayList<ContactType>();
	 ContactType contact1=new ContactType("Mme.","Jmaa","najwa");
	 ContactType contact2=new ContactType("Mme.","Mhamdi","Safae");
	 ContactType contact3=new ContactType("Mme.","Boucher","Axelle");
	 membre.add(contact1);
	 membre.add(contact2);
	 membre.add(contact3);
	 EquipeType equipe=new EquipeType(membre);
	 ExigenceFonctionnelleType exgFonct=new  ExigenceFonctionnelleType("exig1","Mon 1 exig",1);
	 ArrayList<ExigenceFonctionnelleType> listExig=new  ArrayList<ExigenceFonctionnelleType>();
	 listExig.add(exgFonct);
	 FonctionaliteType fonct=new FonctionaliteType("",listExig,1);
	 ArrayList<FonctionaliteType> listFonct=new  ArrayList<FonctionaliteType>();
	 listFonct.add(fonct);
	 Date date=new Date();
	 StbType  stb=new StbType("Projet annuel", "0.1",date,"description",client,equipe,listFonct," ",1);
	 
	 service.addStb(stb);
		
			return "Bienvenu";

	}

	@ResponseBody
	@RequestMapping(value = "/Accueil", method = RequestMethod.GET)
	public List<String> displaySTB(Model model) {
		List<StbType> stbs=service.getStbs();
		
		List<String> liste =  new ArrayList<String>() ;
		List<EquipeType> equipe= new ArrayList<EquipeType>() ;
		int nb=stbs.size();
		for(int i=0;i<nb;i++)
		{
			equipe.add(stbs.get(i).getEquipe());
		}
		List<ContactType> membre=new ArrayList<ContactType>();
		for(int i=0;i<equipe.size();i++)
		{
			membre.addAll(equipe.get(i).getMember());
		}
	for (int i=0;i<membre.size();i++){
		
		liste.add(""+i+""+membre.get(i).getGender()+""+membre.get(i).getNom()+""+membre.get(i).getPrenom()+"");
	}
		
	
	return liste;
}
	
	
}