package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p000.AbstractC11153tN0;
import p000.AbstractC9809it0;
import p000.C1087RH;
import p000.C6790rv;
import p000.C6853sv;
import p000.C6914tt;
import p000.C8674a22;
import p000.C9252eW1;
import p000.C9937jt0;
import p000.CY1;

@KeepForSdk
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(C9937jt0.class);
        c6790rvM24810b.m24548a(new C1087RH(2, 0, AbstractC9809it0.class));
        c6790rvM24810b.f42157g = C6914tt.f43397h;
        Object[] objArr = {c6790rvM24810b.m24549b()};
        for (int i = 0; i < 1; i++) {
            C9252eW1 c9252eW1 = CY1.f1425b;
            if (objArr[i] == null) {
                throw new NullPointerException(AbstractC11153tN0.m24909u(i, "at index "));
            }
        }
        C9252eW1 c9252eW12 = CY1.f1425b;
        return new C8674a22(1, objArr);
    }
}
