package org.training.sqills.pattern.behavioral.command.oo;

import org.training.sqills.pattern.behavioral.command.Customer;
import org.training.sqills.pattern.behavioral.command.EAccountType;

import java.util.List;

public class AtmMenuFactory {

    public static List<ICommand> getCommands(Customer customerParam) {
        return List.of(new DepositCommand(EAccountType.TL),
                       new WithdrawCommand(EAccountType.TL),
                       new TransferCommand(EAccountType.TL),
                       new ShowCommand(EAccountType.TL),
                       new DepositCommand(EAccountType.DOLAR),
                       new WithdrawCommand(EAccountType.DOLAR),
                       new TransferCommand(EAccountType.DOLAR),
                       new ShowCommand(EAccountType.DOLAR));
    }
}
