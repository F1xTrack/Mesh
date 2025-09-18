package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Xk */
/* loaded from: classes2.dex */
public class C3061Xk {

    /* renamed from: a */
    public final int f22825a;

    /* renamed from: b */
    public final String f22826b;

    /* renamed from: c */
    private final int f22827c = m15434a();

    public C3061Xk(int i, String str) {
        this.f22825a = i;
        this.f22826b = str;
    }

    /* renamed from: a */
    private int m15434a() {
        return this.f22826b.length() + (this.f22825a * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3061Xk.class != obj.getClass()) {
            return false;
        }
        C3061Xk c3061Xk = (C3061Xk) obj;
        if (this.f22825a != c3061Xk.f22825a) {
            return false;
        }
        return this.f22826b.equals(c3061Xk.f22826b);
    }

    public int hashCode() {
        return this.f22827c;
    }
}
