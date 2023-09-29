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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the SER_LINK_SERIE database table.
 */
@Entity
@Table(name = "SER_LINK_SERIE")
@NamedQuery(name = "SerLinkSerie.findAll", query = "SELECT s FROM SerLinkSerie s")
public class SerLinkSerie implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idLinkSerie;

    private BigDecimal aaSerieArrivo;

    private String cdCompositoSerieArrivo;

    private String dsLinkSerie;

    private BigDecimal idStrutArrivo;

    private SerSerie serSeriePartenza;

    private SerSerie serSerieArrivo;

    public SerLinkSerie() {/* Hibernate */
    }

    @Id
    // "SER_LINK_SERIE_IDLINKSERIE_GENERATOR",
    // sequenceName = "SSER_LINK_SERIE", allocationSize
    // = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_LINK_SERIE_IDLINKSERIE_GENERATOR")
    @Column(name = "ID_LINK_SERIE")
    @GenericGenerator(name = "SSER_LINK_SERIE_ID_LINK_SERIE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SSER_LINK_SERIE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SSER_LINK_SERIE_ID_LINK_SERIE_GENERATOR")
    public Long getIdLinkSerie() {
        return this.idLinkSerie;
    }

    public void setIdLinkSerie(Long idLinkSerie) {
        this.idLinkSerie = idLinkSerie;
    }

    @Column(name = "AA_SERIE_ARRIVO")
    public BigDecimal getAaSerieArrivo() {
        return this.aaSerieArrivo;
    }

    public void setAaSerieArrivo(BigDecimal aaSerieArrivo) {
        this.aaSerieArrivo = aaSerieArrivo;
    }

    @Column(name = "CD_COMPOSITO_SERIE_ARRIVO")
    public String getCdCompositoSerieArrivo() {
        return this.cdCompositoSerieArrivo;
    }

    public void setCdCompositoSerieArrivo(String cdCompositoSerieArrivo) {
        this.cdCompositoSerieArrivo = cdCompositoSerieArrivo;
    }

    @Column(name = "DS_LINK_SERIE")
    public String getDsLinkSerie() {
        return this.dsLinkSerie;
    }

    public void setDsLinkSerie(String dsLinkSerie) {
        this.dsLinkSerie = dsLinkSerie;
    }

    @Column(name = "ID_STRUT_ARRIVO")
    public BigDecimal getIdStrutArrivo() {
        return this.idStrutArrivo;
    }

    public void setIdStrutArrivo(BigDecimal idStrutArrivo) {
        this.idStrutArrivo = idStrutArrivo;
    }

    // bi-directional many-to-one association to SerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SERIE_PARTENZA")
    public SerSerie getSerSeriePartenza() {
        return this.serSeriePartenza;
    }

    public void setSerSeriePartenza(SerSerie serSeriePartenza) {
        this.serSeriePartenza = serSeriePartenza;
    }

    // bi-directional many-to-one association to SerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SERIE_ARRIVO")
    public SerSerie getSerSerieArrivo() {
        return this.serSerieArrivo;
    }

    public void setSerSerieArrivo(SerSerie serSerieArrivo) {
        this.serSerieArrivo = serSerieArrivo;
    }

}
