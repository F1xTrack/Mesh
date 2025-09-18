package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5705lV {
    public static final C7533v4 d = C7533v4.d();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final C0943Lw b;
    public Boolean c;

    public C5705lV(MU mu, InterfaceC3739fG0 interfaceC3739fG0, XU xu, InterfaceC3739fG0 interfaceC3739fG02, RemoteConfigManager remoteConfigManager, C0943Lw c0943Lw, SessionManager sessionManager) {
        Bundle bundle = null;
        this.c = null;
        if (mu == null) {
            this.c = Boolean.FALSE;
            this.b = c0943Lw;
            new H70(new Bundle());
            return;
        }
        C1977Zc1 c1977Zc1 = C1977Zc1.s;
        c1977Zc1.d = mu;
        mu.a();
        C3783fV c3783fV = mu.c;
        c1977Zc1.p = c3783fV.g;
        c1977Zc1.f = xu;
        c1977Zc1.g = interfaceC3739fG02;
        c1977Zc1.i.execute(new RunnableC1899Yc1(c1977Zc1, 1));
        mu.a();
        Context context = mu.a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            e.getMessage();
        }
        H70 h70 = bundle != null ? new H70(bundle) : new H70();
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC3739fG0);
        this.b = c0943Lw;
        c0943Lw.b = h70;
        C0943Lw.d.b = AbstractC3880g02.c(context);
        c0943Lw.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolH = c0943Lw.h();
        this.c = boolH;
        C7533v4 c7533v4 = d;
        if (c7533v4.b) {
            if (boolH != null ? boolH.booleanValue() : MU.d().j()) {
                mu.a();
                "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(RT1.a(c3783fV.g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (c7533v4.b) {
                    c7533v4.a.getClass();
                }
            }
        }
    }

    public static C5705lV a() {
        return (C5705lV) MU.d().b(C5705lV.class);
    }
}
