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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VRS_SESSIONE_VERS_SOSP database table.
 */
@Entity
@Table(name = "VRS_SESSIONE_VERS_SOSP")
public class VrsSessioneVersSosp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idSessioneVersSosp;

    private BigDecimal idStrut;

    private VrsSessioneVers vrsSessioneVers;

    public VrsSessioneVersSosp() {/* Hibernate */
    }

    @Id
    // "VRS_SESSIONE_VERS_SOSP_IDSESSIONEVERSSOSP_GENERATOR",
    // sequenceName =
    // "SVRS_SESSIONE_VERS_SOSP",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VRS_SESSIONE_VERS_SOSP_IDSESSIONEVERSSOSP_GENERATOR")
    @Column(name = "ID_SESSIONE_VERS_SOSP")
    @GenericGenerator(name = "SVRS_SESSIONE_VERS_SOSP_ID_SESSIONE_VERS_SOSP_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_SESSIONE_VERS_SOSP"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVRS_SESSIONE_VERS_SOSP_ID_SESSIONE_VERS_SOSP_GENERATOR")
    public Long getIdSessioneVersSosp() {
        return this.idSessioneVersSosp;
    }

    public void setIdSessioneVersSosp(Long idSessioneVersSosp) {
        this.idSessioneVersSosp = idSessioneVersSosp;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to VrsSessioneVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SESSIONE_VERS")
    public VrsSessioneVers getVrsSessioneVers() {
        return this.vrsSessioneVers;
    }

    public void setVrsSessioneVers(VrsSessioneVers vrsSessioneVers) {
        this.vrsSessioneVers = vrsSessioneVers;
    }

}
