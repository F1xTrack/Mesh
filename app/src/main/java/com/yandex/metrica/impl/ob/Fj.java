package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public class Fj {
    private static volatile Fj b;
    private final C2638an a;

    public Fj(C2638an c2638an) {
        this.a = c2638an;
    }

    public static Fj a(Context context) {
        if (b == null) {
            synchronized (Fj.class) {
                try {
                    if (b == null) {
                        b = new Fj(new C2638an(context, "uuid.dat"));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public Ej b(Context context, Cj cj) {
        return new Ej(cj, new Bj(), this.a, new Gj(context, new L0(), new Rm()));
    }

    public Ej a(Context context, Cj cj) {
        return new Ej(cj, new Hj(context, new L0()), this.a, new Gj(context, new L0(), new Rm()));
    }
}
