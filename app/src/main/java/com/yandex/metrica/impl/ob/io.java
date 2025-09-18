package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.jo;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class io<D> implements go<D> {
    private final Comparator<D> a;
    private final int b;
    private final Om c;
    final long d;
    private D e;
    private int f;
    private long g;

    public io(Comparator<D> comparator, Om om, int i, long j) {
        this.a = comparator;
        this.b = i;
        this.c = om;
        this.d = TimeUnit.SECONDS.toMillis(j);
    }

    private void a() {
        this.f = 0;
        this.g = this.c.c();
    }

    @Override // com.yandex.metrica.impl.ob.go
    public jo<D> get(D d) {
        D d2 = this.e;
        if (d2 != d) {
            if (this.a.compare(d2, d) != 0) {
                this.e = d;
                a();
                return new jo<>(jo.a.NEW, this.e);
            }
            this.e = d;
        }
        int i = this.f + 1;
        this.f = i;
        this.f = i % this.b;
        if (this.c.c() - this.g >= this.d) {
            a();
            return new jo<>(jo.a.REFRESH, this.e);
        }
        if (this.f != 0) {
            return new jo<>(jo.a.NOT_CHANGED, this.e);
        }
        a();
        return new jo<>(jo.a.REFRESH, this.e);
    }
}
