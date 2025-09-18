package io.sentry.android.replay;

import io.sentry.C5759D1;
import io.sentry.C5765F1;
import io.sentry.EnumC6069n1;
import io.sentry.android.replay.capture.C5932f;
import io.sentry.android.replay.capture.C5935i;
import java.io.File;
import java.io.Serializable;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6497nZ;
import p000.O90;
import p000.SO0;
import p000.TO0;

/* renamed from: io.sentry.android.replay.i */
/* loaded from: classes2.dex */
public final class C5949i extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f33984e;

    /* renamed from: f */
    public final /* synthetic */ long f33985f;

    /* renamed from: g */
    public final /* synthetic */ Object f33986g;

    /* renamed from: h */
    public final /* synthetic */ Serializable f33987h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5949i(long j, Object obj, Serializable serializable, int i) {
        super(1);
        this.f33984e = i;
        this.f33985f = j;
        this.f33986g = obj;
        this.f33987h = serializable;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        Serializable serializable = this.f33987h;
        Object obj2 = this.f33986g;
        long j = this.f33985f;
        switch (this.f33984e) {
            case 0:
                C5951k c5951k = (C5951k) obj;
                O90.m5968f(c5951k, "it");
                if (c5951k.f33998b >= j) {
                    TO0 to0 = (TO0) serializable;
                    if (to0.f11337a == null) {
                        to0.f11337a = c5951k.f33999c;
                    }
                    break;
                } else {
                    ((C5950j) obj2).m21671a(c5951k.f33997a);
                    break;
                }
            default:
                C5935i c5935i = (C5935i) obj;
                O90.m5968f(c5935i, "it");
                C5765F1 c5765f1 = c5935i.f33950a;
                if (c5765f1.f33277u.getTime() >= j) {
                    break;
                } else {
                    C5932f c5932f = (C5932f) obj2;
                    c5932f.m21657l(c5932f.m21655j() - 1);
                    File file = c5765f1.f33272p;
                    C5759D1 c5759d1 = c5932f.f33945s;
                    if (file != null) {
                        try {
                            if (!file.delete()) {
                                c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                            }
                        } catch (Throwable th) {
                            c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    }
                    ((SO0) serializable).f10713a = true;
                    break;
                }
        }
        return Boolean.FALSE;
    }
}
