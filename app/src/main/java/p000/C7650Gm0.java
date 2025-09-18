package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.dylanvann.fastimage.FastImageViewPackage;
import com.facebook.react.bridge.UIManagerProvider;
import com.horcrux.svg.SvgPackage;
import com.reactnative.ivpusic.imagepicker.C2404e;
import com.swmansion.reanimated.ReanimatedPackage;
import io.appmetrica.analytics.reactnative.AppMetricaPackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.mes.dnevnik.MainApplication;
import ru.mes.dnevnik.R;

/* renamed from: Gm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7650Gm0 extends PL0 {

    /* renamed from: c */
    public final boolean f3874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7650Gm0(MainApplication mainApplication) {
        super(mainApplication);
        O90.m5968f(mainApplication, "application");
        this.f3874c = true;
    }

    @Override // p000.PL0
    /* renamed from: d */
    public final boolean mo3152d() {
        return false;
    }

    @Override // p000.PL0
    public final String getJSBundleFile() {
        C1000Pt c1000Pt = C1000Pt.f9328m;
        if (c1000Pt == null) {
            throw new C6838sg("A CodePush instance has not been created yet. Have you added it to your app's list of ReactPackages?");
        }
        String strM6467d = c1000Pt.m6467d("index.android.bundle");
        O90.m5967e(strM6467d, "getJSBundleFile(...)");
        return strM6467d;
    }

    @Override // p000.PL0
    public final EnumC11816ya0 getJSEngineResolutionAlgorithm() {
        Boolean boolValueOf = Boolean.valueOf(this.f3874c);
        if (boolValueOf.equals(Boolean.TRUE)) {
            return EnumC11816ya0.f46317b;
        }
        if (boolValueOf.equals(Boolean.FALSE)) {
            return EnumC11816ya0.f46316a;
        }
        throw new C6838sg();
    }

    @Override // p000.PL0
    public final String getJSMainModuleName() {
        return "index";
    }

    @Override // p000.PL0
    public final List getPackages() throws Resources.NotFoundException {
        C7061wD c7061wD = new C7061wD(1);
        ML0 ml0 = new ML0(1);
        AppMetricaPackage appMetricaPackage = new AppMetricaPackage();
        ML0 ml02 = new ML0(11);
        FastImageViewPackage fastImageViewPackage = new FastImageViewPackage();
        ML0 ml03 = new ML0(9);
        HMSAvailabilityPackage hMSAvailabilityPackage = new HMSAvailabilityPackage();
        HmsPushPackage hmsPushPackage = new HmsPushPackage();
        C1176Sh c1176Sh = new C1176Sh(0);
        C1176Sh c1176Sh2 = new C1176Sh(5);
        C6265jt c6265jt = new C6265jt();
        C11013sH0 c11013sH0 = new C11013sH0(1);
        C1176Sh c1176Sh3 = new C1176Sh(11);
        C1176Sh c1176Sh4 = new C1176Sh(2);
        C1176Sh c1176Sh5 = new C1176Sh(23);
        C1176Sh c1176Sh6 = new C1176Sh(24);
        C1176Sh c1176Sh7 = new C1176Sh(26);
        C1176Sh c1176Sh8 = new C1176Sh(27);
        C1176Sh c1176Sh9 = new C1176Sh(28);
        C1176Sh c1176Sh10 = new C1176Sh(25);
        C11013sH0 c11013sH02 = new C11013sH0(9);
        C1176Sh c1176Sh11 = new C1176Sh(29);
        C1176Sh c1176Sh12 = new C1176Sh(9);
        C6617pR c6617pR = new C6617pR();
        C1176Sh c1176Sh13 = new C1176Sh(7);
        C11013sH0 c11013sH03 = new C11013sH0(6);
        String string = getApplication().getResources().getString(R.string.CodePushDeploymentKey);
        Context applicationContext = getApplication().getApplicationContext();
        C1000Pt c1000Pt = new C1000Pt();
        c1000Pt.f9329a = false;
        Context applicationContext2 = applicationContext.getApplicationContext();
        c1000Pt.f9335g = applicationContext2;
        String absolutePath = applicationContext.getFilesDir().getAbsolutePath();
        C3956du c3956du = new C3956du();
        c3956du.f26382a = absolutePath;
        c1000Pt.f9331c = c3956du;
        C1814bu c1814bu = new C1814bu();
        c1814bu.f17214a = applicationContext2.getSharedPreferences("CodePush", 0);
        c1000Pt.f9332d = c1814bu;
        c1000Pt.f9334f = string;
        HZ0 hz0 = new HZ0();
        hz0.f4351a = applicationContext2.getSharedPreferences("CodePush", 0);
        c1000Pt.f9333e = hz0;
        if (C1000Pt.f9325j == null) {
            try {
                C1000Pt.f9325j = applicationContext2.getPackageManager().getPackageInfo(applicationContext2.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                throw new C3894cu("Unable to get package info for " + c1000Pt.f9335g.getPackageName(), e);
            }
        }
        C1000Pt.f9328m = c1000Pt;
        String strM6466c = c1000Pt.m6466c("PublicKey");
        if (strM6466c != null) {
            C1000Pt.f9327l = strM6466c;
        }
        String strM6466c2 = c1000Pt.m6466c("ServerUrl");
        if (strM6466c2 != null) {
            C1000Pt.f9326k = strM6466c2;
        }
        c1000Pt.m6468e();
        C1176Sh c1176Sh14 = new C1176Sh(14);
        C11013sH0 c11013sH04 = new C11013sH0(2);
        C1781bN c1781bN = new C1781bN(0);
        C1176Sh c1176Sh15 = new C1176Sh(15);
        LH0 lh0 = new LH0();
        ML0 ml04 = new ML0(0);
        C1176Sh c1176Sh16 = new C1176Sh(16);
        C1176Sh c1176Sh17 = new C1176Sh(3);
        C11013sH0 c11013sH05 = new C11013sH0(4);
        C2404e c2404e = new C2404e();
        C1176Sh c1176Sh18 = new C1176Sh(17);
        C1781bN c1781bN2 = new C1781bN(1);
        C10423ng0 c10423ng0 = new C10423ng0();
        C1176Sh c1176Sh19 = new C1176Sh(6);
        C1176Sh c1176Sh20 = new C1176Sh(8);
        C1176Sh c1176Sh21 = new C1176Sh(12);
        C1176Sh c1176Sh22 = new C1176Sh(13);
        C1176Sh c1176Sh23 = new C1176Sh(18);
        C11013sH0 c11013sH06 = new C11013sH0(3);
        ML0 ml05 = new ML0(2);
        ReanimatedPackage reanimatedPackage = new ReanimatedPackage();
        ML0 ml06 = new ML0(6);
        ML0 ml07 = new ML0(5);
        ML0 ml08 = new ML0(7);
        C1781bN c1781bN3 = new C1781bN(3);
        C1781bN c1781bN4 = new C1781bN(2);
        C1176Sh c1176Sh24 = new C1176Sh(19);
        C11013sH0 c11013sH07 = new C11013sH0(7);
        C1176Sh c1176Sh25 = new C1176Sh(20);
        C11013sH0 c11013sH08 = new C11013sH0(5);
        ML0 ml09 = new ML0(8);
        SI0 si0 = new SI0();
        si0.f10679a = true;
        ArrayList arrayList = new ArrayList(Arrays.asList(c7061wD, ml0, appMetricaPackage, ml02, fastImageViewPackage, ml03, hMSAvailabilityPackage, hmsPushPackage, c1176Sh, c1176Sh2, c6265jt, c11013sH0, c1176Sh3, c1176Sh4, c1176Sh5, c1176Sh6, c1176Sh7, c1176Sh8, c1176Sh9, c1176Sh10, c11013sH02, c1176Sh11, c1176Sh12, c6617pR, c1176Sh13, c11013sH03, c1000Pt, c1176Sh14, c11013sH04, c1781bN, c1176Sh15, lh0, ml04, c1176Sh16, c1176Sh17, c11013sH05, c2404e, c1176Sh18, c1781bN2, c10423ng0, c1176Sh19, c1176Sh20, c1176Sh21, c1176Sh22, c1176Sh23, c11013sH06, ml05, reanimatedPackage, ml06, ml07, ml08, c1781bN3, c1781bN4, c1176Sh24, c11013sH07, c1176Sh25, c11013sH08, ml09, si0, new C11013sH0(8), new SvgPackage(), new ML0(10), new C1176Sh(21), new ML0(4), new C1176Sh(1), new C11013sH0(0), new C1176Sh(22), new ML0(3)));
        arrayList.add(new C1176Sh(10));
        arrayList.add(new C1176Sh(4));
        return arrayList;
    }

    @Override // p000.PL0
    public final AbstractC9231eM0 getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    @Override // p000.PL0
    public final UIManagerProvider getUIManagerProvider() {
        return null;
    }
}
