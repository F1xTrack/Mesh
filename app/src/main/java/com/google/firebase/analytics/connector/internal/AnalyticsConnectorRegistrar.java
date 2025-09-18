package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0783MR;
import p000.C0786MU;
import p000.C1087RH;
import p000.C1199T3;
import p000.C6790rv;
import p000.C6821sP;
import p000.C6853sv;
import p000.C8141Px1;
import p000.CG1;
import p000.ExecutorC1215TJ;
import p000.InterfaceC0562Iv;
import p000.InterfaceC1136S3;
import p000.M51;
import p000.S20;

@Keep
@KeepForSdk
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC1136S3 lambda$getComponents$0(InterfaceC0562Iv interfaceC0562Iv) {
        C0786MU c0786mu = (C0786MU) interfaceC0562Iv.mo4066a(C0786MU.class);
        Context context = (Context) interfaceC0562Iv.mo4066a(Context.class);
        M51 m51 = (M51) interfaceC0562Iv.mo4066a(M51.class);
        Preconditions.checkNotNull(c0786mu);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(m51);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (C1199T3.f11129c == null) {
            synchronized (C1199T3.class) {
                try {
                    if (C1199T3.f11129c == null) {
                        Bundle bundle = new Bundle(1);
                        c0786mu.m5379a();
                        if ("[DEFAULT]".equals(c0786mu.f7175b)) {
                            ((C6821sP) m51).m24735c(new ExecutorC1215TJ(14), new C8141Px1());
                            bundle.putBoolean("dataCollectionDefaultEnabled", c0786mu.m5383j());
                        }
                        C1199T3.f11129c = new C1199T3(CG1.m1131d(context, bundle).f1290d);
                    }
                } finally {
                }
            }
        }
        return C1199T3.f11129c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<C6853sv> getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(InterfaceC1136S3.class);
        c6790rvM24810b.m24548a(C1087RH.m6929c(C0786MU.class));
        c6790rvM24810b.m24548a(C1087RH.m6929c(Context.class));
        c6790rvM24810b.m24548a(C1087RH.m6929c(M51.class));
        c6790rvM24810b.f42157g = new S20(26);
        c6790rvM24810b.m24550c(2);
        return Arrays.asList(c6790rvM24810b.m24549b(), AbstractC0783MR.m5363a("fire-analytics", "22.2.0"));
    }
}
