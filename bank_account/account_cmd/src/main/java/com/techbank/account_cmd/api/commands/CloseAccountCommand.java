package com.techbank.account_cmd.api.commands;

import com.techbank.cqrs_core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
   public CloseAccountCommand(String id) {
      super(id);
   }
}
