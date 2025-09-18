package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Cf {
    public final HashSet a = new HashSet();
    public Ef b;
    public boolean c;
    public final sn d;
    public final Context e;

    public Cf(Context context, sn snVar) {
        this.e = context;
        this.d = snVar;
        this.b = snVar.b();
        this.c = snVar.c();
    }

    public final void a() {
        if (this.c) {
            return;
        }
        Context context = this.e;
        La laA = Mf.a(context, C4667ka.C.d.a());
        Jf jf = (Jf) new C4887tf(this, new Mf(laA), new C4954wa(context), new Nf(context)).f.getValue();
        try {
            laA.a(jf);
        } catch (Throwable th) {
            jf.a(th);
        }
    }

    public final synchronized void a(Gf gf) {
        this.a.add(gf);
        if (this.c) {
            gf.a(this.b);
        }
    }

    public final synchronized void a(Ef ef) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Gf) it.next()).a(ef);
        }
    }
}
