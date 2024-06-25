package chap02;

import javax.management.Query;
import java.time.Duration;

public class Movie {
    private Money fee;
    private String title;
    private Duration runningTime;
    private DiscountPolicy discountPolicy;

    public Movie(Money fee, String title, Duration runningTime, DiscountPolicy discountPolicy) {
        this.fee = fee;
        this.title = title;
        this.runningTime = runningTime;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
