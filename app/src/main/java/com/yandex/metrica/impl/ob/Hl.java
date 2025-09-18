package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C2712dm;

/* loaded from: classes2.dex */
class Hl {
    private final Xl a;
    private final C2712dm.a b;
    private final Yl c;

    public Hl() {
        this(new Xl(), new C2712dm.a(), new Yl());
    }

    public Gl a(Activity activity, C2662bm c2662bm, C2661bl c2661bl, InterfaceC2835il interfaceC2835il, boolean z) throws Throwable {
        if (z) {
            return new Gl();
        }
        Yl yl = this.c;
        this.b.getClass();
        return yl.a(activity, interfaceC2835il, c2662bm, c2661bl, new C2712dm(c2662bm, Oh.a()), this.a);
    }

    public Hl(Xl xl, C2712dm.a aVar, Yl yl) {
        this.a = xl;
        this.b = aVar;
        this.c = yl;
    }
}
