package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.YandexMetrica;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.U3 */
/* loaded from: classes2.dex */
public class C2969U3 implements Parcelable {

    /* renamed from: a */
    private final ContentValues f22436a;

    /* renamed from: b */
    private ResultReceiver f22437b;

    /* renamed from: c */
    public static final String f22435c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<C2969U3> CREATOR = new a();

    /* renamed from: com.yandex.metrica.impl.ob.U3$a */
    public class a implements Parcelable.Creator<C2969U3> {
        @Override // android.os.Parcelable.Creator
        public C2969U3 createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(ResultReceiverC3454n0.class.getClassLoader());
            return new C2969U3((ContentValues) bundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) bundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
        }

        @Override // android.os.Parcelable.Creator
        public C2969U3[] newArray(int i) {
            return new C2969U3[i];
        }
    }

    public C2969U3(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f22436a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f22435c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f22437b = resultReceiver;
    }

    /* renamed from: a */
    public static C2969U3 m15252a(Bundle bundle) {
        if (bundle != null) {
            try {
                return (C2969U3) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m15259b(C3806y c3806y) {
        synchronized (this) {
            try {
                if (C2968U2.m15244a((Object) c3806y.f25542b)) {
                    List list = c3806y.f25542b;
                    synchronized (this) {
                        this.f22436a.put("PROCESS_CFG_CUSTOM_HOSTS", C3762ym.m17294c((List<String>) list));
                    }
                }
                if (C2968U2.m15244a((Object) c3806y.f25541a)) {
                    Map<String, String> mapM17307i = C3762ym.m17307i(c3806y.f25541a);
                    synchronized (this) {
                        this.f22436a.put("PROCESS_CFG_CLIDS", C3762ym.m17305g(mapM17307i));
                    }
                }
                m15253a(c3806y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public ResultReceiver m15261c() {
        return this.f22437b;
    }

    /* renamed from: d */
    public String m15262d() {
        return this.f22436a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m15263e() {
        return this.f22436a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    /* renamed from: f */
    public String m15264f() {
        return this.f22436a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    /* renamed from: g */
    public Integer m15265g() {
        return this.f22436a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    /* renamed from: h */
    public String m15266h() {
        return this.f22436a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: i */
    public int m15267i() {
        return this.f22436a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue();
    }

    /* renamed from: j */
    public boolean m15268j() {
        return this.f22436a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f22436a + ", mDataResultReceiver=" + this.f22437b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f22436a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f22437b);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    private void m15253a(C3806y c3806y) {
        c3806y.getClass();
        if (C2968U2.m15244a((Object) null)) {
            synchronized (this) {
                this.f22436a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", (String) null);
            }
            synchronized (this) {
                this.f22436a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            }
        }
    }

    /* renamed from: a */
    public synchronized void m15256a(List<String> list) {
        this.f22436a.put("PROCESS_CFG_CUSTOM_HOSTS", C3762ym.m17294c(list));
    }

    /* renamed from: a */
    public Map<String, String> m15254a() {
        return C3762ym.m17298d(this.f22436a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public C2969U3(C2969U3 c2969u3) {
        synchronized (c2969u3) {
            this.f22436a = new ContentValues(c2969u3.f22436a);
            this.f22437b = c2969u3.f22437b;
        }
    }

    /* renamed from: a */
    public synchronized void m15257a(Map<String, String> map) {
        this.f22436a.put("PROCESS_CFG_CLIDS", C3762ym.m17305g(map));
    }

    /* renamed from: a */
    public synchronized void m15255a(String str) {
        this.f22436a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
    }

    /* renamed from: b */
    public List<String> m15258b() {
        String asString = this.f22436a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return C3762ym.m17296c(asString);
    }

    /* renamed from: b */
    public synchronized void m15260b(String str) {
        this.f22436a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
    }

    public C2969U3(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f22436a = contentValues == null ? new ContentValues() : contentValues;
        this.f22437b = resultReceiver;
    }
}
