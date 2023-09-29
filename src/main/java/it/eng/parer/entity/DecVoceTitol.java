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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_VOCE_TITOL database table.
 */
@Entity
@Table(name = "DEC_VOCE_TITOL")
public class DecVoceTitol implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idVoceTitol;

    private String cdCompositoVoceTitol;

    private String cdVoceTitol;

    private Date dtIstituz;

    private Date dtSoppres;

    private BigDecimal niFascic;

    private BigDecimal niFascicVociFiglie;

    private BigDecimal niOrdVoceTitol;
    private List<DecValVoceTitol> decValVoceTitols = new ArrayList<DecValVoceTitol>();
    private DecLivelloTitol decLivelloTitol;

    private DecTitol decTitol;

    private DecVoceTitol decVoceTitol;
    private List<DecVoceTitol> decVoceTitols = new ArrayList<DecVoceTitol>();
    private List<OrgOperVoceTitol> orgOperVoceTitols = new ArrayList<OrgOperVoceTitol>();

    public DecVoceTitol() {/* Hibernate */
    }

    @Id
    // "DEC_VOCE_TITOL_IDVOCETITOL_GENERATOR",
    // sequenceName = "SDEC_VOCE_TITOL", allocationSize
    // = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_VOCE_TITOL_IDVOCETITOL_GENERATOR")
    @Column(name = "ID_VOCE_TITOL")
    @GenericGenerator(name = "SDEC_VOCE_TITOL_ID_VOCE_TITOL_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_VOCE_TITOL"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_VOCE_TITOL_ID_VOCE_TITOL_GENERATOR")
    public Long getIdVoceTitol() {
        return this.idVoceTitol;
    }

    public void setIdVoceTitol(Long idVoceTitol) {
        this.idVoceTitol = idVoceTitol;
    }

    @Column(name = "CD_COMPOSITO_VOCE_TITOL")
    public String getCdCompositoVoceTitol() {
        return this.cdCompositoVoceTitol;
    }

    public void setCdCompositoVoceTitol(String cdCompositoVoceTitol) {
        this.cdCompositoVoceTitol = cdCompositoVoceTitol;
    }

    @Column(name = "CD_VOCE_TITOL")
    public String getCdVoceTitol() {
        return this.cdVoceTitol;
    }

    public void setCdVoceTitol(String cdVoceTitol) {
        this.cdVoceTitol = cdVoceTitol;
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

    @Column(name = "NI_FASCIC")
    public BigDecimal getNiFascic() {
        return this.niFascic;
    }

    public void setNiFascic(BigDecimal niFascic) {
        this.niFascic = niFascic;
    }

    @Column(name = "NI_FASCIC_VOCI_FIGLIE")
    public BigDecimal getNiFascicVociFiglie() {
        return this.niFascicVociFiglie;
    }

    public void setNiFascicVociFiglie(BigDecimal niFascicVociFiglie) {
        this.niFascicVociFiglie = niFascicVociFiglie;
    }

    @Column(name = "NI_ORD_VOCE_TITOL")
    public BigDecimal getNiOrdVoceTitol() {
        return this.niOrdVoceTitol;
    }

    public void setNiOrdVoceTitol(BigDecimal niOrdVoceTitol) {
        this.niOrdVoceTitol = niOrdVoceTitol;
    }

    // bi-directional many-to-one association to DecValVoceTitol
    @OneToMany(mappedBy = "decVoceTitol", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    public List<DecValVoceTitol> getDecValVoceTitols() {
        return this.decValVoceTitols;
    }

    public void setDecValVoceTitols(List<DecValVoceTitol> decValVoceTitols) {
        this.decValVoceTitols = decValVoceTitols;
    }

    public DecValVoceTitol addDecValVoceTitol(DecValVoceTitol decValVoceTitol) {
        getDecValVoceTitols().add(decValVoceTitol);
        decValVoceTitol.setDecVoceTitol(this);
        return decValVoceTitol;
    }

    public DecValVoceTitol removeDecValVoceTitol(DecValVoceTitol decValVoceTitol) {
        getDecValVoceTitols().remove(decValVoceTitol);
        decValVoceTitol.setDecVoceTitol(null);
        return decValVoceTitol;
    }

    // bi-directional many-to-one association to DecLivelloTitol
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LIVELLO_TITOL")
    public DecLivelloTitol getDecLivelloTitol() {
        return this.decLivelloTitol;
    }

    public void setDecLivelloTitol(DecLivelloTitol decLivelloTitol) {
        this.decLivelloTitol = decLivelloTitol;
    }

    // bi-directional many-to-one association to DecTitol
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TITOL")
    public DecTitol getDecTitol() {
        return this.decTitol;
    }

    public void setDecTitol(DecTitol decTitol) {
        this.decTitol = decTitol;
    }

    // bi-directional many-to-one association to DecVoceTitol
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VOCE_TITOL_PADRE")
    public DecVoceTitol getDecVoceTitol() {
        return this.decVoceTitol;
    }

    public void setDecVoceTitol(DecVoceTitol decVoceTitol) {
        this.decVoceTitol = decVoceTitol;
    }

    // bi-directional many-to-one association to DecVoceTitol
    @OneToMany(mappedBy = "decVoceTitol")
    public List<DecVoceTitol> getDecVoceTitols() {
        return this.decVoceTitols;
    }

    public void setDecVoceTitols(List<DecVoceTitol> decVoceTitols) {
        this.decVoceTitols = decVoceTitols;
    }

    public DecVoceTitol addDecVoceTitol(DecVoceTitol decVoceTitol) {
        getDecVoceTitols().add(decVoceTitol);
        decVoceTitol.setDecVoceTitol(this);
        return decVoceTitol;
    }

    public DecVoceTitol removeDecVoceTitol(DecVoceTitol decVoceTitol) {
        getDecVoceTitols().remove(decVoceTitol);
        decVoceTitol.setDecVoceTitol(null);
        return decVoceTitol;
    }

    // bi-directional many-to-one association to OrgOperVoceTitol
    @OneToMany(mappedBy = "decVoceTitol", cascade = { CascadeType.PERSIST })
    public List<OrgOperVoceTitol> getOrgOperVoceTitols() {
        return this.orgOperVoceTitols;
    }

    public void setOrgOperVoceTitols(List<OrgOperVoceTitol> orgOperVoceTitols) {
        this.orgOperVoceTitols = orgOperVoceTitols;
    }

    public OrgOperVoceTitol addOrgOperVoceTitol(OrgOperVoceTitol orgOperVoceTitol) {
        getOrgOperVoceTitols().add(orgOperVoceTitol);
        orgOperVoceTitol.setDecVoceTitol(this);
        return orgOperVoceTitol;
    }

    public OrgOperVoceTitol removeOrgOperVoceTitol(OrgOperVoceTitol orgOperVoceTitol) {
        getOrgOperVoceTitols().remove(orgOperVoceTitol);
        orgOperVoceTitol.setDecVoceTitol(null);
        return orgOperVoceTitol;
    }

}
