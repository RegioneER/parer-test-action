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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ELV_V_SEL_UNITA_DOC_VERS database table.
 */
// @Entity
// @Table(name = "ELV_V_SEL_UNITA_DOC_VERS")
@NamedQuery(name = "ElvVSelUnitaDocVer.findAll", query = "SELECT e FROM ElvVSelUnitaDocVer e")
public class ElvVSelUnitaDocVer implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal aaKeyUnitaDoc;

    private Date dtCreazione;

    public ElvVSelUnitaDocVer() {/* Hibernate */
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    private ElvVSelUnitaDocVerId elvVSelUnitaDocVerId;

    @EmbeddedId()
    public ElvVSelUnitaDocVerId getElvVSelUnitaDocVerId() {
        return elvVSelUnitaDocVerId;
    }

    public void setElvVSelUnitaDocVerId(ElvVSelUnitaDocVerId elvVSelUnitaDocVerId) {
        this.elvVSelUnitaDocVerId = elvVSelUnitaDocVerId;
    }
}
