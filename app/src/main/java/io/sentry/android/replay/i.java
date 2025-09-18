package io.sentry.android.replay;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import defpackage.SO0;
import defpackage.TO0;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.F1;
import java.io.File;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class i extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(long j, Object obj, Serializable serializable, int i) {
        super(1);
        this.e = i;
        this.f = j;
        this.g = obj;
        this.h = serializable;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        Serializable serializable = this.h;
        Object obj2 = this.g;
        long j = this.f;
        switch (this.e) {
            case 0:
                k kVar = (k) obj;
                O90.f(kVar, "it");
                if (kVar.b >= j) {
                    TO0 to0 = (TO0) serializable;
                    if (to0.a == null) {
                        to0.a = kVar.c;
                    }
                    break;
                } else {
                    ((j) obj2).a(kVar.a);
                    break;
                }
            default:
                io.sentry.android.replay.capture.i iVar = (io.sentry.android.replay.capture.i) obj;
                O90.f(iVar, "it");
                F1 f1 = iVar.a;
                if (f1.u.getTime() >= j) {
                    break;
                } else {
                    io.sentry.android.replay.capture.f fVar = (io.sentry.android.replay.capture.f) obj2;
                    fVar.l(fVar.j() - 1);
                    File file = f1.p;
                    D1 d1 = fVar.s;
                    if (file != null) {
                        try {
                            if (!file.delete()) {
                                d1.getLogger().k(EnumC5148n1.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                            }
                        } catch (Throwable th) {
                            d1.getLogger().c(EnumC5148n1.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    }
                    ((SO0) serializable).a = true;
                    break;
                }
        }
        return Boolean.FALSE;
    }
}
