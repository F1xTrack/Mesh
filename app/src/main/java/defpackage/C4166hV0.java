package defpackage;

import android.os.Bundle;
import java.util.Map;

/* renamed from: hV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4166hV0 implements InterfaceC5515kV0 {
    public final C5706lV0 a;
    public boolean b;
    public Bundle c;
    public final F71 d;

    public C4166hV0(C5706lV0 c5706lV0, InterfaceC2001Zk1 interfaceC2001Zk1) {
        O90.f(c5706lV0, "savedStateRegistry");
        this.a = c5706lV0;
        this.d = LB.b(new C6685qd0(22, interfaceC2001Zk1));
    }

    @Override // defpackage.InterfaceC5515kV0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C4357iV0) this.d.getValue()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((C3975gV0) entry.getValue()).e.a();
            if (!O90.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.c = bundle;
        this.b = true;
    }
}
