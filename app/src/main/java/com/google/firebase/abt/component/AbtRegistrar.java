package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0783MR;
import p000.C1087RH;
import p000.C4262il;
import p000.C6717r1;
import p000.C6790rv;
import p000.C6853sv;
import p000.InterfaceC0562Iv;
import p000.InterfaceC1136S3;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ C6717r1 lambda$getComponents$0(InterfaceC0562Iv interfaceC0562Iv) {
        return new C6717r1((Context) interfaceC0562Iv.mo4066a(Context.class), interfaceC0562Iv.mo4068c(InterfaceC1136S3.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6853sv> getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(C6717r1.class);
        c6790rvM24810b.f42153c = LIBRARY_NAME;
        c6790rvM24810b.m24548a(C1087RH.m6929c(Context.class));
        c6790rvM24810b.m24548a(C1087RH.m6927a(InterfaceC1136S3.class));
        c6790rvM24810b.f42157g = new C4262il(2);
        return Arrays.asList(c6790rvM24810b.m24549b(), AbstractC0783MR.m5363a(LIBRARY_NAME, "21.1.1"));
    }
}
