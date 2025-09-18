package p000;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Hq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7710Hq0 {

    /* renamed from: a */
    public final Runnable f4548a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f4549b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final HashMap f4550c = new HashMap();

    public C7710Hq0(Runnable runnable) {
        this.f4548a = runnable;
    }

    /* renamed from: a */
    public final boolean m3607a(MenuItem menuItem) {
        Iterator it = this.f4549b.iterator();
        while (it.hasNext()) {
            if (((C1854cY) ((InterfaceC8594Yq0) it.next())).f17597a.m10079o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m3608b(InterfaceC8594Yq0 interfaceC8594Yq0) {
        this.f4549b.remove(interfaceC8594Yq0);
        C7658Gq0 c7658Gq0 = (C7658Gq0) this.f4550c.remove(interfaceC8594Yq0);
        if (c7658Gq0 != null) {
            c7658Gq0.f3923a.mo2369b(c7658Gq0.f3924b);
            c7658Gq0.f3924b = null;
        }
        this.f4548a.run();
    }
}
