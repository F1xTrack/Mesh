package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.g6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2771g6 {
    private final int a;
    private final C2870k6 b;
    private C2796h6 c;

    public C2771g6(Context context, C2669c4 c2669c4, int i) {
        this(new C2870k6(context, c2669c4), i);
    }

    private void b() {
        this.b.a(this.c);
    }

    public N0 a(String str) {
        if (this.c == null) {
            C2796h6 c2796h6A = this.b.a();
            this.c = c2796h6A;
            int iD = c2796h6A.d();
            int i = this.a;
            if (iD != i) {
                this.c.b(i);
                b();
            }
        }
        int iHashCode = str.hashCode();
        if (this.c.b().contains(Integer.valueOf(iHashCode))) {
            return N0.NON_FIRST_OCCURENCE;
        }
        N0 n0 = this.c.e() ? N0.FIRST_OCCURRENCE : N0.UNKNOWN;
        if (this.c.c() < 1000) {
            this.c.a(iHashCode);
        } else {
            this.c.a(false);
        }
        b();
        return n0;
    }

    public C2771g6(C2870k6 c2870k6, int i) {
        this.a = i;
        this.b = c2870k6;
    }

    public void a() {
        if (this.c == null) {
            C2796h6 c2796h6A = this.b.a();
            this.c = c2796h6A;
            int iD = c2796h6A.d();
            int i = this.a;
            if (iD != i) {
                this.c.b(i);
                b();
            }
        }
        this.c.a();
        this.c.a(true);
        b();
    }
}
