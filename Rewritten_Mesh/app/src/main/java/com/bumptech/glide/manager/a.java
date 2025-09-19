package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.o;
import defpackage.AbstractC0121Bh1;
import defpackage.AbstractC0357Ei0;
import defpackage.C1058Ni0;
import defpackage.CC0;
import defpackage.JR0;
import defpackage.MR0;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {
    public final HashMap a = new HashMap();
    public final MR0 b;

    public a(MR0 mr0) {
        this.b = mr0;
    }

    public final JR0 a(Context context, com.bumptech.glide.a aVar, AbstractC0357Ei0 abstractC0357Ei0, o oVar, boolean z) {
        AbstractC0121Bh1.a();
        AbstractC0121Bh1.a();
        HashMap map = this.a;
        JR0 jr0 = (JR0) map.get(abstractC0357Ei0);
        if (jr0 != null) {
            return jr0;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC0357Ei0);
        JR0 jr0D = this.b.d(aVar, lifecycleLifecycle, new CC0(this, oVar, false, 18), context);
        map.put(abstractC0357Ei0, jr0D);
        lifecycleLifecycle.k(new C1058Ni0(this, abstractC0357Ei0));
        if (z) {
            jr0D.onStart();
        }
        return jr0D;
    }
}
