package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;

/* loaded from: classes2.dex */
public class Ui {
    public final long a;

    public Ui(long j) {
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Ui.class == obj.getClass() && this.a == ((Ui) obj).a;
    }

    public int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return AbstractC7209tN0.y(new StringBuilder("StatSending{disabledReportingInterval="), this.a, '}');
    }
}
