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

/* renamed from: io.appmetrica.analytics.impl.Re */
/* loaded from: classes2.dex */
public final class C4782Re implements Parcelable {

    /* renamed from: a */
    public final ContentValues f30696a;

    /* renamed from: b */
    public final ResultReceiver f30697b;

    /* renamed from: c */
    public static final String f30695c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<C4782Re> CREATOR = new C4759Qe();

    public C4782Re(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f30696a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f30695c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f30697b = resultReceiver;
    }

    /* renamed from: a */
    public final void m19763a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap mapM19478b = AbstractC4550Hl.m19478b(map);
            synchronized (this) {
                this.f30696a.put("PROCESS_CFG_CLIDS", AbstractC5020bb.m20174b(mapM19478b));
            }
        }
    }

    /* renamed from: b */
    public final void m19765b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f30696a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC5182hn.m20513a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    /* renamed from: c */
    public final void m19767c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f30696a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            m19775j();
        }
    }

    /* renamed from: d */
    public final void m19769d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                m19765b(appMetricaConfig);
                m19763a(appMetricaConfig);
                m19767c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m19770e() {
        return this.f30696a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    /* renamed from: f */
    public final String m19771f() {
        return this.f30696a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    /* renamed from: g */
    public final Integer m19772g() {
        return this.f30696a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    /* renamed from: h */
    public final String m19773h() {
        return this.f30696a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: i */
    public final boolean m19774i() {
        return this.f30696a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    /* renamed from: j */
    public final synchronized void m19775j() {
        this.f30696a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f30696a + ", mDataResultReceiver=" + this.f30697b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f30696a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f30697b);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public final HashMap m19762a() {
        return AbstractC5020bb.m20176c(this.f30696a.getAsString("PROCESS_CFG_CLIDS"));
    }

    /* renamed from: c */
    public final ResultReceiver m19766c() {
        return this.f30697b;
    }

    /* renamed from: d */
    public final String m19768d() {
        return this.f30696a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public C4782Re(C4782Re c4782Re) {
        synchronized (c4782Re) {
            this.f30696a = new ContentValues(c4782Re.f30696a);
            this.f30697b = c4782Re.f30697b;
        }
    }

    /* renamed from: b */
    public final ArrayList m19764b() {
        String asString = this.f30696a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC5020bb.m20175b(asString);
    }

    public C4782Re(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f30696a = contentValues == null ? new ContentValues() : contentValues;
        this.f30697b = resultReceiver;
    }
}
