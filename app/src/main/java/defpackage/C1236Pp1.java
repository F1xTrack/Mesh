package defpackage;

import android.app.Activity;
import io.appmetrica.analytics.impl.EnumC4704m;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.InterfaceC4728n;
import io.appmetrica.analytics.impl.Zj;

/* renamed from: Pp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1236Pp1 implements InterfaceC4728n {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1236Pp1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4728n
    public final void a(Activity activity, EnumC4704m enumC4704m) {
        switch (this.a) {
            case 0:
                ((Zj) this.b).a(activity, enumC4704m);
                break;
            case 1:
                ((Zj) this.b).b(activity, enumC4704m);
                break;
            default:
                I5.a((I5) this.b, activity, enumC4704m);
                break;
        }
    }
}
