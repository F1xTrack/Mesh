package com.yandex.metrica;

import com.yandex.metrica.impl.p022ob.C3556qo;
import com.yandex.metrica.impl.p022ob.C3582ro;
import java.util.Currency;

/* loaded from: classes2.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;

    @Deprecated
    public final Double price;
    public final Long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: h */
        public static final C3582ro f20748h = new C3582ro(new C3556qo("revenue currency"));

        /* renamed from: a */
        public Double f20749a;

        /* renamed from: b */
        public Long f20750b;

        /* renamed from: c */
        public Currency f20751c;

        /* renamed from: d */
        public Integer f20752d;

        /* renamed from: e */
        public String f20753e;

        /* renamed from: f */
        public String f20754f;

        /* renamed from: g */
        public Receipt f20755g;

        public Revenue build() {
            return new Revenue(this);
        }

        public Builder withPayload(String str) {
            this.f20754f = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f20753e = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f20752d = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f20755g = receipt;
            return this;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a */
            public String f20756a;

            /* renamed from: b */
            public String f20757b;

            public Receipt build() {
                return new Receipt(this);
            }

            public Builder withData(String str) {
                this.f20756a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f20757b = str;
                return this;
            }
        }

        public Receipt(Builder builder) {
            this.data = builder.f20756a;
            this.signature = builder.f20757b;
        }

        public static Builder newBuilder() {
            return new Builder();
        }
    }

    public Revenue(Builder builder) {
        this.price = builder.f20749a;
        this.priceMicros = builder.f20750b;
        this.currency = builder.f20751c;
        this.quantity = builder.f20752d;
        this.productID = builder.f20753e;
        this.payload = builder.f20754f;
        this.receipt = builder.f20755g;
    }

    @Deprecated
    public static Builder newBuilder(double d, Currency currency) {
        Builder builder = new Builder();
        Builder.f20748h.mo14391a(currency);
        builder.f20749a = Double.valueOf(d);
        builder.f20751c = currency;
        return builder;
    }

    public static Builder newBuilderWithMicros(long j, Currency currency) {
        Builder builder = new Builder();
        Builder.f20748h.mo14391a(currency);
        builder.f20750b = Long.valueOf(j);
        builder.f20751c = currency;
        return builder;
    }
}
