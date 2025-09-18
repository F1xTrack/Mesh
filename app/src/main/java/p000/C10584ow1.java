package p000;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.C5654r;

/* renamed from: ow1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10584ow1 implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ int f39364a;

    /* renamed from: b */
    public final /* synthetic */ C5654r f39365b;

    public /* synthetic */ C10584ow1(C5654r c5654r, int i) {
        this.f39364a = i;
        this.f39365b = c5654r;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public final Object apply(Object obj) {
        switch (this.f39364a) {
            case 0:
                return C5654r.m21278b(this.f39365b, (LocationManager) obj);
            default:
                return C5654r.m21277a(this.f39365b, (LocationManager) obj);
        }
    }
}
