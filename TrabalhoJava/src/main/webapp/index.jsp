<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:p="http://primefaces.org/ui">
<h:head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Cadastro de Pessoa</title>
</h:head>
<h:body>
	<h1>Cadastro de Pessoa</h1>
	<h:form>
		<p:messages id="messages" autoUpdate="true" closable="true" />
		<h:panelGrid columns="2">
			<p:outputLabel value="Nome:" for="nomePessoa" />
			<p:inputText id="nomePessoa" value="#{PessoaBean.Pessoa.nome}"
				required="true" />

			<p:outputLabel value="Idade:" for="idadePessoa" />
			<p:inputText id="idadePessoa" value="#{PessoaBean.Pessoa.idade}"
				required="true" />

			<p:outputLabel value="Sexo:" for="sexo" />
			<p:selectOneMenu id="sexo" value="#{PessoaBean.Pessoa.sexo}">
				<f:selectItems value="#{PessoaBean.sexoValues}" var="sexo"
					itemValue="#{sexo}" itemLabel="#{sexo.descricao}" />
			</p:selectOneMenu>

			<p:outputLabel value="Cpf:" for="cpfPessoa" />
			<p:inputText id="cpfPessoa" value="#{PessoaBean.Pessoa.cpf}"
				required="true" />

			<p:commandButton value="Inserir"
				rendered="#{PessoaBean.Pessoa.id == null}"
				action="#{PessoaBean.salvar}" />

			<p:commandButton value="Alterar"
				rendered="#{PessoaBean.Pessoa.id != null}"
				action="#{PessoaBean.salvar}" />

			<p:commandButton value="Voltar" action="PessoaList" immediate="true" />
		</h:panelGrid>
	</h:form>

</h:body>
</html>