package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Rc */
/* loaded from: classes2.dex */
public class C2903Rc {

    /* renamed from: a */
    private final C2475A8 f22124a;

    /* renamed from: b */
    private final C2529Cc f22125b;

    public C2903Rc(Context context) {
        this(C2877Qa.m14815a(context).m14829e(), new C2529Cc(context));
    }

    /* renamed from: a */
    public void m14996a(C2953Tc c2953Tc) {
        String strM13963a = this.f22125b.m13963a(c2953Tc);
        if (TextUtils.isEmpty(strM13963a)) {
            return;
        }
        this.f22124a.m16677a(c2953Tc.m15187d(), strM13963a);
    }

    public C2903Rc(C2475A8 c2475a8, C2529Cc c2529Cc) {
        this.f22124a = c2475a8;
        this.f22125b = c2529Cc;
    }
}
