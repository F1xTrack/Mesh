package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0783MR;
import p000.C0928Ok;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C6790rv;
import p000.C6853sv;
import p000.C8749ad1;
import p000.C8877bd1;
import p000.InterfaceC0562Iv;
import p000.InterfaceC10939ri0;
import p000.InterfaceC8203Rc1;
import p000.InterfaceC8307Tc1;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ InterfaceC8307Tc1 lambda$getComponents$0(InterfaceC0562Iv interfaceC0562Iv) {
        C8877bd1.m10476b((Context) interfaceC0562Iv.mo4066a(Context.class));
        return C8877bd1.m10475a().m10477c(C0928Ok.f8588f);
    }

    public static /* synthetic */ InterfaceC8307Tc1 lambda$getComponents$1(InterfaceC0562Iv interfaceC0562Iv) {
        C8877bd1.m10476b((Context) interfaceC0562Iv.mo4066a(Context.class));
        return C8877bd1.m10475a().m10477c(C0928Ok.f8588f);
    }

    public static /* synthetic */ InterfaceC8307Tc1 lambda$getComponents$2(InterfaceC0562Iv interfaceC0562Iv) {
        C8877bd1.m10476b((Context) interfaceC0562Iv.mo4066a(Context.class));
        return C8877bd1.m10475a().m10477c(C0928Ok.f8587e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6853sv> getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(InterfaceC8307Tc1.class);
        c6790rvM24810b.f42153c = LIBRARY_NAME;
        c6790rvM24810b.m24548a(C1087RH.m6929c(Context.class));
        c6790rvM24810b.f42157g = new C8749ad1(0);
        C6853sv c6853svM24549b = c6790rvM24810b.m24549b();
        C6790rv c6790rvM24809a = C6853sv.m24809a(new C11011sG0(InterfaceC10939ri0.class, InterfaceC8307Tc1.class));
        c6790rvM24809a.m24548a(C1087RH.m6929c(Context.class));
        c6790rvM24809a.f42157g = new C8749ad1(1);
        C6853sv c6853svM24549b2 = c6790rvM24809a.m24549b();
        C6790rv c6790rvM24809a2 = C6853sv.m24809a(new C11011sG0(InterfaceC8203Rc1.class, InterfaceC8307Tc1.class));
        c6790rvM24809a2.m24548a(C1087RH.m6929c(Context.class));
        c6790rvM24809a2.f42157g = new C8749ad1(2);
        return Arrays.asList(c6853svM24549b, c6853svM24549b2, c6790rvM24809a2.m24549b(), AbstractC0783MR.m5363a(LIBRARY_NAME, "19.0.0"));
    }
}
