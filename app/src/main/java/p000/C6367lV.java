package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lV */
/* loaded from: classes.dex */
public final class C6367lV {

    /* renamed from: d */
    public static final C6989v4 f37080d = C6989v4.m25319d();

    /* renamed from: a */
    public final ConcurrentHashMap f37081a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C0751Lw f37082b;

    /* renamed from: c */
    public Boolean f37083c;

    public C6367lV(C0786MU c0786mu, InterfaceC9347fG0 interfaceC9347fG0, InterfaceC1478XU interfaceC1478XU, InterfaceC9347fG0 interfaceC9347fG02, RemoteConfigManager remoteConfigManager, C0751Lw c0751Lw, SessionManager sessionManager) {
        Bundle bundle = null;
        this.f37083c = null;
        if (c0786mu == null) {
            this.f37083c = Boolean.FALSE;
            this.f37082b = c0751Lw;
            new H70(new Bundle());
            return;
        }
        C8619Zc1 c8619Zc1 = C8619Zc1.f15028s;
        c8619Zc1.f15032d = c0786mu;
        c0786mu.m5379a();
        C4057fV c4057fV = c0786mu.f7176c;
        c8619Zc1.f15044p = c4057fV.f27224g;
        c8619Zc1.f15034f = interfaceC1478XU;
        c8619Zc1.f15035g = interfaceC9347fG02;
        c8619Zc1.f15037i.execute(new RunnableC8567Yc1(c8619Zc1, 1));
        c0786mu.m5379a();
        Context context = c0786mu.f7174a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            e.getMessage();
        }
        H70 h70 = bundle != null ? new H70(bundle) : new H70();
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC9347fG0);
        this.f37082b = c0751Lw;
        c0751Lw.f6933b = h70;
        C0751Lw.f6930d.f44133b = AbstractC9441g02.m18379c(context);
        c0751Lw.f6934c.m18420c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolM5146h = c0751Lw.m5146h();
        this.f37083c = boolM5146h;
        C6989v4 c6989v4 = f37080d;
        if (c6989v4.f44133b) {
            if (boolM5146h != null ? boolM5146h.booleanValue() : C0786MU.m5375d().m5383j()) {
                c0786mu.m5379a();
                "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(RT1.m7019a(c4057fV.f27224g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (c6989v4.f44133b) {
                    c6989v4.f44132a.getClass();
                }
            }
        }
    }

    /* renamed from: a */
    public static C6367lV m22440a() {
        return (C6367lV) C0786MU.m5375d().m5380b(C6367lV.class);
    }
}
