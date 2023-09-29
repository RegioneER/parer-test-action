/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VRS_XML_SES_FASCICOLO_ERR database table.
 */
@Entity
@Table(name = "VRS_XML_SES_FASCICOLO_ERR")
@NamedQuery(name = "VrsXmlSesFascicoloErr.findAll", query = "SELECT v FROM VrsXmlSesFascicoloErr v")
public class VrsXmlSesFascicoloErr implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idXmlSesFascicoloErr;
    private String blXml;
    // private String cdEncodingHashXml;
    private String cdVersioneXml;
    // private String dsAlgoHashXml;
    // private String dsHashXml;
    // private String dsUrnXml;
    private String tiXml;
    private VrsSesFascicoloErr vrsSesFascicoloErr;

    public VrsXmlSesFascicoloErr() {/* Hibernate */
    }

    @Id
    // "VRS_XML_SES_FASCICOLO_ERR_IDXMLSESFASCICOLOERR_GENERATOR",
    // sequenceName =
    // "SVRS_XML_SES_FASCICOLO_ERR",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VRS_XML_SES_FASCICOLO_ERR_IDXMLSESFASCICOLOERR_GENERATOR")
    @Column(name = "ID_XML_SES_FASCICOLO_ERR")
    @GenericGenerator(name = "SVRS_XML_SES_FASCICOLO_ERR_ID_XML_SES_FASCICOLO_ERR_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_XML_SES_FASCICOLO_ERR"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVRS_XML_SES_FASCICOLO_ERR_ID_XML_SES_FASCICOLO_ERR_GENERATOR")
    public Long getIdXmlSesFascicoloErr() {
        return this.idXmlSesFascicoloErr;
    }

    public void setIdXmlSesFascicoloErr(Long idXmlSesFascicoloErr) {
        this.idXmlSesFascicoloErr = idXmlSesFascicoloErr;
    }

    @Lob
    @Column(name = "BL_XML")
    public String getBlXml() {
        return this.blXml;
    }

    public void setBlXml(String blXml) {
        this.blXml = blXml;
    }

    /*
     * @Column(name = "CD_ENCODING_HASH_XML") public String getCdEncodingHashXml() { return this.cdEncodingHashXml; }
     * 
     * public void setCdEncodingHashXml(String cdEncodingHashXml) { this.cdEncodingHashXml = cdEncodingHashXml; }
     */
    @Column(name = "CD_VERSIONE_XML")
    public String getCdVersioneXml() {
        return this.cdVersioneXml;
    }

    public void setCdVersioneXml(String cdVersioneXml) {
        this.cdVersioneXml = cdVersioneXml;
    }

    /*
     * @Column(name = "DS_ALGO_HASH_XML") public String getDsAlgoHashXml() { return this.dsAlgoHashXml; }
     * 
     * public void setDsAlgoHashXml(String dsAlgoHashXml) { this.dsAlgoHashXml = dsAlgoHashXml; }
     * 
     * @Column(name = "DS_HASH_XML") public String getDsHashXml() { return this.dsHashXml; }
     * 
     * public void setDsHashXml(String dsHashXml) { this.dsHashXml = dsHashXml; }
     * 
     * @Column(name = "DS_URN_XML") public String getDsUrnXml() { return this.dsUrnXml; }
     * 
     * public void setDsUrnXml(String dsUrnXml) { this.dsUrnXml = dsUrnXml; }
     */
    @Column(name = "TI_XML")
    public String getTiXml() {
        return this.tiXml;
    }

    public void setTiXml(String tiXml) {
        this.tiXml = tiXml;
    }

    // bi-directional many-to-one association to VrsSesFascicoloErr
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_FASCICOLO_ERR")
    public VrsSesFascicoloErr getVrsSesFascicoloErr() {
        return this.vrsSesFascicoloErr;
    }

    public void setVrsSesFascicoloErr(VrsSesFascicoloErr vrsSesFascicoloErr) {
        this.vrsSesFascicoloErr = vrsSesFascicoloErr;
    }
}
