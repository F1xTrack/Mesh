package com.yandex.metrica;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2968U2;
import com.yandex.metrica.impl.p022ob.C3207dd;

@Deprecated
/* loaded from: classes2.dex */
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new C2457b();

    /* renamed from: a */
    public final ContentValues f20731a;

    public CounterConfiguration(CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f20731a = new ContentValues(counterConfiguration.f20731a);
            m13786s();
        }
    }

    /* renamed from: a */
    public final String m13768a() {
        return this.f20731a.getAsString("CFG_API_KEY");
    }

    /* renamed from: b */
    public final synchronized void m13769b(Location location) {
        byte[] bArrMarshall;
        try {
            ContentValues contentValues = this.f20731a;
            int i = C3207dd.f23231q;
            if (location != null) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeValue(location);
                    bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                } catch (Throwable unused) {
                    parcelObtain.recycle();
                }
            } else {
                bArrMarshall = null;
            }
            contentValues.put("CFG_MANUAL_LOCATION", bArrMarshall);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void m13770c(EnumC2458c enumC2458c) {
        this.f20731a.put("CFG_REPORTER_TYPE", enumC2458c.f20784a);
    }

    /* renamed from: d */
    public final void m13771d(C3806y c3806y) {
        if (C2968U2.m15244a(c3806y.f25543c)) {
            int iIntValue = c3806y.f25543c.intValue();
            synchronized (this) {
                this.f20731a.put("CFG_APP_VERSION_CODE", String.valueOf(iIntValue));
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m13772e(Boolean bool) {
        if (C2968U2.m15244a(bool)) {
            bool.booleanValue();
            synchronized (this) {
                this.f20731a.put("CFG_IS_LOG_ENABLED", bool);
            }
        }
    }

    /* renamed from: f */
    public final void m13773f(Integer num) {
        if (C2968U2.m15244a(num)) {
            num.intValue();
            synchronized (this) {
                this.f20731a.put("CFG_DISPATCH_PERIOD", num);
            }
        }
    }

    /* renamed from: g */
    public final void m13774g(String str) {
        if (C2968U2.m15244a((Object) str)) {
            synchronized (this) {
                this.f20731a.put("CFG_API_KEY", str);
            }
        }
    }

    /* renamed from: h */
    public final void m13775h(C3806y c3806y) {
        if (TextUtils.isEmpty(c3806y.appVersion)) {
            return;
        }
        String str = c3806y.appVersion;
        synchronized (this) {
            this.f20731a.put("CFG_APP_VERSION", str);
        }
    }

    /* renamed from: i */
    public final void m13776i(Integer num) {
        if (C2968U2.m15244a(num)) {
            int iIntValue = num.intValue();
            synchronized (this) {
                ContentValues contentValues = this.f20731a;
                if (iIntValue <= 0) {
                    iIntValue = Integer.MAX_VALUE;
                }
                contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(iIntValue));
            }
        }
    }

    /* renamed from: j */
    public final synchronized void m13777j(String str) {
        this.f20731a.put("CFG_API_KEY", str);
    }

    /* renamed from: k */
    public final synchronized void m13778k(boolean z) {
        this.f20731a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final void m13779l(C3806y c3806y) {
        c3806y.getClass();
        if (C2968U2.m15244a((Object) null)) {
            synchronized (this) {
                ContentValues contentValues = this.f20731a;
                TextUtils.isEmpty(null);
                contentValues.put("CFG_DEVICE_SIZE_TYPE", (String) null);
            }
        }
    }

    /* renamed from: m */
    public final void m13780m(String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            synchronized (this) {
                this.f20731a.put("CFG_REPORTER_TYPE", "appmetrica");
            }
        } else {
            synchronized (this) {
                this.f20731a.put("CFG_REPORTER_TYPE", "manual");
            }
        }
    }

    /* renamed from: n */
    public final synchronized void m13781n(boolean z) {
        this.f20731a.put("CFG_STATISTICS_SENDING", Boolean.valueOf(z));
    }

    /* renamed from: o */
    public final void m13782o(C3806y c3806y) {
        if (C2968U2.m15244a(c3806y.firstActivationAsUpdate)) {
            Boolean bool = c3806y.firstActivationAsUpdate;
            bool.booleanValue();
            synchronized (this) {
                this.f20731a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", bool);
            }
        }
    }

    /* renamed from: p */
    public final void m13783p(Integer num) {
        if (C2968U2.m15244a(num)) {
            num.intValue();
            synchronized (this) {
                this.f20731a.put("CFG_SESSION_TIMEOUT", num);
            }
        }
    }

    /* renamed from: q */
    public final void m13784q(C3806y c3806y) {
        if (C2968U2.m15244a(c3806y.f25547g)) {
            Boolean bool = c3806y.f25547g;
            bool.booleanValue();
            synchronized (this) {
                this.f20731a.put("CFG_PERMISSIONS_COLLECTING", bool);
            }
        }
    }

    /* renamed from: r */
    public final void m13785r(C3806y c3806y) {
        if (C2968U2.m15244a(c3806y.revenueAutoTrackingEnabled)) {
            Boolean bool = c3806y.revenueAutoTrackingEnabled;
            bool.booleanValue();
            synchronized (this) {
                this.f20731a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", bool);
            }
        }
    }

    /* renamed from: s */
    public final void m13786s() {
        if (this.f20731a.containsKey("CFG_REPORTER_TYPE")) {
            return;
        }
        if (this.f20731a.containsKey("CFG_MAIN_REPORTER")) {
            if (!this.f20731a.getAsBoolean("CFG_MAIN_REPORTER").booleanValue()) {
                m13780m(m13768a());
                return;
            } else {
                synchronized (this) {
                    this.f20731a.put("CFG_REPORTER_TYPE", "main");
                }
            }
        }
        if (!this.f20731a.containsKey("CFG_COMMUTATION_REPORTER") || !this.f20731a.getAsBoolean("CFG_COMMUTATION_REPORTER").booleanValue()) {
            return;
        }
        synchronized (this) {
            this.f20731a.put("CFG_REPORTER_TYPE", "commutation");
        }
    }

    public final synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f20731a + '}';
    }

    @Override // android.os.Parcelable
    public final synchronized void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", this.f20731a);
        parcel.writeBundle(bundle);
    }

    public CounterConfiguration() {
        this.f20731a = new ContentValues();
    }

    public CounterConfiguration(C3806y c3806y, EnumC2458c enumC2458c) {
        this();
        synchronized (this) {
            m13774g(c3806y.apiKey);
            m13783p(c3806y.sessionTimeout);
            if (C2968U2.m15244a(c3806y.location)) {
                m13769b(c3806y.location);
            }
            if (C2968U2.m15244a(c3806y.locationTracking)) {
                m13778k(c3806y.locationTracking.booleanValue());
            }
            m13779l(c3806y);
            m13773f(c3806y.f25544d);
            m13776i(c3806y.f25545e);
            m13775h(c3806y);
            m13771d(c3806y);
            m13784q(c3806y);
            m13782o(c3806y);
            Boolean bool = c3806y.statisticsSending;
            if (C2968U2.m15244a(bool)) {
                m13781n(bool.booleanValue());
            }
            Integer num = c3806y.maxReportsInDatabaseCount;
            if (C2968U2.m15244a(num)) {
                this.f20731a.put("MAX_REPORTS_IN_DB_COUNT", num);
            }
            Boolean bool2 = c3806y.nativeCrashReporting;
            if (C2968U2.m15244a(bool2)) {
                this.f20731a.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
            }
            m13785r(c3806y);
            m13770c(enumC2458c);
        }
    }

    public CounterConfiguration(ContentValues contentValues) {
        this.f20731a = contentValues;
        m13786s();
    }
}
