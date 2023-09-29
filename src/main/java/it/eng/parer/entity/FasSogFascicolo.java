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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the FAS_SOG_FASCICOLO database table.
 */
@Entity
@Table(name = "FAS_SOG_FASCICOLO")
@NamedQuery(name = "FasSogFascicolo.find", query = "SELECT f FROM FasSogFascicolo f WHERE f.fasFascicolo.idFascicolo = :idFascicolo")
public class FasSogFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idSogFascicolo;

    private String cdSog;

    private String dsDenomSog;

    private String nmCognSog;

    private String nmNomeSog;

    private String tiCdSog;

    private String tiRapp;

    private FasFascicolo fasFascicolo;

    private List<FasCodIdeSog> fasCodIdeSogs = new ArrayList<>();

    private List<FasIndRifSog> fasIndRifSogs = new ArrayList<>();

    public FasSogFascicolo() {/* Hibernate */
    }

    @Id
    // "FAS_SOG_FASCICOLO_IDSOGFASCICOLO_GENERATOR",
    // sequenceName = "SFAS_SOG_FASCICOLO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_SOG_FASCICOLO_IDSOGFASCICOLO_GENERATOR")
    @Column(name = "ID_SOG_FASCICOLO")
    @GenericGenerator(name = "SFAS_SOG_FASCICOLO_ID_SOG_FASCICOLO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_SOG_FASCICOLO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_SOG_FASCICOLO_ID_SOG_FASCICOLO_GENERATOR")
    public Long getIdSogFascicolo() {
        return this.idSogFascicolo;
    }

    public void setIdSogFascicolo(Long idSogFascicolo) {
        this.idSogFascicolo = idSogFascicolo;
    }

    @Column(name = "CD_SOG")
    public String getCdSog() {
        return this.cdSog;
    }

    public void setCdSog(String cdSog) {
        this.cdSog = cdSog;
    }

    @Column(name = "DS_DENOM_SOG")
    public String getDsDenomSog() {
        return this.dsDenomSog;
    }

    public void setDsDenomSog(String dsDenomSog) {
        this.dsDenomSog = dsDenomSog;
    }

    @Column(name = "NM_COGN_SOG")
    public String getNmCognSog() {
        return this.nmCognSog;
    }

    public void setNmCognSog(String nmCognSog) {
        this.nmCognSog = nmCognSog;
    }

    @Column(name = "NM_NOME_SOG")
    public String getNmNomeSog() {
        return this.nmNomeSog;
    }

    public void setNmNomeSog(String nmNomeSog) {
        this.nmNomeSog = nmNomeSog;
    }

    @Column(name = "TI_CD_SOG")
    public String getTiCdSog() {
        return this.tiCdSog;
    }

    public void setTiCdSog(String tiCdSog) {
        this.tiCdSog = tiCdSog;
    }

    @Column(name = "TI_RAPP")
    public String getTiRapp() {
        return this.tiRapp;
    }

    public void setTiRapp(String tiRapp) {
        this.tiRapp = tiRapp;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }

    // bi-directional many-to-one association to FasCodIdeSog
    @OneToMany(mappedBy = "fasSogFascicolo")
    public List<FasCodIdeSog> getFasCodIdeSogs() {
        return this.fasCodIdeSogs;
    }

    public void setFasCodIdeSogs(List<FasCodIdeSog> fasCodIdeSogs) {
        this.fasCodIdeSogs = fasCodIdeSogs;
    }

    // bi-directional many-to-one association to FasIndRifSog
    @OneToMany(mappedBy = "fasSogFascicolo")
    public List<FasIndRifSog> getFasIndRifSogs() {
        return this.fasIndRifSogs;
    }

    public void setFasIndRifSogs(List<FasIndRifSog> fasIndRifSogs) {
        this.fasIndRifSogs = fasIndRifSogs;
    }
}
