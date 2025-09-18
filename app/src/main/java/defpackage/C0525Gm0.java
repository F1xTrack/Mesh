package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.dylanvann.fastimage.FastImageViewPackage;
import com.facebook.react.bridge.UIManagerProvider;
import com.horcrux.svg.SvgPackage;
import com.reactnative.ivpusic.imagepicker.e;
import com.swmansion.reanimated.ReanimatedPackage;
import io.appmetrica.analytics.reactnative.AppMetricaPackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.mes.dnevnik.MainApplication;
import ru.mes.dnevnik.R;

/* renamed from: Gm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0525Gm0 extends PL0 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525Gm0(MainApplication mainApplication) {
        super(mainApplication);
        O90.f(mainApplication, "application");
        this.c = true;
    }

    @Override // defpackage.PL0
    public final boolean d() {
        return false;
    }

    @Override // defpackage.PL0
    public final String getJSBundleFile() {
        C1246Pt c1246Pt = C1246Pt.m;
        if (c1246Pt == null) {
            throw new C7074sg("A CodePush instance has not been created yet. Have you added it to your app's list of ReactPackages?");
        }
        String strD = c1246Pt.d("index.android.bundle");
        O90.e(strD, "getJSBundleFile(...)");
        return strD;
    }

    @Override // defpackage.PL0
    public final EnumC8200ya0 getJSEngineResolutionAlgorithm() {
        Boolean boolValueOf = Boolean.valueOf(this.c);
        if (boolValueOf.equals(Boolean.TRUE)) {
            return EnumC8200ya0.b;
        }
        if (boolValueOf.equals(Boolean.FALSE)) {
            return EnumC8200ya0.a;
        }
        throw new C7074sg();
    }

    @Override // defpackage.PL0
    public final String getJSMainModuleName() {
        return "index";
    }

    @Override // defpackage.PL0
    public final List getPackages() throws Resources.NotFoundException {
        C7750wD c7750wD = new C7750wD(1);
        ML0 ml0 = new ML0(1);
        AppMetricaPackage appMetricaPackage = new AppMetricaPackage();
        ML0 ml02 = new ML0(11);
        FastImageViewPackage fastImageViewPackage = new FastImageViewPackage();
        ML0 ml03 = new ML0(9);
        HMSAvailabilityPackage hMSAvailabilityPackage = new HMSAvailabilityPackage();
        HmsPushPackage hmsPushPackage = new HmsPushPackage();
        C1444Sh c1444Sh = new C1444Sh(0);
        C1444Sh c1444Sh2 = new C1444Sh(5);
        C5395jt c5395jt = new C5395jt();
        C7000sH0 c7000sH0 = new C7000sH0(1);
        C1444Sh c1444Sh3 = new C1444Sh(11);
        C1444Sh c1444Sh4 = new C1444Sh(2);
        C1444Sh c1444Sh5 = new C1444Sh(23);
        C1444Sh c1444Sh6 = new C1444Sh(24);
        C1444Sh c1444Sh7 = new C1444Sh(26);
        C1444Sh c1444Sh8 = new C1444Sh(27);
        C1444Sh c1444Sh9 = new C1444Sh(28);
        C1444Sh c1444Sh10 = new C1444Sh(25);
        C7000sH0 c7000sH02 = new C7000sH0(9);
        C1444Sh c1444Sh11 = new C1444Sh(29);
        C1444Sh c1444Sh12 = new C1444Sh(9);
        C6457pR c6457pR = new C6457pR();
        C1444Sh c1444Sh13 = new C1444Sh(7);
        C7000sH0 c7000sH03 = new C7000sH0(6);
        String string = getApplication().getResources().getString(R.string.CodePushDeploymentKey);
        Context applicationContext = getApplication().getApplicationContext();
        C1246Pt c1246Pt = new C1246Pt();
        c1246Pt.a = false;
        Context applicationContext2 = applicationContext.getApplicationContext();
        c1246Pt.g = applicationContext2;
        String absolutePath = applicationContext.getFilesDir().getAbsolutePath();
        C3476du c3476du = new C3476du();
        c3476du.a = absolutePath;
        c1246Pt.c = c3476du;
        C2411bu c2411bu = new C2411bu();
        c2411bu.a = applicationContext2.getSharedPreferences("CodePush", 0);
        c1246Pt.d = c2411bu;
        c1246Pt.f = string;
        HZ0 hz0 = new HZ0();
        hz0.a = applicationContext2.getSharedPreferences("CodePush", 0);
        c1246Pt.e = hz0;
        if (C1246Pt.j == null) {
            try {
                C1246Pt.j = applicationContext2.getPackageManager().getPackageInfo(applicationContext2.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                throw new C3286cu("Unable to get package info for " + c1246Pt.g.getPackageName(), e);
            }
        }
        C1246Pt.m = c1246Pt;
        String strC = c1246Pt.c("PublicKey");
        if (strC != null) {
            C1246Pt.l = strC;
        }
        String strC2 = c1246Pt.c("ServerUrl");
        if (strC2 != null) {
            C1246Pt.k = strC2;
        }
        c1246Pt.e();
        C1444Sh c1444Sh14 = new C1444Sh(14);
        C7000sH0 c7000sH04 = new C7000sH0(2);
        C2312bN c2312bN = new C2312bN(0);
        C1444Sh c1444Sh15 = new C1444Sh(15);
        LH0 lh0 = new LH0();
        ML0 ml04 = new ML0(0);
        C1444Sh c1444Sh16 = new C1444Sh(16);
        C1444Sh c1444Sh17 = new C1444Sh(3);
        C7000sH0 c7000sH05 = new C7000sH0(4);
        e eVar = new e();
        C1444Sh c1444Sh18 = new C1444Sh(17);
        C2312bN c2312bN2 = new C2312bN(1);
        C6121ng0 c6121ng0 = new C6121ng0();
        C1444Sh c1444Sh19 = new C1444Sh(6);
        C1444Sh c1444Sh20 = new C1444Sh(8);
        C1444Sh c1444Sh21 = new C1444Sh(12);
        C1444Sh c1444Sh22 = new C1444Sh(13);
        C1444Sh c1444Sh23 = new C1444Sh(18);
        C7000sH0 c7000sH06 = new C7000sH0(3);
        ML0 ml05 = new ML0(2);
        ReanimatedPackage reanimatedPackage = new ReanimatedPackage();
        ML0 ml06 = new ML0(6);
        ML0 ml07 = new ML0(5);
        ML0 ml08 = new ML0(7);
        C2312bN c2312bN3 = new C2312bN(3);
        C2312bN c2312bN4 = new C2312bN(2);
        C1444Sh c1444Sh24 = new C1444Sh(19);
        C7000sH0 c7000sH07 = new C7000sH0(7);
        C1444Sh c1444Sh25 = new C1444Sh(20);
        C7000sH0 c7000sH08 = new C7000sH0(5);
        ML0 ml09 = new ML0(8);
        SI0 si0 = new SI0();
        si0.a = true;
        ArrayList arrayList = new ArrayList(Arrays.asList(c7750wD, ml0, appMetricaPackage, ml02, fastImageViewPackage, ml03, hMSAvailabilityPackage, hmsPushPackage, c1444Sh, c1444Sh2, c5395jt, c7000sH0, c1444Sh3, c1444Sh4, c1444Sh5, c1444Sh6, c1444Sh7, c1444Sh8, c1444Sh9, c1444Sh10, c7000sH02, c1444Sh11, c1444Sh12, c6457pR, c1444Sh13, c7000sH03, c1246Pt, c1444Sh14, c7000sH04, c2312bN, c1444Sh15, lh0, ml04, c1444Sh16, c1444Sh17, c7000sH05, eVar, c1444Sh18, c2312bN2, c6121ng0, c1444Sh19, c1444Sh20, c1444Sh21, c1444Sh22, c1444Sh23, c7000sH06, ml05, reanimatedPackage, ml06, ml07, ml08, c2312bN3, c2312bN4, c1444Sh24, c7000sH07, c1444Sh25, c7000sH08, ml09, si0, new C7000sH0(8), new SvgPackage(), new ML0(10), new C1444Sh(21), new ML0(4), new C1444Sh(1), new C7000sH0(0), new C1444Sh(22), new ML0(3)));
        arrayList.add(new C1444Sh(10));
        arrayList.add(new C1444Sh(4));
        return arrayList;
    }

    @Override // defpackage.PL0
    public final AbstractC3566eM0 getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    @Override // defpackage.PL0
    public final UIManagerProvider getUIManagerProvider() {
        return null;
    }
}
