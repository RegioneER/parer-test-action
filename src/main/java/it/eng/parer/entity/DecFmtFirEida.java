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
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_FMT_FIR_EIDAS database table.
 */
@Entity
@Table(name = "DEC_FMT_FIR_EIDAS")
@NamedQuery(name = "DecFmtFirEida.findAll", query = "SELECT d FROM DecFmtFirEida d")
public class DecFmtFirEida implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFmtFirEidas;

    private BigDecimal pgOrdCampo;

    private String tiFormato;

    private List<DecAmsFmtFirEidasCrypto> decAmsFmtFirEidasCryptos = new ArrayList<>();

    public DecFmtFirEida() {/* Hibernate */
    }

    @Id
    // "DEC_FMT_FIR_EIDAS_IDFMTFIREIDAS_GENERATOR",
    // sequenceName = "SDEC_FMT_FIR_EIDAS",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FMT_FIR_EIDAS_IDFMTFIREIDAS_GENERATOR")
    @Column(name = "ID_FMT_FIR_EIDAS")
    @GenericGenerator(name = "SDEC_FMT_FIR_EIDAS_ID_FMT_FIR_EIDAS_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_FMT_FIR_EIDAS"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_FMT_FIR_EIDAS_ID_FMT_FIR_EIDAS_GENERATOR")
    public Long getIdFmtFirEidas() {
        return this.idFmtFirEidas;
    }

    public void setIdFmtFirEidas(Long idFmtFirEidas) {
        this.idFmtFirEidas = idFmtFirEidas;
    }

    @Column(name = "PG_ORD_CAMPO")
    public BigDecimal getPgOrdCampo() {
        return this.pgOrdCampo;
    }

    public void setPgOrdCampo(BigDecimal pgOrdCampo) {
        this.pgOrdCampo = pgOrdCampo;
    }

    @Column(name = "TI_FORMATO")
    public String getTiFormato() {
        return this.tiFormato;
    }

    public void setTiFormato(String tiFormato) {
        this.tiFormato = tiFormato;
    }

    // bi-directional many-to-one association to DecAmsFmtFirEidasCrypto
    @OneToMany(mappedBy = "decFmtFirEida")
    public List<DecAmsFmtFirEidasCrypto> getDecAmsFmtFirEidasCryptos() {
        return this.decAmsFmtFirEidasCryptos;
    }

    public void setDecAmsFmtFirEidasCryptos(List<DecAmsFmtFirEidasCrypto> decAmsFmtFirEidasCryptos) {
        this.decAmsFmtFirEidasCryptos = decAmsFmtFirEidasCryptos;
    }

    public DecAmsFmtFirEidasCrypto addDecAmsFmtFirEidasCrypto(DecAmsFmtFirEidasCrypto decAmsFmtFirEidasCrypto) {
        getDecAmsFmtFirEidasCryptos().add(decAmsFmtFirEidasCrypto);
        decAmsFmtFirEidasCrypto.setDecFmtFirEida(this);
        return decAmsFmtFirEidasCrypto;
    }

    public DecAmsFmtFirEidasCrypto removeDecAmsFmtFirEidasCrypto(DecAmsFmtFirEidasCrypto decAmsFmtFirEidasCrypto) {
        getDecAmsFmtFirEidasCryptos().remove(decAmsFmtFirEidasCrypto);
        decAmsFmtFirEidasCrypto.setDecFmtFirEida(null);
        return decAmsFmtFirEidasCrypto;
    }

}
