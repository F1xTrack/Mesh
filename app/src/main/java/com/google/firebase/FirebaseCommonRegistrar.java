package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import p000.AbstractC0783MR;
import p000.C0079BF;
import p000.C0786MU;
import p000.C0912OU;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C1235Td;
import p000.C3980eH;
import p000.C6730rE;
import p000.C6790rv;
import p000.C6853sv;
import p000.C7252zF;
import p000.InterfaceC7026vf;
import p000.S20;
import p000.T20;
import p000.U20;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: a */
    public static String m11294a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        int i = 0;
        ArrayList arrayList = new ArrayList();
        C6790rv c6790rvM24810b = C6853sv.m24810b(C3980eH.class);
        c6790rvM24810b.m24548a(new C1087RH(2, 0, C1235Td.class));
        c6790rvM24810b.f42157g = new C6730rE(14);
        arrayList.add(c6790rvM24810b.m24549b());
        C11011sG0 c11011sG0 = new C11011sG0(InterfaceC7026vf.class, Executor.class);
        C6790rv c6790rv = new C6790rv(C0079BF.class, new Class[]{T20.class, U20.class});
        c6790rv.m24548a(C1087RH.m6929c(Context.class));
        c6790rv.m24548a(C1087RH.m6929c(C0786MU.class));
        c6790rv.m24548a(new C1087RH(2, 0, S20.class));
        c6790rv.m24548a(new C1087RH(1, 1, C3980eH.class));
        c6790rv.m24548a(new C1087RH(c11011sG0, 1, 0));
        c6790rv.f42157g = new C7252zF(c11011sG0, i);
        arrayList.add(c6790rv.m24549b());
        arrayList.add(AbstractC0783MR.m5363a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC0783MR.m5363a("fire-core", "21.0.0"));
        arrayList.add(AbstractC0783MR.m5363a("device-name", m11294a(Build.PRODUCT)));
        arrayList.add(AbstractC0783MR.m5363a("device-model", m11294a(Build.DEVICE)));
        arrayList.add(AbstractC0783MR.m5363a("device-brand", m11294a(Build.BRAND)));
        arrayList.add(AbstractC0783MR.m5364b("android-target-sdk", new C6730rE(28)));
        arrayList.add(AbstractC0783MR.m5364b("android-min-sdk", new C6730rE(29)));
        arrayList.add(AbstractC0783MR.m5364b("android-platform", new C0912OU(i)));
        arrayList.add(AbstractC0783MR.m5364b("android-installer", new C0912OU(1)));
        try {
            string = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(AbstractC0783MR.m5363a("kotlin", string));
        }
        return arrayList;
    }
}
