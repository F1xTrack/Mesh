package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Z4 {
    private Long a;
    private int b;
    private Om c;

    public static class a {
        public final long a;
        public final long b;
        public final int c;

        public a(long j, long j2, int i) {
            this.a = j;
            this.c = i;
            this.b = j2;
        }
    }

    public Z4() {
        this(new Nm());
    }

    public a a() {
        if (this.a == null) {
            this.a = Long.valueOf(this.c.b());
        }
        long jLongValue = this.a.longValue();
        long jLongValue2 = this.a.longValue();
        int i = this.b;
        a aVar = new a(jLongValue, jLongValue2, i);
        this.b = i + 1;
        return aVar;
    }

    public Z4(Om om) {
        this.c = om;
    }
}
