package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0783MR;
import p000.AbstractC1378Vu;
import p000.C0471HT;
import p000.C1087RH;
import p000.C1100RU;
import p000.C1831cB;
import p000.C6790rv;
import p000.C6853sv;
import p000.C8128Pr0;
import p000.InterfaceC0750Lv;
import p000.InterfaceC6726rA;

/* loaded from: classes.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(InterfaceC6726rA.class);
        c6790rvM24810b.f42153c = "fire-cls-ndk";
        c6790rvM24810b.m24548a(C1087RH.m6929c(Context.class));
        c6790rvM24810b.f42157g = new InterfaceC0750Lv() { // from class: com.google.firebase.crashlytics.ndk.a
            @Override // p000.InterfaceC0750Lv
            /* renamed from: g */
            public final Object mo390g(C8128Pr0 c8128Pr0) {
                this.f18457a.getClass();
                Context context = (Context) c8128Pr0.mo4066a(Context.class);
                return new C1100RU(new C1831cB(context, new JniNativeApi(context), new C0471HT(context)), !(AbstractC1378Vu.m8625j(context, "com.google.firebase.crashlytics.unity_version", "string") != 0));
            }
        };
        c6790rvM24810b.m24550c(2);
        return Arrays.asList(c6790rvM24810b.m24549b(), AbstractC0783MR.m5363a("fire-cls-ndk", "19.4.0"));
    }
}
