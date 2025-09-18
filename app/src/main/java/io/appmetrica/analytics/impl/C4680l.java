package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4680l implements InterfaceC4728n {
    public final HashSet a = new HashSet();

    public C4680l(C4776p c4776p) {
        c4776p.a(this, new EnumC4704m[0]);
    }

    public final synchronized void a(InterfaceC4656k interfaceC4656k) {
        this.a.add(interfaceC4656k);
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C4842ri) ((InterfaceC4656k) it.next())).a(activity);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4728n
    public final void a(Activity activity, EnumC4704m enumC4704m) {
        C4805q4.h().c.a().execute(new RunnableC4632j(this, activity));
    }
}
