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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_CONTENUTO_COMP database table.
 */
@Entity
@Table(name = "ARO_CONTENUTO_COMP")
public class AroContenutoComp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idContenComp;

    private BigDecimal aaKeyUnitaDoc;

    private byte[] blContenComp;

    private BigDecimal idStrut;

    private AroCompDoc aroCompDoc;

    private BigDecimal mmVers;

    public AroContenutoComp() {/* Hibernate */
    }

    @Id
    // "ARO_CONTENUTO_COMP_IDCONTENCOMP_GENERATOR",
    // sequenceName = "SARO_CONTENUTO_COMP",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_CONTENUTO_COMP_IDCONTENCOMP_GENERATOR")
    @Column(name = "ID_CONTEN_COMP")
    @GenericGenerator(name = "SARO_CONTENUTO_COMP_ID_CONTEN_COMP_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_CONTENUTO_COMP"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_CONTENUTO_COMP_ID_CONTEN_COMP_GENERATOR")
    public Long getIdContenComp() {
        return this.idContenComp;
    }

    public void setIdContenComp(Long idContenComp) {
        this.idContenComp = idContenComp;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Lob()
    @Column(name = "BL_CONTEN_COMP")
    public byte[] getBlContenComp() {
        return this.blContenComp;
    }

    public void setBlContenComp(byte[] blContenComp) {
        this.blContenComp = blContenComp;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "MM_VERS")
    public BigDecimal getMmVers() {
        return this.mmVers;
    }

    public void setMmVers(BigDecimal mmVers) {
        this.mmVers = mmVers;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_STRUT_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }
}
