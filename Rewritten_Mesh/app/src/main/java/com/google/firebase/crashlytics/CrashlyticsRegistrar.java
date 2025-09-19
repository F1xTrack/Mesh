package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p000.AbstractC0783MR;
import p000.C0071B7;
import p000.C0095BV;
import p000.C0221DV;
import p000.C0786MU;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C6790rv;
import p000.C6853sv;
import p000.C8028Nt0;
import p000.EnumC9897jZ0;
import p000.InterfaceC0108Bi;
import p000.InterfaceC1136S3;
import p000.InterfaceC1478XU;
import p000.InterfaceC6726rA;
import p000.InterfaceC6953uV;
import p000.InterfaceC7026vf;
import p000.InterfaceC8214Ri0;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d */
    public static final /* synthetic */ int f18449d = 0;

    /* renamed from: a */
    public final C11011sG0 f18450a = new C11011sG0(InterfaceC7026vf.class, ExecutorService.class);

    /* renamed from: b */
    public final C11011sG0 f18451b = new C11011sG0(InterfaceC0108Bi.class, ExecutorService.class);

    /* renamed from: c */
    public final C11011sG0 f18452c = new C11011sG0(InterfaceC8214Ri0.class, ExecutorService.class);

    static {
        EnumC9897jZ0 enumC9897jZ0 = EnumC9897jZ0.f35235a;
        Map map = C0221DV.f2023b;
        if (map.containsKey(enumC9897jZ0)) {
            enumC9897jZ0.toString();
        } else {
            map.put(enumC9897jZ0, new C0095BV(new C8028Nt0(true)));
            enumC9897jZ0.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(FirebaseCrashlytics.class);
        c6790rvM24810b.f42153c = "fire-cls";
        c6790rvM24810b.m24548a(C1087RH.m6929c(C0786MU.class));
        c6790rvM24810b.m24548a(C1087RH.m6929c(InterfaceC1478XU.class));
        c6790rvM24810b.m24548a(new C1087RH(this.f18450a, 1, 0));
        c6790rvM24810b.m24548a(new C1087RH(this.f18451b, 1, 0));
        c6790rvM24810b.m24548a(new C1087RH(this.f18452c, 1, 0));
        c6790rvM24810b.m24548a(new C1087RH(0, 2, InterfaceC6726rA.class));
        c6790rvM24810b.m24548a(new C1087RH(0, 2, InterfaceC1136S3.class));
        c6790rvM24810b.m24548a(new C1087RH(0, 2, InterfaceC6953uV.class));
        c6790rvM24810b.f42157g = new C0071B7(25, this);
        c6790rvM24810b.m24550c(2);
        return Arrays.asList(c6790rvM24810b.m24549b(), AbstractC0783MR.m5363a("fire-cls", "19.4.0"));
    }
}
