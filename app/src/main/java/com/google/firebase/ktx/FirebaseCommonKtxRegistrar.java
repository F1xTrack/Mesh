package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import p000.AbstractC0377Fz;
import p000.AbstractC7230yu;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C6790rv;
import p000.C6853sv;
import p000.C7356Av0;
import p000.C7460Cv0;
import p000.C7564Ev0;
import p000.C8326Tm0;
import p000.InterfaceC0108Bi;
import p000.InterfaceC7026vf;
import p000.InterfaceC7637Gf1;
import p000.InterfaceC8214Ri0;

@Keep
@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m22267d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lsv;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6853sv> getComponents() {
        C6790rv c6790rvM24809a = C6853sv.m24809a(new C11011sG0(InterfaceC7026vf.class, AbstractC0377Fz.class));
        c6790rvM24809a.m24548a(new C1087RH(new C11011sG0(InterfaceC7026vf.class, Executor.class), 1, 0));
        c6790rvM24809a.f42157g = C8326Tm0.f11506c;
        C6853sv c6853svM24549b = c6790rvM24809a.m24549b();
        C6790rv c6790rvM24809a2 = C6853sv.m24809a(new C11011sG0(InterfaceC8214Ri0.class, AbstractC0377Fz.class));
        c6790rvM24809a2.m24548a(new C1087RH(new C11011sG0(InterfaceC8214Ri0.class, Executor.class), 1, 0));
        c6790rvM24809a2.f42157g = C7356Av0.f464d;
        C6853sv c6853svM24549b2 = c6790rvM24809a2.m24549b();
        C6790rv c6790rvM24809a3 = C6853sv.m24809a(new C11011sG0(InterfaceC0108Bi.class, AbstractC0377Fz.class));
        c6790rvM24809a3.m24548a(new C1087RH(new C11011sG0(InterfaceC0108Bi.class, Executor.class), 1, 0));
        c6790rvM24809a3.f42157g = C7460Cv0.f1754d;
        C6853sv c6853svM24549b3 = c6790rvM24809a3.m24549b();
        C6790rv c6790rvM24809a4 = C6853sv.m24809a(new C11011sG0(InterfaceC7637Gf1.class, AbstractC0377Fz.class));
        c6790rvM24809a4.m24548a(new C1087RH(new C11011sG0(InterfaceC7637Gf1.class, Executor.class), 1, 0));
        c6790rvM24809a4.f42157g = C7564Ev0.f2961d;
        return AbstractC7230yu.m26275f(c6853svM24549b, c6853svM24549b2, c6853svM24549b3, c6790rvM24809a4.m24549b());
    }
}
