package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C4379Am;
import io.appmetrica.analytics.impl.C5547wd;
import java.util.Currency;

/* loaded from: classes2.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;
    public final long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: g */
        private static final C4379Am f29533g = new C4379Am(new C5547wd("revenue currency"));

        /* renamed from: a */
        final long f29534a;

        /* renamed from: b */
        final Currency f29535b;

        /* renamed from: c */
        Integer f29536c;

        /* renamed from: d */
        String f29537d;

        /* renamed from: e */
        String f29538e;

        /* renamed from: f */
        Receipt f29539f;

        public /* synthetic */ Builder(long j, Currency currency, int i) {
            this(j, currency);
        }

        public Revenue build() {
            return new Revenue(this, 0);
        }

        public Builder withPayload(String str) {
            this.f29538e = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f29537d = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f29536c = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f29539f = receipt;
            return this;
        }

        private Builder(long j, Currency currency) {
            f29533g.mo19211a(currency);
            this.f29534a = j;
            this.f29535b = currency;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* renamed from: a */
            private String f29540a;

            /* renamed from: b */
            private String f29541b;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Receipt build() {
                return new Receipt(this, 0);
            }

            public Builder withData(String str) {
                this.f29540a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f29541b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f29540a;
            this.signature = builder.f29541b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(long j, Currency currency) {
        return new Builder(j, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f29534a;
        this.currency = builder.f29535b;
        this.quantity = builder.f29536c;
        this.productID = builder.f29537d;
        this.payload = builder.f29538e;
        this.receipt = builder.f29539f;
    }
}
