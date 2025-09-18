package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.yandex.metrica.impl.p022ob.C2641H;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC1374Vq;
import p000.F91;

/* renamed from: com.yandex.metrica.impl.ob.k0 */
/* loaded from: classes2.dex */
public class C3376k0 implements Parcelable {
    public static final Parcelable.Creator<C3376k0> CREATOR = new a();

    /* renamed from: a */
    String f23827a;

    /* renamed from: b */
    String f23828b;

    /* renamed from: c */
    private String f23829c;

    /* renamed from: d */
    private String f23830d;

    /* renamed from: e */
    int f23831e;

    /* renamed from: f */
    int f23832f;

    /* renamed from: g */
    private Pair<String, String> f23833g;

    /* renamed from: h */
    int f23834h;

    /* renamed from: i */
    private String f23835i;

    /* renamed from: j */
    private long f23836j;

    /* renamed from: k */
    private long f23837k;

    /* renamed from: l */
    private EnumC2792N0 f23838l;

    /* renamed from: m */
    private EnumC2667I0 f23839m;

    /* renamed from: n */
    private Bundle f23840n;

    /* renamed from: o */
    private Boolean f23841o;

    /* renamed from: p */
    private Integer f23842p;

    /* renamed from: com.yandex.metrica.impl.ob.k0$a */
    public class a implements Parcelable.Creator<C3376k0> {
        @Override // android.os.Parcelable.Creator
        public C3376k0 createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(ResultReceiverC3454n0.class.getClassLoader());
            EnumC2667I0 enumC2667I0M14273a = bundle.containsKey("CounterReport.Source") ? EnumC2667I0.m14273a(bundle.getInt("CounterReport.Source")) : null;
            C3376k0 c3376k0 = new C3376k0();
            c3376k0.f23831e = bundle.getInt("CounterReport.Type", EnumC3377k1.EVENT_TYPE_UNDEFINED.m16250b());
            c3376k0.f23832f = bundle.getInt("CounterReport.CustomType");
            String string = bundle.getString("CounterReport.Value");
            int i = C2819O2.f21836a;
            if (string == null) {
                string = "";
            }
            c3376k0.f23828b = string;
            C3376k0 c3376k0M16210a = C3376k0.m16210a(c3376k0.mo15102e(bundle.getString("CounterReport.UserInfo")).m16232c(bundle.getString("CounterReport.Environment")).mo15100b(bundle.getString("CounterReport.Event")), (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) ? new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue")) : null);
            c3376k0M16210a.f23834h = bundle.getInt("CounterReport.TRUNCATED");
            return c3376k0M16210a.mo15101d(bundle.getString("CounterReport.ProfileID")).m16222a(bundle.getLong("CounterReport.CreationElapsedRealtime")).m16230b(bundle.getLong("CounterReport.CreationTimestamp")).m16224a(EnumC2792N0.m14635a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")))).m16223a(enumC2667I0M14273a).m16231c(bundle.getBundle("CounterReport.Payload")).m16225a(bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null).m16226a(bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null);
        }

        @Override // android.os.Parcelable.Creator
        public C3376k0[] newArray(int i) {
            return new C3376k0[i];
        }
    }

    public C3376k0() {
        this("", 0);
    }

    /* renamed from: a */
    public C3376k0 mo15099a(byte[] bArr) {
        this.f23828b = new String(Base64.encode(bArr, 0));
        return this;
    }

    /* renamed from: b */
    public C3376k0 mo15100b(String str) {
        this.f23827a = str;
        return this;
    }

    /* renamed from: c */
    public C3376k0 m16232c(String str) {
        this.f23830d = str;
        return this;
    }

