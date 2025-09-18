package androidx.fragment.app;

import android.view.View;
import java.util.LinkedHashSet;
import p000.C0744Lp;
import p000.HS1;
import p000.O90;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public abstract class AbstractC1723e {

    /* renamed from: a */
    public final C1740v f16181a;

    /* renamed from: b */
    public final C0744Lp f16182b;

    public AbstractC1723e(C1740v c1740v, C0744Lp c0744Lp) {
        this.f16181a = c1740v;
        this.f16182b = c0744Lp;
    }

    /* renamed from: a */
    public final void m10020a() {
        C1740v c1740v = this.f16181a;
        C0744Lp c0744Lp = this.f16182b;
        LinkedHashSet linkedHashSet = c1740v.f16281e;
        if (linkedHashSet.remove(c0744Lp) && linkedHashSet.isEmpty()) {
            c1740v.m10119b();
        }
    }

    /* renamed from: b */
    public final boolean m10021b() {
        C1740v c1740v = this.f16181a;
        View view = c1740v.f16279c.mView;
        O90.m5967e(view, "operation.fragment.mView");
        int iM3430a = HS1.m3430a(view);
        int i = c1740v.f16277a;
        return iM3430a == i || !(iM3430a == 2 || i == 2);
    }
}
