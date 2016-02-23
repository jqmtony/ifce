package com.j7ss.entity.constraint;

import com.github.rjeschke.txtmark.Processor;
import com.j7ss.entity.DocumentoVagaEstagio;


public class DocumentoParse {

	private DocumentoVagaEstagio documentoVagaEstagio;

	private String docPage;
	
	public DocumentoParse(DocumentoVagaEstagio documentoVagaEstagio) {
		this.documentoVagaEstagio = documentoVagaEstagio;
		this.docPage = documentoVagaEstagio.getDocumento().getHtmlPage();
		if(documentoVagaEstagio.getDocumento().getKeys() != null){
			for (String key : documentoVagaEstagio.getDocumento().getKeys().split(",")) {
				replace(DocumentoKey.valueOf(key.replaceAll("&", "").replaceAll("`", "")));
			}
		}
	}
	
	public String toPage(){
		return Processor.process(docPage, true);
	}
	
	private void replace(DocumentoKey key){
		switch (key) {
		// Usuario
		case USUARIO_NOME:
			replace(DocumentoKey.USUARIO_NOME, documentoVagaEstagio.getVagaEstagio().getAluno().getUsuario().getNome());
			break;
		case USUARIO_EMAIL:
			replace(DocumentoKey.USUARIO_EMAIL, documentoVagaEstagio.getVagaEstagio().getAluno().getUsuario().getEmail());
			break;
			
		// Aluno
		case ALUNO_MATRICULA:	
			replace(DocumentoKey.ALUNO_MATRICULA, documentoVagaEstagio.getVagaEstagio().getAluno().getMatricula());
			break;
		case ALUNO_TELEFONE:
			replace(DocumentoKey.ALUNO_TELEFONE, documentoVagaEstagio.getVagaEstagio().getAluno().getTelefone());
			break;
		case ALUNO_CELULAR:	
			replace(DocumentoKey.ALUNO_CELULAR, documentoVagaEstagio.getVagaEstagio().getAluno().getCelular());
			break;
		case ALUNO_CV_LATTES:
			replace(DocumentoKey.ALUNO_CV_LATTES, documentoVagaEstagio.getVagaEstagio().getAluno().getCvLattes());
			break;
		case ALUNO_CPF:
			replace(DocumentoKey.ALUNO_CPF, documentoVagaEstagio.getVagaEstagio().getAluno().getCpf());
			break;
		case ALUNO_RG:
			replace(DocumentoKey.ALUNO_RG, documentoVagaEstagio.getVagaEstagio().getAluno().getRg());
			break;
		case ALUNO_DATA_NASCIMENTO:
			replace(DocumentoKey.ALUNO_DATA_NASCIMENTO, documentoVagaEstagio.getVagaEstagio().getAluno().getDataNascimento());
			break;
		case ALUNO_ENDERECO_ENDERECO:
			replace(DocumentoKey.ALUNO_ENDERECO_ENDERECO, documentoVagaEstagio.getVagaEstagio().getAluno().getEndereco());
			break;
		case ALUNO_ENDERECO_NUMERO:
			replace(DocumentoKey.ALUNO_ENDERECO_NUMERO, documentoVagaEstagio.getVagaEstagio().getAluno().getNumero());
			break;
		case ALUNO_ENDERECO_BAIRRO:
			replace(DocumentoKey.ALUNO_ENDERECO_BAIRRO, documentoVagaEstagio.getVagaEstagio().getAluno().getBairro());
			break;
		case ALUNO_ENDERECO_CEP:
			replace(DocumentoKey.ALUNO_ENDERECO_CEP, documentoVagaEstagio.getVagaEstagio().getAluno().getCep());
			break;
		case ALUNO_ENDERECO_CIDADE:
			replace(DocumentoKey.ALUNO_ENDERECO_CIDADE, documentoVagaEstagio.getVagaEstagio().getAluno().getCidade());
			break;
		case ALUNO_ENDERECO_UF:
			replace(DocumentoKey.ALUNO_ENDERECO_UF, documentoVagaEstagio.getVagaEstagio().getAluno().getUf());
			break;
		
		// Empresa
		case EMPRESA_NOME:
			replace(DocumentoKey.EMPRESA_NOME, documentoVagaEstagio.getVagaEstagio().getEmpresa().getNome());
			break;
		case EMPRESA_EMAIL:
			replace(DocumentoKey.EMPRESA_EMAIL, documentoVagaEstagio.getVagaEstagio().getEmpresa().getEmail());
			break;
		case EMPRESA_TELEFONE:
			replace(DocumentoKey.EMPRESA_TELEFONE, documentoVagaEstagio.getVagaEstagio().getEmpresa().getTelefone());
			break;
		case EMPRESA_FAX:
			replace(DocumentoKey.EMPRESA_FAX, documentoVagaEstagio.getVagaEstagio().getEmpresa().getFax());
			break;
		case EMPRESA_SUPERVISOR:
			// TODO: Empresa Supervisor
//			replace(DocumentoKey.EMPRESA_SUPERVISOR, documentoVagaEstagio.getVagaEstagio().getEmpresa());
			break;
		case EMPRESA_CARGO_SUPERVISOR:
			// TODO: Empresa Supervisor
//			replace(DocumentoKey.EMPRESA_CARGO_SUPERVISOR, documentoVagaEstagio.getVagaEstagio().getEmpresa());
			break;
		case EMPRESA_TELEFONE_SUPERVISOR:
			// TODO: Empresa Supervisor
//			replace(DocumentoKey.EMPRESA_TELEFONE_SUPERVISOR, documentoVagaEstagio.getVagaEstagio().getEmpresa());
			break;
		case EMPRESA_CNPJ:
			replace(DocumentoKey.EMPRESA_CNPJ, documentoVagaEstagio.getVagaEstagio().getEmpresa().getCnpj());
			break;
		case EMPRESA_SITE:
			replace(DocumentoKey.EMPRESA_SITE, documentoVagaEstagio.getVagaEstagio().getEmpresa().getSite());
			break;
		case EMPRESA_RAMO_ATIVIDADE:
			replace(DocumentoKey.EMPRESA_RAMO_ATIVIDADE, documentoVagaEstagio.getVagaEstagio().getEmpresa().getRamoAtividade());
			break;
		case EMPRESA_ENDERECO_ENDERECO:
			replace(DocumentoKey.EMPRESA_ENDERECO_ENDERECO, documentoVagaEstagio.getVagaEstagio().getEmpresa().getEndereco());
			break;
		case EMPRESA_ENDERECO_NUMERO:
			replace(DocumentoKey.EMPRESA_ENDERECO_NUMERO, documentoVagaEstagio.getVagaEstagio().getEmpresa().getNumero());
			break;
		case EMPRESA_ENDERECO_BAIRRO:
			replace(DocumentoKey.EMPRESA_ENDERECO_BAIRRO, documentoVagaEstagio.getVagaEstagio().getEmpresa().getBairro());
			break;
		case EMPRESA_ENDERECO_CEP:
			replace(DocumentoKey.EMPRESA_ENDERECO_CEP, documentoVagaEstagio.getVagaEstagio().getEmpresa().getCep());
			break;
		case EMPRESA_ENDERECO_UF:
			replace(DocumentoKey.EMPRESA_ENDERECO_UF, documentoVagaEstagio.getVagaEstagio().getEmpresa().getUf());
			break;
		case EMPRESA_ENDERECO_CIDADE:
			replace(DocumentoKey.EMPRESA_ENDERECO_CIDADE, documentoVagaEstagio.getVagaEstagio().getEmpresa().getCidade());
			break;
			
		// Instituicao
		case INSTITUICAO_NOME:
			replace(DocumentoKey.INSTITUICAO_NOME, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getInstituicao().getNome());
			break;
			
		// Campus
		case CAMPUS_NOME:
			replace(DocumentoKey.CAMPUS_NOME, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getNome());
			break;
		case CAMPUS_EMAIL:
			replace(DocumentoKey.CAMPUS_EMAIL, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getEmail());
			break;
		case CAMPUS_TELEFONE:
			replace(DocumentoKey.CAMPUS_TELEFONE, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getTelefone());
			break;
		case CAMPUS_ENDERECO_ENDERECO:
			replace(DocumentoKey.CAMPUS_ENDERECO_ENDERECO, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getEndereco());
			break;
		case CAMPUS_ENDERECO_NUMERO:
			replace(DocumentoKey.CAMPUS_ENDERECO_NUMERO, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getNumero());
			break;
		case CAMPUS_ENDERECO_BAIRRO:
			replace(DocumentoKey.CAMPUS_ENDERECO_BAIRRO, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getBairro());
			break;
		case CAMPUS_ENDERECO_CEP:
			replace(DocumentoKey.CAMPUS_ENDERECO_CEP, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getCep());
			break;
		case CAMPUS_ENDERECO_UF:
			replace(DocumentoKey.CAMPUS_ENDERECO_UF, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getUf());
			break;
		case CAMPUS_ENDERECO_CIDADE:
			replace(DocumentoKey.CAMPUS_ENDERECO_CIDADE, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getCampus().getCidade());
			break;
	
		// Departamento
		case DEPARTAMENTO_NOME:
			replace(DocumentoKey.DEPARTAMENTO_NOME, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getDepartamento().getNome());
			break;
			
		// Curso
		case ALUNO_CURSO_SEMESTRE_ATUAL:
			replace(DocumentoKey.ALUNO_CURSO_SEMESTRE_ATUAL, documentoVagaEstagio.getVagaEstagio().getAluno().getSemestreAtual().toString());
			break;
		case ALUNO_CURSO_NOME:
			replace(DocumentoKey.ALUNO_CURSO_NOME, documentoVagaEstagio.getVagaEstagio().getAluno().getCurso().getNome());
			break;
		}
	}
	
	private void replace(DocumentoKey key, Object value){
		if(value != null){
			docPage = docPage.replace(key.getKey(), value.toString());
		}
	}
	
}