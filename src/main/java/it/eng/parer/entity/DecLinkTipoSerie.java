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
 * The persistent class for the DEC_LINK_TIPO_SERIE database table.
 */
@Entity
@Table(name = "DEC_LINK_TIPO_SERIE")
@NamedQuery(name = "DecLinkTipoSerie.findAll", query = "SELECT d FROM DecLinkTipoSerie d")
public class DecLinkTipoSerie implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idLinkTipoSerie;

    private String dsLinkTipoSerie;

    private DecTipoSerie decTipoSeriePartenza;

    private DecTipoSerie decTipoSerieArrivo;

    public DecLinkTipoSerie() {/* Hibernate */
    }

    @Id
    // "DEC_LINK_TIPO_SERIE_IDLINKTIPOSERIE_GENERATOR",
    // sequenceName = "SDEC_LINK_TIPO_SERIE",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_LINK_TIPO_SERIE_IDLINKTIPOSERIE_GENERATOR")
    @Column(name = "ID_LINK_TIPO_SERIE")
    @GenericGenerator(name = "SDEC_LINK_TIPO_SERIE_ID_LINK_TIPO_SERIE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_LINK_TIPO_SERIE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_LINK_TIPO_SERIE_ID_LINK_TIPO_SERIE_GENERATOR")
    public Long getIdLinkTipoSerie() {
        return this.idLinkTipoSerie;
    }

    public void setIdLinkTipoSerie(Long idLinkTipoSerie) {
        this.idLinkTipoSerie = idLinkTipoSerie;
    }

    @Column(name = "DS_LINK_TIPO_SERIE")
    public String getDsLinkTipoSerie() {
        return this.dsLinkTipoSerie;
    }

    public void setDsLinkTipoSerie(String dsLinkTipoSerie) {
        this.dsLinkTipoSerie = dsLinkTipoSerie;
    }

    // bi-directional many-to-one association to DecTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE_PARTENZA")
    public DecTipoSerie getDecTipoSeriePartenza() {
        return this.decTipoSeriePartenza;
    }

    public void setDecTipoSeriePartenza(DecTipoSerie decTipoSeriePartenza) {
        this.decTipoSeriePartenza = decTipoSeriePartenza;
    }

    // bi-directional many-to-one association to DecTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE_ARRIVO")
    public DecTipoSerie getDecTipoSerieArrivo() {
        return this.decTipoSerieArrivo;
    }

    public void setDecTipoSerieArrivo(DecTipoSerie decTipoSerieArrivo) {
        this.decTipoSerieArrivo = decTipoSerieArrivo;
    }

}
