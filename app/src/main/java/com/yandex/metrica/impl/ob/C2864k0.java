package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.yandex.metrica.impl.ob.H;
import defpackage.AbstractC1705Vq;
import defpackage.F91;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.k0 */
/* loaded from: classes2.dex */
public class C2864k0 implements Parcelable {
    public static final Parcelable.Creator<C2864k0> CREATOR = new a();
    String a;
    String b;
    private String c;
    private String d;
    int e;
    int f;
    private Pair<String, String> g;
    int h;
    private String i;
    private long j;
    private long k;
    private N0 l;
    private I0 m;
    private Bundle n;
    private Boolean o;
    private Integer p;

    /* renamed from: com.yandex.metrica.impl.ob.k0$a */
    public class a implements Parcelable.Creator<C2864k0> {
        @Override // android.os.Parcelable.Creator
        public C2864k0 createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(ResultReceiverC2939n0.class.getClassLoader());
            I0 i0A = bundle.containsKey("CounterReport.Source") ? I0.a(bundle.getInt("CounterReport.Source")) : null;
            C2864k0 c2864k0 = new C2864k0();
            c2864k0.e = bundle.getInt("CounterReport.Type", EnumC2865k1.EVENT_TYPE_UNDEFINED.b());
            c2864k0.f = bundle.getInt("CounterReport.CustomType");
            String string = bundle.getString("CounterReport.Value");
            int i = O2.a;
            if (string == null) {
                string = "";
            }
            c2864k0.b = string;
            C2864k0 c2864k0A = C2864k0.a(c2864k0.e(bundle.getString("CounterReport.UserInfo")).c(bundle.getString("CounterReport.Environment")).b(bundle.getString("CounterReport.Event")), (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) ? new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue")) : null);
            c2864k0A.h = bundle.getInt("CounterReport.TRUNCATED");
            return c2864k0A.d(bundle.getString("CounterReport.ProfileID")).a(bundle.getLong("CounterReport.CreationElapsedRealtime")).b(bundle.getLong("CounterReport.CreationTimestamp")).a(N0.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")))).a(i0A).c(bundle.getBundle("CounterReport.Payload")).a(bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null).a(bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null);
        }

        @Override // android.os.Parcelable.Creator
        public C2864k0[] newArray(int i) {
            return new C2864k0[i];
        }
    }

    public C2864k0() {
        this("", 0);
    }

    public C2864k0 a(byte[] bArr) {
        this.b = new String(Base64.encode(bArr, 0));
        return this;
    }

    public C2864k0 b(String str) {
        this.a = str;
        return this;
    }

    public C2864k0 c(String str) {
        this.d = str;
        return this;
    }

    public int d() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C2864k0 e(String str) {
        this.c = str;
        return this;
    }

    public C2864k0 f(String str) {
        this.b = str;
        return this;
    }

    public String g() {
        return this.a;
    }

    public String h() {
        return this.d;
    }

    public N0 i() {
        return this.l;
    }

    public Integer j() {
        return this.p;
    }

    public Bundle k() {
        return this.n;
    }

    public String l() {
        return this.i;
    }

    public I0 m() {
        return this.m;
    }

    public int n() {
        return this.e;
    }

    public String o() {
        return this.c;
    }

    public String p() {
        return this.b;
    }

    public byte[] q() {
        return Base64.decode(this.b, 0);
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = this.a;
        String strA = EnumC2865k1.a(this.e).a();
        return AbstractC1705Vq.l(F91.x("[event: ", str, ", type: ", strA, ", value: "), U2.a(this.b, 500), "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.a);
        bundle.putString("CounterReport.Value", this.b);
        bundle.putInt("CounterReport.Type", this.e);
        bundle.putInt("CounterReport.CustomType", this.f);
        bundle.putInt("CounterReport.TRUNCATED", this.h);
        bundle.putString("CounterReport.ProfileID", this.i);
        bundle.putInt("CounterReport.UniquenessStatus", this.l.a);
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.d;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.g;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.j);
        bundle.putLong("CounterReport.CreationTimestamp", this.k);
        I0 i0 = this.m;
        if (i0 != null) {
            bundle.putInt("CounterReport.Source", i0.a);
        }
        Boolean bool = this.o;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.p;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        parcel.writeBundle(bundle);
    }

    public C2864k0(String str, int i) {
        this("", str, i);
    }

    public C2864k0 a(int i) {
        this.e = i;
        return this;
    }

    public Pair<String, String> b() {
        return this.g;
    }

    public C2864k0 c(Bundle bundle) {
        this.n = bundle;
        return this;
    }

    public C2864k0 d(String str) {
        this.i = str;
        return this;
    }

    public long e() {
        return this.j;
    }

    public long f() {
        return this.k;
    }

    public C2864k0(String str, String str2, int i) {
        this(str, str2, i, new Nm());
    }

    private static C2864k0 d(C2864k0 c2864k0) {
        C2864k0 c2864k02 = new C2864k0();
        c2864k02.k = c2864k0.k;
        c2864k02.j = c2864k0.j;
        c2864k02.c = c2864k0.c;
        c2864k02.g = c2864k0.g;
        c2864k02.d = c2864k0.d;
        c2864k02.n = c2864k0.n;
        c2864k02.i = c2864k0.i;
        return c2864k02;
    }

