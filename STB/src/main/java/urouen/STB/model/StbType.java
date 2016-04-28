//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 01:24:11 PM CEST 
//

package urouen.STB.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for stbType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="stbType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://univ.fr/stb}Titre"/>
 *         &lt;element ref="{http://univ.fr/stb}Version"/>
 *         &lt;element ref="{http://univ.fr/stb}Date"/>
 *         &lt;element ref="{http://univ.fr/stb}Description"/>
 *         &lt;element ref="{http://univ.fr/stb}Client"/>
 *         &lt;element ref="{http://univ.fr/stb}Equipe"/>
 *         &lt;element ref="{http://univ.fr/stb}Fonctionnalite" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{http://univ.fr/stb}Commmentaire" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stb", propOrder = { "titre", "version", "date", "description", "client", "equipe", "fonctionnalite",
		"commmentaire" })
@Entity
@Table(name = "StbType")
public class StbType {

	@XmlElement(name = "Titre", required = true)
	@Column(name = "Titre")
	protected String titre;

	@XmlElement(name = "Version", required = true)
	@Column(name = "Version")
	protected String version;

	@XmlElement(name = "Date", required = true)
	@XmlSchemaType(name = "date")
	@Column(name = "Date")
	@Temporal(value = TemporalType.DATE)
	protected Date date;
	@XmlElement(name = "Description", required = true)
	@Column(name = "Description")
	protected String description;

	@XmlElement(name = "Client", required = true)
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	
	protected ClientType client;
	@XmlElement(name = "Equipe", required = true)
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	protected EquipeType equipe;
	
	@XmlElement(name = "Fonctionnalite", required = true)
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	protected List<FonctionaliteType> fonctionnalite;

	@XmlElement(name = "Commmentaire")
	@Column(name = "Commmentaire")
	protected String commmentaire;

	@XmlAttribute
	@Id
	@Column(name = "id")
	protected Integer id;

	public StbType() {
		super();
	}

	
	public StbType(String titre, String version, ClientType client, EquipeType equipe) {
		super();
		this.titre = titre;
		this.version = version;
		this.client = client;
		this.equipe = equipe;
	}


	public StbType(String titre, String version, Date date, String description, ClientType client, EquipeType equipe,
			List<FonctionaliteType> fonctionnalite, String commmentaire, Integer id) {
		super();
		this.titre = titre;
		this.version = version;
		this.date = date;
		this.description = description;
		this.client = client;
		this.equipe = equipe;
		this.fonctionnalite = fonctionnalite;
		this.commmentaire = commmentaire;
		this.id = id;
	}

	/**
	 * Gets the value of the titre property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Sets the value of the titre property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitre(String value) {
		this.titre = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

	/**
	 * Gets the value of the date property.
	 * 
	 * @return possible object is {@link Date }
	 * 
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *            allowed object is {@link Date }
	 * 
	 */
	public void setDate(Date value) {
		this.date = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the client property.
	 * 
	 * @return possible object is {@link ClientType }
	 * 
	 */
	public ClientType getClient() {
		return client;
	}

	/**
	 * Sets the value of the client property.
	 * 
	 * @param value
	 *            allowed object is {@link ClientType }
	 * 
	 */
	public void setClient(ClientType value) {
		this.client = value;
	}

	/**
	 * Gets the value of the equipe property.
	 * 
	 * @return possible object is {@link EquipeType }
	 * 
	 */
	public EquipeType getEquipe() {
		return equipe;
	}

	/**
	 * Sets the value of the equipe property.
	 * 
	 * @param value
	 *            allowed object is {@link EquipeType }
	 * 
	 */
	public void setEquipe(EquipeType value) {
		this.equipe = value;
	}

	/**
	 * Gets the value of the fonctionnalite property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the fonctionnalite property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFonctionnalite().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link FonctionaliteType }
	 * 
	 * 
	 */
	public List<FonctionaliteType> getFonctionnalite() {
		if (fonctionnalite == null) {
			fonctionnalite = new ArrayList<FonctionaliteType>();
		}
		return this.fonctionnalite;
	}

	/**
	 * Gets the value of the commmentaire property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCommmentaire() {
		return commmentaire;
	}

	/**
	 * Sets the value of the commmentaire property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCommmentaire(String value) {
		this.commmentaire = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}