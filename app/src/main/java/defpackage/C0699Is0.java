package defpackage;

import android.os.Trace;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: Is0 */
/* loaded from: classes2.dex */
public final class C0699Is0 implements Iterable, InterfaceC7451ue0 {
    public final WeakReference a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c = new ArrayList();
    public boolean d;

    public C0699Is0(WeakReference weakReference) {
        this.a = weakReference;
    }

    public final boolean b(NP np, Object obj, Object obj2) {
        synchronized (this) {
            if (this.d) {
                return false;
            }
            this.c.add(new C0621Hs0(np, obj, obj2));
            return true;
        }
    }

    public final void d() {
        Object obj;
        synchronized (this) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    C0621Hs0 c0621Hs0 = (C0621Hs0) it.next();
                    Iterator it2 = iterator();
                    while (it2.hasNext()) {
                        C0387Es0 c0387Es0 = (C0387Es0) it2.next();
                        c0621Hs0.getClass();
                        O90.f(c0387Es0, "moduleHolder");
                        NP np = c0621Hs0.a;
                        Object obj2 = c0621Hs0.b;
                        if (obj2 != null && (obj = c0621Hs0.c) != null) {
                            c0387Es0.c(np, obj2, obj);
                        } else if (obj2 != null) {
                        } else {
                            c0387Es0.b(np);
                        }
                    }
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0387Es0 i(String str) {
        O90.f(str, "name");
        return (C0387Es0) this.b.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.values().iterator();
    }

    public final void k(NP np) {
        if (b(np, null, null)) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            ((C0387Es0) it.next()).b(np);
        }
    }

    public final void q(AbstractC7874ws0 abstractC7874ws0) {
        O90.f(abstractC7874ws0, "module");
        OY1.a("[ExpoModulesCore] " + ("ModuleRegistry.register(" + abstractC7874ws0.getClass() + ")"));
        try {
            Object obj = this.a.get();
            if (obj == null) {
                throw new IllegalArgumentException("Cannot create a module for invalid app context.");
            }
            abstractC7874ws0.a = (C7) obj;
            C0387Es0 c0387Es0 = new C0387Es0(abstractC7874ws0);
            LB.b(new C0309Ds0(c0387Es0, 1));
            this.b.put(c0387Es0.b.a, c0387Es0);
        } finally {
            Trace.endSection();
        }
    }
}
