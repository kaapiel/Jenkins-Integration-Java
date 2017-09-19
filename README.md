# JenkinsIntegration #

Esta é a integração, onde você pode realizar testes remotamente através de qualquer aplicação externa.

#### Este framework é capaz de: ####
* Realizar a execução de um job no jenkins externamente
* Obter o log em tempo real da execução do job

### Este é um repositório privado. Apenas pessoas autorizadas podem realizar alterações. ###

* Android JenkinsIntegration
* v0.01

### O que precisamos ter em mente antes de iniciar as configurações? ###

* 1 - Token de execução remota
* 2 - Nome do job para execução

### Contribua conosco ###

* Escreva melhorias tanto no framework como na estrutura dos testes
* A nossa política de code review está em construção

### Entre em contato ###

* Owner/Admin - Gabriel Aguido Fraga


## 1 - Token de execução remota ##

Em seu Jenkins, é necessário a configuração de um token de segurança para ser disponibilizado apenas as pessoas com acesso
a execução de jobs remotamente.
			
## 2 - Nome do job para execução ##

Tenha em mente o nome ou a lógica para gerar o nome do job desejado a ser executado.