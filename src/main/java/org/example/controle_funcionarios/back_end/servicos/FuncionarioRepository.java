package org.example.controle_funcionarios.back_end.servicos;

import org.example.controle_funcionarios.back_end.dominio.Funcionario;

public interface FuncionarioRepository {
    void salvar(Funcionario funcionarios);
    void excluir(Funcionario funcionario);
    void editarNome (Funcionario funcionario, String novoNome);
    void editarSalario (Funcionario funcionario, double novoSalario);
    void editarCargo(Funcionario funcionario, String novoCargo);
}
