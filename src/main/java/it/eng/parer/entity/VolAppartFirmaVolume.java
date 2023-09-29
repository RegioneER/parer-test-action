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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VOL_APPART_FIRMA_VOLUME database table.
 */
@Entity
@Table(name = "VOL_APPART_FIRMA_VOLUME")
public class VolAppartFirmaVolume implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAppartFirmaVolume;

    private AroFirmaComp aroFirmaComp;

    private VolAppartCompVolume volAppartCompVolume;

    private List<VolVerifFirmaVolume> volVerifFirmaVolumes = new ArrayList<>();

    public VolAppartFirmaVolume() {/* Hibernate */
    }

    @Id
    // "VOL_APPART_FIRMA_VOLUME_IDAPPARTFIRMAVOLUME_GENERATOR",
    // sequenceName =
    // "SVOL_APPART_FIRMA_VOLUME",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VOL_APPART_FIRMA_VOLUME_IDAPPARTFIRMAVOLUME_GENERATOR")
    @Column(name = "ID_APPART_FIRMA_VOLUME")
    @GenericGenerator(name = "SVOL_APPART_FIRMA_VOLUME_ID_APPART_FIRMA_VOLUME_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVOL_APPART_FIRMA_VOLUME"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVOL_APPART_FIRMA_VOLUME_ID_APPART_FIRMA_VOLUME_GENERATOR")
    public Long getIdAppartFirmaVolume() {
        return this.idAppartFirmaVolume;
    }

    public void setIdAppartFirmaVolume(Long idAppartFirmaVolume) {
        this.idAppartFirmaVolume = idAppartFirmaVolume;
    }

    // bi-directional many-to-one association to AroFirmaComp
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_FIRMA_COMP")
    public AroFirmaComp getAroFirmaComp() {
        return this.aroFirmaComp;
    }

    public void setAroFirmaComp(AroFirmaComp aroFirmaComp) {
        this.aroFirmaComp = aroFirmaComp;
    }

    // bi-directional many-to-one association to VolAppartCompVolume
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_APPART_COMP_VOLUME")
    public VolAppartCompVolume getVolAppartCompVolume() {
        return this.volAppartCompVolume;
    }

    public void setVolAppartCompVolume(VolAppartCompVolume volAppartCompVolume) {
        this.volAppartCompVolume = volAppartCompVolume;
    }

    // bi-directional many-to-one association to VolVerifFirmaVolume
    @OneToMany(mappedBy = "volAppartFirmaVolume", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH })
    public List<VolVerifFirmaVolume> getVolVerifFirmaVolumes() {
        return this.volVerifFirmaVolumes;
    }

    public void setVolVerifFirmaVolumes(List<VolVerifFirmaVolume> volVerifFirmaVolumes) {
        this.volVerifFirmaVolumes = volVerifFirmaVolumes;
    }

}
