package defpackage;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.C4670kd;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import java.io.File;

/* renamed from: Bv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0163Bv1 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4670kd b;
    public final /* synthetic */ NativeCrash c;

    public /* synthetic */ C0163Bv1(C4670kd c4670kd, NativeCrash nativeCrash, int i) {
        this.a = i;
        this.b = c4670kd;
        this.c = nativeCrash;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        switch (this.a) {
            case 0:
                C4670kd.b(this.b, this.c, (File) obj);
                break;
            default:
                C4670kd.a(this.b, this.c, (File) obj);
                break;
        }
    }
}
