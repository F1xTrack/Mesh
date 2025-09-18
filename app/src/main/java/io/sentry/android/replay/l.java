package io.sentry.android.replay;

import defpackage.AbstractC7538v51;
import defpackage.O90;
import defpackage.TO0;
import io.sentry.L0;
import io.sentry.M0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements M0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TO0 b;

    public /* synthetic */ l(TO0 to0, int i) {
        this.a = i;
        this.b = to0;
    }

    @Override // io.sentry.M0
    public final void b(L0 l0) {
        switch (this.a) {
            case 0:
                TO0 to0 = this.b;
                O90.f(l0, "it");
                String str = l0.c;
                to0.a = str != null ? AbstractC7538v51.U('.', str, str) : null;
                break;
            default:
                TO0 to02 = this.b;
                O90.f(l0, "scope");
                to02.a = new ArrayList(l0.f);
                break;
        }
    }
}
