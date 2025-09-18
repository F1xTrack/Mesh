package defpackage;

import android.app.Activity;
import io.appmetrica.analytics.impl.InterfaceC4933vd;
import io.appmetrica.analytics.impl.Wb;
import io.appmetrica.analytics.impl.Zj;

/* renamed from: Qp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1314Qp1 implements InterfaceC4933vd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Zj b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ C1314Qp1(Zj zj, Activity activity, int i) {
        this.a = i;
        this.b = zj;
        this.c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4933vd
    public final void consume(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a(this.c, (Wb) obj);
                break;
            default:
                this.b.b(this.c, (Wb) obj);
                break;
        }
    }
}
