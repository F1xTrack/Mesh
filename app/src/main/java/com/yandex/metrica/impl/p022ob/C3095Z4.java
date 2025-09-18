package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Z4 */
/* loaded from: classes2.dex */
public class C3095Z4 {

    /* renamed from: a */
    private Long f22929a;

    /* renamed from: b */
    private int f22930b;

    /* renamed from: c */
    private InterfaceC2839Om f22931c;

    /* renamed from: com.yandex.metrica.impl.ob.Z4$a */
    public static class a {

        /* renamed from: a */
        public final long f22932a;

        /* renamed from: b */
        public final long f22933b;

        /* renamed from: c */
        public final int f22934c;

        public a(long j, long j2, int i) {
            this.f22932a = j;
            this.f22934c = i;
            this.f22933b = j2;
        }
    }

    public C3095Z4() {
        this(new C2814Nm());
    }

    /* renamed from: a */
    public a m15536a() {
        if (this.f22929a == null) {
            this.f22929a = Long.valueOf(this.f22931c.mo14675b());
        }
        long jLongValue = this.f22929a.longValue();
        long jLongValue2 = this.f22929a.longValue();
        int i = this.f22930b;
        a aVar = new a(jLongValue, jLongValue2, i);
        this.f22930b = i + 1;
        return aVar;
    }

    public C3095Z4(InterfaceC2839Om interfaceC2839Om) {
        this.f22931c = interfaceC2839Om;
    }
}
