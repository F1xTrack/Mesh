package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.g6 */
/* loaded from: classes2.dex */
public class C3278g6 {

    /* renamed from: a */
    private final int f23483a;

    /* renamed from: b */
    private final C3382k6 f23484b;

    /* renamed from: c */
    private C3304h6 f23485c;

    public C3278g6(Context context, C3172c4 c3172c4, int i) {
        this(new C3382k6(context, c3172c4), i);
    }

    /* renamed from: b */
    private void m15979b() {
        this.f23484b.m16263a(this.f23485c);
    }

    /* renamed from: a */
    public EnumC2792N0 m15980a(String str) {
        if (this.f23485c == null) {
            C3304h6 c3304h6M16262a = this.f23484b.m16262a();
            this.f23485c = c3304h6M16262a;
            int iM16036d = c3304h6M16262a.m16036d();
            int i = this.f23483a;
            if (iM16036d != i) {
                this.f23485c.m16034b(i);
                m15979b();
            }
        }
        int iHashCode = str.hashCode();
        if (this.f23485c.m16033b().contains(Integer.valueOf(iHashCode))) {
            return EnumC2792N0.NON_FIRST_OCCURENCE;
        }
        EnumC2792N0 enumC2792N0 = this.f23485c.m16037e() ? EnumC2792N0.FIRST_OCCURRENCE : EnumC2792N0.UNKNOWN;
        if (this.f23485c.m16035c() < 1000) {
            this.f23485c.m16031a(iHashCode);
        } else {
            this.f23485c.m16032a(false);
        }
        m15979b();
        return enumC2792N0;
    }

    public C3278g6(C3382k6 c3382k6, int i) {
        this.f23483a = i;
        this.f23484b = c3382k6;
    }

    /* renamed from: a */
    public void m15981a() {
        if (this.f23485c == null) {
            C3304h6 c3304h6M16262a = this.f23484b.m16262a();
            this.f23485c = c3304h6M16262a;
            int iM16036d = c3304h6M16262a.m16036d();
            int i = this.f23483a;
            if (iM16036d != i) {
                this.f23485c.m16034b(i);
                m15979b();
            }
        }
        this.f23485c.m16030a();
        this.f23485c.m16032a(true);
        m15979b();
    }
}
