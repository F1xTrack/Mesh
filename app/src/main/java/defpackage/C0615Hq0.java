package defpackage;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Hq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615Hq0 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public C0615Hq0(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((C2535cY) ((InterfaceC1940Yq0) it.next())).a.o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC1940Yq0 interfaceC1940Yq0) {
        this.b.remove(interfaceC1940Yq0);
        C0537Gq0 c0537Gq0 = (C0537Gq0) this.c.remove(interfaceC1940Yq0);
        if (c0537Gq0 != null) {
            c0537Gq0.a.b(c0537Gq0.b);
            c0537Gq0.b = null;
        }
        this.a.run();
    }
}
