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
 * The persistent class for the SER_V_VIS_NOTA_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_V_VIS_NOTA_SERIE")
@NamedQuery(name = "SerVVisNotaSerie.findAll", query = "SELECT s FROM SerVVisNotaSerie s")
public class SerVVisNotaSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal aaSerie;
    private String cdCompositoSerie;
    private String cdVerSerie;
    private String dsNotaVerSerie;
    private String dsSerie;
    private String dsTipoNotaSerie;
    private Date dtNotaVerSerie;
    private BigDecimal idAmbiente;
    private BigDecimal idEnte;
    private BigDecimal idNotaVerSerie;
    private BigDecimal idSerie;
    private BigDecimal idStatoSerieCor;
    private BigDecimal idStatoVerSerieCor;
    private BigDecimal idStrut;
    private BigDecimal idTipoNotaSerie;
    private BigDecimal idTipoSerie;
    private BigDecimal idUserIamNota;
    private BigDecimal idVerSerie;
    private BigDecimal niOrd;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;
    private String nmTipoSerie;
    private String nmUseridNota;
    private BigDecimal pgNotaVerSerie;
    private String tiStatoSerieCor;
    private String tiStatoVerSerieCor;

    public SerVVisNotaSerie() {/* Hibernate */
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

    @Column(name = "DS_NOTA_VER_SERIE")
    public String getDsNotaVerSerie() {
        return this.dsNotaVerSerie;
    }

    public void setDsNotaVerSerie(String dsNotaVerSerie) {
        this.dsNotaVerSerie = dsNotaVerSerie;
    }

    @Column(name = "DS_SERIE")
    public String getDsSerie() {
        return this.dsSerie;
    }

    public void setDsSerie(String dsSerie) {
        this.dsSerie = dsSerie;
    }

    @Column(name = "DS_TIPO_NOTA_SERIE")
    public String getDsTipoNotaSerie() {
        return this.dsTipoNotaSerie;
    }

    public void setDsTipoNotaSerie(String dsTipoNotaSerie) {
        this.dsTipoNotaSerie = dsTipoNotaSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_NOTA_VER_SERIE")
    public Date getDtNotaVerSerie() {
        return this.dtNotaVerSerie;
    }

    public void setDtNotaVerSerie(Date dtNotaVerSerie) {
        this.dtNotaVerSerie = dtNotaVerSerie;
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

    @Id
    @Column(name = "ID_NOTA_VER_SERIE")
    public BigDecimal getIdNotaVerSerie() {
        return this.idNotaVerSerie;
    }

    public void setIdNotaVerSerie(BigDecimal idNotaVerSerie) {
        this.idNotaVerSerie = idNotaVerSerie;
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

    @Column(name = "ID_TIPO_NOTA_SERIE")
    public BigDecimal getIdTipoNotaSerie() {
        return this.idTipoNotaSerie;
    }

    public void setIdTipoNotaSerie(BigDecimal idTipoNotaSerie) {
        this.idTipoNotaSerie = idTipoNotaSerie;
    }

    @Column(name = "ID_TIPO_SERIE")
    public BigDecimal getIdTipoSerie() {
        return this.idTipoSerie;
    }

    public void setIdTipoSerie(BigDecimal idTipoSerie) {
        this.idTipoSerie = idTipoSerie;
    }

    @Column(name = "ID_USER_IAM_NOTA")
    public BigDecimal getIdUserIamNota() {
        return this.idUserIamNota;
    }

    public void setIdUserIamNota(BigDecimal idUserIamNota) {
        this.idUserIamNota = idUserIamNota;
    }

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Column(name = "NI_ORD")
    public BigDecimal getNiOrd() {
        return this.niOrd;
    }

    public void setNiOrd(BigDecimal niOrd) {
        this.niOrd = niOrd;
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

    @Column(name = "NM_USERID_NOTA")
    public String getNmUseridNota() {
        return this.nmUseridNota;
    }

    public void setNmUseridNota(String nmUseridNota) {
        this.nmUseridNota = nmUseridNota;
    }

    @Column(name = "PG_NOTA_VER_SERIE")
    public BigDecimal getPgNotaVerSerie() {
        return this.pgNotaVerSerie;
    }

    public void setPgNotaVerSerie(BigDecimal pgNotaVerSerie) {
        this.pgNotaVerSerie = pgNotaVerSerie;
    }

    @Column(name = "TI_STATO_SERIE_COR")
    public String getTiStatoSerieCor() {
        return this.tiStatoSerieCor;
    }

    public void setTiStatoSerieCor(String tiStatoSerieCor) {
        this.tiStatoSerieCor = tiStatoSerieCor;
    }

    @Column(name = "TI_STATO_VER_SERIE_COR")
    public String getTiStatoVerSerieCor() {
        return this.tiStatoVerSerieCor;
    }

    public void setTiStatoVerSerieCor(String tiStatoVerSerieCor) {
        this.tiStatoVerSerieCor = tiStatoVerSerieCor;
    }

}
