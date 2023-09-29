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

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_LIS_VERSER_BY_UPD_UD database table.
 */
@Entity
@Table(name = "SER_V_LIS_VERSER_BY_UPD_UD")
@NamedQuery(name = "SerVLisVerserByUpdUd.findAll", query = "SELECT s FROM SerVLisVerserByUpdUd s")
public class SerVLisVerserByUpdUd implements Serializable {

    private static final long serialVersionUID = 1L;

    public SerVLisVerserByUpdUd() {/* Hibernate */
    }

    private SerVLisVerserByUpdUdId serVLisVerserByUpdUdId;

    @EmbeddedId()
    public SerVLisVerserByUpdUdId getSerVLisVerserByUpdUdId() {
        return serVLisVerserByUpdUdId;
    }

    public void setSerVLisVerserByUpdUdId(SerVLisVerserByUpdUdId serVLisVerserByUpdUdId) {
        this.serVLisVerserByUpdUdId = serVLisVerserByUpdUdId;
    }
}
