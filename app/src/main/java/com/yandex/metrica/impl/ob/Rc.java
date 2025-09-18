package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class Rc {
    private final A8 a;
    private final Cc b;

    public Rc(Context context) {
        this(Qa.a(context).e(), new Cc(context));
    }

    public void a(Tc tc) {
        String strA = this.b.a(tc);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.a.a(tc.d(), strA);
    }

    public Rc(A8 a8, Cc cc) {
        this.a = a8;
        this.b = cc;
    }
}
