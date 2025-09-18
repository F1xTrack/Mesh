package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.AbstractC0783MR;
import p000.C0071B7;
import p000.C0786MU;
import p000.C0912OU;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C1415WU;
import p000.C6790rv;
import p000.C6853sv;
import p000.ExecutorC10023kY0;
import p000.InterfaceC0108Bi;
import p000.InterfaceC0562Iv;
import p000.InterfaceC1478XU;
import p000.InterfaceC7026vf;
import p000.S20;
import p000.T20;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static InterfaceC1478XU lambda$getComponents$0(InterfaceC0562Iv interfaceC0562Iv) {
        return new C1415WU((C0786MU) interfaceC0562Iv.mo4066a(C0786MU.class), interfaceC0562Iv.mo4068c(T20.class), (ExecutorService) interfaceC0562Iv.mo4071h(new C11011sG0(InterfaceC7026vf.class, ExecutorService.class)), new ExecutorC10023kY0((Executor) interfaceC0562Iv.mo4071h(new C11011sG0(InterfaceC0108Bi.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6853sv> getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(InterfaceC1478XU.class);
        c6790rvM24810b.f42153c = LIBRARY_NAME;
        c6790rvM24810b.m24548a(C1087RH.m6929c(C0786MU.class));
        c6790rvM24810b.m24548a(C1087RH.m6927a(T20.class));
        c6790rvM24810b.m24548a(new C1087RH(new C11011sG0(InterfaceC7026vf.class, ExecutorService.class), 1, 0));
        c6790rvM24810b.m24548a(new C1087RH(new C11011sG0(InterfaceC0108Bi.class, Executor.class), 1, 0));
        c6790rvM24810b.f42157g = new C0912OU(3);
        C6853sv c6853svM24549b = c6790rvM24810b.m24549b();
        S20 s20 = new S20(0);
        C6790rv c6790rvM24810b2 = C6853sv.m24810b(S20.class);
        c6790rvM24810b2.f42152b = 1;
        c6790rvM24810b2.f42157g = new C0071B7(22, s20);
        return Arrays.asList(c6853svM24549b, c6790rvM24810b2.m24549b(), AbstractC0783MR.m5363a(LIBRARY_NAME, "18.0.0"));
    }
}
