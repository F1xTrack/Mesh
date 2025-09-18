package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.AbstractC1733o;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.util.HashMap;
import p000.AbstractC7381Bh1;
import p000.AbstractC7538Ei0;
import p000.C8006Ni0;
import p000.CC0;
import p000.JR0;
import p000.MR0;

/* renamed from: com.bumptech.glide.manager.a */
/* loaded from: classes.dex */
public final class C1876a {

    /* renamed from: a */
    public final HashMap f17790a = new HashMap();

    /* renamed from: b */
    public final MR0 f17791b;

    public C1876a(MR0 mr0) {
        this.f17791b = mr0;
    }

    /* renamed from: a */
    public final JR0 m10892a(Context context, ComponentCallbacks2C1874a componentCallbacks2C1874a, AbstractC7538Ei0 abstractC7538Ei0, AbstractC1733o abstractC1733o, boolean z) {
        AbstractC7381Bh1.m802a();
        AbstractC7381Bh1.m802a();
        HashMap map = this.f17790a;
        JR0 jr0 = (JR0) map.get(abstractC7538Ei0);
        if (jr0 != null) {
            return jr0;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC7538Ei0);
        JR0 jr0Mo5369d = this.f17791b.mo5369d(componentCallbacks2C1874a, lifecycleLifecycle, new CC0(this, abstractC1733o, false, 18), context);
        map.put(abstractC7538Ei0, jr0Mo5369d);
        lifecycleLifecycle.mo1844k(new C8006Ni0(this, abstractC7538Ei0));
        if (z) {
            jr0Mo5369d.onStart();
        }
        return jr0Mo5369d;
    }
}
