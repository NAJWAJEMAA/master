//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 01:24:11 PM CEST 
//

package urouen.STB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ContactType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://univ.fr/stb}gender"/>
 *         &lt;element name="Nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Prenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = { "gender", "nom", "prenom" })
@Entity
@Table(name = "ContactType")
public class ContactType {

	@XmlTransient
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@XmlElement(required = true)
	@Column(name = "gender")
	protected String gender;
	@XmlElement(name = "Nom", required = true)
	@Column(name = "Nom")
	protected String nom;
	@XmlElement(name = "Prenom", required = true)
	@Column(name = "Prenom")
	protected String prenom;

	public ContactType() {
		super();
	}

	public ContactType(String gender, String nom, String prenom) {
		super();
		this.gender = gender;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Gets the value of the gender property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the value of the gender property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGender(String value) {
		this.gender = value;
	}

	/**
	 * Gets the value of the nom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the value of the nom property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNom(String value) {
		this.nom = value;
	}

	/**
	 * Gets the value of the prenom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the value of the prenom property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrenom(String value) {
		this.prenom = value;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

}
