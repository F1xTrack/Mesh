package com.yandex.metrica.impl.p022ob;

import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Ui */
/* loaded from: classes2.dex */
public class C2984Ui {

    /* renamed from: a */
    public final long f22494a;

    public C2984Ui(long j) {
        this.f22494a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2984Ui.class == obj.getClass() && this.f22494a == ((C2984Ui) obj).f22494a;
    }

    public int hashCode() {
        long j = this.f22494a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return AbstractC11153tN0.m24913y(new StringBuilder("StatSending{disabledReportingInterval="), this.f22494a, '}');
    }
}
