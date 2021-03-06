package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ControllerShowBankAccount {
  BankAccount bankAccount = new BankAccount("Simba", 2000, "Zebra", "lion", true);

  @RequestMapping("/show")
  public String show(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("currency", bankAccount.getCurrency());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    model.addAttribute("isKing", bankAccount.getKing());

    return "showAccount";
  }

  @RequestMapping("/showAll")
  public String showAll(Model model) {

    ArrayList<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList (
            new BankAccount("Simba", 2000, "Zebra", "lion", false),
            new BankAccount("Mufasa", 1191, "Zebra", "lion", true),
            new BankAccount("Timon", 30, "Gazella", "meerkat", false),
            new BankAccount("Pumbaa", 2840, "Zebra", "warthog", false),
            new BankAccount("Rafiki", 127, "Gazella", "mandrill", false)
    ));

    model.addAttribute("accounts", bankAccounts);
    return "showAccountList";
  }
}
