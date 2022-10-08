package com.xyz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ATM系统的入口
 */
public class ATMSystem {
    public static void main(String[] args) {
        // 1.定义账户类
        // 2.定义一个集合容器,负责以后存储全部的账户对象,进行相关的业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        // 3.展示系统的首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=================ATM系统================");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");
            System.out.println("请您选择操作:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 用户登录操作
                    login(accounts, sc);
                    break;
                case 2:
                    // 用户账户开户
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作命令不存在");
            }
        }

    }

    /**
     * 登录功能
     *
     * @param accounts 全部账户对象的集合
     * @param sc       扫描器
     */

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("====================系统登录操作========================");
        // 1.判断账户集合中是否存在账户,如果不存在账户,登录功能不能进行.
        if (accounts.size() == 0) {
            System.out.println("对不起,当前系统中,无任何账户,请先开户,再来登录~~");
        }

        // 2.正式登录操作
        while (true) {
            System.out.println("请您输入登录卡号:");
            String cardId = sc.next();
            // 3.判断卡号是否存在,根据卡号去账户集合中查询账户对象.
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null) {
                while (true) {
                    // 卡号存在
                    // 4.让用户输入密码,认证密码
                    System.out.println("请您输入登录密码");
                    String passWord = sc.next();
                    // 判断当前账户对象的密码是否与用户输入的密码一致
                    if (acc.getPassWord().equals(passWord)) {
                        // 登录成功
                        System.out.println("恭喜您," + acc.getUserName() + "登录成功");
                        // 展示登录后的操作页
                        showUserCommand(sc, acc, accounts);
                        return; // 退出登录方法
                    } else {
                        System.out.println("输入的密码有误!");
                    }
                }
            } else {
                System.out.println("对不起,系统中不存在该账户卡号~~");
            }
        }
    }


    /**
     * 展示登录后的操作页
     */
    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("==============用户操作页==============");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 查询账户(展示当前登陆的账户)
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    addMoney(acc, sc);
                    break;
                case 3:
                    // 取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    // 转账
                    transferMoney(sc, acc, accounts);
                    break;
                case 5:
                    // 修改密码
                    updatePassWord(sc, acc);
                    return;
                case 6:
                    // 退出
                    System.out.println("退出成功,欢迎下次光临");
                    return; // 让当前方法停止执行
                case 7:
                    // 注销账户
                    // 删除当前账户对象
                    if (deleteAccount(acc, sc, accounts)) {
                        return;
                    } else {
                        // 未销户成功
                        break;
                    }
                default:
                    System.out.println("您输入的操作命令不正确~~");
                    break;


            }
        }

    }

    /**
     * 销毁账户
     *
     * @param acc
     * @param sc
     * @param accounts
     */

    private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("您真的要销户?y/n");
        String rs = sc.next();
        switch (rs) {

            case "y":
                // 销户
                if (acc.getMoney() > 0) {
                    System.out.println("账户中还有余额,不允许销户!");
                } else {
                    accounts.remove(acc);
                    System.out.println("销户完成!");
                    return true; // 销户成功
                }
                break;
            default:
                System.out.println("当前账户继续保留!");
                break;
        }
        return false;

    }

    /**
     * 修改密码
     *
     * @param sc  扫描器
     * @param acc 当前用户
     */
    private static void updatePassWord(Scanner sc, Account acc) {
        System.out.println("============用户密码修改===========");
        while (true) {
            System.out.println("请您输入当前密码:");
            String passWord = sc.next();
            // 1.判断这个密码是否正确
            if (acc.getPassWord().equals(passWord)) {
                while (true) {
                    // 密码正确
                    // 2.输入新的密码
                    System.out.println("请您输入新的密码");
                    String newPassWord = sc.next();
                    System.out.println("请您再次输入新的密码");
                    String okPassWord = sc.next();
                    if (newPassWord.equals(okPassWord)) {
                        acc.setPassWord(okPassWord);
                        System.out.println("密码修改成功!");
                        return;
                    } else {
                        System.out.println("您输入的两次密码不一致");
                    }
                }

            } else {
                System.out.println("您输入的密码不正确");
            }
        }
    }

    /**
     * 转账功能
     *
     * @param sc       扫描器
     * @param acc      自己的账户
     * @param accounts 全部的集合
     */

    private static void transferMoney(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("=========================转账操作=====================");
            // 1.判断是否足够2个账户
            if (accounts.size() < 2) {
                System.out.println("当前系统中不足两个账户,请去开户");
                return;
            }
            // 2.判断自己的账户是否有钱
            if (acc.getMoney() == 0) {
                System.out.println("对不起,您的余额不足!");
                return;
            }
            System.out.println("请您输入要转账的卡号:");
            String cardId = sc.next();
            // 这个卡号不能是自己的卡号
            if (cardId.equals(acc.getCardId())) {
                System.out.println("您不能给自己转账!");
                continue;// 结束本次执行进入下一次
            }
            // 判断卡号是否存在,根据卡号查账户对象
            Account account = getAccountByCardId(cardId, accounts);
            if (account == null) {
                System.out.println("您输入的卡号不存在!");
            } else {
                // 账户对象存在了
                System.out.println("请您输入对方的姓氏");
                String userName = account.getUserName();
                String tip = "*" + userName.substring(1);
                System.out.println("请输入[" + tip + "]的姓氏");
                String preName = sc.next();

                // 认证姓氏是否准确
                if (userName.startsWith(preName)) {
                    while (true) {
                        // 认证通过,开始转账了
                        System.out.println("请您输入转账金额");
                        double money = sc.nextDouble();
                        if (money > acc.getQuotaMoney()) {
                            System.out.println("转账超出本次限额!");
                        } else {
                            if (money > acc.getMoney()) {
                                System.out.println("转账余额不足!");
                            } else {
                                // 余额足够可以转账
                                System.out.println("转账成功!");
                                acc.setMoney(acc.getMoney() - money);
                                account.setMoney(account.getMoney() + money);
                                showAccount(acc);
                                return;
                            }
                        }
                    }

                } else {
                    System.out.println("对不起,您输入的信息有误!");
                }

            }
        }


    }


    /**
     * 取钱功能
     *
     * @param acc 登录成功的账户
     * @param sc  扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        // 1.首先判断账户有没有超过100元
        if (acc.getMoney() < 100) {
            System.out.println("对不起,余额不足100元!");
            return;
        }
        while (true) {
            // 2.提示用户输入取钱金额
            System.out.println("请您输入取款金额");
            double money = sc.nextDouble();
            // 3.判断金额是否满足要求
            if (money > acc.getQuotaMoney()) {
                System.out.println("对不起,您当前的取款金额超过每次限额,每次最多可取:" + acc.getQuotaMoney());
            } else {
                // 没有超过当次限额
                // 4.是否超过了账户的总余额
                if (money > acc.getMoney()) {
                    System.out.println("余额不足,您目前账户总余额是:" + acc.getMoney());
                } else {
                    // 可以取钱
                    System.out.println("恭喜您,取钱成功" + money + "元");
                    acc.setMoney(acc.getMoney() - money);
                    // 取钱结束了
                    showAccount(acc);
                    return; // 关掉取钱方法
                }
            }
        }

    }

    /**
     * @param acc 登录成功的账户
     * @param sc  扫描器
     */
    private static void addMoney(Account acc, Scanner sc) {
        System.out.println("=================请输入要存入的存款金额===========");
        double money = sc.nextDouble();
        acc.setMoney(acc.getMoney() + money);
        System.out.println("恭喜您,存钱成功,当前账户信息如下:");
        showAccount(acc);
    }

    /**
     * 展示账户信息
     *
     * @param acc 登录成功的账户
     */
    private static void showAccount(Account acc) {
        System.out.println("===================当前账户信息如下====================");
        System.out.println("卡号:" + acc.getCardId());
        System.out.println("姓名:" + acc.getUserName());
        System.out.println("余额:" + acc.getMoney());
        System.out.println("限额:" + acc.getQuotaMoney());
    }

    /**
     * 用户开户功能的实现
     *
     * @param accounts 接受的账户集合
     */

    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==================系统开户操作==================");
        // 1.创建一个账户对象,用于后期封装账户信息
        Account account = new Account();

        // 2.录入当前这个账户的信息,注入到账户对象中去
        System.out.println("请您输入账户用户名:");

        String userName = sc.next();
        account.setUserName(userName);


        while (true) {
            System.out.println("请您输入账户密码:");
            String passWord = sc.next();
            System.out.println("请您输入确认密码:");
            String okPassWord = sc.next();
            if (passWord.equals(okPassWord)) {
                // 密码认证通过,可以注入给账户对象
                account.setPassWord(okPassWord);
                break;// 密码录入成功
            } else {
                System.out.println("对不起,您输入的2次密码不一致,请重新确认~~");

            }
        }


        System.out.println("请您输入账户当次限额");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // 为账户随机一个八位且与其他账户的卡号不重复的号码(独立功能)

        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        // 3.把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println("恭喜您," + userName + "账户开户成功,您的卡号是:" + cardId + "请妥善保管!");
    }

    /**
     * 为账户生成8位与其他用户卡号不同的号码
     */

    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            // 1.先生成8位数字
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);// 0-9
            }

            // 2.判断这个8位卡号是否与其他账户的卡号重复了
            // 根据这个卡号去查询账户的对象
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                // 说明cardId此时没有重复 这个卡号就是一个新卡号了
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询一个账户对象出来
     *
     * @param cardId   卡号
     * @param accounts 账户
     * @return 账户对象|null
     */
    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;// 没有此账号
    }


}
