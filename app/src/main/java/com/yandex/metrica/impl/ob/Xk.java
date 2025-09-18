package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Xk {
    public final int a;
    public final String b;
    private final int c = a();

    public Xk(int i, String str) {
        this.a = i;
        this.b = str;
    }

    private int a() {
        return this.b.length() + (this.a * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Xk.class != obj.getClass()) {
            return false;
        }
        Xk xk = (Xk) obj;
        if (this.a != xk.a) {
            return false;
        }
        return this.b.equals(xk.b);
    }

    public int hashCode() {
        return this.c;
    }
}
