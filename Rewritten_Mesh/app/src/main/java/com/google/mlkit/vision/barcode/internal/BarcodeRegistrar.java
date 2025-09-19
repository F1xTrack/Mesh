package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p000.AbstractC11153tN0;
import p000.C1087RH;
import p000.C4178hQ;
import p000.C6790rv;
import p000.C6853sv;
import p000.C6914tt;
import p000.C7512Dv0;
import p000.C8906bs0;
import p000.CD1;
import p000.KD1;
import p000.MO1;
import p000.PJ1;
import p000.ZE1;

@KeepForSdk
/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(MO1.class);
        c6790rvM24810b.m24548a(C1087RH.m6929c(C8906bs0.class));
        c6790rvM24810b.f42157g = new C6914tt(27);
        C6853sv c6853svM24549b = c6790rvM24810b.m24549b();
        C6790rv c6790rvM24810b2 = C6853sv.m24810b(PJ1.class);
        c6790rvM24810b2.m24548a(C1087RH.m6929c(MO1.class));
        c6790rvM24810b2.m24548a(C1087RH.m6929c(C4178hQ.class));
        c6790rvM24810b2.m24548a(C1087RH.m6929c(C8906bs0.class));
        c6790rvM24810b2.f42157g = new C7512Dv0(28);
        C6853sv c6853svM24549b2 = c6790rvM24810b2.m24549b();
        CD1 cd1 = KD1.f5947b;
        Object[] objArr = {c6853svM24549b, c6853svM24549b2};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(AbstractC11153tN0.m24909u(i, "at index "));
            }
        }
        return new ZE1(2, objArr);
    }
}
