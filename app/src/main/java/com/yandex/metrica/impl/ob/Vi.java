package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;

/* loaded from: classes2.dex */
public class Vi {
    public final a a;
    public final a b;

    public static class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Item{refreshEventCount=");
            sb.append(this.a);
            sb.append(", refreshPeriodSeconds=");
            return AbstractC7209tN0.y(sb, this.b, '}');
        }
    }

    public enum b {
        WIFI,
        CELL
    }

    public Vi(a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public String toString() {
        return "ThrottlingConfig{cell=" + this.a + ", wifi=" + this.b + '}';
    }
}
