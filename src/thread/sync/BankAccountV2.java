package thread.sync;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class BankAccountV2 implements BankAccount{
    private int balance;

    public BankAccountV2(int initialBalance) {  //초기 잔고 -> 계좌 잔고
        this.balance = initialBalance;
    }

    @Override
    public synchronized boolean withdraw(int amount) {  // synchronized : 한번에 하나의 스레드만 실행 가능. 다른 스레드는 실행 불가. 동기화된 메서드
        log("거래 시작 : "+getClass().getSimpleName());

        //잔고가 출금액 보다 적으면, 진행하면 안됨
        //  ==임계 영역 시작==
        log("[검증 시작] 출금액 : "+amount+", 잔액 : "+balance);
        if(balance<amount){
            log("[검증 실패] 출금액 : "+amount+", 잔액 : "+balance);
            return false;
        }
        // 잔고가 출금액 보다 많으면, 진행
        log("[검증 완료] 출금액 : "+amount+", 잔액 : "+balance);
        sleep(1000);    //출금에 걸리는 시간으로 가정
        //잔고가 출금액 보다 많으면, 진행

        balance = balance - amount;
        log("[출금 완료] 출금액 : "+amount+", 잔액 : "+balance);
        //  ==임계 영역 종료==

        log("거래 종료 ");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
