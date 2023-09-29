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
 * The persistent class for the ARO_V_LIS_DATI_COMP database table.
 * 
 */
/*
 * @Entity
 * 
 * @Table(name = "ARO_V_LIS_DATI_COMP")
 */
public class AroVLisDatiComp implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "DL_VALORE")
    private String dlValore;

    @Column(name = "DS_ATTRIB_TIPO_COMP")
    private String dsAttribTipoComp;

    @Column(name = "ID_COMP_DOC")
    private BigDecimal idCompDoc;

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_DATI_COMP")
    private BigDecimal idDatiComp;

    @Column(name = "NI_ORD_ATTRIB")
    private BigDecimal niOrdAttrib;

    @Column(name = "NM_ATTRIB_TIPO_COMP")
    private String nmAttribTipoComp;

    public AroVLisDatiComp() {/* Hibernate */
    }

    public String getDlValore() {
        return this.dlValore;
    }

    public void setDlValore(String dlValore) {
        this.dlValore = dlValore;
    }

    public String getDsAttribTipoComp() {
        return this.dsAttribTipoComp;
    }

    public void setDsAttribTipoComp(String dsAttribTipoComp) {
        this.dsAttribTipoComp = dsAttribTipoComp;
    }

    public BigDecimal getIdCompDoc() {
        return this.idCompDoc;
    }

    public void setIdCompDoc(BigDecimal idCompDoc) {
        this.idCompDoc = idCompDoc;
    }

    public BigDecimal getIdDatiComp() {
        return this.idDatiComp;
    }

    public void setIdDatiComp(BigDecimal idDatiComp) {
        this.idDatiComp = idDatiComp;
    }

    public BigDecimal getNiOrdAttrib() {
        return this.niOrdAttrib;
    }

    public void setNiOrdAttrib(BigDecimal niOrdAttrib) {
        this.niOrdAttrib = niOrdAttrib;
    }

    public String getNmAttribTipoComp() {
        return this.nmAttribTipoComp;
    }

    public void setNmAttribTipoComp(String nmAttribTipoComp) {
        this.nmAttribTipoComp = nmAttribTipoComp;
    }

}
