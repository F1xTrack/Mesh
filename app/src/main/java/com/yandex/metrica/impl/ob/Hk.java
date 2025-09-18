package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.List;

/* loaded from: classes2.dex */
class Hk implements InterfaceC2637am {
    private final Lk a;
    private final F9 b;
    private final InterfaceC2935ml c;
    private final a d;
    private final boolean e;

    public static class a {
    }

    public static class b {
    }

    public Hk(Lk lk, F9 f9, boolean z, InterfaceC2935ml interfaceC2935ml, a aVar) {
        this.a = lk;
        this.b = f9;
        this.e = z;
        this.c = interfaceC2935ml;
        this.d = aVar;
    }

    private boolean b(Il il) {
        if (!il.c || il.g == null) {
            return false;
        }
        return this.e || this.b.a(false);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public void a(long j, Activity activity, Gl gl, List<Wl> list, Il il, C2686cl c2686cl) {
        if (b(il)) {
            a aVar = this.d;
            Kl kl = il.g;
            aVar.getClass();
            this.a.a((kl.h ? new C2786gl() : new C2711dl(list)).a(activity, gl, il.g, c2686cl.a(), j));
            this.c.onResult(this.a.a());
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public void a(Throwable th, C2662bm c2662bm) {
        this.c.onError("exception: " + th.getMessage());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public boolean a(Il il) {
        return b(il) && !il.g.h;
    }
}
