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
import java.util.List;

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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VRS_FILE_SESSIONE database table.
 */
@Entity
@Table(name = "VRS_FILE_SESSIONE")
public class VrsFileSessione implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFileSessione;

    private BigDecimal idStrut;

    private String nmFileSessione;

    private BigDecimal pgFileSessione;

    private String tiStatoFileSessione;

    private List<VrsContenutoFile> vrsContenutoFiles = new ArrayList<>();

    private List<VrsFileSesObjectStorage> fileSesObjectStorages = new ArrayList<>();

    private VrsDatiSessioneVers vrsDatiSessioneVers;

    public VrsFileSessione() {/* Hibernate */
    }

    @Id
    // "VRS_FILE_SESSIONE_IDFILESESSIONE_GENERATOR",
    // sequenceName = "SVRS_FILE_SESSIONE",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VRS_FILE_SESSIONE_IDFILESESSIONE_GENERATOR")
    @Column(name = "ID_FILE_SESSIONE")
    @GenericGenerator(name = "SVRS_FILE_SESSIONE_ID_FILE_SESSIONE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_FILE_SESSIONE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVRS_FILE_SESSIONE_ID_FILE_SESSIONE_GENERATOR")
    public Long getIdFileSessione() {
        return this.idFileSessione;
    }

    public void setIdFileSessione(Long idFileSessione) {
        this.idFileSessione = idFileSessione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NM_FILE_SESSIONE")
    public String getNmFileSessione() {
        return this.nmFileSessione;
    }

    public void setNmFileSessione(String nmFileSessione) {
        this.nmFileSessione = nmFileSessione;
    }

    @Column(name = "PG_FILE_SESSIONE")
    public BigDecimal getPgFileSessione() {
        return this.pgFileSessione;
    }

    public void setPgFileSessione(BigDecimal pgFileSessione) {
        this.pgFileSessione = pgFileSessione;
    }

    @Column(name = "TI_STATO_FILE_SESSIONE")
    public String getTiStatoFileSessione() {
        return this.tiStatoFileSessione;
    }

    public void setTiStatoFileSessione(String tiStatoFileSessione) {
        this.tiStatoFileSessione = tiStatoFileSessione;
    }

    // bi-directional many-to-one association to VrsContenutoFile
    @OneToMany(mappedBy = "vrsFileSessione")
    public List<VrsContenutoFile> getVrsContenutoFiles() {
        return this.vrsContenutoFiles;
    }

    public void setVrsContenutoFiles(List<VrsContenutoFile> vrsContenutoFiles) {
        this.vrsContenutoFiles = vrsContenutoFiles;
    }

    // bi-directional many-to-one association to VrsDatiSessioneVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATI_SESSIONE_VERS")
    public VrsDatiSessioneVers getVrsDatiSessioneVers() {
        return this.vrsDatiSessioneVers;
    }

    public void setVrsDatiSessioneVers(VrsDatiSessioneVers vrsDatiSessioneVers) {
        this.vrsDatiSessioneVers = vrsDatiSessioneVers;
    }

    @OneToMany(mappedBy = "fileSessione")
    public List<VrsFileSesObjectStorage> getFileSesObjectStorages() {
        return fileSesObjectStorages;
    }

    public void setFileSesObjectStorages(List<VrsFileSesObjectStorage> fileSesObjectStorages) {
        this.fileSesObjectStorages = fileSesObjectStorages;
    }

}
