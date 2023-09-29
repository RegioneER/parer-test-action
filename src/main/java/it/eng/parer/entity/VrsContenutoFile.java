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
 * The persistent class for the VRS_CONTENUTO_FILE database table.
 */
@Entity
@Table(name = "VRS_CONTENUTO_FILE")
public class VrsContenutoFile implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idContenutoFile;

    private byte[] blContenutoFileSessione;

    private BigDecimal idStrut;

    private VrsFileSessione vrsFileSessione;

    public VrsContenutoFile() {/* Hibernate */
    }

    @Id
    // "VRS_CONTENUTO_FILE_IDCONTENUTOFILE_GENERATOR",
    // sequenceName = "SVRS_CONTENUTO_FILE",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_CONTENUTO_FILE_IDCONTENUTOFILE_GENERATOR")
    @Column(name = "ID_CONTENUTO_FILE")
    @GenericGenerator(name = "SVRS_CONTENUTO_FILE_ID_CONTENUTO_FILE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_CONTENUTO_FILE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVRS_CONTENUTO_FILE_ID_CONTENUTO_FILE_GENERATOR")
    public Long getIdContenutoFile() {
        return this.idContenutoFile;
    }

    public void setIdContenutoFile(Long idContenutoFile) {
        this.idContenutoFile = idContenutoFile;
    }

    @Lob()
    @Column(name = "BL_CONTENUTO_FILE_SESSIONE")
    public byte[] getBlContenutoFileSessione() {
        return this.blContenutoFileSessione;
    }

    public void setBlContenutoFileSessione(byte[] blContenutoFileSessione) {
        this.blContenutoFileSessione = blContenutoFileSessione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to VrsFileSessione
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILE_SESSIONE")
    public VrsFileSessione getVrsFileSessione() {
        return this.vrsFileSessione;
    }

    public void setVrsFileSessione(VrsFileSessione vrsFileSessione) {
        this.vrsFileSessione = vrsFileSessione;
    }
}
