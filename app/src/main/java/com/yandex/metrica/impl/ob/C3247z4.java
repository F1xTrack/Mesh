package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3247z4 {
    private final G9 a;
    private final Om b;
    private final R2 c;
    private Ui d;
    private long e;

    public C3247z4(Context context, C2669c4 c2669c4) {
        this(new G9(Qa.a(context).b(c2669c4)), new Nm(), new R2());
    }

    public boolean a(Boolean bool) {
        Ui ui;
        return Boolean.FALSE.equals(bool) && (ui = this.d) != null && this.c.a(this.e, ui.a, "should report diagnostic");
    }

    public void a() {
        long jA = this.b.a();
        this.e = jA;
        this.a.d(jA).c();
    }

    public C3247z4(G9 g9, Om om, R2 r2) {
        this.a = g9;
        this.b = om;
        this.c = r2;
        this.e = g9.j();
    }

    public void a(Ui ui) {
        this.d = ui;
    }
}
