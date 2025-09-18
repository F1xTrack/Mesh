package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import defpackage.AbstractC1705Vq;
import defpackage.F91;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class T5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<T5> CREATOR = new S5();
    protected String a;
    protected String b;
    public String c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public String h;
    public long i;
    public long j;
    public EnumC4424aa k;
    public EnumC4666k9 l;
    public Bundle m;
    public Boolean n;
    public Integer o;
    public Map p;

    public T5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f == null) {
            this.f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f;
    }

    public final void c(Bundle bundle) {
        this.m = bundle;
    }

    public final long d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.j;
    }

    public final String f() {
        return this.c;
    }

    public final EnumC4424aa g() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.o;
    }

    public final Bundle i() {
        return this.m;
    }

    public final String j() {
        return this.h;
    }

    public final EnumC4666k9 k() {
        return this.l;
    }

    public final boolean l() {
        return this.a == null;
    }

    public final boolean m() {
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        return -1 == this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.a;
        String str2 = Wa.a(this.d).b;
        String strSubstring = this.b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        return AbstractC1705Vq.l(F91.x("[event: ", str, ", type: ", str2, ", value: "), strSubstring, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.a);
        bundle.putString("CounterReport.Value", this.b);
        bundle.putInt("CounterReport.Type", this.d);
        bundle.putInt("CounterReport.CustomType", this.e);
        bundle.putInt("CounterReport.TRUNCATED", this.g);
        bundle.putString("CounterReport.ProfileID", this.h);
        bundle.putInt("CounterReport.UniquenessStatus", this.k.a);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.i);
        bundle.putLong("CounterReport.CreationTimestamp", this.j);
        EnumC4666k9 enumC4666k9 = this.l;
        if (enumC4666k9 != null) {
            bundle.putInt("CounterReport.Source", enumC4666k9.a);
        }
        Boolean bool = this.n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.p));
        parcel.writeBundle(bundle);
    }

    public T5(String str, int i) {
        this("", str, i);
    }

    public static T5 e(T5 t5) {
        return a(t5, Wa.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.c = str;
    }

    public void c(String str) {
        this.h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public T5(String str, String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final Boolean c() {
        return this.n;
    }

    public T5(String str, String str2, int i, SystemTimeProvider systemTimeProvider) {
        this.k = EnumC4424aa.UNKNOWN;
        this.p = new HashMap();
        this.a = str2;
        this.d = i;
        this.b = str;
        this.i = systemTimeProvider.elapsedRealtime();
        this.j = systemTimeProvider.currentTimeMillis();
    }

    public static T5 b(Bundle bundle) {
        if (bundle != null) {
            try {
                T5 t5 = (T5) bundle.getParcelable("CounterReport.Object");
                if (t5 != null) {
                    return t5;
                }
            } catch (Throwable unused) {
                return new T5("", 0);
            }
        }
        return new T5("", 0);
    }

    public static T5 c(T5 t5) {
        return a(t5, Wa.EVENT_TYPE_INIT);
    }

    public static T5 d(T5 t5) {
        T5 t52 = new T5("", 0);
        t52.j = t5.j;
        t52.i = t5.i;
        t52.f = t5.f;
        t52.c = t5.c;
        t52.m = t5.m;
        t52.p = t5.p;
        t52.h = t5.h;
        return t52;
    }

    public final void a(EnumC4424aa enumC4424aa) {
        this.k = enumC4424aa;
    }

    public final void a(EnumC4666k9 enumC4666k9) {
        this.l = enumC4666k9;
    }

    public final void a(Boolean bool) {
        this.n = bool;
    }

    public final void a(Integer num) {
        this.o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static T5 b(T5 t5) {
        return a(t5, Wa.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static T5 a(T5 t5, Wa wa) {
        T5 t5D = d(t5);
        t5D.d = wa.a;
        return t5D;
    }

    public static T5 a(T5 t5) {
        return a(t5, Wa.EVENT_TYPE_ALIVE);
    }

    public static T5 a(T5 t5, J9 j9) {
        T5 t5A = a(t5, Wa.EVENT_TYPE_START);
        t5A.setValueBytes(MessageNano.toByteArray(new C4738n9().fromModel(new C4714m9((String) j9.a.a()))));
        t5A.j = t5.j;
        t5A.i = t5.i;
        return t5A;
    }

    public static T5 a(T5 t5, Collection<PermissionState> collection, E2 e2, C4491d2 c4491d2, List<String> list) {
        String string;
        String str;
        T5 t5D = d(t5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (e2 != null) {
                jSONObject.put("background_restricted", e2.b);
                D2 d2 = e2.a;
                c4491d2.getClass();
                if (d2 != null) {
                    int iOrdinal = d2.ordinal();
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
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5D.d = 12288;
        t5D.setValue(string);
        return t5D;
    }

    public static T5 a(T5 t5, String str) {
        T5 t5D = d(t5);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5D.d = 12289;
        t5D.setValue(str);
        return t5D;
    }

    public static T5 a() {
        T5 t5 = new T5("", 0);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = 16384;
        return t5;
    }

    public static T5 a(Ve ve) {
        String currencyCode = "";
        int i = 0;
        T5 t5 = new T5("", "", 0);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = 40976;
        ProductInfo productInfo = ve.a;
        C4482ci c4482ci = new C4482ci();
        c4482ci.a = productInfo.quantity;
        c4482ci.f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        c4482ci.b = currencyCode.getBytes();
        c4482ci.c = productInfo.sku.getBytes();
        Xh xh = new Xh();
        xh.a = productInfo.purchaseOriginalJson.getBytes();
        xh.b = productInfo.signature.getBytes();
        c4482ci.e = xh;
        c4482ci.g = true;
        c4482ci.h = 1;
        c4482ci.i = Ue.a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        C4457bi c4457bi = new C4457bi();
        c4457bi.a = productInfo.purchaseToken.getBytes();
        c4457bi.b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        c4482ci.j = c4457bi;
        if (productInfo.type == ProductType.SUBS) {
            C4432ai c4432ai = new C4432ai();
            c4432ai.a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                Zh zh = new Zh();
                zh.a = period.number;
                int i2 = Ue.b[period.timeUnit.ordinal()];
                zh.b = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 4 : 3 : 2 : 1;
                c4432ai.b = zh;
            }
            Yh yh = new Yh();
            yh.a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                Zh zh2 = new Zh();
                zh2.a = period2.number;
                int i3 = Ue.b[period2.timeUnit.ordinal()];
                if (i3 == 1) {
                    i = 1;
                } else if (i3 == 2) {
                    i = 2;
                } else if (i3 == 3) {
                    i = 3;
                } else if (i3 == 4) {
                    i = 4;
                }
                zh2.b = i;
                yh.b = zh2;
            }
            yh.c = productInfo.introductoryPriceCycles;
            c4432ai.c = yh;
            c4482ci.k = c4432ai;
        }
        t5.setValueBytes(MessageNano.toByteArray(c4482ci));
        return t5;
    }

    public static T5 a(String str) {
        T5 t5 = new T5("", 0);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = 12320;
        t5.b = str;
        t5.l = EnumC4666k9.JS;
        return t5;
    }
}
