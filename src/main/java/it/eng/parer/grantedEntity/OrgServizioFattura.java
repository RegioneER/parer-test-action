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

package it.eng.parer.grantedEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ORG_SERVIZIO_FATTURA database table.
 *
 */
// @Entity
// @Table(name = "ORG_SERVIZIO_FATTURA", schema = "SACER_IAM")
// @NamedQuery(name = "OrgServizioFattura.findAll", query = "SELECT o FROM OrgServizioFattura o")
public class OrgServizioFattura implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idServizioFattura;
    private BigDecimal aaServizioFattura;
    private Date dtErog;
    private BigDecimal imServizioFattura;
    private BigDecimal qtScaglioneServizioFattura;
    private BigDecimal qtUnitServizioFattura;
    private OrgServizioErog orgServizioErog;
    private String nmServizioFattura;
    private String ntServizioFattura;
    private BigDecimal imIva;

    public OrgServizioFattura() {/* Hibernate */
    }

    @Id
    @SequenceGenerator(name = "ORG_SERVIZIO_FATTURA_IDSERVIZIOFATTURA_GENERATOR", sequenceName = "SORG_SERVIZIO_FATTURA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_SERVIZIO_FATTURA_IDSERVIZIOFATTURA_GENERATOR")
    @Column(name = "ID_SERVIZIO_FATTURA")
    public Long getIdServizioFattura() {
        return this.idServizioFattura;
    }

    public void setIdServizioFattura(Long idServizioFattura) {
        this.idServizioFattura = idServizioFattura;
    }

    @Column(name = "IM_SERVIZIO_FATTURA")
    public BigDecimal getImServizioFattura() {
        return this.imServizioFattura;
    }

    public void setImServizioFattura(BigDecimal imServizioFattura) {
        this.imServizioFattura = imServizioFattura;
    }

    @Column(name = "AA_SERVIZIO_FATTURA")
    public BigDecimal getAaServizioFattura() {
        return aaServizioFattura;
    }

    public void setAaServizioFattura(BigDecimal aaServizioFattura) {
        this.aaServizioFattura = aaServizioFattura;
    }

    @Column(name = "DT_EROG")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDtErog() {
        return dtErog;
    }

    public void setDtErog(Date dtErog) {
        this.dtErog = dtErog;
    }

    @Column(name = "QT_SCAGLIONE_SERVIZIO_FATTURA")
    public BigDecimal getQtScaglioneServizioFattura() {
        return this.qtScaglioneServizioFattura;
    }

    public void setQtScaglioneServizioFattura(BigDecimal qtScaglioneServizioFattura) {
        this.qtScaglioneServizioFattura = qtScaglioneServizioFattura;
    }

    @Column(name = "QT_UNIT_SERVIZIO_FATTURA")
    public BigDecimal getQtUnitServizioFattura() {
        return this.qtUnitServizioFattura;
    }

    public void setQtUnitServizioFattura(BigDecimal qtUnitServizioFattura) {
        this.qtUnitServizioFattura = qtUnitServizioFattura;
    }

    // bi-directional many-to-one association to OrgServizioErog
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SERVIZIO_EROGATO")
    public OrgServizioErog getOrgServizioErog() {
        return this.orgServizioErog;
    }

    public void setOrgServizioErog(OrgServizioErog orgServizioErog) {
        this.orgServizioErog = orgServizioErog;
    }

    @Column(name = "NM_SERVIZIO_FATTURA")
    public String getNmServizioFattura() {
        return nmServizioFattura;
    }

    public void setNmServizioFattura(String nmServizioFattura) {
        this.nmServizioFattura = nmServizioFattura;
    }

    @Column(name = "NT_SERVIZIO_FATTURA")
    public String getNtServizioFattura() {
        return ntServizioFattura;
    }

    public void setNtServizioFattura(String ntServizioFattura) {
        this.ntServizioFattura = ntServizioFattura;
    }

    @Column(name = "IM_IVA")
    public BigDecimal getImIva() {
        return this.imIva;
    }

    public void setImIva(BigDecimal imIva) {
        this.imIva = imIva;
    }

}
