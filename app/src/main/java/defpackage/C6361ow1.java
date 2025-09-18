package defpackage;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* renamed from: ow1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6361ow1 implements FunctionWithThrowable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ C6361ow1(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return r.b(this.b, (LocationManager) obj);
            default:
                return r.a(this.b, (LocationManager) obj);
        }
    }
}
