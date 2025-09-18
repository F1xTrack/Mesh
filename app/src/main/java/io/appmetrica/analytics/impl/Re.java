package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class Re implements Parcelable {
    public final ContentValues a;
    public final ResultReceiver b;
    public static final String c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<Re> CREATOR = new Qe();

    public Re(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.b = resultReceiver;
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap mapB = Hl.b(map);
            synchronized (this) {
                this.a.put("PROCESS_CFG_CLIDS", AbstractC4450bb.b(mapB));
            }
        }
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.a.put("PROCESS_CFG_CUSTOM_HOSTS", hn.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            j();
        }
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public final String f() {
        return this.a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer g() {
        return this.a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String h() {
        return this.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean i() {
        return this.a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final synchronized void j() {
        this.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.a + ", mDataResultReceiver=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.b);
        parcel.writeBundle(bundle);
    }

    public final HashMap a() {
        return AbstractC4450bb.c(this.a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final ResultReceiver c() {
        return this.b;
    }

    public final String d() {
        return this.a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public Re(Re re) {
        synchronized (re) {
            this.a = new ContentValues(re.a);
            this.b = re.b;
        }
    }

    public final ArrayList b() {
        String asString = this.a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC4450bb.b(asString);
    }

    public Re(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.a = contentValues == null ? new ContentValues() : contentValues;
        this.b = resultReceiver;
    }
}