    public static C2864k0 e(C2864k0 c2864k0) {
        return a(c2864k0, EnumC2865k1.EVENT_TYPE_APP_UPDATE);
    }

    public C2864k0 a(String str, String str2) {
        if (this.g == null) {
            this.g = new Pair<>(str, str2);
        }
        return this;
    }

    public C2864k0 b(long j) {
        this.k = j;
        return this;
    }

    public Boolean c() {
        return this.o;
    }

    public C2864k0(String str, String str2, int i, Nm nm) {
        this.l = N0.UNKNOWN;
        this.a = str2;
        this.e = i;
        this.b = str;
        this.j = nm.c();
        this.k = nm.a();
    }

    public static C2864k0 c(C2864k0 c2864k0) {
        return a(c2864k0, EnumC2865k1.EVENT_TYPE_INIT);
    }

    public Bundle b(Bundle bundle) {
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public static C2864k0 a(C2864k0 c2864k0, Pair pair) {
        c2864k0.g = pair;
        return c2864k0;
    }

    public static C2864k0 b(C2864k0 c2864k0) {
        return a(c2864k0, EnumC2865k1.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public C2864k0 a(long j) {
        this.j = j;
        return this;
    }

    public C2864k0 a(N0 n0) {
        this.l = n0;
        return this;
    }

    public C2864k0 a(I0 i0) {
        this.m = i0;
        return this;
    }

    public C2864k0 a(Boolean bool) {
        this.o = bool;
        return this;
    }

    public C2864k0 a(Integer num) {
        this.p = num;
        return this;
    }

    public static C2864k0 a(Bundle bundle) {
        if (bundle != null) {
            try {
                C2864k0 c2864k0 = (C2864k0) bundle.getParcelable("CounterReport.Object");
                if (c2864k0 != null) {
                    return c2864k0;
                }
            } catch (Throwable unused) {
                return new C2864k0();
            }
        }
        return new C2864k0();
    }

    private static C2864k0 a(C2864k0 c2864k0, EnumC2865k1 enumC2865k1) {
        C2864k0 c2864k0D = d(c2864k0);
        c2864k0D.e = enumC2865k1.b();
        return c2864k0D;
    }

    public static C2864k0 a(C2864k0 c2864k0) {
        return a(c2864k0, EnumC2865k1.EVENT_TYPE_ALIVE);
    }

    public static C2864k0 a(C2864k0 c2864k0, K0 k0) {
        C2864k0 c2864k0A = a(c2864k0, EnumC2865k1.EVENT_TYPE_START);
        String strA = k0.a();
        Sf sf = new Sf();
        if (strA != null) {
            sf.b = strA.getBytes();
        }
        c2864k0A.a(AbstractC2714e.a(sf));
        c2864k0A.k = c2864k0.k;
        c2864k0A.j = c2864k0.j;
        return c2864k0A;
    }

    public static C2864k0 a(C2864k0 c2864k0, C2744f4 c2744f4) {
        Context contextG = c2744f4.g();
        C2816i1 c2816i1C = new C2816i1(contextG, new A0(contextG)).c();
        try {
            c2816i1C.b();
        } catch (Throwable unused) {
        }
        C2864k0 c2864k0D = d(c2864k0);
        c2864k0D.e = EnumC2865k1.EVENT_TYPE_IDENTITY.b();
        c2864k0D.b = c2816i1C.a();
        return c2864k0D;
    }

    public static C2864k0 a(C2864k0 c2864k0, Collection<C2829ie> collection, H h, D d, List<String> list) {
        String string;
        String str;
        C2864k0 c2864k0D = d(c2864k0);
        try {
            JSONArray jSONArray = new JSONArray();
            for (C2829ie c2829ie : collection) {
                jSONArray.put(new JSONObject().put("name", c2829ie.a).put("granted", c2829ie.b));
            }
            JSONObject jSONObject = new JSONObject();
            if (h != null) {
                jSONObject.put("background_restricted", h.b);
                H.a aVar = h.a;
                d.getClass();
                if (aVar != null) {
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        str = "ACTIVE";
                    } else if (iOrdinal == 1) {
                        str = "WORKING_SET";
                    } else if (iOrdinal == 2) {
                        str = "FREQUENT";
                    } else if (iOrdinal == 3) {
                        str = "RARE";
                    } else if (iOrdinal == 4) {
                        str = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        c2864k0D.e = EnumC2865k1.EVENT_TYPE_PERMISSIONS.b();
        c2864k0D.b = string;
        return c2864k0D;
    }

    public static C2864k0 a(C2864k0 c2864k0, String str) {
        C2864k0 c2864k0D = d(c2864k0);
        c2864k0D.e = EnumC2865k1.EVENT_TYPE_APP_FEATURES.b();
        c2864k0D.b = str;
        return c2864k0D;
    }

    public static C2864k0 a() {
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.e = EnumC2865k1.EVENT_TYPE_SEND_REVENUE_EVENT.b();
        return c2864k0;
    }

    public static C2864k0 a(String str) {
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.e = EnumC2865k1.EVENT_TYPE_WEBVIEW_SYNC.b();
        c2864k0.b = str;
        c2864k0.m = I0.JS;
        return c2864k0;
    }
}
