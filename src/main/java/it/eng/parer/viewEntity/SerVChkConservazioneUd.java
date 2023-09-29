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
 * The persistent class for the SER_V_CHK_CONSERVAZIONE_UD database table.
 * 
 */
@Entity
@Table(name = "SER_V_CHK_CONSERVAZIONE_UD")
@NamedQuery(name = "SerVChkConservazioneUd.findAll", query = "SELECT s FROM SerVChkConservazioneUd s")
public class SerVChkConservazioneUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flOkStatoConservazione;
    private BigDecimal idVerSerie;

    public SerVChkConservazioneUd() {/* Hibernate */
    }

    @Column(name = "FL_OK_STATO_CONSERVAZIONE", columnDefinition = "char(1)")
    public String getFlOkStatoConservazione() {
        return this.flOkStatoConservazione;
    }

    public void setFlOkStatoConservazione(String flOkStatoConservazione) {
        this.flOkStatoConservazione = flOkStatoConservazione;
    }

    @Id
    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

}
