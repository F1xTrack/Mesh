package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC0377Fz;
import p000.AbstractC0783MR;
import p000.AbstractC7230yu;
import p000.C0284EV;
import p000.C0786MU;
import p000.C0912OU;
import p000.C10537oZ0;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C6790rv;
import p000.C6853sv;
import p000.C7268zV;
import p000.C7391Bm1;
import p000.C8996cZ0;
import p000.FY0;
import p000.InterfaceC0108Bi;
import p000.InterfaceC0125Bz;
import p000.InterfaceC0562Iv;
import p000.InterfaceC1478XU;
import p000.InterfaceC7026vf;
import p000.InterfaceC8307Tc1;
import p000.InterfaceC8868bZ0;
import p000.InterfaceC9347fG0;
import p000.MY0;
import p000.O90;
import p000.QY0;
import p000.TY0;
import p000.VY0;

@Keep
@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m22267d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lsv;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "EV", "com.google.firebase-firebase-sessions"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C0284EV Companion = new C0284EV();
    private static final C11011sG0 firebaseApp = C11011sG0.m24687a(C0786MU.class);
    private static final C11011sG0 firebaseInstallationsApi = C11011sG0.m24687a(InterfaceC1478XU.class);
    private static final C11011sG0 backgroundDispatcher = new C11011sG0(InterfaceC7026vf.class, AbstractC0377Fz.class);
    private static final C11011sG0 blockingDispatcher = new C11011sG0(InterfaceC0108Bi.class, AbstractC0377Fz.class);
    private static final C11011sG0 transportFactory = C11011sG0.m24687a(InterfaceC8307Tc1.class);
    private static final C11011sG0 sessionsSettings = C11011sG0.m24687a(C10537oZ0.class);
    private static final C11011sG0 sessionLifecycleServiceBinder = C11011sG0.m24687a(InterfaceC8868bZ0.class);

    public static final C7268zV getComponents$lambda$0(InterfaceC0562Iv interfaceC0562Iv) {
        Object objMo4071h = interfaceC0562Iv.mo4071h(firebaseApp);
        O90.m5967e(objMo4071h, "container[firebaseApp]");
        Object objMo4071h2 = interfaceC0562Iv.mo4071h(sessionsSettings);
        O90.m5967e(objMo4071h2, "container[sessionsSettings]");
        Object objMo4071h3 = interfaceC0562Iv.mo4071h(backgroundDispatcher);
        O90.m5967e(objMo4071h3, "container[backgroundDispatcher]");
        Object objMo4071h4 = interfaceC0562Iv.mo4071h(sessionLifecycleServiceBinder);
        O90.m5967e(objMo4071h4, "container[sessionLifecycleServiceBinder]");
        return new C7268zV((C0786MU) objMo4071h, (C10537oZ0) objMo4071h2, (InterfaceC0125Bz) objMo4071h3, (InterfaceC8868bZ0) objMo4071h4);
    }

    public static final VY0 getComponents$lambda$1(InterfaceC0562Iv interfaceC0562Iv) {
        return new VY0();
    }

    public static final QY0 getComponents$lambda$2(InterfaceC0562Iv interfaceC0562Iv) {
        Object objMo4071h = interfaceC0562Iv.mo4071h(firebaseApp);
        O90.m5967e(objMo4071h, "container[firebaseApp]");
        C0786MU c0786mu = (C0786MU) objMo4071h;
        Object objMo4071h2 = interfaceC0562Iv.mo4071h(firebaseInstallationsApi);
        O90.m5967e(objMo4071h2, "container[firebaseInstallationsApi]");
        InterfaceC1478XU interfaceC1478XU = (InterfaceC1478XU) objMo4071h2;
        Object objMo4071h3 = interfaceC0562Iv.mo4071h(sessionsSettings);
        O90.m5967e(objMo4071h3, "container[sessionsSettings]");
        C10537oZ0 c10537oZ0 = (C10537oZ0) objMo4071h3;
        InterfaceC9347fG0 interfaceC9347fG0Mo4070f = interfaceC0562Iv.mo4070f(transportFactory);
        O90.m5967e(interfaceC9347fG0Mo4070f, "container.getProvider(transportFactory)");
        C7391Bm1 c7391Bm1 = new C7391Bm1(17, interfaceC9347fG0Mo4070f);
        Object objMo4071h4 = interfaceC0562Iv.mo4071h(backgroundDispatcher);
        O90.m5967e(objMo4071h4, "container[backgroundDispatcher]");
        return new TY0(c0786mu, interfaceC1478XU, c10537oZ0, c7391Bm1, (InterfaceC0125Bz) objMo4071h4);
    }

    public static final C10537oZ0 getComponents$lambda$3(InterfaceC0562Iv interfaceC0562Iv) {
        Object objMo4071h = interfaceC0562Iv.mo4071h(firebaseApp);
        O90.m5967e(objMo4071h, "container[firebaseApp]");
        Object objMo4071h2 = interfaceC0562Iv.mo4071h(blockingDispatcher);
        O90.m5967e(objMo4071h2, "container[blockingDispatcher]");
        Object objMo4071h3 = interfaceC0562Iv.mo4071h(backgroundDispatcher);
        O90.m5967e(objMo4071h3, "container[backgroundDispatcher]");
        Object objMo4071h4 = interfaceC0562Iv.mo4071h(firebaseInstallationsApi);
        O90.m5967e(objMo4071h4, "container[firebaseInstallationsApi]");
        return new C10537oZ0((C0786MU) objMo4071h, (InterfaceC0125Bz) objMo4071h2, (InterfaceC0125Bz) objMo4071h3, (InterfaceC1478XU) objMo4071h4);
    }

    public static final FY0 getComponents$lambda$4(InterfaceC0562Iv interfaceC0562Iv) {
        C0786MU c0786mu = (C0786MU) interfaceC0562Iv.mo4071h(firebaseApp);
        c0786mu.m5379a();
        Context context = c0786mu.f7174a;
        O90.m5967e(context, "container[firebaseApp].applicationContext");
        Object objMo4071h = interfaceC0562Iv.mo4071h(backgroundDispatcher);
        O90.m5967e(objMo4071h, "container[backgroundDispatcher]");
        return new MY0(context, (InterfaceC0125Bz) objMo4071h);
    }

    public static final InterfaceC8868bZ0 getComponents$lambda$5(InterfaceC0562Iv interfaceC0562Iv) {
        Object objMo4071h = interfaceC0562Iv.mo4071h(firebaseApp);
        O90.m5967e(objMo4071h, "container[firebaseApp]");
        return new C8996cZ0((C0786MU) objMo4071h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6853sv> getComponents() {
        C6790rv c6790rvM24810b = C6853sv.m24810b(C7268zV.class);
        c6790rvM24810b.f42153c = LIBRARY_NAME;
        C11011sG0 c11011sG0 = firebaseApp;
        c6790rvM24810b.m24548a(C1087RH.m6928b(c11011sG0));
        C11011sG0 c11011sG02 = sessionsSettings;
        c6790rvM24810b.m24548a(C1087RH.m6928b(c11011sG02));
        C11011sG0 c11011sG03 = backgroundDispatcher;
        c6790rvM24810b.m24548a(C1087RH.m6928b(c11011sG03));
        c6790rvM24810b.m24548a(C1087RH.m6928b(sessionLifecycleServiceBinder));
        c6790rvM24810b.f42157g = new C0912OU(8);
        c6790rvM24810b.m24550c(2);
        C6853sv c6853svM24549b = c6790rvM24810b.m24549b();
        C6790rv c6790rvM24810b2 = C6853sv.m24810b(VY0.class);
        c6790rvM24810b2.f42153c = "session-generator";
        c6790rvM24810b2.f42157g = new C0912OU(9);
        C6853sv c6853svM24549b2 = c6790rvM24810b2.m24549b();
        C6790rv c6790rvM24810b3 = C6853sv.m24810b(QY0.class);
        c6790rvM24810b3.f42153c = "session-publisher";
        c6790rvM24810b3.m24548a(new C1087RH(c11011sG0, 1, 0));
        C11011sG0 c11011sG04 = firebaseInstallationsApi;
        c6790rvM24810b3.m24548a(C1087RH.m6928b(c11011sG04));
        c6790rvM24810b3.m24548a(new C1087RH(c11011sG02, 1, 0));
        c6790rvM24810b3.m24548a(new C1087RH(transportFactory, 1, 1));
        c6790rvM24810b3.m24548a(new C1087RH(c11011sG03, 1, 0));
        c6790rvM24810b3.f42157g = new C0912OU(10);
        C6853sv c6853svM24549b3 = c6790rvM24810b3.m24549b();
        C6790rv c6790rvM24810b4 = C6853sv.m24810b(C10537oZ0.class);
        c6790rvM24810b4.f42153c = "sessions-settings";
        c6790rvM24810b4.m24548a(new C1087RH(c11011sG0, 1, 0));
        c6790rvM24810b4.m24548a(C1087RH.m6928b(blockingDispatcher));
        c6790rvM24810b4.m24548a(new C1087RH(c11011sG03, 1, 0));
        c6790rvM24810b4.m24548a(new C1087RH(c11011sG04, 1, 0));
        c6790rvM24810b4.f42157g = new C0912OU(11);
        C6853sv c6853svM24549b4 = c6790rvM24810b4.m24549b();
        C6790rv c6790rvM24810b5 = C6853sv.m24810b(FY0.class);
        c6790rvM24810b5.f42153c = "sessions-datastore";
        c6790rvM24810b5.m24548a(new C1087RH(c11011sG0, 1, 0));
        c6790rvM24810b5.m24548a(new C1087RH(c11011sG03, 1, 0));
        c6790rvM24810b5.f42157g = new C0912OU(12);
        C6853sv c6853svM24549b5 = c6790rvM24810b5.m24549b();
        C6790rv c6790rvM24810b6 = C6853sv.m24810b(InterfaceC8868bZ0.class);
        c6790rvM24810b6.f42153c = "sessions-service-binder";
        c6790rvM24810b6.m24548a(new C1087RH(c11011sG0, 1, 0));
        c6790rvM24810b6.f42157g = new C0912OU(13);
        return AbstractC7230yu.m26275f(c6853svM24549b, c6853svM24549b2, c6853svM24549b3, c6853svM24549b4, c6853svM24549b5, c6790rvM24810b6.m24549b(), AbstractC0783MR.m5363a(LIBRARY_NAME, "2.0.8"));
    }
}
