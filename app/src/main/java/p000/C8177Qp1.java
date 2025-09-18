package p000;

import android.app.Activity;
import io.appmetrica.analytics.impl.C4899Wb;
import io.appmetrica.analytics.impl.C4979Zj;
import io.appmetrica.analytics.impl.InterfaceC5522vd;

/* renamed from: Qp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8177Qp1 implements InterfaceC5522vd {

    /* renamed from: a */
    public final /* synthetic */ int f9807a;

    /* renamed from: b */
    public final /* synthetic */ C4979Zj f9808b;

    /* renamed from: c */
    public final /* synthetic */ Activity f9809c;

    public /* synthetic */ C8177Qp1(C4979Zj c4979Zj, Activity activity, int i) {
        this.f9807a = i;
        this.f9808b = c4979Zj;
        this.f9809c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5522vd
    public final void consume(Object obj) {
        switch (this.f9807a) {
            case 0:
                this.f9808b.m20090a(this.f9809c, (C4899Wb) obj);
                break;
            default:
                this.f9808b.m20092b(this.f9809c, (C4899Wb) obj);
                break;
        }
    }
}
