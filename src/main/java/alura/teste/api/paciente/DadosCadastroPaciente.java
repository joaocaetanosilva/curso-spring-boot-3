package alura.teste.api.paciente;

import alura.teste.api.endereco.DadosEndereco;
import alura.teste.api.medico.Especialidade;

public record DadosCadastroPaciente(String nome, String email, Especialidade especialidade,
                                    DadosEndereco endereco) {
}
