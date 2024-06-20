import java.sql.Date;
import java.util.Set;

public class Bootcamp {

Date dataFinal;
Date dataInicio;
String nome;
String descricao;

public Date getDataFinal() {
    return dataFinal;
}
public void setDataFinal(Date dataFinal) {
    this.dataFinal = dataFinal;
}
public Date getDataInicio() {
    return dataInicio;
}
public void setDataInicio(Date dataInicio) {
    this.dataInicio = dataInicio;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public Object getConteudos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getConteudos'");
}
public Set<Conteudo> getDevsInscritos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getDevsInscritos'");
}



}
