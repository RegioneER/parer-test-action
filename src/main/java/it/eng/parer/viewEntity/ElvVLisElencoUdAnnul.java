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

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_LIS_ELENCO_UD_ANNUL database table.
 */
@Entity
@Table(name = "ELV_V_LIS_ELENCO_UD_ANNUL")
@NamedQuery(name = "ElvVLisElencoUdAnnul.findAll", query = "SELECT e FROM ElvVLisElencoUdAnnul e")
public class ElvVLisElencoUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ntElencoChiuso;

    public ElvVLisElencoUdAnnul() {/* Hibernate */
    }

    @Column(name = "NT_ELENCO_CHIUSO")
    public String getNtElencoChiuso() {
        return this.ntElencoChiuso;
    }

    public void setNtElencoChiuso(String ntElencoChiuso) {
        this.ntElencoChiuso = ntElencoChiuso;
    }

    private ElvVLisElencoUdAnnulId elvVLisElencoUdAnnulId;

    @EmbeddedId()
    public ElvVLisElencoUdAnnulId getElvVLisElencoUdAnnulId() {
        return elvVLisElencoUdAnnulId;
    }

    public void setElvVLisElencoUdAnnulId(ElvVLisElencoUdAnnulId elvVLisElencoUdAnnulId) {
        this.elvVLisElencoUdAnnulId = elvVLisElencoUdAnnulId;
    }
}
