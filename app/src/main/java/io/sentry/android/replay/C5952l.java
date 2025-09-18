package io.sentry.android.replay;

import io.sentry.C5782L0;
import io.sentry.InterfaceC5785M0;
import java.util.ArrayList;
import p000.AbstractC11374v51;
import p000.O90;
import p000.TO0;

/* renamed from: io.sentry.android.replay.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5952l implements InterfaceC5785M0 {

    /* renamed from: a */
    public final /* synthetic */ int f34000a;

    /* renamed from: b */
    public final /* synthetic */ TO0 f34001b;

    public /* synthetic */ C5952l(TO0 to0, int i) {
        this.f34000a = i;
        this.f34001b = to0;
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public final void mo3170b(C5782L0 c5782l0) {
        switch (this.f34000a) {
            case 0:
                TO0 to0 = this.f34001b;
                O90.m5968f(c5782l0, "it");
                String str = c5782l0.f33307c;
                to0.f11337a = str != null ? AbstractC11374v51.m25346U('.', str, str) : null;
                break;
            default:
                TO0 to02 = this.f34001b;
                O90.m5968f(c5782l0, "scope");
                to02.f11337a = new ArrayList(c5782l0.f33310f);
                break;
        }
    }
}
