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
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ORG_CATEG_STRUT database table.
 */
@Entity
@Table(name = "ORG_CATEG_STRUT")
public class OrgCategStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idCategStrut;

    private String cdCategStrut;

    private String dsCategStrut;

    private List<OrgStrut> orgStruts = new ArrayList<>();

    public OrgCategStrut() {/* Hibernate */
    }

    @Id
    // "ORG_CATEG_STRUT_IDCATEGSTRUT_GENERATOR",
    // sequenceName = "SORG_CATEG_STRUT",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_CATEG_STRUT_IDCATEGSTRUT_GENERATOR")
    @Column(name = "ID_CATEG_STRUT")
    @GenericGenerator(name = "SORG_CATEG_STRUT_ID_CATEG_STRUT_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SORG_CATEG_STRUT"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SORG_CATEG_STRUT_ID_CATEG_STRUT_GENERATOR")
    public Long getIdCategStrut() {
        return this.idCategStrut;
    }

    public void setIdCategStrut(Long idCategStrut) {
        this.idCategStrut = idCategStrut;
    }

    @Column(name = "CD_CATEG_STRUT")
    public String getCdCategStrut() {
        return this.cdCategStrut;
    }

    public void setCdCategStrut(String cdCategStrut) {
        this.cdCategStrut = cdCategStrut;
    }

    @Column(name = "DS_CATEG_STRUT")
    public String getDsCategStrut() {
        return this.dsCategStrut;
    }

    public void setDsCategStrut(String dsCategStrut) {
        this.dsCategStrut = dsCategStrut;
    }

    // bi-directional many-to-one association to OrgStrut
    @OneToMany(mappedBy = "orgCategStrut")
    @XmlTransient
    public List<OrgStrut> getOrgStruts() {
        return this.orgStruts;
    }

    public void setOrgStruts(List<OrgStrut> orgStruts) {
        this.orgStruts = orgStruts;
    }
}
