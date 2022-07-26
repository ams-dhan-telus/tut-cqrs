package com.techbank.cqrs_core.commands;

import com.techbank.cqrs_core.messages.Message;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseCommand extends Message {
   public BaseCommand(String id) {
      super(id);
   }
}
