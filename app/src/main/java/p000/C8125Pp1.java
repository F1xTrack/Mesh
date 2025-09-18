package p000;

import android.app.Activity;
import io.appmetrica.analytics.impl.C4558I5;
import io.appmetrica.analytics.impl.C4979Zj;
import io.appmetrica.analytics.impl.EnumC5283m;
import io.appmetrica.analytics.impl.InterfaceC5308n;

/* renamed from: Pp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8125Pp1 implements InterfaceC5308n {

    /* renamed from: a */
    public final /* synthetic */ int f9293a;

    /* renamed from: b */
    public final /* synthetic */ Object f9294b;

    public /* synthetic */ C8125Pp1(int i, Object obj) {
        this.f9293a = i;
        this.f9294b = obj;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5308n
    /* renamed from: a */
    public final void mo6433a(Activity activity, EnumC5283m enumC5283m) {
        switch (this.f9293a) {
            case 0:
                ((C4979Zj) this.f9294b).m20091a(activity, enumC5283m);
                break;
            case 1:
                ((C4979Zj) this.f9294b).m20093b(activity, enumC5283m);
                break;
            default:
                C4558I5.m19492a((C4558I5) this.f9294b, activity, enumC5283m);
                break;
        }
    }
}
