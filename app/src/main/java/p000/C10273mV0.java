package p000;

import android.os.Bundle;
import androidx.lifecycle.C1742a;
import androidx.savedstate.Recreator;
import java.util.Map;

/* renamed from: mV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10273mV0 {

    /* renamed from: a */
    public final InterfaceC10401nV0 f37729a;

    /* renamed from: b */
    public final C10145lV0 f37730b = new C10145lV0();

    /* renamed from: c */
    public boolean f37731c;

    public C10273mV0(InterfaceC10401nV0 interfaceC10401nV0) {
        this.f37729a = interfaceC10401nV0;
    }

    /* renamed from: a */
    public final void m22830a() {
        InterfaceC10401nV0 interfaceC10401nV0 = this.f37729a;
        AbstractC7538Ei0 lifecycle = interfaceC10401nV0.getLifecycle();
        if (((C1742a) lifecycle).f16309c != EnumC7434Ci0.f1587b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo2368a(new Recreator(interfaceC10401nV0));
        C10145lV0 c10145lV0 = this.f37730b;
        c10145lV0.getClass();
        if (c10145lV0.f37085b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.mo2368a(new C6979uv(2, c10145lV0));
        c10145lV0.f37085b = true;
        this.f37731c = true;
    }

    /* renamed from: b */
    public final void m22831b(Bundle bundle) {
        if (!this.f37731c) {
            m22830a();
        }
        C1742a c1742a = (C1742a) this.f37729a.getLifecycle();
        if (c1742a.f16309c.compareTo(EnumC7434Ci0.f1589d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c1742a.f16309c).toString());
        }
        C10145lV0 c10145lV0 = this.f37730b;
        if (!c10145lV0.f37085b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c10145lV0.f37087d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c10145lV0.f37086c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c10145lV0.f37087d = true;
    }

    /* renamed from: c */
    public final void m22832c(Bundle bundle) {
        O90.m5968f(bundle, "outBundle");
        C10145lV0 c10145lV0 = this.f37730b;
        c10145lV0.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c10145lV0.f37086c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        WU0 wu0 = c10145lV0.f37084a;
        wu0.getClass();
        UU0 uu0 = new UU0(wu0);
        wu0.f13216c.put(uu0, Boolean.FALSE);
        while (uu0.hasNext()) {
            Map.Entry entry = (Map.Entry) uu0.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC10017kV0) entry.getValue()).mo18401a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
