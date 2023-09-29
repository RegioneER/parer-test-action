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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the IAM_ENTE_CONVENZ_DA_ALLINEA database table.
 */
@Entity
@Table(name = "IAM_ENTE_CONVENZ_DA_ALLINEA")
public class IamEnteConvenzDaAllinea implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idEnteConvenzDaAllinea;

    private String cdErr;

    private String dsMsgErr;

    private Date dtErr;

    private Date dtLogEnteConvenzDaAllinea;

    private BigDecimal idEnteConvenz;

    private String nmEnteConvenz;

    private String tiOperAllinea;

    private String tiStatoAllinea;

    public IamEnteConvenzDaAllinea() {/* Hibernate */
    }

    @Id
    // "IAM_ENTE_CONVENZ_DA_ALLINEA_IDENTECONVENZDAALLINEA_GENERATOR",
    // sequenceName =
    // "SIAM_ENTE_CONVENZ_DA_ALLINEA",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "IAM_ENTE_CONVENZ_DA_ALLINEA_IDENTECONVENZDAALLINEA_GENERATOR")
    @Column(name = "ID_ENTE_CONVENZ_DA_ALLINEA")
    @GenericGenerator(name = "SIAM_ENTE_CONVENZ_DA_ALLINEA_ID_ENTE_CONVENZ_DA_ALLINEA_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SIAM_ENTE_CONVENZ_DA_ALLINEA"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIAM_ENTE_CONVENZ_DA_ALLINEA_ID_ENTE_CONVENZ_DA_ALLINEA_GENERATOR")
    public Long getIdEnteConvenzDaAllinea() {
        return this.idEnteConvenzDaAllinea;
    }

    public void setIdEnteConvenzDaAllinea(Long idEnteConvenzDaAllinea) {
        this.idEnteConvenzDaAllinea = idEnteConvenzDaAllinea;
    }

    @Column(name = "CD_ERR")
    public String getCdErr() {
        return this.cdErr;
    }

    public void setCdErr(String cdErr) {
        this.cdErr = cdErr;
    }

    @Column(name = "DS_MSG_ERR")
    public String getDsMsgErr() {
        return this.dsMsgErr;
    }

    public void setDsMsgErr(String dsMsgErr) {
        this.dsMsgErr = dsMsgErr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ERR")
    public Date getDtErr() {
        return this.dtErr;
    }

    public void setDtErr(Date dtErr) {
        this.dtErr = dtErr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LOG_ENTE_CONVENZ_DA_ALLINEA")
    public Date getDtLogEnteConvenzDaAllinea() {
        return this.dtLogEnteConvenzDaAllinea;
    }

    public void setDtLogEnteConvenzDaAllinea(Date dtLogEnteConvenzDaAllinea) {
        this.dtLogEnteConvenzDaAllinea = dtLogEnteConvenzDaAllinea;
    }

    @Column(name = "ID_ENTE_CONVENZ")
    public BigDecimal getIdEnteConvenz() {
        return this.idEnteConvenz;
    }

    public void setIdEnteConvenz(BigDecimal idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

    @Column(name = "NM_ENTE_CONVENZ")
    public String getNmEnteConvenz() {
        return this.nmEnteConvenz;
    }

    public void setNmEnteConvenz(String nmEnteConvenz) {
        this.nmEnteConvenz = nmEnteConvenz;
    }

    @Column(name = "TI_OPER_ALLINEA")
    public String getTiOperAllinea() {
        return this.tiOperAllinea;
    }

    public void setTiOperAllinea(String tiOperAllinea) {
        this.tiOperAllinea = tiOperAllinea;
    }

    @Column(name = "TI_STATO_ALLINEA")
    public String getTiStatoAllinea() {
        return this.tiStatoAllinea;
    }

    public void setTiStatoAllinea(String tiStatoAllinea) {
        this.tiStatoAllinea = tiStatoAllinea;
    }
}
