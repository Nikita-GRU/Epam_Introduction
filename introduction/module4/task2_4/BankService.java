package epam.introduction.module4.task2_4;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.ArrayList;
import java.util.List;

public class BankService {
    private Client client;
    private Bank bank;

    public BankService(Client client, Bank bank) {
        this.client = client;
        this.bank = bank;
    }

    public Client getClient() {
        return client;
    }

    public Bank getBank() {
        return bank;
    }

    public void createAccount(Account account) {

        if (getBank().getClientAccountMap().isEmpty()) {
            List<Account> accounts = new ArrayList<>();
            accounts.add(account);
            getBank().getClientAccountMap().put(getClient(), accounts);
        } else getBank().getClientAccountMap().get(getClient()).add(account);

    }

    public void blockAccount(int accountId) {

    }

    public List<Account> getAccounts() {
        return getBank().getClientAccountMap().get(getClient());
    }


}
