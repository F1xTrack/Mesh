package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.Wl;

/* renamed from: com.yandex.metrica.impl.ob.bl */
/* loaded from: classes2.dex */
class C2661bl {
    private final Jk a;
    private final Wk b;
    private final int c;

    public C2661bl(Zk<?> zk, int i) {
        this(zk, i, new Jk(zk.b()));
    }

    public Wl.b a(String str) {
        if (str == null) {
            return null;
        }
        Pair<Boolean, Wl.b> pairA = this.b.a(this.c, str);
        if (pairA != null) {
            return (Wl.b) pairA.second;
        }
        Wl.b bVarA = this.a.a(str);
        this.b.a(this.c, str, bVarA != null, bVarA);
        return bVarA;
    }

    public C2661bl(Zk<?> zk, int i, Jk jk) {
        this.c = i;
        this.a = jk;
        this.b = zk.a();
    }
}
