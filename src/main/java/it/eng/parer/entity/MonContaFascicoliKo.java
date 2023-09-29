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
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the MON_CONTA_FASCICOLI_KO database table.
 */
@Entity
@Table(name = "MON_CONTA_FASCICOLI_KO")
@NamedQueries({ @NamedQuery(name = "MonContaFascicoliKo.findAll", query = "SELECT m FROM MonContaFascicoliKo m"),
        @NamedQuery(name = "MonContaFascicoliKo.findByChiaveTotaliz", query = "SELECT m FROM MonContaFascicoliKo m WHERE m.dtRifConta=:dtRifConta AND m.orgStrut=:orgStrut AND m.tiStatoFascicoloKo=:tiStatoFascicoloKo AND m.aaFascicolo=:aaFascicolo AND m.decTipoFascicolo=:decTipoFascicolo"),
        @NamedQuery(name = "MonContaFascicoliKo.findByChiaveTotalizIds", query = "SELECT m FROM MonContaFascicoliKo m WHERE TRUNC(m.dtRifConta)=:dtRifConta AND m.orgStrut.idStrut=:idStrut AND m.tiStatoFascicoloKo=:tiStatoFascicoloKo AND m.aaFascicolo=:aaFascicolo AND m.decTipoFascicolo.idTipoFascicolo=:idTipoFascicolo") })
public class MonContaFascicoliKo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idContaFascicoliKo;

    private BigDecimal aaFascicolo;

    private Date dtRifConta;

    private BigDecimal niFascicoliKo;

    private String tiStatoFascicoloKo;

    private DecTipoFascicolo decTipoFascicolo;

    private OrgStrut orgStrut;

    public MonContaFascicoliKo() {/* Hibernate */
    }

    @Id
    // "MON_CONTA_FASCICOLI_KO_IDCONTAFASCICOLIKO_GENERATOR",
    // sequenceName =
    // "SMON_CONTA_FASCICOLI_KO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "MON_CONTA_FASCICOLI_KO_IDCONTAFASCICOLIKO_GENERATOR")
    @Column(name = "ID_CONTA_FASCICOLI_KO")
    @GenericGenerator(name = "SMON_CONTA_FASCICOLI_KO_ID_CONTA_FASCICOLI_KO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SMON_CONTA_FASCICOLI_KO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SMON_CONTA_FASCICOLI_KO_ID_CONTA_FASCICOLI_KO_GENERATOR")
    public Long getIdContaFascicoliKo() {
        return this.idContaFascicoliKo;
    }

    public void setIdContaFascicoliKo(Long idContaFascicoliKo) {
        this.idContaFascicoliKo = idContaFascicoliKo;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Column(name = "NI_FASCICOLI_KO")
    public BigDecimal getNiFascicoliKo() {
        return this.niFascicoliKo;
    }

    public void setNiFascicoliKo(BigDecimal niFascicoliKo) {
        this.niFascicoliKo = niFascicoliKo;
    }

    @Column(name = "TI_STATO_FASCICOLO_KO")
    public String getTiStatoFascicoloKo() {
        return this.tiStatoFascicoloKo;
    }

    public void setTiStatoFascicoloKo(String tiStatoFascicoloKo) {
        this.tiStatoFascicoloKo = tiStatoFascicoloKo;
    }

    // bi-directional many-to-one association to DecTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_FASCICOLO")
    public DecTipoFascicolo getDecTipoFascicolo() {
        return this.decTipoFascicolo;
    }

    public void setDecTipoFascicolo(DecTipoFascicolo decTipoFascicolo) {
        this.decTipoFascicolo = decTipoFascicolo;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }
}
