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

package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_V_LIS_USO_FMT_FILE_STD database table.
 * 
 */
@Entity
@Table(name = "DEC_V_LIS_USO_FMT_FILE_STD")
public class DecVLisUsoFmtFileStd implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idFormatoFileDoc;
    private BigDecimal idFormatoFileStandard;
    private BigDecimal idUsoFormatoFileAmmesso;
    private BigDecimal niOrdUso;
    private String nmFormatoFileDoc;
    private String nmFormatoFileStandard;

    public DecVLisUsoFmtFileStd() {/* Hibernate */
    }

    @Column(name = "ID_FORMATO_FILE_DOC")
    public BigDecimal getIdFormatoFileDoc() {
        return this.idFormatoFileDoc;
    }

    public void setIdFormatoFileDoc(BigDecimal idFormatoFileDoc) {
        this.idFormatoFileDoc = idFormatoFileDoc;
    }

    @Column(name = "ID_FORMATO_FILE_STANDARD")
    public BigDecimal getIdFormatoFileStandard() {
        return this.idFormatoFileStandard;
    }

    public void setIdFormatoFileStandard(BigDecimal idFormatoFileStandard) {
        this.idFormatoFileStandard = idFormatoFileStandard;
    }

    @Id
    @Column(name = "ID_USO_FORMATO_FILE_AMMESSO")
    public BigDecimal getIdUsoFormatoFileAmmesso() {
        return this.idUsoFormatoFileAmmesso;
    }

    public void setIdUsoFormatoFileAmmesso(BigDecimal idUsoFormatoFileAmmesso) {
        this.idUsoFormatoFileAmmesso = idUsoFormatoFileAmmesso;
    }

    @Column(name = "NI_ORD_USO")
    public BigDecimal getNiOrdUso() {
        return this.niOrdUso;
    }

    public void setNiOrdUso(BigDecimal niOrdUso) {
        this.niOrdUso = niOrdUso;
    }

    @Column(name = "NM_FORMATO_FILE_DOC")
    public String getNmFormatoFileDoc() {
        return this.nmFormatoFileDoc;
    }

    public void setNmFormatoFileDoc(String nmFormatoFileDoc) {
        this.nmFormatoFileDoc = nmFormatoFileDoc;
    }

    @Column(name = "NM_FORMATO_FILE_STANDARD")
    public String getNmFormatoFileStandard() {
        return this.nmFormatoFileStandard;
    }

    public void setNmFormatoFileStandard(String nmFormatoFileStandard) {
        this.nmFormatoFileStandard = nmFormatoFileStandard;
    }

}
