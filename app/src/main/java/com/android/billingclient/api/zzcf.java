package com.android.billingclient.api;

import android.content.Context;
import p000.BA1;
import p000.C0040Ad;
import p000.C0928Ok;
import p000.C7135xO;
import p000.C7754Im0;
import p000.C8411Vc1;
import p000.C8877bd1;
import p000.EnumC11261uD0;
import p000.IN1;
import p000.InterfaceC11821yc1;
import p000.InterfaceC8151Qc1;

/* loaded from: classes.dex */
final class zzcf {
    private boolean zza;
    private InterfaceC8151Qc1 zzb;

    public zzcf(Context context) {
        try {
            C8877bd1.m10476b(context);
            this.zzb = C8877bd1.m10475a().m10477c(C0928Ok.f8587e).m8089a("PLAY_BILLING_LIBRARY", new C7135xO("proto"), new InterfaceC11821yc1() { // from class: com.android.billingclient.api.zzce
                @Override // p000.InterfaceC11821yc1
                public final Object apply(Object obj) {
                    return ((IN1) obj).m1587b();
                }
            });
        } catch (Throwable unused) {
            this.zza = true;
        }
    }

    public final void zza(IN1 in1) {
        if (this.zza) {
            int i = BA1.f614a;
            return;
        }
        try {
            ((C8411Vc1) this.zzb).m8514a(new C0040Ad(in1, EnumC11261uD0.f43594a, null), new C7754Im0(29));
        } catch (Throwable unused) {
            int i2 = BA1.f614a;
        }
    }
}
