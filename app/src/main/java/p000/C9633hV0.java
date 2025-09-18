package p000;

import android.os.Bundle;
import java.util.Map;

/* renamed from: hV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9633hV0 implements InterfaceC10017kV0 {

    /* renamed from: a */
    public final C10145lV0 f28433a;

    /* renamed from: b */
    public boolean f28434b;

    /* renamed from: c */
    public Bundle f28435c;

    /* renamed from: d */
    public final F71 f28436d;

    public C9633hV0(C10145lV0 c10145lV0, InterfaceC8635Zk1 interfaceC8635Zk1) {
        O90.m5968f(c10145lV0, "savedStateRegistry");
        this.f28433a = c10145lV0;
        this.f28436d = AbstractC0705LB.m4915b(new C10801qd0(22, interfaceC8635Zk1));
    }

    @Override // p000.InterfaceC10017kV0
    /* renamed from: a */
    public final Bundle mo18401a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f28435c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C9761iV0) this.f28436d.getValue()).f29277d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo18401a = ((C9505gV0) entry.getValue()).f27818e.mo18401a();
            if (!O90.m5963a(bundleMo18401a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo18401a);
            }
        }
        this.f28434b = false;
        return bundle;
    }

    /* renamed from: b */
    public final void m18820b() {
        if (this.f28434b) {
            return;
        }
        Bundle bundleM22441a = this.f28433a.m22441a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f28435c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM22441a != null) {
            bundle.putAll(bundleM22441a);
        }
        this.f28435c = bundle;
        this.f28434b = true;
    }
}
