package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.h4 */
/* loaded from: classes2.dex */
public final class C5163h4 {

    /* renamed from: a */
    public final IdentifiersResult f31826a;

    /* renamed from: b */
    public final IdentifiersResult f31827b;

    /* renamed from: c */
    public final IdentifiersResult f31828c;

    /* renamed from: d */
    public final IdentifiersResult f31829d;

    /* renamed from: e */
    public final IdentifiersResult f31830e;

    /* renamed from: f */
    public final IdentifiersResult f31831f;

    /* renamed from: g */
    public final IdentifiersResult f31832g;

    /* renamed from: h */
    public final IdentifiersResult f31833h;

    /* renamed from: i */
    public final IdentifiersResult f31834i;

    /* renamed from: j */
    public final IdentifiersResult f31835j;

    /* renamed from: k */
    public final IdentifiersResult f31836k;

    /* renamed from: l */
    public final long f31837l;

    /* renamed from: m */
    public final long f31838m;

    /* renamed from: n */
    public final C4801S9 f31839n;

    /* renamed from: o */
    public final Bundle f31840o;

    public C5163h4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j, long j2, C4801S9 c4801s9, Bundle bundle) {
        this.f31826a = identifiersResult;
        this.f31827b = identifiersResult2;
        this.f31828c = identifiersResult3;
        this.f31829d = identifiersResult4;
        this.f31830e = identifiersResult5;
        this.f31831f = identifiersResult6;
        this.f31832g = identifiersResult7;
        this.f31833h = identifiersResult8;
        this.f31834i = identifiersResult9;
        this.f31835j = identifiersResult10;
        this.f31836k = identifiersResult11;
        this.f31837l = j;
        this.f31838m = j2;
        this.f31839n = c4801s9;
        this.f31840o = bundle;
    }

    /* renamed from: a */
    public static IdentifiersResult m20483a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    /* renamed from: b */
    public final void m20485b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f31826a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f31827b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f31828c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f31829d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f31830e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f31831f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f31832g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f31833h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f31834i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f31835j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f31836k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f31837l);
        bundle.putLong("NextStartupTime", this.f31838m);
        C4801S9 c4801s9 = this.f31839n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c4801s9);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C5244ka.f32038C.m20628m().m19209h());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f31826a + ", mDeviceIdData=" + this.f31827b + ", mDeviceIdHashData=" + this.f31828c + ", mReportAdUrlData=" + this.f31829d + ", mGetAdUrlData=" + this.f31830e + ", mResponseClidsData=" + this.f31831f + ", mClientClidsForRequestData=" + this.f31832g + ", mGaidData=" + this.f31833h + ", mHoaidData=" + this.f31834i + ", yandexAdvIdData=" + this.f31835j + ", customSdkHostsData=" + this.f31836k + ", mServerTimeOffset=" + this.f31837l + ", nextStartupTime=" + this.f31838m + ", features=" + this.f31839n + ", modulesConfig=" + this.f31840o + '}';
    }

    /* renamed from: a */
    public static C4801S9 m20481a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C4801S9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C4801S9 c4801s9 = (C4801S9) parcelable;
        return c4801s9 == null ? new C4801S9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c4801s9;
    }

    /* renamed from: a */
    public static IdentifiersResult m20484a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    /* renamed from: a */
    public static C4801S9 m20482a(Boolean bool) {
        boolean z = bool != null;
        return new C4801S9(bool, z ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z ? null : "no identifier in startup state");
    }
}
