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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the PROVA_SECUREFILE database table.
 */
// @Entity
// @Table(name = "PROVA_SECUREFILE")
public class ProvaSecurefile implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idRec;

    private byte[] blRec;

    public ProvaSecurefile() {/* Hibernate */
    }

    @Id
    // "PROVA_SECUREFILE_GENERATOR", sequenceName =
    // "SPROVA_SECUREFILE", allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROVA_SECUREFILE_GENERATOR")
    @Column(name = "ID_REC")
    @GenericGenerator(name = "SPROVA_SECUREFILE_ID_REC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SPROVA_SECUREFILE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SPROVA_SECUREFILE_ID_REC_GENERATOR")
    public Long getIdRec() {
        return this.idRec;
    }

    public void setIdRec(Long idRec) {
        this.idRec = idRec;
    }

    @Lob()
    @Column(name = "BL_REC")
    public byte[] getBlRec() {
        return this.blRec;
    }

    public void setBlRec(byte[] blRec) {
        this.blRec = blRec;
    }
}
