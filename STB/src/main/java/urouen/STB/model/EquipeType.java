//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 01:24:11 PM CEST 
//


package urouen.STB.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="7" minOccurs="2">
 *         &lt;element name="Member" type="{http://univ.fr/stb}ContactType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipeType", propOrder = {
    "member"
})

@Entity
@Table(name="EquipeType")
public class EquipeType {

	@XmlTransient
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
    @XmlElement(name = "Member", required = true)
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    protected List<ContactType> member;
    
    

    public EquipeType() {
		super();
	}



	public EquipeType(List<ContactType> member) {
		super();
		this.member = member;
	}
	



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setMember(List<ContactType> member) {
		this.member = member;
	}



	/**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getMember() {
        if (member == null) {
            member = new ArrayList<ContactType>();
        }
        return this.member;
    }

}