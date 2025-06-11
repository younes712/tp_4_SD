package com.younes;
import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(33));
        System.out.println("--------------------------------------");
        Compte compte = proxy.getCompte(2);
        System.out.println(compte.getCompteId());
        System.out.println(compte.getDateCreation());
        System.out.println(compte.getSolde());
        System.out.println("--------------------------------------");
        proxy.listComptes().forEach(cmp -> {
            System.out.println(cmp.getCompteId());
            System.out.println(cmp.getDateCreation());
            System.out.println(cmp.getSolde());
        });
        System.out.println("--------------------------------------");
    }
}