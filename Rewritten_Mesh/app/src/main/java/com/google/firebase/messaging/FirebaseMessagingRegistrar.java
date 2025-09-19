package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0783MR;
import p000.C0786MU;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C3980eH;
import p000.C6790rv;
import p000.C6853sv;
import p000.C7252zF;
import p000.InterfaceC0562Iv;
import p000.InterfaceC1478XU;
import p000.InterfaceC1604ZU;
import p000.InterfaceC8203Rc1;
import p000.InterfaceC8307Tc1;
import p000.M51;
import p000.U20;

@Keep
@KeepForSdk
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C11011sG0 c11011sG0, InterfaceC0562Iv interfaceC0562Iv) {
        C0786MU c0786mu = (C0786MU) interfaceC0562Iv.mo4066a(C0786MU.class);
        if (interfaceC0562Iv.mo4066a(InterfaceC1604ZU.class) == null) {
            return new FirebaseMessaging(c0786mu, interfaceC0562Iv.mo4068c(C3980eH.class), interfaceC0562Iv.mo4068c(U20.class), (InterfaceC1478XU) interfaceC0562Iv.mo4066a(InterfaceC1478XU.class), interfaceC0562Iv.mo4070f(c11011sG0), (M51) interfaceC0562Iv.mo4066a(M51.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6853sv> getComponents() {
        C11011sG0 c11011sG0 = new C11011sG0(InterfaceC8203Rc1.class, InterfaceC8307Tc1.class);
        C6790rv c6790rvM24810b = C6853sv.m24810b(FirebaseMessaging.class);
        c6790rvM24810b.f42153c = LIBRARY_NAME;
        c6790rvM24810b.m24548a(C1087RH.m6929c(C0786MU.class));
        c6790rvM24810b.m24548a(new C1087RH(0, 0, InterfaceC1604ZU.class));
        c6790rvM24810b.m24548a(C1087RH.m6927a(C3980eH.class));
        c6790rvM24810b.m24548a(C1087RH.m6927a(U20.class));
        c6790rvM24810b.m24548a(C1087RH.m6929c(InterfaceC1478XU.class));
        c6790rvM24810b.m24548a(new C1087RH(c11011sG0, 0, 1));
        c6790rvM24810b.m24548a(C1087RH.m6929c(M51.class));
        c6790rvM24810b.f42157g = new C7252zF(c11011sG0, 1);
        c6790rvM24810b.m24550c(1);
        return Arrays.asList(c6790rvM24810b.m24549b(), AbstractC0783MR.m5363a(LIBRARY_NAME, "24.1.0"));
    }
}
