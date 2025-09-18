package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.ui */
/* loaded from: classes2.dex */
public final class C5502ui implements SdkEnvironmentProvider {

    /* renamed from: a */
    public final Context f32692a;

    /* renamed from: b */
    public final C4393Bb f32693b = new C4393Bb();

    /* renamed from: c */
    public final CopyOnWriteArrayList f32694c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public SdkEnvironment f32695d;

    /* renamed from: e */
    public String f32696e;

    public C5502ui(Context context) {
        this.f32692a = context;
        this.f32695d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.2.0", "50105519", AbstractC5527vi.m21160a()), "phone", C4393Bb.m19231a(context.getResources().getConfiguration()));
    }

    /* renamed from: a */
    public final synchronized void m21133a(ScreenInfo screenInfo) {
        float f;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.f32696e;
                    if (str == null) {
                        Context context = this.f32692a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = AbstractC4949Yd.f31112a;
                        try {
                            f = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f = 0.0f;
                        }
                        if (f == 0.0f) {
                            str = "phone";
                        } else {
                            float f2 = point.x;
                            float f3 = point.y;
                            float fMin = Math.min(f2 / f, f3 / f);
                            float f4 = f * 160.0f;
                            float f5 = f2 / f4;
                            float f6 = f3 / f4;
                            double dSqrt = Math.sqrt((f6 * f6) + (f5 * f5));
                            str = (dSqrt < 15.0d || AbstractC4949Yd.f31112a.hasSystemFeature(context, "android.hardware.touchscreen")) ? (dSqrt >= 7.0d || fMin >= 600.0f) ? "tablet" : "phone" : "tv";
                        }
                    }
                    this.f32695d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f32694c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC5489u5) ((InterfaceC5477ti) it.next())).m21118d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m21137b(InterfaceC5477ti interfaceC5477ti) {
        this.f32694c.remove(interfaceC5477ti);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f32695d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        O90.m5977o("sdkEnvironment");
        throw null;
    }

    /* renamed from: a */
    public final synchronized void m21135a(String str) {
        if (str != null) {
            if (!str.equals(this.f32696e)) {
                this.f32696e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f32695d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f32694c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC5489u5) ((InterfaceC5477ti) it.next())).m21118d();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m21136a(String str, String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!O90.m5963a(appVersionInfo.getAppVersionName(), str) || !O90.m5963a(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f32695d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f32694c.iterator();
            while (it.hasNext()) {
                ((AbstractC5489u5) ((InterfaceC5477ti) it.next())).m21118d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m21132a(Configuration configuration) {
        this.f32693b.getClass();
        List listM19231a = C4393Bb.m19231a(configuration);
        if (!O90.m5963a(getSdkEnvironment().getLocales(), listM19231a)) {
            this.f32695d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, listM19231a, 31, null);
            Iterator it = this.f32694c.iterator();
            while (it.hasNext()) {
                ((AbstractC5489u5) ((InterfaceC5477ti) it.next())).m21118d();
            }
        }
    }

    /* renamed from: a */
    public final void m21134a(InterfaceC5477ti interfaceC5477ti) {
        this.f32694c.add(interfaceC5477ti);
    }
}
