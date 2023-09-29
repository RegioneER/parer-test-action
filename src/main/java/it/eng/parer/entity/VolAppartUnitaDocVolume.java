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
 * The persistent class for the VOL_APPART_UNITA_DOC_VOLUME database table.
 */
@Entity
@Table(name = "VOL_APPART_UNITA_DOC_VOLUME")
public class VolAppartUnitaDocVolume implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAppartUnitaDocVolume;

    private Date dtCreazione;

    private BigDecimal idStrut;

    private List<VolAppartDocVolume> volAppartDocVolumes = new ArrayList<>();

    private AroUnitaDoc aroUnitaDoc;

    private VolVolumeConserv volVolumeConserv;

    public VolAppartUnitaDocVolume() {/* Hibernate */
    }

    @Id
    // "VOL_APPART_UNITA_DOC_VOLUME_IDAPPARTUNITADOCVOLUME_GENERATOR",
    // sequenceName =
    // "SVOL_APPART_UNITA_DOC_VOLUME",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VOL_APPART_UNITA_DOC_VOLUME_IDAPPARTUNITADOCVOLUME_GENERATOR")
    @Column(name = "ID_APPART_UNITA_DOC_VOLUME")
    @GenericGenerator(name = "SVOL_APPART_UNITA_DOC_VOLUME_ID_APPART_UNITA_DOC_VOLUME_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVOL_APPART_UNITA_DOC_VOLUME"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVOL_APPART_UNITA_DOC_VOLUME_ID_APPART_UNITA_DOC_VOLUME_GENERATOR")
    public Long getIdAppartUnitaDocVolume() {
        return this.idAppartUnitaDocVolume;
    }

    public void setIdAppartUnitaDocVolume(Long idAppartUnitaDocVolume) {
        this.idAppartUnitaDocVolume = idAppartUnitaDocVolume;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to VolAppartDocVolume
    @OneToMany(mappedBy = "volAppartUnitaDocVolume", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH })
    public List<VolAppartDocVolume> getVolAppartDocVolumes() {
        return this.volAppartDocVolumes;
    }

    public void setVolAppartDocVolumes(List<VolAppartDocVolume> volAppartDocVolumes) {
        this.volAppartDocVolumes = volAppartDocVolumes;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }

    // bi-directional many-to-one association to VolVolumeConserv
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_VOLUME_CONSERV")
    public VolVolumeConserv getVolVolumeConserv() {
        return this.volVolumeConserv;
    }

    public void setVolVolumeConserv(VolVolumeConserv volVolumeConserv) {
        this.volVolumeConserv = volVolumeConserv;
    }
}
