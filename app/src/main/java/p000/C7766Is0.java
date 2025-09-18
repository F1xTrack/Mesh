package p000;

import android.os.Trace;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: Is0 */
/* loaded from: classes2.dex */
public final class C7766Is0 implements Iterable, InterfaceC11315ue0 {

    /* renamed from: a */
    public final WeakReference f5189a;

    /* renamed from: b */
    public final LinkedHashMap f5190b = new LinkedHashMap();

    /* renamed from: c */
    public final ArrayList f5191c = new ArrayList();

    /* renamed from: d */
    public boolean f5192d;

    public C7766Is0(WeakReference weakReference) {
        this.f5189a = weakReference;
    }

    /* renamed from: b */
    public final boolean m4058b(EnumC0844NP enumC0844NP, Object obj, Object obj2) {
        synchronized (this) {
            if (this.f5192d) {
                return false;
            }
            this.f5191c.add(new C7714Hs0(enumC0844NP, obj, obj2));
            return true;
        }
    }

    /* renamed from: d */
    public final void m4059d() {
        Object obj;
        synchronized (this) {
            try {
                Iterator it = this.f5191c.iterator();
                while (it.hasNext()) {
                    C7714Hs0 c7714Hs0 = (C7714Hs0) it.next();
                    Iterator it2 = iterator();
                    while (it2.hasNext()) {
                        C7558Es0 c7558Es0 = (C7558Es0) it2.next();
                        c7714Hs0.getClass();
                        O90.m5968f(c7558Es0, "moduleHolder");
                        EnumC0844NP enumC0844NP = c7714Hs0.f4561a;
                        Object obj2 = c7714Hs0.f4562b;
                        if (obj2 != null && (obj = c7714Hs0.f4563c) != null) {
                            c7558Es0.m2438c(enumC0844NP, obj2, obj);
                        } else if (obj2 != null) {
                        } else {
                            c7558Es0.m2437b(enumC0844NP);
                        }
                    }
                }
                this.f5191c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final C7558Es0 m4060i(String str) {
        O90.m5968f(str, "name");
        return (C7558Es0) this.f5190b.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f5190b.values().iterator();
    }

    /* renamed from: k */
    public final void m4061k(EnumC0844NP enumC0844NP) {
        if (m4058b(enumC0844NP, null, null)) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            ((C7558Es0) it.next()).m2437b(enumC0844NP);
        }
    }

    /* renamed from: q */
    public final void m4062q(AbstractC11598ws0 abstractC11598ws0) {
        O90.m5968f(abstractC11598ws0, "module");
        OY1.m6083a("[ExpoModulesCore] " + ("ModuleRegistry.register(" + abstractC11598ws0.getClass() + ")"));
        try {
            Object obj = this.f5189a.get();
            if (obj == null) {
                throw new IllegalArgumentException("Cannot create a module for invalid app context.");
            }
            abstractC11598ws0.f45149a = (C0134C7) obj;
            C7558Es0 c7558Es0 = new C7558Es0(abstractC11598ws0);
            AbstractC0705LB.m4915b(new C7506Ds0(c7558Es0, 1));
            this.f5190b.put(c7558Es0.f2934b.f454a, c7558Es0);
        } finally {
            Trace.endSection();
        }
    }
}
