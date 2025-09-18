package com.yandex.metrica.impl.p022ob;

import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Vi */
/* loaded from: classes2.dex */
public class C3009Vi {

    /* renamed from: a */
    public final a f22621a;

    /* renamed from: b */
    public final a f22622b;

    /* renamed from: com.yandex.metrica.impl.ob.Vi$a */
    public static class a {

        /* renamed from: a */
        public final int f22623a;

        /* renamed from: b */
        public final long f22624b;

        public a(int i, long j) {
            this.f22623a = i;
            this.f22624b = j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Item{refreshEventCount=");
            sb.append(this.f22623a);
            sb.append(", refreshPeriodSeconds=");
            return AbstractC11153tN0.m24913y(sb, this.f22624b, '}');
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vi$b */
    public enum b {
        WIFI,
        CELL
    }

    public C3009Vi(a aVar, a aVar2) {
        this.f22621a = aVar;
        this.f22622b = aVar2;
    }

    public String toString() {
        return "ThrottlingConfig{cell=" + this.f22621a + ", wifi=" + this.f22622b + '}';
    }
}
