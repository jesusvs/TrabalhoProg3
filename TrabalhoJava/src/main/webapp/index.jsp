<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:p="http://primefaces.org/ui">

<h:head>
	<title>Página Inicial</title>
</h:head>
<h:body>
	<h:form>
		<h:panelGrid columns="3">
			<h:outputText value="Pagina Inicial" styleClass="conteudo" />

			<!-- <p:outputLabel value="Logado como : #{usuarioBean.usuario.login}" />

			<p:commandButton value="Logoff" action="#{usuarioBean.logoff}" /> -->
		</h:panelGrid>
		<h:panelGrid columns="3">
			<p:commandButton value="Cadastro de Pessoas"
				action="pessoaList" />
			<p:commandButton value="Cadastro de Pessoa" action="pessoaList" />
		</h:panelGrid>
	</h:form>
</h:body>
</html>