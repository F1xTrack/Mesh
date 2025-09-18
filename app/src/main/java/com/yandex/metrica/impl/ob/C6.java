package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public class C6 {
    private Context a;
    private B6 b;
    private G6 c;

    public C6(Context context) {
        this(context, new B6(context), new G6(context));
    }

    public void a() {
        this.a.getPackageName();
        this.c.a().a(this.b.a());
    }

    public C6(Context context, B6 b6, G6 g6) {
        this.a = context;
        this.b = b6;
        this.c = g6;
    }
}
