package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3374jo;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.io */
/* loaded from: classes2.dex */
public class C3348io<D> implements InterfaceC3296go<D> {

    /* renamed from: a */
    private final Comparator<D> f23661a;

    /* renamed from: b */
    private final int f23662b;

    /* renamed from: c */
    private final InterfaceC2839Om f23663c;

    /* renamed from: d */
    final long f23664d;

    /* renamed from: e */
    private D f23665e;

    /* renamed from: f */
    private int f23666f;

    /* renamed from: g */
    private long f23667g;

    public C3348io(Comparator<D> comparator, InterfaceC2839Om interfaceC2839Om, int i, long j) {
        this.f23661a = comparator;
        this.f23662b = i;
        this.f23663c = interfaceC2839Om;
        this.f23664d = TimeUnit.SECONDS.toMillis(j);
    }

    /* renamed from: a */
    private void m16100a() {
        this.f23666f = 0;
        this.f23667g = this.f23663c.mo14676c();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3296go
    public C3374jo<D> get(D d) {
        D d2 = this.f23665e;
        if (d2 != d) {
            if (this.f23661a.compare(d2, d) != 0) {
                this.f23665e = d;
                m16100a();
                return new C3374jo<>(C3374jo.a.NEW, this.f23665e);
            }
            this.f23665e = d;
        }
        int i = this.f23666f + 1;
        this.f23666f = i;
        this.f23666f = i % this.f23662b;
        if (this.f23663c.mo14676c() - this.f23667g >= this.f23664d) {
            m16100a();
            return new C3374jo<>(C3374jo.a.REFRESH, this.f23665e);
        }
        if (this.f23666f != 0) {
            return new C3374jo<>(C3374jo.a.NOT_CHANGED, this.f23665e);
        }
        m16100a();
        return new C3374jo<>(C3374jo.a.REFRESH, this.f23665e);
    }
}
