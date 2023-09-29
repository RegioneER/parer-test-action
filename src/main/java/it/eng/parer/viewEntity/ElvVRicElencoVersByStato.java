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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ELV_V_RIC_ELENCO_VERS_BY_STATO database table.
 *
 */
@Entity
@Table(name = "ELV_V_RIC_ELENCO_VERS_BY_STATO")
@NamedQuery(name = "ElvVRicElencoVersByStato.findAll", query = "SELECT e FROM ElvVRicElencoVersByStato e")
public class ElvVRicElencoVersByStato implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsElenco;
    private Date dtChius;
    private Date dtCreazioneElenco;
    private Date dtCreazioneElencoIxAip;
    private Date dtFirmaElencoIxAip;
    private Date dtFirmaIndice;
    private String flElencoFisc;
    private String flElencoStandard;
    private String flElencoFirmato;
    private BigDecimal idAmbiente;
    private BigDecimal idCriterioRaggr;
    private BigDecimal idElencoVers;
    private BigDecimal idEnte;
    private BigDecimal idStrut;
    private BigDecimal idUserIam;
    private BigDecimal niCompAggElenco;
    private BigDecimal niCompVersElenco;
    private BigDecimal niIndiciAip;
    private BigDecimal niSizeAggElenco;
    private BigDecimal niSizeVersElenco;
    private String nmAmbiente;
    private String nmCriterioRaggr;
    private String nmElenco;
    private String nmEnte;
    private String nmStrut;
    private String ntElencoChiuso;
    private String ntIndiceElenco;
    private String tiStatoElenco;
    private String tiValidElenco;
    private String tiModValidElenco;
    private String tiGestElenco;
    private Date tsStatoElencoInCodaJms;
    private BigDecimal hhStatoElencoInCodaJms;

    public ElvVRicElencoVersByStato() {/* Hibernate */
    }

    @Column(name = "DS_ELENCO")
    public String getDsElenco() {
        return this.dsElenco;
    }

    public void setDsElenco(String dsElenco) {
        this.dsElenco = dsElenco;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_CHIUS")
    public Date getDtChius() {
        return this.dtChius;
    }

    public void setDtChius(Date dtChius) {
        this.dtChius = dtChius;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_CREAZIONE_ELENCO")
    public Date getDtCreazioneElenco() {
        return this.dtCreazioneElenco;
    }

    public void setDtCreazioneElenco(Date dtCreazioneElenco) {
        this.dtCreazioneElenco = dtCreazioneElenco;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_CREAZIONE_ELENCO_IX_AIP")
    public Date getDtCreazioneElencoIxAip() {
        return this.dtCreazioneElencoIxAip;
    }

    public void setDtCreazioneElencoIxAip(Date dtCreazioneElencoIxAip) {
        this.dtCreazioneElencoIxAip = dtCreazioneElencoIxAip;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_FIRMA_ELENCO_IX_AIP")
    public Date getDtFirmaElencoIxAip() {
        return this.dtFirmaElencoIxAip;
    }

    public void setDtFirmaElencoIxAip(Date dtFirmaElencoIxAip) {
        this.dtFirmaElencoIxAip = dtFirmaElencoIxAip;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_FIRMA_INDICE")
    public Date getDtFirmaIndice() {
        return this.dtFirmaIndice;
    }

    public void setDtFirmaIndice(Date dtFirmaIndice) {
        this.dtFirmaIndice = dtFirmaIndice;
    }

    @Column(name = "FL_ELENCO_FISC", columnDefinition = "char(1)")
    public String getFlElencoFisc() {
        return this.flElencoFisc;
    }

    public void setFlElencoFisc(String flElencoFisc) {
        this.flElencoFisc = flElencoFisc;
    }

    @Column(name = "FL_ELENCO_STANDARD", columnDefinition = "char(1)")
    public String getFlElencoStandard() {
        return this.flElencoStandard;
    }

    @Column(name = "FL_ELENCO_FIRMATO", columnDefinition = "char(1)")
    public String getFlElencoFirmato() {
        return this.flElencoFirmato;
    }

    public void setFlElencoFirmato(String flElencoFirmato) {
        this.flElencoFirmato = flElencoFirmato;
    }

    public void setFlElencoStandard(String flElencoStandard) {
        this.flElencoStandard = flElencoStandard;
    }

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Column(name = "ID_CRITERIO_RAGGR")
    public BigDecimal getIdCriterioRaggr() {
        return this.idCriterioRaggr;
    }

    public void setIdCriterioRaggr(BigDecimal idCriterioRaggr) {
        this.idCriterioRaggr = idCriterioRaggr;
    }

    @Id
    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "NI_COMP_AGG_ELENCO")
    public BigDecimal getNiCompAggElenco() {
        return this.niCompAggElenco;
    }

    public void setNiCompAggElenco(BigDecimal niCompAggElenco) {
        this.niCompAggElenco = niCompAggElenco;
    }

    @Column(name = "NI_COMP_VERS_ELENCO")
    public BigDecimal getNiCompVersElenco() {
        return this.niCompVersElenco;
    }

    public void setNiCompVersElenco(BigDecimal niCompVersElenco) {
        this.niCompVersElenco = niCompVersElenco;
    }

    @Column(name = "NI_INDICI_AIP")
    public BigDecimal getNiIndiciAip() {
        return this.niIndiciAip;
    }

    public void setNiIndiciAip(BigDecimal niIndiciAip) {
        this.niIndiciAip = niIndiciAip;
    }

    @Column(name = "NI_SIZE_AGG_ELENCO")
    public BigDecimal getNiSizeAggElenco() {
        return this.niSizeAggElenco;
    }

    public void setNiSizeAggElenco(BigDecimal niSizeAggElenco) {
        this.niSizeAggElenco = niSizeAggElenco;
    }

    @Column(name = "NI_SIZE_VERS_ELENCO")
    public BigDecimal getNiSizeVersElenco() {
        return this.niSizeVersElenco;
    }

    public void setNiSizeVersElenco(BigDecimal niSizeVersElenco) {
        this.niSizeVersElenco = niSizeVersElenco;
    }

    @Column(name = "NM_AMBIENTE")
    public String getNmAmbiente() {
        return this.nmAmbiente;
    }

    public void setNmAmbiente(String nmAmbiente) {
        this.nmAmbiente = nmAmbiente;
    }

    @Column(name = "NM_CRITERIO_RAGGR")
    public String getNmCriterioRaggr() {
        return this.nmCriterioRaggr;
    }

    public void setNmCriterioRaggr(String nmCriterioRaggr) {
        this.nmCriterioRaggr = nmCriterioRaggr;
    }

    @Column(name = "NM_ELENCO")
    public String getNmElenco() {
        return this.nmElenco;
    }

    public void setNmElenco(String nmElenco) {
        this.nmElenco = nmElenco;
    }

    @Column(name = "NM_ENTE")
    public String getNmEnte() {
        return this.nmEnte;
    }

    public void setNmEnte(String nmEnte) {
        this.nmEnte = nmEnte;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return this.nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

    @Column(name = "NT_ELENCO_CHIUSO")
    public String getNtElencoChiuso() {
        return this.ntElencoChiuso;
    }

    public void setNtElencoChiuso(String ntElencoChiuso) {
        this.ntElencoChiuso = ntElencoChiuso;
    }

    @Column(name = "NT_INDICE_ELENCO")
    public String getNtIndiceElenco() {
        return this.ntIndiceElenco;
    }

    public void setNtIndiceElenco(String ntIndiceElenco) {
        this.ntIndiceElenco = ntIndiceElenco;
    }

    @Column(name = "TI_STATO_ELENCO")
    public String getTiStatoElenco() {
        return this.tiStatoElenco;
    }

    public void setTiStatoElenco(String tiStatoElenco) {
        this.tiStatoElenco = tiStatoElenco;
    }

    @Column(name = "TI_VALID_ELENCO")
    public String getTiValidElenco() {
        return this.tiValidElenco;
    }

    public void setTiValidElenco(String tiValidElenco) {
        this.tiValidElenco = tiValidElenco;
    }

    @Column(name = "TI_MOD_VALID_ELENCO")
    public String getTiModValidElenco() {
        return this.tiModValidElenco;
    }

    public void setTiModValidElenco(String tiModValidElenco) {
        this.tiModValidElenco = tiModValidElenco;
    }

    @Column(name = "TI_GEST_ELENCO")
    public String getTiGestElenco() {
        return this.tiGestElenco;
    }

    public void setTiGestElenco(String tiGestElenco) {
        this.tiGestElenco = tiGestElenco;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_STATO_ELENCO_IN_CODA_JMS")
    public Date getTsStatoElencoInCodaJms() {
        return this.tsStatoElencoInCodaJms;
    }

    public void setTsStatoElencoInCodaJms(Date tsStatoElencoInCodaJms) {
        this.tsStatoElencoInCodaJms = tsStatoElencoInCodaJms;
    }

    @Column(name = "HH_STATO_ELENCO_IN_CODA_JMS")
    public BigDecimal getHhStatoElencoInCodaJms() {
        return this.hhStatoElencoInCodaJms;
    }

    public void setHhStatoElencoInCodaJms(BigDecimal hhStatoElencoInCodaJms) {
        this.hhStatoElencoInCodaJms = hhStatoElencoInCodaJms;
    }
}
