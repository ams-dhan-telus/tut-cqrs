package com.techbank.account_cmd.api.commands;

import com.techbank.account_common.dtos.AccountType;
import com.techbank.cqrs_core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
   private String accountHolder;
   private AccountType accountType;
   private double openingBalance;
}
