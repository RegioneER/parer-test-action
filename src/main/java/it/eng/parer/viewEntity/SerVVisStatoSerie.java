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
 * The persistent class for the SER_V_VIS_STATO_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_V_VIS_STATO_SERIE")
@NamedQuery(name = "SerVVisStatoSerie.findAll", query = "SELECT s FROM SerVVisStatoSerie s")
public class SerVVisStatoSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal aaSerie;
    private String cdCompositoSerie;
    private String cdVerSerie;
    private String dsAzione;
    private String dsNotaAzione;
    private String dsSerie;
    private Date dtRegStatoVerSerie;
    private BigDecimal idAmbiente;
    private BigDecimal idEnte;
    private BigDecimal idSerie;
    private BigDecimal idStatoSerieCor;
    private BigDecimal idStatoVerSerie;
    private BigDecimal idStatoVerSerieCor;
    private BigDecimal idStrut;
    private BigDecimal idTipoSerie;
    private BigDecimal idUserIamStato;
    private BigDecimal idVerSerie;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;
    private String nmTipoSerie;
    private String nmUseridStato;
    private BigDecimal pgStatoVerSerie;
    private String tiStatoSerieCor;
    private String tiStatoVerSerie;
    private String tiStatoVerSerieCor;

    public SerVVisStatoSerie() {/* Hibernate */
    }

    @Column(name = "AA_SERIE")
    public BigDecimal getAaSerie() {
        return this.aaSerie;
    }

    public void setAaSerie(BigDecimal aaSerie) {
        this.aaSerie = aaSerie;
    }

    @Column(name = "CD_COMPOSITO_SERIE")
    public String getCdCompositoSerie() {
        return this.cdCompositoSerie;
    }

    public void setCdCompositoSerie(String cdCompositoSerie) {
        this.cdCompositoSerie = cdCompositoSerie;
    }

    @Column(name = "CD_VER_SERIE")
    public String getCdVerSerie() {
        return this.cdVerSerie;
    }

    public void setCdVerSerie(String cdVerSerie) {
        this.cdVerSerie = cdVerSerie;
    }

    @Column(name = "DS_AZIONE")
    public String getDsAzione() {
        return this.dsAzione;
    }

    public void setDsAzione(String dsAzione) {
        this.dsAzione = dsAzione;
    }

    @Column(name = "DS_NOTA_AZIONE")
    public String getDsNotaAzione() {
        return this.dsNotaAzione;
    }

    public void setDsNotaAzione(String dsNotaAzione) {
        this.dsNotaAzione = dsNotaAzione;
    }

    @Column(name = "DS_SERIE")
    public String getDsSerie() {
        return this.dsSerie;
    }

    public void setDsSerie(String dsSerie) {
        this.dsSerie = dsSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_STATO_VER_SERIE")
    public Date getDtRegStatoVerSerie() {
        return this.dtRegStatoVerSerie;
    }

    public void setDtRegStatoVerSerie(Date dtRegStatoVerSerie) {
        this.dtRegStatoVerSerie = dtRegStatoVerSerie;
    }

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Column(name = "ID_SERIE")
    public BigDecimal getIdSerie() {
        return this.idSerie;
    }

    public void setIdSerie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

    @Column(name = "ID_STATO_SERIE_COR")
    public BigDecimal getIdStatoSerieCor() {
        return this.idStatoSerieCor;
    }

    public void setIdStatoSerieCor(BigDecimal idStatoSerieCor) {
        this.idStatoSerieCor = idStatoSerieCor;
    }

    @Column(name = "ID_STATO_VER_SERIE")
    public BigDecimal getIdStatoVerSerie() {
        return this.idStatoVerSerie;
    }

    public void setIdStatoVerSerie(BigDecimal idStatoVerSerie) {
        this.idStatoVerSerie = idStatoVerSerie;
    }

    @Column(name = "ID_STATO_VER_SERIE_COR")
    public BigDecimal getIdStatoVerSerieCor() {
        return this.idStatoVerSerieCor;
    }

    public void setIdStatoVerSerieCor(BigDecimal idStatoVerSerieCor) {
        this.idStatoVerSerieCor = idStatoVerSerieCor;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_TIPO_SERIE")
    public BigDecimal getIdTipoSerie() {
        return this.idTipoSerie;
    }

    public void setIdTipoSerie(BigDecimal idTipoSerie) {
        this.idTipoSerie = idTipoSerie;
    }

    @Column(name = "ID_USER_IAM_STATO")
    public BigDecimal getIdUserIamStato() {
        return this.idUserIamStato;
    }

    public void setIdUserIamStato(BigDecimal idUserIamStato) {
        this.idUserIamStato = idUserIamStato;
    }

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Column(name = "NM_AMBIENTE")
    public String getNmAmbiente() {
        return this.nmAmbiente;
    }

    public void setNmAmbiente(String nmAmbiente) {
        this.nmAmbiente = nmAmbiente;
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

    @Column(name = "NM_TIPO_SERIE")
    public String getNmTipoSerie() {
        return this.nmTipoSerie;
    }

    public void setNmTipoSerie(String nmTipoSerie) {
        this.nmTipoSerie = nmTipoSerie;
    }

    @Column(name = "NM_USERID_STATO")
    public String getNmUseridStato() {
        return this.nmUseridStato;
    }

    public void setNmUseridStato(String nmUseridStato) {
        this.nmUseridStato = nmUseridStato;
    }

    @Column(name = "PG_STATO_VER_SERIE")
    public BigDecimal getPgStatoVerSerie() {
        return this.pgStatoVerSerie;
    }

    public void setPgStatoVerSerie(BigDecimal pgStatoVerSerie) {
        this.pgStatoVerSerie = pgStatoVerSerie;
    }

    @Column(name = "TI_STATO_SERIE_COR")
    public String getTiStatoSerieCor() {
        return this.tiStatoSerieCor;
    }

    public void setTiStatoSerieCor(String tiStatoSerieCor) {
        this.tiStatoSerieCor = tiStatoSerieCor;
    }

    @Id
    @Column(name = "TI_STATO_VER_SERIE")
    public String getTiStatoVerSerie() {
        return this.tiStatoVerSerie;
    }

    public void setTiStatoVerSerie(String tiStatoVerSerie) {
        this.tiStatoVerSerie = tiStatoVerSerie;
    }

    @Column(name = "TI_STATO_VER_SERIE_COR")
    public String getTiStatoVerSerieCor() {
        return this.tiStatoVerSerieCor;
    }

    public void setTiStatoVerSerieCor(String tiStatoVerSerieCor) {
        this.tiStatoVerSerieCor = tiStatoVerSerieCor;
    }

}
