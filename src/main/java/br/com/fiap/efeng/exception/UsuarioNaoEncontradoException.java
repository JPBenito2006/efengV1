package br.com.fiap.efeng.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontradoException extends RuntimeException {
  public UsuarioNaoEncontradoException(String mensagem) {
    super(mensagem);
  }
}
