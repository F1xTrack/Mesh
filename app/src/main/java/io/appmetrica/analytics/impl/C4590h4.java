package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4590h4 {
    public final IdentifiersResult a;
    public final IdentifiersResult b;
    public final IdentifiersResult c;
    public final IdentifiersResult d;
    public final IdentifiersResult e;
    public final IdentifiersResult f;
    public final IdentifiersResult g;
    public final IdentifiersResult h;
    public final IdentifiersResult i;
    public final IdentifiersResult j;
    public final IdentifiersResult k;
    public final long l;
    public final long m;
    public final S9 n;
    public final Bundle o;

    public C4590h4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j, long j2, S9 s9, Bundle bundle) {
        this.a = identifiersResult;
        this.b = identifiersResult2;
        this.c = identifiersResult3;
        this.d = identifiersResult4;
        this.e = identifiersResult5;
        this.f = identifiersResult6;
        this.g = identifiersResult7;
        this.h = identifiersResult8;
        this.i = identifiersResult9;
        this.j = identifiersResult10;
        this.k = identifiersResult11;
        this.l = j;
        this.m = j2;
        this.n = s9;
        this.o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
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

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.l);
        bundle.putLong("NextStartupTime", this.m);
        S9 s9 = this.n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", s9);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C4667ka.C.m().h());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.a + ", mDeviceIdData=" + this.b + ", mDeviceIdHashData=" + this.c + ", mReportAdUrlData=" + this.d + ", mGetAdUrlData=" + this.e + ", mResponseClidsData=" + this.f + ", mClientClidsForRequestData=" + this.g + ", mGaidData=" + this.h + ", mHoaidData=" + this.i + ", yandexAdvIdData=" + this.j + ", customSdkHostsData=" + this.k + ", mServerTimeOffset=" + this.l + ", nextStartupTime=" + this.m + ", features=" + this.n + ", modulesConfig=" + this.o + '}';
    }

    public static S9 a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = S9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        S9 s9 = (S9) parcelable;
        return s9 == null ? new S9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : s9;
    }

    public static IdentifiersResult a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    public static S9 a(Boolean bool) {
        boolean z = bool != null;
        return new S9(bool, z ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z ? null : "no identifier in startup state");
    }
}