    /* renamed from: d */
    public int m16234d() {
        return this.f23834h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C3376k0 mo15102e(String str) {
        this.f23829c = str;
        return this;
    }

    /* renamed from: f */
    public C3376k0 mo15103f(String str) {
        this.f23828b = str;
        return this;
    }

    /* renamed from: g */
    public String m16237g() {
        return this.f23827a;
    }

    /* renamed from: h */
    public String m16238h() {
        return this.f23830d;
    }

    /* renamed from: i */
    public EnumC2792N0 m16239i() {
        return this.f23838l;
    }

    /* renamed from: j */
    public Integer m16240j() {
        return this.f23842p;
    }

    /* renamed from: k */
    public Bundle m16241k() {
        return this.f23840n;
    }

    /* renamed from: l */
    public String m16242l() {
        return this.f23835i;
    }

    /* renamed from: m */
    public EnumC2667I0 m16243m() {
        return this.f23839m;
    }

    /* renamed from: n */
    public int m16244n() {
        return this.f23831e;
    }

    /* renamed from: o */
    public String m16245o() {
        return this.f23829c;
    }

    /* renamed from: p */
    public String m16246p() {
        return this.f23828b;
    }

    /* renamed from: q */
    public byte[] m16247q() {
        return Base64.decode(this.f23828b, 0);
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = this.f23827a;
        String strM16249a = EnumC3377k1.m16248a(this.f23831e).m16249a();
        return AbstractC1374Vq.m8593l(F91.m2541x("[event: ", str, ", type: ", strM16249a, ", value: "), C2968U2.m15232a(this.f23828b, 500), "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f23827a);
        bundle.putString("CounterReport.Value", this.f23828b);
        bundle.putInt("CounterReport.Type", this.f23831e);
        bundle.putInt("CounterReport.CustomType", this.f23832f);
        bundle.putInt("CounterReport.TRUNCATED", this.f23834h);
        bundle.putString("CounterReport.ProfileID", this.f23835i);
        bundle.putInt("CounterReport.UniquenessStatus", this.f23838l.f21760a);
        Bundle bundle2 = this.f23840n;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f23830d;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.f23829c;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.f23833g;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f23836j);
        bundle.putLong("CounterReport.CreationTimestamp", this.f23837k);
        EnumC2667I0 enumC2667I0 = this.f23839m;
        if (enumC2667I0 != null) {
            bundle.putInt("CounterReport.Source", enumC2667I0.f21387a);
        }
        Boolean bool = this.f23841o;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f23842p;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        parcel.writeBundle(bundle);
    }

    public C3376k0(String str, int i) {
        this("", str, i);
    }

    /* renamed from: a */
    public C3376k0 m16221a(int i) {
        this.f23831e = i;
        return this;
    }

    /* renamed from: b */
    public Pair<String, String> m16229b() {
        return this.f23833g;
    }

    /* renamed from: c */
    public C3376k0 m16231c(Bundle bundle) {
        this.f23840n = bundle;
        return this;
    }

    /* renamed from: d */
    public C3376k0 mo15101d(String str) {
        this.f23835i = str;
        return this;
    }

    /* renamed from: e */
    public long m16235e() {
        return this.f23836j;
    }

    /* renamed from: f */
    public long m16236f() {
        return this.f23837k;
    }

    public C3376k0(String str, String str2, int i) {
        this(str, str2, i, new C2814Nm());
    }

    /* renamed from: d */
    private static C3376k0 m16219d(C3376k0 c3376k0) {
        C3376k0 c3376k02 = new C3376k0();
        c3376k02.f23837k = c3376k0.f23837k;
        c3376k02.f23836j = c3376k0.f23836j;
        c3376k02.f23829c = c3376k0.f23829c;
        c3376k02.f23833g = c3376k0.f23833g;
        c3376k02.f23830d = c3376k0.f23830d;
        c3376k02.f23840n = c3376k0.f23840n;
        c3376k02.f23835i = c3376k0.f23835i;
        return c3376k02;
    }

    /* renamed from: e */
    public static C3376k0 m16220e(C3376k0 c3376k0) {
        return m16213a(c3376k0, EnumC3377k1.EVENT_TYPE_APP_UPDATE);
    }

    /* renamed from: a */
    public C3376k0 m16227a(String str, String str2) {
        if (this.f23833g == null) {
            this.f23833g = new Pair<>(str, str2);
        }
        return this;
    }

    /* renamed from: b */
    public C3376k0 m16230b(long j) {
        this.f23837k = j;
        return this;
    }

    /* renamed from: c */
    public Boolean m16233c() {
        return this.f23841o;
    }

    public C3376k0(String str, String str2, int i, C2814Nm c2814Nm) {
        this.f23838l = EnumC2792N0.UNKNOWN;
        this.f23827a = str2;
        this.f23831e = i;
        this.f23828b = str;
        this.f23836j = c2814Nm.mo14676c();
        this.f23837k = c2814Nm.mo14674a();
    }

    /* renamed from: c */
    public static C3376k0 m16218c(C3376k0 c3376k0) {
        return m16213a(c3376k0, EnumC3377k1.EVENT_TYPE_INIT);
    }

    /* renamed from: b */
    public Bundle m16228b(Bundle bundle) {
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    /* renamed from: a */
    public static C3376k0 m16210a(C3376k0 c3376k0, Pair pair) {
        c3376k0.f23833g = pair;
        return c3376k0;
    }

    /* renamed from: b */
    public static C3376k0 m16217b(C3376k0 c3376k0) {
        return m16213a(c3376k0, EnumC3377k1.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* renamed from: a */
    public C3376k0 m16222a(long j) {
        this.f23836j = j;
        return this;
    }

    /* renamed from: a */
    public C3376k0 m16224a(EnumC2792N0 enumC2792N0) {
        this.f23838l = enumC2792N0;
        return this;
    }

    /* renamed from: a */
    public C3376k0 m16223a(EnumC2667I0 enumC2667I0) {
        this.f23839m = enumC2667I0;
        return this;
    }

    /* renamed from: a */
    public C3376k0 m16225a(Boolean bool) {
        this.f23841o = bool;
        return this;
    }

    /* renamed from: a */
    public C3376k0 m16226a(Integer num) {
        this.f23842p = num;
        return this;
    }

    /* renamed from: a */
    public static C3376k0 m16208a(Bundle bundle) {
        if (bundle != null) {
            try {
                C3376k0 c3376k0 = (C3376k0) bundle.getParcelable("CounterReport.Object");
                if (c3376k0 != null) {
                    return c3376k0;
                }
            } catch (Throwable unused) {
                return new C3376k0();
            }
        }
        return new C3376k0();
    }

    /* renamed from: a */
    private static C3376k0 m16213a(C3376k0 c3376k0, EnumC3377k1 enumC3377k1) {
        C3376k0 c3376k0M16219d = m16219d(c3376k0);
        c3376k0M16219d.f23831e = enumC3377k1.m16250b();
        return c3376k0M16219d;
    }

    /* renamed from: a */
    public static C3376k0 m16209a(C3376k0 c3376k0) {
        return m16213a(c3376k0, EnumC3377k1.EVENT_TYPE_ALIVE);
    }

    /* renamed from: a */
    public static C3376k0 m16211a(C3376k0 c3376k0, C2717K0 c2717k0) {
        C3376k0 c3376k0M16213a = m16213a(c3376k0, EnumC3377k1.EVENT_TYPE_START);
        String strM14455a = c2717k0.m14455a();
        C2931Sf c2931Sf = new C2931Sf();
        if (strM14455a != null) {
            c2931Sf.f22307b = strM14455a.getBytes();
        }
        c3376k0M16213a.mo15099a(AbstractC3219e.m15809a(c2931Sf));
        c3376k0M16213a.f23837k = c3376k0.f23837k;
        c3376k0M16213a.f23836j = c3376k0.f23836j;
        return c3376k0M16213a;
    }

    /* renamed from: a */
    public static C3376k0 m16212a(C3376k0 c3376k0, C3250f4 c3250f4) {
        Context contextM15908g = c3250f4.m15908g();
        C3325i1 c3325i1M16079c = new C3325i1(contextM15908g, new C2467A0(contextM15908g)).m16079c();
        try {
            c3325i1M16079c.m16078b();
        } catch (Throwable unused) {
        }
        C3376k0 c3376k0M16219d = m16219d(c3376k0);
        c3376k0M16219d.f23831e = EnumC3377k1.EVENT_TYPE_IDENTITY.m16250b();
        c3376k0M16219d.f23828b = c3325i1M16079c.m16077a();
        return c3376k0M16219d;
    }

    /* renamed from: a */
    public static C3376k0 m16215a(C3376k0 c3376k0, Collection<C3338ie> collection, C2641H c2641h, C2541D c2541d, List<String> list) {
        String string;
        String str;
        C3376k0 c3376k0M16219d = m16219d(c3376k0);
        try {
            JSONArray jSONArray = new JSONArray();
            for (C3338ie c3338ie : collection) {
                jSONArray.put(new JSONObject().put("name", c3338ie.f23647a).put("granted", c3338ie.f23648b));
            }
            JSONObject jSONObject = new JSONObject();
            if (c2641h != null) {
                jSONObject.put("background_restricted", c2641h.f21327b);
                C2641H.a aVar = c2641h.f21326a;
                c2541d.getClass();
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
        c3376k0M16219d.f23831e = EnumC3377k1.EVENT_TYPE_PERMISSIONS.m16250b();
        c3376k0M16219d.f23828b = string;
        return c3376k0M16219d;
    }

    /* renamed from: a */
    public static C3376k0 m16214a(C3376k0 c3376k0, String str) {
        C3376k0 c3376k0M16219d = m16219d(c3376k0);
        c3376k0M16219d.f23831e = EnumC3377k1.EVENT_TYPE_APP_FEATURES.m16250b();
        c3376k0M16219d.f23828b = str;
        return c3376k0M16219d;
    }

    /* renamed from: a */
    public static C3376k0 m16207a() {
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_SEND_REVENUE_EVENT.m16250b();
        return c3376k0;
    }

    /* renamed from: a */
    public static C3376k0 m16216a(String str) {
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_WEBVIEW_SYNC.m16250b();
        c3376k0.f23828b = str;
        c3376k0.f23839m = EnumC2667I0.JS;
        return c3376k0;
    }
}
