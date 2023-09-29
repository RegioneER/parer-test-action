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
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ORG_V_CHK_STRUT_PARTITION_UPD database table.
 *
 */
@Entity
@Table(name = "ORG_V_CHK_STRUT_PARTITION_UPD")
@NamedQuery(name = "OrgVChkStrutPartitionUpd.findAll", query = "SELECT o FROM OrgVChkStrutPartitionUpd o")
public class OrgVChkStrutPartitionUpd implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdPartitionSesupderr;
    private String cdPartitionSesupdko;
    private String cdPartitionUpddatispec;
    private String cdPartitionUpdko;
    private String cdPartitionVersinidatispec;
    private String cdPartitionXmlsesupdko;
    private String cdPartitionXmlupd;
    private String flPartOk;
    private String flPartSesupderrOk;
    private String flPartSesupdkoAaOk;
    private String flPartSesupdkoOk;
    private String flPartUpddatispecAaOk;
    private String flPartUpddatispecOk;
    private String flPartUpdkoAaOk;
    private String flPartUpdkoOk;
    private String flPartVersinidatispecAaOk;
    private String flPartVersinidatispecOk;
    private String flPartXmlsesupdkoAaOk;
    private String flPartXmlsesupdkoOk;
    private String flPartXmlupdAaOk;
    private String flPartXmlupdOk;
    private BigDecimal idStrut;

    public OrgVChkStrutPartitionUpd() {/* Hibernate */
    }

    @Column(name = "CD_PARTITION_SESUPDERR")
    public String getCdPartitionSesupderr() {
        return this.cdPartitionSesupderr;
    }

    public void setCdPartitionSesupderr(String cdPartitionSesupderr) {
        this.cdPartitionSesupderr = cdPartitionSesupderr;
    }

    @Column(name = "CD_PARTITION_SESUPDKO")
    public String getCdPartitionSesupdko() {
        return this.cdPartitionSesupdko;
    }

    public void setCdPartitionSesupdko(String cdPartitionSesupdko) {
        this.cdPartitionSesupdko = cdPartitionSesupdko;
    }

    @Column(name = "CD_PARTITION_UPDDATISPEC")
    public String getCdPartitionUpddatispec() {
        return this.cdPartitionUpddatispec;
    }

    public void setCdPartitionUpddatispec(String cdPartitionUpddatispec) {
        this.cdPartitionUpddatispec = cdPartitionUpddatispec;
    }

    @Column(name = "CD_PARTITION_UPDKO")
    public String getCdPartitionUpdko() {
        return this.cdPartitionUpdko;
    }

    public void setCdPartitionUpdko(String cdPartitionUpdko) {
        this.cdPartitionUpdko = cdPartitionUpdko;
    }

    @Column(name = "CD_PARTITION_VERSINIDATISPEC")
    public String getCdPartitionVersinidatispec() {
        return this.cdPartitionVersinidatispec;
    }

    public void setCdPartitionVersinidatispec(String cdPartitionVersinidatispec) {
        this.cdPartitionVersinidatispec = cdPartitionVersinidatispec;
    }

    @Column(name = "CD_PARTITION_XMLSESUPDKO")
    public String getCdPartitionXmlsesupdko() {
        return this.cdPartitionXmlsesupdko;
    }

    public void setCdPartitionXmlsesupdko(String cdPartitionXmlsesupdko) {
        this.cdPartitionXmlsesupdko = cdPartitionXmlsesupdko;
    }

    @Column(name = "CD_PARTITION_XMLUPD")
    public String getCdPartitionXmlupd() {
        return this.cdPartitionXmlupd;
    }

    public void setCdPartitionXmlupd(String cdPartitionXmlupd) {
        this.cdPartitionXmlupd = cdPartitionXmlupd;
    }

    @Column(name = "FL_PART_OK", columnDefinition = "char")
    public String getFlPartOk() {
        return this.flPartOk;
    }

    public void setFlPartOk(String flPartOk) {
        this.flPartOk = flPartOk;
    }

    @Column(name = "FL_PART_SESUPDERR_OK", columnDefinition = "char")
    public String getFlPartSesupderrOk() {
        return this.flPartSesupderrOk;
    }

    public void setFlPartSesupderrOk(String flPartSesupderrOk) {
        this.flPartSesupderrOk = flPartSesupderrOk;
    }

    @Column(name = "FL_PART_SESUPDKO_AA_OK", columnDefinition = "char")
    public String getFlPartSesupdkoAaOk() {
        return this.flPartSesupdkoAaOk;
    }

    public void setFlPartSesupdkoAaOk(String flPartSesupdkoAaOk) {
        this.flPartSesupdkoAaOk = flPartSesupdkoAaOk;
    }

    @Column(name = "FL_PART_SESUPDKO_OK", columnDefinition = "char")
    public String getFlPartSesupdkoOk() {
        return this.flPartSesupdkoOk;
    }

    public void setFlPartSesupdkoOk(String flPartSesupdkoOk) {
        this.flPartSesupdkoOk = flPartSesupdkoOk;
    }

    @Column(name = "FL_PART_UPDDATISPEC_AA_OK", columnDefinition = "char")
    public String getFlPartUpddatispecAaOk() {
        return this.flPartUpddatispecAaOk;
    }

    public void setFlPartUpddatispecAaOk(String flPartUpddatispecAaOk) {
        this.flPartUpddatispecAaOk = flPartUpddatispecAaOk;
    }

    @Column(name = "FL_PART_UPDDATISPEC_OK", columnDefinition = "char")
    public String getFlPartUpddatispecOk() {
        return this.flPartUpddatispecOk;
    }

    public void setFlPartUpddatispecOk(String flPartUpddatispecOk) {
        this.flPartUpddatispecOk = flPartUpddatispecOk;
    }

    @Column(name = "FL_PART_UPDKO_AA_OK", columnDefinition = "char")
    public String getFlPartUpdkoAaOk() {
        return this.flPartUpdkoAaOk;
    }

    public void setFlPartUpdkoAaOk(String flPartUpdkoAaOk) {
        this.flPartUpdkoAaOk = flPartUpdkoAaOk;
    }

    @Column(name = "FL_PART_UPDKO_OK", columnDefinition = "char")
    public String getFlPartUpdkoOk() {
        return this.flPartUpdkoOk;
    }

    public void setFlPartUpdkoOk(String flPartUpdkoOk) {
        this.flPartUpdkoOk = flPartUpdkoOk;
    }

    @Column(name = "FL_PART_VERSINIDATISPEC_AA_OK", columnDefinition = "char")
    public String getFlPartVersinidatispecAaOk() {
        return this.flPartVersinidatispecAaOk;
    }

    public void setFlPartVersinidatispecAaOk(String flPartVersinidatispecAaOk) {
        this.flPartVersinidatispecAaOk = flPartVersinidatispecAaOk;
    }

    @Column(name = "FL_PART_VERSINIDATISPEC_OK", columnDefinition = "char")
    public String getFlPartVersinidatispecOk() {
        return this.flPartVersinidatispecOk;
    }

    public void setFlPartVersinidatispecOk(String flPartVersinidatispecOk) {
        this.flPartVersinidatispecOk = flPartVersinidatispecOk;
    }

    @Column(name = "FL_PART_XMLSESUPDKO_AA_OK", columnDefinition = "char")
    public String getFlPartXmlsesupdkoAaOk() {
        return this.flPartXmlsesupdkoAaOk;
    }

    public void setFlPartXmlsesupdkoAaOk(String flPartXmlsesupdkoAaOk) {
        this.flPartXmlsesupdkoAaOk = flPartXmlsesupdkoAaOk;
    }

    @Column(name = "FL_PART_XMLSESUPDKO_OK", columnDefinition = "char")
    public String getFlPartXmlsesupdkoOk() {
        return this.flPartXmlsesupdkoOk;
    }

    public void setFlPartXmlsesupdkoOk(String flPartXmlsesupdkoOk) {
        this.flPartXmlsesupdkoOk = flPartXmlsesupdkoOk;
    }

    @Column(name = "FL_PART_XMLUPD_AA_OK", columnDefinition = "char")
    public String getFlPartXmlupdAaOk() {
        return this.flPartXmlupdAaOk;
    }

    public void setFlPartXmlupdAaOk(String flPartXmlupdAaOk) {
        this.flPartXmlupdAaOk = flPartXmlupdAaOk;
    }

    @Column(name = "FL_PART_XMLUPD_OK", columnDefinition = "char")
    public String getFlPartXmlupdOk() {
        return this.flPartXmlupdOk;
    }

    public void setFlPartXmlupdOk(String flPartXmlupdOk) {
        this.flPartXmlupdOk = flPartXmlupdOk;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

}
