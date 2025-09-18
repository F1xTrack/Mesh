package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
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
import p000.AbstractC1374Vq;
import p000.F91;

/* renamed from: io.appmetrica.analytics.impl.T5 */
/* loaded from: classes2.dex */
public class C4821T5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C4821T5> CREATOR = new C4797S5();

    /* renamed from: a */
    protected String f30761a;

    /* renamed from: b */
    protected String f30762b;

    /* renamed from: c */
    public String f30763c;

    /* renamed from: d */
    public int f30764d;

    /* renamed from: e */
    public int f30765e;

    /* renamed from: f */
    public Pair f30766f;

    /* renamed from: g */
    public int f30767g;

    /* renamed from: h */
    public String f30768h;

    /* renamed from: i */
    public long f30769i;

    /* renamed from: j */
    public long f30770j;

    /* renamed from: k */
    public EnumC4994aa f30771k;

    /* renamed from: l */
    public EnumC5243k9 f30772l;

    /* renamed from: m */
    public Bundle f30773m;

    /* renamed from: n */
    public Boolean f30774n;

    /* renamed from: o */
    public Integer f30775o;

    /* renamed from: p */
    public Map f30776p;

    public C4821T5() {
        this("", 0);
    }

    /* renamed from: a */
    public final void m19851a(String str, String str2) {
        if (this.f30766f == null) {
            this.f30766f = new Pair(str, str2);
        }
    }

    /* renamed from: b */
    public final Pair<String, String> m19852b() {
        return this.f30766f;
    }

    /* renamed from: c */
    public final void m19856c(Bundle bundle) {
        this.f30773m = bundle;
    }

    /* renamed from: d */
    public final long m19858d() {
        return this.f30769i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long m19860e() {
        return this.f30770j;
    }

    /* renamed from: f */
    public final String m19861f() {
        return this.f30763c;
    }

    /* renamed from: g */
    public final EnumC4994aa m19862g() {
        return this.f30771k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f30767g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f30765e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f30776p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f30761a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f30764d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f30762b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f30762b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: h */
    public final Integer m19863h() {
        return this.f30775o;
    }

    /* renamed from: i */
    public final Bundle m19864i() {
        return this.f30773m;
    }

    /* renamed from: j */
    public final String m19865j() {
        return this.f30768h;
    }

    /* renamed from: k */
    public final EnumC5243k9 m19866k() {
        return this.f30772l;
    }

    /* renamed from: l */
    public final boolean m19867l() {
        return this.f30761a == null;
    }

    /* renamed from: m */
    public final boolean m19868m() {
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        return -1 == this.f30764d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.f30767g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.f30765e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f30776p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f30761a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.f30764d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f30762b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f30762b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f30761a;
        String str2 = EnumC4898Wa.m19946a(this.f30764d).f30975b;
        String strSubstring = this.f30762b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        return AbstractC1374Vq.m8593l(F91.m2541x("[event: ", str, ", type: ", str2, ", value: "), strSubstring, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f30761a);
        bundle.putString("CounterReport.Value", this.f30762b);
        bundle.putInt("CounterReport.Type", this.f30764d);
        bundle.putInt("CounterReport.CustomType", this.f30765e);
        bundle.putInt("CounterReport.TRUNCATED", this.f30767g);
        bundle.putString("CounterReport.ProfileID", this.f30768h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f30771k.f31257a);
        Bundle bundle2 = this.f30773m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f30763c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f30766f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f30769i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f30770j);
        EnumC5243k9 enumC5243k9 = this.f30772l;
        if (enumC5243k9 != null) {
            bundle.putInt("CounterReport.Source", enumC5243k9.f32037a);
        }
        Boolean bool = this.f30774n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f30775o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f30776p));
        parcel.writeBundle(bundle);
    }

    public C4821T5(String str, int i) {
        this("", str, i);
    }

    /* renamed from: e */
    public static C4821T5 m19845e(C4821T5 c4821t5) {
        return m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_APP_UPDATE);
    }

    /* renamed from: b */
    public final void m19854b(String str) {
        this.f30763c = str;
    }

    /* renamed from: c */
    public void mo19857c(String str) {
        this.f30768h = str;
    }

    /* renamed from: d */
    public final Bundle m19859d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C4821T5(String str, String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    /* renamed from: a */
    public final void m19846a(long j) {
        this.f30769i = j;
    }

    /* renamed from: b */
    public final void m19853b(long j) {
        this.f30770j = j;
    }

    /* renamed from: c */
    public final Boolean m19855c() {
        return this.f30774n;
    }

    public C4821T5(String str, String str2, int i, SystemTimeProvider systemTimeProvider) {
        this.f30771k = EnumC4994aa.UNKNOWN;
        this.f30776p = new HashMap();
        this.f30761a = str2;
        this.f30764d = i;
        this.f30762b = str;
        this.f30769i = systemTimeProvider.elapsedRealtime();
        this.f30770j = systemTimeProvider.currentTimeMillis();
    }

    /* renamed from: b */
    public static C4821T5 m19841b(Bundle bundle) {
        if (bundle != null) {
            try {
                C4821T5 c4821t5 = (C4821T5) bundle.getParcelable("CounterReport.Object");
                if (c4821t5 != null) {
                    return c4821t5;
                }
            } catch (Throwable unused) {
                return new C4821T5("", 0);
            }
        }
        return new C4821T5("", 0);
    }

    /* renamed from: c */
    public static C4821T5 m19843c(C4821T5 c4821t5) {
        return m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_INIT);
    }

    /* renamed from: d */
    public static C4821T5 m19844d(C4821T5 c4821t5) {
        C4821T5 c4821t52 = new C4821T5("", 0);
        c4821t52.f30770j = c4821t5.f30770j;
        c4821t52.f30769i = c4821t5.f30769i;
        c4821t52.f30766f = c4821t5.f30766f;
        c4821t52.f30763c = c4821t5.f30763c;
        c4821t52.f30773m = c4821t5.f30773m;
        c4821t52.f30776p = c4821t5.f30776p;
        c4821t52.f30768h = c4821t5.f30768h;
        return c4821t52;
    }

    /* renamed from: a */
    public final void m19847a(EnumC4994aa enumC4994aa) {
        this.f30771k = enumC4994aa;
    }

    /* renamed from: a */
    public final void m19848a(EnumC5243k9 enumC5243k9) {
        this.f30772l = enumC5243k9;
    }

    /* renamed from: a */
    public final void m19849a(Boolean bool) {
        this.f30774n = bool;
    }

    /* renamed from: a */
    public final void m19850a(Integer num) {
        this.f30775o = num;
    }

    /* renamed from: a */
    public static Pair m19832a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    /* renamed from: b */
    public static C4821T5 m19842b(C4821T5 c4821t5) {
        return m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* renamed from: a */
    public static C4821T5 m19836a(C4821T5 c4821t5, EnumC4898Wa enumC4898Wa) {
        C4821T5 c4821t5M19844d = m19844d(c4821t5);
        c4821t5M19844d.f30764d = enumC4898Wa.f30974a;
        return c4821t5M19844d;
    }

    /* renamed from: a */
    public static C4821T5 m19834a(C4821T5 c4821t5) {
        return m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_ALIVE);
    }

    /* renamed from: a */
    public static C4821T5 m19835a(C4821T5 c4821t5, C4586J9 c4586j9) {
        C4821T5 c4821t5M19836a = m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_START);
        c4821t5M19836a.setValueBytes(MessageNano.toByteArray(new C5318n9().fromModel(new C5293m9((String) c4586j9.f30357a.m19817a()))));
        c4821t5M19836a.f30770j = c4821t5.f30770j;
        c4821t5M19836a.f30769i = c4821t5.f30769i;
        return c4821t5M19836a;
    }

    /* renamed from: a */
    public static C4821T5 m19838a(C4821T5 c4821t5, Collection<PermissionState> collection, C4459E2 c4459e2, C5061d2 c5061d2, List<String> list) {
        String string;
        String str;
        C4821T5 c4821t5M19844d = m19844d(c4821t5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c4459e2 != null) {
                jSONObject.put("background_restricted", c4459e2.f30049b);
                EnumC4434D2 enumC4434D2 = c4459e2.f30048a;
                c5061d2.getClass();
                if (enumC4434D2 != null) {
                    int iOrdinal = enumC4434D2.ordinal();
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
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5M19844d.f30764d = 12288;
        c4821t5M19844d.setValue(string);
        return c4821t5M19844d;
    }

    /* renamed from: a */
    public static C4821T5 m19837a(C4821T5 c4821t5, String str) {
        C4821T5 c4821t5M19844d = m19844d(c4821t5);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5M19844d.f30764d = 12289;
        c4821t5M19844d.setValue(str);
        return c4821t5M19844d;
    }

    /* renamed from: a */
    public static C4821T5 m19833a() {
        C4821T5 c4821t5 = new C4821T5("", 0);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = 16384;
        return c4821t5;
    }

    /* renamed from: a */
    public static C4821T5 m19839a(C4878Ve c4878Ve) {
        String currencyCode = "";
        int i = 0;
        C4821T5 c4821t5 = new C4821T5("", "", 0);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = 40976;
        ProductInfo productInfo = c4878Ve.f30858a;
        C5052ci c5052ci = new C5052ci();
        c5052ci.f31421a = productInfo.quantity;
        c5052ci.f31426f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        c5052ci.f31422b = currencyCode.getBytes();
        c5052ci.f31423c = productInfo.sku.getBytes();
        C4929Xh c4929Xh = new C4929Xh();
        c4929Xh.f31051a = productInfo.purchaseOriginalJson.getBytes();
        c4929Xh.f31052b = productInfo.signature.getBytes();
        c5052ci.f31425e = c4929Xh;
        c5052ci.f31427g = true;
        c5052ci.f31428h = 1;
        c5052ci.f31429i = AbstractC4854Ue.f30810a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        C5027bi c5027bi = new C5027bi();
        c5027bi.f31330a = productInfo.purchaseToken.getBytes();
        c5027bi.f31331b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        c5052ci.f31430j = c5027bi;
        if (productInfo.type == ProductType.SUBS) {
            C5002ai c5002ai = new C5002ai();
            c5002ai.f31263a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                C4977Zh c4977Zh = new C4977Zh();
                c4977Zh.f31207a = period.number;
                int i2 = AbstractC4854Ue.f30811b[period.timeUnit.ordinal()];
                c4977Zh.f31208b = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 4 : 3 : 2 : 1;
                c5002ai.f31264b = c4977Zh;
            }
            C4953Yh c4953Yh = new C4953Yh();
            c4953Yh.f31121a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                C4977Zh c4977Zh2 = new C4977Zh();
                c4977Zh2.f31207a = period2.number;
                int i3 = AbstractC4854Ue.f30811b[period2.timeUnit.ordinal()];
                if (i3 == 1) {
                    i = 1;
                } else if (i3 == 2) {
                    i = 2;
                } else if (i3 == 3) {
                    i = 3;
                } else if (i3 == 4) {
                    i = 4;
                }
                c4977Zh2.f31208b = i;
                c4953Yh.f31122b = c4977Zh2;
            }
            c4953Yh.f31123c = productInfo.introductoryPriceCycles;
            c5002ai.f31265c = c4953Yh;
            c5052ci.f31431k = c5002ai;
        }
        c4821t5.setValueBytes(MessageNano.toByteArray(c5052ci));
        return c4821t5;
    }

    /* renamed from: a */
    public static C4821T5 m19840a(String str) {
        C4821T5 c4821t5 = new C4821T5("", 0);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = 12320;
        c4821t5.f30762b = str;
        c4821t5.f30772l = EnumC5243k9.JS;
        return c4821t5;
    }
}
