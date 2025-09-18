package com.yandex.metrica.impl.p022ob;

import android.util.Pair;
import com.yandex.metrica.impl.p022ob.C3037Wl;

/* renamed from: com.yandex.metrica.impl.ob.bl */
/* loaded from: classes2.dex */
class C3163bl {

    /* renamed from: a */
    private final C2712Jk f23145a;

    /* renamed from: b */
    private final C3036Wk f23146b;

    /* renamed from: c */
    private final int f23147c;

    public C3163bl(AbstractC3111Zk<?> abstractC3111Zk, int i) {
        this(abstractC3111Zk, i, new C2712Jk(abstractC3111Zk.m15560b()));
    }

    /* renamed from: a */
    public C3037Wl.b m15694a(String str) {
        if (str == null) {
            return null;
        }
        Pair<Boolean, C3037Wl.b> pairM15396a = this.f23146b.m15396a(this.f23147c, str);
        if (pairM15396a != null) {
            return (C3037Wl.b) pairM15396a.second;
        }
        C3037Wl.b bVarM14445a = this.f23145a.m14445a(str);
        this.f23146b.m15398a(this.f23147c, str, bVarM14445a != null, bVarM14445a);
        return bVarM14445a;
    }

    public C3163bl(AbstractC3111Zk<?> abstractC3111Zk, int i, C2712Jk c2712Jk) {
        this.f23147c = i;
        this.f23145a = c2712Jk;
        this.f23146b = abstractC3111Zk.m15559a();
    }
}
