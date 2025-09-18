package defpackage;

import android.os.Bundle;
import androidx.fragment.app.l;
import androidx.fragment.app.o;

/* renamed from: vv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7692vv implements InterfaceC5515kV0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C7692vv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC5515kV0
    public final Bundle a() {
        switch (this.a) {
            case 0:
                return AbstractActivityC0629Hv.d((AbstractActivityC0629Hv) this.b);
            case 1:
                l lVar = (l) this.b;
                while (l.f(lVar.e())) {
                }
                lVar.b.e(EnumC0123Bi0.ON_STOP);
                return new Bundle();
            case 2:
                return ((o) this.b).V();
            default:
                return C3975gV0.a((C3975gV0) this.b);
        }
    }
}
