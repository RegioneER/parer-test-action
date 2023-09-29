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
 * The persistent class for the VRS_FILE_NOARK_PATH_DT_VERS database table.
 */
@Entity
@Table(name = "VRS_FILE_NOARK_PATH_DT_VERS")
public class VrsFileNoarkPathDtVers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFileNoArkPathDtVers;

    private String dsFileNoark;

    private String tiArkFileNoark;

    private VrsPathDtVers vrsPathDtVers;

    public VrsFileNoarkPathDtVers() {/* Hibernate */
    }

    @Id
    // "VRS_FILE_NOARK_PATH_DT_VERS_IDFILENOARKPATHDTVERS_GENERATOR",
    // sequenceName =
    // "SVRS_FILE_NOARK_PATH_DT_VERS",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VRS_FILE_NOARK_PATH_DT_VERS_IDFILENOARKPATHDTVERS_GENERATOR")
    @Column(name = "ID_FILE_NO_ARK_PATH_DT_VERS")
    @GenericGenerator(name = "SVRS_FILE_NOARK_PATH_DT_VERS_ID_FILE_NO_ARK_PATH_DT_VERS_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_FILE_NOARK_PATH_DT_VERS"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVRS_FILE_NOARK_PATH_DT_VERS_ID_FILE_NO_ARK_PATH_DT_VERS_GENERATOR")
    public Long getIdFileNoArkPathDtVers() {
        return this.idFileNoArkPathDtVers;
    }

    public void setIdFileNoArkPathDtVers(Long idFileNoArkPathDtVers) {
        this.idFileNoArkPathDtVers = idFileNoArkPathDtVers;
    }

    @Column(name = "DS_FILE_NOARK")
    public String getDsFileNoark() {
        return this.dsFileNoark;
    }

    public void setDsFileNoark(String dsFileNoark) {
        this.dsFileNoark = dsFileNoark;
    }

    @Column(name = "TI_ARK_FILE_NOARK")
    public String getTiArkFileNoark() {
        return this.tiArkFileNoark;
    }

    public void setTiArkFileNoark(String tiArkFileNoark) {
        this.tiArkFileNoark = tiArkFileNoark;
    }

    // bi-directional many-to-one association to VrsPathDtVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PATH_DT_VERS")
    public VrsPathDtVers getVrsPathDtVers() {
        return this.vrsPathDtVers;
    }

    public void setVrsPathDtVers(VrsPathDtVers vrsPathDtVers) {
        this.vrsPathDtVers = vrsPathDtVers;
    }

}
