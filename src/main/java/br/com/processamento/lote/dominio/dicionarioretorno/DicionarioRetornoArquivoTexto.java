package br.com.processamento.lote.dominio.dicionarioretorno;

import java.io.Serializable;

/**
 * @author marcos.buganeme
 */
public class DicionarioRetornoArquivoTexto implements Serializable {

  private static final long serialVersionUID = 1L;

  private String codigo;
  private String descricao;
  private String filler;

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getFiller() {
    return filler;
  }

  public void setFiller(String filler) {
    this.filler = filler;
  }

  @Override
  public String toString() {
    return "DicionarioRetornoArquivoTexto [codigo=" + codigo + ", descricao=" + descricao
        + ", filler=" + filler + "]";
  }
}
