package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p000.AbstractC0783MR;
import p000.C0409GU;
import p000.C0786MU;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C11159tQ0;
import p000.C6717r1;
import p000.C6790rv;
import p000.C6853sv;
import p000.C7252zF;
import p000.InterfaceC0108Bi;
import p000.InterfaceC0562Iv;
import p000.InterfaceC1136S3;
import p000.InterfaceC1478XU;
import p000.InterfaceC6953uV;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static C11159tQ0 lambda$getComponents$0(C11011sG0 c11011sG0, InterfaceC0562Iv interfaceC0562Iv) {
        C0409GU c0409gu;
        Context context = (Context) interfaceC0562Iv.mo4066a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) interfaceC0562Iv.mo4071h(c11011sG0);
        C0786MU c0786mu = (C0786MU) interfaceC0562Iv.mo4066a(C0786MU.class);
        InterfaceC1478XU interfaceC1478XU = (InterfaceC1478XU) interfaceC0562Iv.mo4066a(InterfaceC1478XU.class);
        C6717r1 c6717r1 = (C6717r1) interfaceC0562Iv.mo4066a(C6717r1.class);
        synchronized (c6717r1) {
            try {
                if (!c6717r1.f41284a.containsKey("frc")) {
                    c6717r1.f41284a.put("frc", new C0409GU(c6717r1.f41285b));
                }
                c0409gu = (C0409GU) c6717r1.f41284a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new C11159tQ0(context, scheduledExecutorService, c0786mu, interfaceC1478XU, c0409gu, interfaceC0562Iv.mo4068c(InterfaceC1136S3.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6853sv> getComponents() {
        C11011sG0 c11011sG0 = new C11011sG0(InterfaceC0108Bi.class, ScheduledExecutorService.class);
        C6790rv c6790rv = new C6790rv(C11159tQ0.class, new Class[]{InterfaceC6953uV.class});
        c6790rv.f42153c = LIBRARY_NAME;
        c6790rv.m24548a(C1087RH.m6929c(Context.class));
        c6790rv.m24548a(new C1087RH(c11011sG0, 1, 0));
        c6790rv.m24548a(C1087RH.m6929c(C0786MU.class));
        c6790rv.m24548a(C1087RH.m6929c(InterfaceC1478XU.class));
        c6790rv.m24548a(C1087RH.m6929c(C6717r1.class));
        c6790rv.m24548a(C1087RH.m6927a(InterfaceC1136S3.class));
        c6790rv.f42157g = new C7252zF(c11011sG0, 3);
        c6790rv.m24550c(2);
        return Arrays.asList(c6790rv.m24549b(), AbstractC0783MR.m5363a(LIBRARY_NAME, "22.1.0"));
    }
}
