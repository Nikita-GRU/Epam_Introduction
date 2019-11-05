package epam.introduction.module4.task2_4;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.List;
import java.util.Map;

public class Bank {
    private int clientId;
    private Map<Client, List<Account>> clientAccountMap;

    public Bank(int clientId, Map<Client, List<Account>> clientAccountMap) {
        this.clientId = clientId;
        this.clientAccountMap = clientAccountMap;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Map<Client, List<Account>> getClientAccountMap() {
        return clientAccountMap;
    }

    public void setClientAccountMap(Map<Client, List<Account>> clientAccountMap) {
        this.clientAccountMap = clientAccountMap;
    }
}

