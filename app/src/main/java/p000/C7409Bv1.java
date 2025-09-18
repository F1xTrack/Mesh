package p000;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.C5247kd;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import java.io.File;

/* renamed from: Bv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C7409Bv1 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f1086a;

    /* renamed from: b */
    public final /* synthetic */ C5247kd f1087b;

    /* renamed from: c */
    public final /* synthetic */ NativeCrash f1088c;

    public /* synthetic */ C7409Bv1(C5247kd c5247kd, NativeCrash nativeCrash, int i) {
        this.f1086a = i;
        this.f1087b = c5247kd;
        this.f1088c = nativeCrash;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        switch (this.f1086a) {
            case 0:
                C5247kd.m20645b(this.f1087b, this.f1088c, (File) obj);
                break;
            default:
                C5247kd.m20644a(this.f1087b, this.f1088c, (File) obj);
                break;
        }
    }
}
