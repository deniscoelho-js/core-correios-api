package br.core.correios.model;

public enum Status {
    NEED_SETUP,         //Precisa baixar o csv dos correios
    RUNNING_SETUP,      //esta baixando/salvando no banco
    READY;              //servico esta apto para ser consumido
}
