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

package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * The persistent class for the ARO_V_LIS_DATI_SPEC_DOC database table.
 * 
 */
// @Entity
// @Table(name = "ARO_V_LIS_DATI_SPEC_DOC")
public class AroVLisDatiSpecDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dlValore;
    private String dsAttribTipoDoc;
    private BigDecimal idDatiSpecDoc;
    private BigDecimal idDoc;
    private BigDecimal niOrdAttrib;
    private String nmAttribTipoDoc;

    public AroVLisDatiSpecDoc() {/* Hibernate */
    }

    @Column(name = "DL_VALORE")
    public String getDlValore() {
        return this.dlValore;
    }

    public void setDlValore(String dlValore) {
        this.dlValore = dlValore;
    }

    @Column(name = "DS_ATTRIB_TIPO_DOC")
    public String getDsAttribTipoDoc() {
        return this.dsAttribTipoDoc;
    }

    public void setDsAttribTipoDoc(String dsAttribTipoDoc) {
        this.dsAttribTipoDoc = dsAttribTipoDoc;
    }

    @Id
    @Column(name = "ID_DATI_SPEC_DOC")
    public BigDecimal getIdDatiSpecDoc() {
        return this.idDatiSpecDoc;
    }

    public void setIdDatiSpecDoc(BigDecimal idDatiSpecDoc) {
        this.idDatiSpecDoc = idDatiSpecDoc;
    }

    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    @Column(name = "NI_ORD_ATTRIB")
    public BigDecimal getNiOrdAttrib() {
        return this.niOrdAttrib;
    }

    public void setNiOrdAttrib(BigDecimal niOrdAttrib) {
        this.niOrdAttrib = niOrdAttrib;
    }

    @Column(name = "NM_ATTRIB_TIPO_DOC")
    public String getNmAttribTipoDoc() {
        return this.nmAttribTipoDoc;
    }

    public void setNmAttribTipoDoc(String nmAttribTipoDoc) {
        this.nmAttribTipoDoc = nmAttribTipoDoc;
    }

}
