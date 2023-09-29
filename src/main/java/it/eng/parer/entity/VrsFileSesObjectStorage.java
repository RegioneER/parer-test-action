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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VRS_FILE_SES_OBJECT_STORAGE")
public class VrsFileSesObjectStorage {

    public VrsFileSesObjectStorage() {
        super();
    }

    private Long idVrsFileSesObjectStorage;
    private DecBackend decBackend;
    private VrsFileSessione fileSessione;
    private String nmTenant;
    private String nmBucket;
    private String nmKeyFile;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VRS_FILE_SES_OBJECT_STORAGE")
    public Long getIdVrsFileSesObjectStorage() {
        return idVrsFileSesObjectStorage;
    }

    public void setIdVrsFileSesObjectStorage(Long idVrsFileSesObjectStorage) {
        this.idVrsFileSesObjectStorage = idVrsFileSesObjectStorage;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DEC_BACKEND")
    public DecBackend getDecBackend() {
        return decBackend;
    }

    public void setDecBackend(DecBackend decBackend) {
        this.decBackend = decBackend;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILE_SESSIONE")
    public VrsFileSessione getFileSessione() {
        return fileSessione;
    }

    public void setFileSessione(VrsFileSessione fileSessione) {
        this.fileSessione = fileSessione;
    }

    @Column(name = "NM_TENANT")
    public String getNmTenant() {
        return nmTenant;
    }

    public void setNmTenant(String nmTenant) {
        this.nmTenant = nmTenant;
    }

    @Column(name = "NM_BUCKET")
    public String getNmBucket() {
        return nmBucket;
    }

    public void setNmBucket(String nmBucket) {
        this.nmBucket = nmBucket;
    }

    @Column(name = "CD_KEY_FILE")
    public String getNmKeyFile() {
        return nmKeyFile;
    }

    public void setNmKeyFile(String nmKeyFile) {
        this.nmKeyFile = nmKeyFile;
    }
}
