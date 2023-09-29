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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import it.eng.parer.entity.constraint.HsmElencoFascSesFirma.TiEsitoFirmaElencoFasc;

/**
 * The persistent class for the HSM_ELENCO_FASC_SES_FIRMA database table.
 */
@Entity
@Table(name = "HSM_ELENCO_FASC_SES_FIRMA")
@NamedQuery(name = "HsmElencoFascSesFirma.findAll", query = "SELECT h FROM HsmElencoFascSesFirma h")
public class HsmElencoFascSesFirma implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idElencoFascSesFirma;

    private String cdErr;

    private String dsErr;

    private TiEsitoFirmaElencoFasc tiEsito;

    private ElvElencoVersFasc elvElencoVersFasc;

    private Date tsEsito;

    private HsmSessioneFirma hsmSessioneFirma;

    public HsmElencoFascSesFirma() {/* Hibernate */
    }

    @Id
    // "HSM_ELENCO_FASC_SES_FIRMA_IDELENCOFASCSESFIRMA_GENERATOR",
    // sequenceName =
    // "SHSM_ELENCO_FASC_SES_FIRMA",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "HSM_ELENCO_FASC_SES_FIRMA_IDELENCOFASCSESFIRMA_GENERATOR")
    @Column(name = "ID_ELENCO_FASC_SES_FIRMA")
    @GenericGenerator(name = "SHSM_ELENCO_FASC_SES_FIRMA_ID_ELENCO_FASC_SES_FIRMA_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SHSM_ELENCO_FASC_SES_FIRMA"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHSM_ELENCO_FASC_SES_FIRMA_ID_ELENCO_FASC_SES_FIRMA_GENERATOR")
    public Long getIdElencoFascSesFirma() {
        return this.idElencoFascSesFirma;
    }

    public void setIdElencoFascSesFirma(Long idElencoFascSesFirma) {
        this.idElencoFascSesFirma = idElencoFascSesFirma;
    }

    @Column(name = "CD_ERR")
    public String getCdErr() {
        return this.cdErr;
    }

    public void setCdErr(String cdErr) {
        this.cdErr = cdErr;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return this.dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_ESITO")
    public TiEsitoFirmaElencoFasc getTiEsito() {
        return this.tiEsito;
    }

    public void setTiEsito(TiEsitoFirmaElencoFasc tiEsito) {
        this.tiEsito = tiEsito;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_ESITO")
    public Date getTsEsito() {
        return this.tsEsito;
    }

    public void setTsEsito(Date tsEsito) {
        this.tsEsito = tsEsito;
    }

    // bi-directional many-to-one association to ElvElencoVersFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS_FASC")
    public ElvElencoVersFasc getElvElencoVersFasc() {
        return this.elvElencoVersFasc;
    }

    public void setElvElencoVersFasc(ElvElencoVersFasc elvElencoVersFasc) {
        this.elvElencoVersFasc = elvElencoVersFasc;
    }

    // bi-directional many-to-one association to HsmSessioneFirma
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SESSIONE_FIRMA")
    public HsmSessioneFirma getHsmSessioneFirma() {
        return this.hsmSessioneFirma;
    }

    public void setHsmSessioneFirma(HsmSessioneFirma hsmSessioneFirma) {
        this.hsmSessioneFirma = hsmSessioneFirma;
    }

    @Transient
    public boolean is2sign() {
        return this.tiEsito.equals(TiEsitoFirmaElencoFasc.DA_FARE);
    }

    @Transient
    public boolean isSigned() {
        return this.tiEsito.equals(TiEsitoFirmaElencoFasc.OK);
    }
}
