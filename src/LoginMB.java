public class LoginMB {
  private Usuario usuario = new Usuario();
  

  public String doEfetuarLogin() {
    if("sakurai".equals(usuario.getLogin()) &&
       "123".equals(usuario.getSenha())) {
      //Se escrever o login e senha correto então vai para a tela principal do sistema. /
      return "principal";
    }

    //Caso erre o login ou senha fica na mesma tela.
    return null;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
