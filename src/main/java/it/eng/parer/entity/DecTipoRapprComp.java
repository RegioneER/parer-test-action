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
import java.util.Date;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_TIPO_RAPPR_COMP database table.
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_TIPO_RAPPR_COMP")
public class DecTipoRapprComp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idTipoRapprComp;

    private String dsTipoRapprComp;

    private Date dtIstituz;

    private Date dtSoppres;

    private String nmTipoRapprComp;

    private List<AroCompDoc> aroCompDocs = new ArrayList<>();

    private OrgStrut orgStrut;

    private String tiAlgoRappr;

    private String tiOutputRappr;

    private List<DecTipoRapprAmmesso> decTipoRapprAmmessos = new ArrayList<>();

    private DecFormatoFileDoc decFormatoFileDocCont;

    private DecFormatoFileDoc decFormatoFileDocConv;

    private DecFormatoFileStandard decFormatoFileStandard;

    private List<DecTrasformTipoRappr> decTrasformTipoRapprs = new ArrayList<>();

    public DecTipoRapprComp() {/* Hibernate */
    }

    @Id
    // "DEC_TIPO_RAPPR_COMP_IDTIPORAPPRCOMP_GENERATOR",
    // sequenceName = "SDEC_TIPO_RAPPR_COMP",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_RAPPR_COMP_IDTIPORAPPRCOMP_GENERATOR")
    @Column(name = "ID_TIPO_RAPPR_COMP")
    @XmlID
    @GenericGenerator(name = "SDEC_TIPO_RAPPR_COMP_ID_TIPO_RAPPR_COMP_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_TIPO_RAPPR_COMP"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_TIPO_RAPPR_COMP_ID_TIPO_RAPPR_COMP_GENERATOR")
    public Long getIdTipoRapprComp() {
        return this.idTipoRapprComp;
    }

    public void setIdTipoRapprComp(Long idTipoRapprComp) {
        this.idTipoRapprComp = idTipoRapprComp;
    }

    @Column(name = "DS_TIPO_RAPPR_COMP")
    public String getDsTipoRapprComp() {
        return this.dsTipoRapprComp;
    }

    public void setDsTipoRapprComp(String dsTipoRapprComp) {
        this.dsTipoRapprComp = dsTipoRapprComp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ISTITUZ")
    public Date getDtIstituz() {
        return this.dtIstituz;
    }

    public void setDtIstituz(Date dtIstituz) {
        this.dtIstituz = dtIstituz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SOPPRES")
    public Date getDtSoppres() {
        return this.dtSoppres;
    }

    public void setDtSoppres(Date dtSoppres) {
        this.dtSoppres = dtSoppres;
    }

    @Column(name = "NM_TIPO_RAPPR_COMP")
    public String getNmTipoRapprComp() {
        return this.nmTipoRapprComp;
    }

    public void setNmTipoRapprComp(String nmTipoRapprComp) {
        this.nmTipoRapprComp = nmTipoRapprComp;
    }

    // bi-directional many-to-one association to AroCompDoc
    @OneToMany(mappedBy = "decTipoRapprComp")
    @XmlTransient
    public List<AroCompDoc> getAroCompDocs() {
        return this.aroCompDocs;
    }

    public void setAroCompDocs(List<AroCompDoc> aroCompDocs) {
        this.aroCompDocs = aroCompDocs;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "decTipoRapprComps")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    @Column(name = "TI_ALGO_RAPPR")
    public String getTiAlgoRappr() {
        return this.tiAlgoRappr;
    }

    public void setTiAlgoRappr(String tiAlgoRappr) {
        this.tiAlgoRappr = tiAlgoRappr;
    }

    @Column(name = "TI_OUTPUT_RAPPR")
    public String getTiOutputRappr() {
        return this.tiOutputRappr;
    }

    public void setTiOutputRappr(String tiOutputRappr) {
        this.tiOutputRappr = tiOutputRappr;
    }

    // bi-directional many-to-one association to DecFormatoFileDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_CONTENUTO")
    @XmlInverseReference(mappedBy = "decTipoRapprCompConts")
    public DecFormatoFileDoc getDecFormatoFileDocCont() {
        return this.decFormatoFileDocCont;
    }

    public void setDecFormatoFileDocCont(DecFormatoFileDoc decFormatoFileDoc) {
        this.decFormatoFileDocCont = decFormatoFileDoc;
    }

    // bi-directional many-to-one association to DecFormatoFileDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_CONVERTIT")
    @XmlInverseReference(mappedBy = "decTipoRapprCompConvs")
    public DecFormatoFileDoc getDecFormatoFileDocConv() {
        return this.decFormatoFileDocConv;
    }

    public void setDecFormatoFileDocConv(DecFormatoFileDoc decFormatoFileDoc) {
        this.decFormatoFileDocConv = decFormatoFileDoc;
    }

    // bi-directional many-to-one association to DecFormatoFileStandard
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_OUTPUT_RAPPR")
    public // @XmlInverseReference(mappedBy = "decTipoRapprComps")
    DecFormatoFileStandard getDecFormatoFileStandard() {
        return this.decFormatoFileStandard;
    }

    public void setDecFormatoFileStandard(DecFormatoFileStandard decFormatoFileStandard) {
        this.decFormatoFileStandard = decFormatoFileStandard;
    }

    // bi-directional many-to-one association to DecTrasformTipoRappr
    @OneToMany(mappedBy = "decTipoRapprComp", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlTransient
    public // @XmlInverseReference(mappedBy = "decTipoRapprComps")
    List<DecTrasformTipoRappr> getDecTrasformTipoRapprs() {
        return this.decTrasformTipoRapprs;
    }

    public void setDecTrasformTipoRapprs(List<DecTrasformTipoRappr> decTrasformTipoRapprs) {
        this.decTrasformTipoRapprs = decTrasformTipoRapprs;
    }

    // bi-directional many-to-one association to DecTipoRapprAmmesso
    @OneToMany(mappedBy = "decTipoRapprComp", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlIDREF
    public List<DecTipoRapprAmmesso> getDecTipoRapprAmmessos() {
        return this.decTipoRapprAmmessos;
    }

    public void setDecTipoRapprAmmessos(List<DecTipoRapprAmmesso> decTipoRapprAmmessos) {
        this.decTipoRapprAmmessos = decTipoRapprAmmessos;
    }
}
