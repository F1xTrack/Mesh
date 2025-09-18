package defpackage;

import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.savedstate.Recreator;
import java.util.Map;

/* renamed from: mV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5897mV0 {
    public final InterfaceC6088nV0 a;
    public final C5706lV0 b = new C5706lV0();
    public boolean c;

    public C5897mV0(InterfaceC6088nV0 interfaceC6088nV0) {
        this.a = interfaceC6088nV0;
    }

    public final void a() {
        InterfaceC6088nV0 interfaceC6088nV0 = this.a;
        AbstractC0357Ei0 lifecycle = interfaceC6088nV0.getLifecycle();
        if (((a) lifecycle).c != EnumC0201Ci0.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(interfaceC6088nV0));
        C5706lV0 c5706lV0 = this.b;
        c5706lV0.getClass();
        if (c5706lV0.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C7501uv(2, c5706lV0));
        c5706lV0.b = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        a aVar = (a) this.a.getLifecycle();
        if (aVar.c.compareTo(EnumC0201Ci0.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + aVar.c).toString());
        }
        C5706lV0 c5706lV0 = this.b;
        if (!c5706lV0.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c5706lV0.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c5706lV0.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c5706lV0.d = true;
    }

    public final void c(Bundle bundle) {
        O90.f(bundle, "outBundle");
        C5706lV0 c5706lV0 = this.b;
        c5706lV0.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c5706lV0.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        WU0 wu0 = c5706lV0.a;
        wu0.getClass();
        UU0 uu0 = new UU0(wu0);
        wu0.c.put(uu0, Boolean.FALSE);
        while (uu0.hasNext()) {
            Map.Entry entry = (Map.Entry) uu0.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC5515kV0) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
