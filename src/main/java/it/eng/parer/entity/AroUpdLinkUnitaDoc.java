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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_UPD_LINK_UNITA_DOC database table.
 */
@Entity
@Table(name = "ARO_UPD_LINK_UNITA_DOC")
@NamedQuery(name = "AroUpdLinkUnitaDoc.findAll", query = "SELECT a FROM AroUpdLinkUnitaDoc a")
public class AroUpdLinkUnitaDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUpdLinkUnitaDoc;

    private BigDecimal aaKeyUnitaDocLink;

    private String cdKeyUnitaDocLink;

    private String cdRegistroKeyUnitaDocLink;

    private String dsLinkUnitaDoc;

    private AroUnitaDoc aroUnitaDocLink;

    private AroUpdUnitaDoc aroUpdUnitaDoc;

    public AroUpdLinkUnitaDoc() {/* Hibernate */
    }

    @Id
    // "ARO_UPD_LINK_UNITA_DOC_IDUPDLINKUNITADOC_GENERATOR",
    // sequenceName =
    // "SARO_UPD_LINK_UNITA_DOC",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_UPD_LINK_UNITA_DOC_IDUPDLINKUNITADOC_GENERATOR")
    @Column(name = "ID_UPD_LINK_UNITA_DOC")
    @GenericGenerator(name = "SARO_UPD_LINK_UNITA_DOC_ID_UPD_LINK_UNITA_DOC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_UPD_LINK_UNITA_DOC"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_UPD_LINK_UNITA_DOC_ID_UPD_LINK_UNITA_DOC_GENERATOR")
    public Long getIdUpdLinkUnitaDoc() {
        return this.idUpdLinkUnitaDoc;
    }

    public void setIdUpdLinkUnitaDoc(Long idUpdLinkUnitaDoc) {
        this.idUpdLinkUnitaDoc = idUpdLinkUnitaDoc;
    }

    @Column(name = "AA_KEY_UNITA_DOC_LINK")
    public BigDecimal getAaKeyUnitaDocLink() {
        return this.aaKeyUnitaDocLink;
    }

    public void setAaKeyUnitaDocLink(BigDecimal aaKeyUnitaDocLink) {
        this.aaKeyUnitaDocLink = aaKeyUnitaDocLink;
    }

    @Column(name = "CD_KEY_UNITA_DOC_LINK")
    public String getCdKeyUnitaDocLink() {
        return this.cdKeyUnitaDocLink;
    }

    public void setCdKeyUnitaDocLink(String cdKeyUnitaDocLink) {
        this.cdKeyUnitaDocLink = cdKeyUnitaDocLink;
    }

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC_LINK")
    public String getCdRegistroKeyUnitaDocLink() {
        return this.cdRegistroKeyUnitaDocLink;
    }

    public void setCdRegistroKeyUnitaDocLink(String cdRegistroKeyUnitaDocLink) {
        this.cdRegistroKeyUnitaDocLink = cdRegistroKeyUnitaDocLink;
    }

    @Column(name = "DS_LINK_UNITA_DOC")
    public String getDsLinkUnitaDoc() {
        return this.dsLinkUnitaDoc;
    }

    public void setDsLinkUnitaDoc(String dsLinkUnitaDoc) {
        this.dsLinkUnitaDoc = dsLinkUnitaDoc;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC_LINK")
    public AroUnitaDoc getAroUnitaDocLink() {
        return this.aroUnitaDocLink;
    }

    public void setAroUnitaDocLink(AroUnitaDoc aroUnitaDocLink) {
        this.aroUnitaDocLink = aroUnitaDocLink;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

}
