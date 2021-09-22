package ru.job4j.bank;

import java.util.*;

/**
 * Класс реализует набор базовых операций
 * с клиентами банка и их счетами
 * @version 0.1
 */
public class BankService {
    /**
     * Список клиентов и соответствие их со счетами храним в Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление нового клиента к списку
     * @param user добавляемый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Добавление нового счета существующему пользователю
     * @param passport паспортные данные для поиска пользователя
     * @param account добавляемый счет
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        // Зачем мы храним уникальные данные в List, а не в Set? :(
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Поиск пользователя по паспортным данным
     * @param passport данные для поиска
     * @return возвращает найденного пользователя или null
     */
    // Не кошерные названия методов - findBy возвращают разные типы данных
    // Лучше бы findUserByPassport и findAccountByRequisite
    public Optional<User> findByPassport(String passport) {
        return this.users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Поиск счета у пользователя по реквизитам
     * Требует передачи паспортных данных, а не пользователя
     * @param passport паспортные данные искомого клиента
     * @param requisite реквизиты искомого счета
     * @return возвращает найденный счет или null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> this.users.get(value).stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Перевод средств между счетами
     * @param srcPassport паспортные данные, от кого переводим
     * @param srcRequisite реквизиты счета, с которого переводим
     * @param destPassport паспортные данные, кому переводим
     * @param destRequisite реквизиты счета, куда переводим
     * @param amount сумма перевода
     * @return при успешном переводе true, иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}