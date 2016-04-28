package urouen.STB.controller;


import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import urouen.STB.model.StbType;


@Controller
public class DepotController {
	ArrayList<StbType> stbs=new ArrayList<StbType>();
	
	@RequestMapping(value ="/depot", method = RequestMethod.POST)
	@ResponseBody
	//@RequestBody StbType stb1
	public StbType depotSTBWithXSDValidation(){
		StbType stb =new StbType();
		try {
			/*ObjectFactory objFactory = new ObjectFactory();

			StbType stb = (StbType) objFactory.createStbType();
			List stbs= stb.
			for (int i = 1; i < 4; i++) {
			LivreType livreType = objFactory.createLivreType();
			livreType.setAuteur("Auteur" + i);
			livreType.setEditeur("Editeur" + i);
			livreType.setTitre("Titre" + i);

			livres.add(livreType);*/

			}
	catch (Exception e) {
			}
		return stb;
	}
	
}
