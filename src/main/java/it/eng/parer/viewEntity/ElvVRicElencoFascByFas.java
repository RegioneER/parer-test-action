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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.eng.parer.entity.DecVoceTitol;

/**
 * The persistent class for the ELV_V_RIC_ELENCO_FASC_BY_FAS database table.
 */
@Entity
@Table(name = "ELV_V_RIC_ELENCO_FASC_BY_FAS")
@NamedQuery(name = "ElvVRicElencoFascByFas.findAll", query = "SELECT e FROM ElvVRicElencoFascByFas e")
public class ElvVRicElencoFascByFas implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal aaFascicoloElenco;

    private String cdKeyFascicolo;

    private Date dtChiusura;

    private Date tsCreazioneElenco;

    private Date dtFirma;

    private String dlMotivoChius;

    private String flElencoStandard;

    private BigDecimal idAmbiente;

    private BigDecimal idCriterioRaggrFasc;

    private BigDecimal idTipoFascicolo;

    private DecVoceTitol decVoceTitol;

    private BigDecimal idEnte;

    private BigDecimal idStrut;

    private BigDecimal idUserIam;

    private BigDecimal aaFascicolo;

    private BigDecimal niFascVersElenco;

    private String nmAmbiente;

    private String nmCriterioRaggr;

    private String nmEnte;

    private String nmStrut;

    private String ntElencoChiuso;

    private String ntIndiceElenco;

    private String tiStato;

    private String cdVoceTitol;

    private String nmTipoFascicolo;

    private BigDecimal idStatoElencoVersFascCor;

    public ElvVRicElencoFascByFas() {/* Hibernate */
    }

    public ElvVRicElencoFascByFas(BigDecimal idElencoVersFasc, String tiStato, BigDecimal aaFascicoloElenco,
            BigDecimal niFascVersElenco, String dlMotivoChius, Date tsCreazioneElenco, Date dtChiusura, Date dtFirma,
            BigDecimal idCriterioRaggrFasc, String nmCriterioRaggr, String ntElencoChiuso, String ntIndiceElenco,
            String nmAmbiente, String nmEnte, String nmStrut, String flElencoStandard, String cdVoceTitol,
            String nmTipoFascicolo) {
        this.elvVRicElencoFascByFasId = new ElvVRicElencoFascByFasId();
        this.elvVRicElencoFascByFasId.setIdElencoVersFasc(idElencoVersFasc);
        this.tiStato = tiStato;
        this.aaFascicoloElenco = aaFascicoloElenco;
        this.niFascVersElenco = niFascVersElenco;
        this.dlMotivoChius = dlMotivoChius;
        this.tsCreazioneElenco = tsCreazioneElenco;
        this.dtChiusura = dtChiusura;
        this.dtFirma = dtFirma;
        this.idCriterioRaggrFasc = idCriterioRaggrFasc;
        this.nmCriterioRaggr = nmCriterioRaggr;
        this.ntElencoChiuso = ntElencoChiuso;
        this.ntIndiceElenco = ntIndiceElenco;
        this.nmAmbiente = nmAmbiente;
        this.nmEnte = nmEnte;
        this.nmStrut = nmStrut;
        this.flElencoStandard = flElencoStandard;
        this.cdVoceTitol = cdVoceTitol;
        this.nmTipoFascicolo = nmTipoFascicolo;
    }

    @Column(name = "AA_FASCICOLO_ELENCO")
    public BigDecimal getAaFascicoloElenco() {
        return this.aaFascicoloElenco;
    }

    public void setAaFascicoloElenco(BigDecimal aaFascicoloElenco) {
        this.aaFascicoloElenco = aaFascicoloElenco;
    }

    @Column(name = "CD_KEY_FASCICOLO")
    public String getCdKeyFascicolo() {
        return this.cdKeyFascicolo;
    }

    public void setCdKeyFascicolo(String cdKeyFascicolo) {
        this.cdKeyFascicolo = cdKeyFascicolo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CHIUSURA")
    public Date getDtChiusura() {
        return this.dtChiusura;
    }

    public void setDtChiusura(Date dtChiusura) {
        this.dtChiusura = dtChiusura;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_CREAZIONE_ELENCO")
    public Date getTsCreazioneElenco() {
        return this.tsCreazioneElenco;
    }

    public void setTsCreazioneElenco(Date tsCreazioneElenco) {
        this.tsCreazioneElenco = tsCreazioneElenco;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIRMA")
    public Date getDtFirma() {
        return this.dtFirma;
    }

    public void setDtFirma(Date dtFirma) {
        this.dtFirma = dtFirma;
    }

    @Column(name = "DL_MOTIVO_CHIUS")
    public String getDlMotivoChius() {
        return this.dlMotivoChius;
    }

    public void setDlMotivoChius(String dlMotivoChius) {
        this.dlMotivoChius = dlMotivoChius;
    }

    @Column(name = "FL_ELENCO_STANDARD", columnDefinition = "char(1)")
    public String getFlElencoStandard() {
        return this.flElencoStandard;
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

    @Column(name = "ID_CRITERIO_RAGGR_FASC")
    public BigDecimal getIdCriterioRaggrFasc() {
        return this.idCriterioRaggrFasc;
    }

    public void setIdCriterioRaggrFasc(BigDecimal idCriterioRaggrFasc) {
        this.idCriterioRaggrFasc = idCriterioRaggrFasc;
    }

    @Column(name = "ID_TIPO_FASCICOLO")
    public BigDecimal getIdTipoFascicolo() {
        return this.idTipoFascicolo;
    }

    public void setIdTipoFascicolo(BigDecimal idTipoFascicolo) {
        this.idTipoFascicolo = idTipoFascicolo;
    }

    // bi-directional many-to-one association to DecVoceTitol
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VOCE_TITOL")
    public DecVoceTitol getDecVoceTitol() {
        return this.decVoceTitol;
    }

    public void setDecVoceTitol(DecVoceTitol decVoceTitol) {
        this.decVoceTitol = decVoceTitol;
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

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "NI_FASC_VERS_ELENCO")
    public BigDecimal getNiFascVersElenco() {
        return this.niFascVersElenco;
    }

    public void setNiFascVersElenco(BigDecimal niFascVersElenco) {
        this.niFascVersElenco = niFascVersElenco;
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

    @Column(name = "TI_STATO")
    public String getTiStato() {
        return this.tiStato;
    }

    public void setTiStato(String tiStato) {
        this.tiStato = tiStato;
    }

    @Column(name = "CD_VOCE_TITOL")
    public String getCdVoceTitol() {
        return this.cdVoceTitol;
    }

    public void setCdVoceTitol(String cdVoceTitol) {
        this.cdVoceTitol = cdVoceTitol;
    }

    @Column(name = "NM_TIPO_FASCICOLO")
    public String getNmTipoFascicolo() {
        return this.nmTipoFascicolo;
    }

    public void setNmTipoFascicolo(String nmTipoFascicolo) {
        this.nmTipoFascicolo = nmTipoFascicolo;
    }

    @Column(name = "ID_STATO_ELENCO_VERS_FASC_COR")
    public BigDecimal getIdStatoElencoVersFascCor() {
        return this.idStatoElencoVersFascCor;
    }

    public void setIdStatoElencoVersFascCor(BigDecimal idStatoElencoVersFascCor) {
        this.idStatoElencoVersFascCor = idStatoElencoVersFascCor;
    }

    private ElvVRicElencoFascByFasId elvVRicElencoFascByFasId;

    @EmbeddedId()
    public ElvVRicElencoFascByFasId getElvVRicElencoFascByFasId() {
        return elvVRicElencoFascByFasId;
    }

    public void setElvVRicElencoFascByFasId(ElvVRicElencoFascByFasId elvVRicElencoFascByFasId) {
        this.elvVRicElencoFascByFasId = elvVRicElencoFascByFasId;
    }
}
