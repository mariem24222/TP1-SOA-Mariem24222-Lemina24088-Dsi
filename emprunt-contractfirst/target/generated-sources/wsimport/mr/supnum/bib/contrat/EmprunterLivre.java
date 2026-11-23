
package mr.supnum.bib.contrat;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="idAdherent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="isbn" type="{http://supnum.mr/bib}IsbnType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idAdherent",
    "isbn"
})
@XmlRootElement(name = "emprunterLivre")
public class EmprunterLivre {

    @XmlElement(required = true)
    protected String idAdherent;
    @XmlElement(required = true)
    protected String isbn;

    /**
     * Obtient la valeur de la propriété idAdherent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAdherent() {
        return idAdherent;
    }

    /**
     * Définit la valeur de la propriété idAdherent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAdherent(String value) {
        this.idAdherent = value;
    }

    /**
     * Obtient la valeur de la propriété isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Définit la valeur de la propriété isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

}
