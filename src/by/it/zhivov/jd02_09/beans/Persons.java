//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.17 at 12:09:52 AM MSK 
//


package by.it.zhivov.jd02_09.beans;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://beans.jd02_09.zhivov.it.by/}User" maxOccurs="unbounded"/>
 *         &lt;element name="admin" type="{http://beans.jd02_09.zhivov.it.by/}Admin"/>
 *         &lt;element name="guest" type="{http://beans.jd02_09.zhivov.it.by/}Guest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "user"
})
@XmlRootElement(name = "persons")
public class Persons {

    @XmlElement(required = true)
    protected List<User> user;


    /**
     * Gets the value of the user property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     */
    public List<User> getUser() {
        if (user == null) {
            user = new ArrayList<User>();
        }
        return this.user;
    }

    /**
     * Gets the value of the admin property.
     *
     * @return possible object is
     * {@link Admin }
     */
//    public Admin getAdmin() {
//        return admin;
//    }

    /**
     * Sets the value of the admin property.
     *
     * @param value allowed object is
     *              {@link Admin }
     */
//    public void setAdmin(Admin value) {
//        this.admin = value;
//    }

    /**
     * Gets the value of the guest property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guest property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuest().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     */


    @Override
    public String toString() {
        return "Persons {\n\t" + user + "\n}";
    }

}