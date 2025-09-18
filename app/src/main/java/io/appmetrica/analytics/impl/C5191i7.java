package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p000.TO0;

/* renamed from: io.appmetrica.analytics.impl.i7 */
/* loaded from: classes2.dex */
public final class C5191i7 {

    /* renamed from: a */
    public final Context f31906a;

    /* renamed from: b */
    public final int f31907b;

    /* renamed from: c */
    public final C4729P8 f31908c;

    /* renamed from: d */
    public final C5542w8 f31909d;

    /* renamed from: e */
    public final C4984a0 f31910e;

    /* renamed from: f */
    public final C4489F8 f31911f;

    /* renamed from: g */
    public final C5266l7 f31912g;

    /* renamed from: h */
    public final C4821T5 f31913h;

    public C5191i7(Context context, C4907Wj c4907Wj, int i, C4729P8 c4729p8, C5542w8 c5542w8, C4984a0 c4984a0, C4489F8 c4489f8, C5266l7 c5266l7) {
        this.f31906a = context;
        this.f31907b = i;
        this.f31908c = c4729p8;
        this.f31909d = c5542w8;
        this.f31910e = c4984a0;
        this.f31911f = c4489f8;
        this.f31912g = c5266l7;
        this.f31913h = c5542w8.f32758a;
    }

    /* renamed from: b */
    public static String m20565b() {
        TO0 to0 = new TO0();
        C5256km c5256kmM20641z = C5244ka.f32038C.m20641z();
        C5166h7 c5166h7 = new C5166h7(to0);
        synchronized (c5256kmM20641z) {
            c5256kmM20641z.f32113b.mo19829a(c5166h7);
        }
        return (String) to0.f11337a;
    }

    /* renamed from: a */
    public final C5091e7 m20566a() throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        C4455Dn c4455Dn;
        Location location;
        Integer numValueOf = Integer.valueOf(this.f31913h.f30765e);
        String name = this.f31913h.getName();
        String value = this.f31913h.getValue();
        C4729P8 c4729p8 = this.f31908c;
        int i = this.f31907b;
        C5482tn c5482tn = c4729p8.f30610a.f30657a;
        synchronized (c5482tn) {
            jSONObjectOptJSONObject = c5482tn.f32656a.m21151a().optJSONObject("numbers_of_type");
        }
        long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong(String.valueOf(i)) : 0L;
        c4729p8.f30610a.m19741a(i, 1 + jOptLong);
        Long lValueOf = Long.valueOf(jOptLong);
        C5266l7 c5266l7 = this.f31912g;
        C4473Eg c4473Eg = c5266l7.f32133a;
        Location location2 = c4473Eg.f30081e;
        if (location2 != null) {
            int i2 = C4455Dn.f30042b;
            Location location3 = new Location(location2);
            String provider = location3.getProvider();
            location3.setProvider("");
            c4455Dn = new C4455Dn(location3, provider);
        } else {
            c4455Dn = (!c4473Eg.f30080d || (location = C5244ka.f32038C.m20625j().getLocation()) == null) ? null : new C4455Dn(new Location(location), "");
        }
        boolean z = c5266l7.f32133a.f30080d;
        Double dValueOf = c4455Dn != null ? Double.valueOf(c4455Dn.getLatitude()) : null;
        Double dValueOf2 = c4455Dn != null ? Double.valueOf(c4455Dn.getLongitude()) : null;
        Long lValueOf2 = c4455Dn != null ? Long.valueOf(c4455Dn.getTime()) : null;
        Integer numValueOf2 = c4455Dn != null ? Integer.valueOf((int) c4455Dn.getAccuracy()) : null;
        C5216j7 c5216j7 = new C5216j7(Boolean.valueOf(z), dValueOf2, dValueOf, c4455Dn != null ? Integer.valueOf((int) c4455Dn.getAltitude()) : null, c4455Dn != null ? Integer.valueOf((int) c4455Dn.getBearing()) : null, numValueOf2, c4455Dn != null ? Integer.valueOf((int) c4455Dn.getSpeed()) : null, lValueOf2, c4455Dn != null ? c4455Dn.getProvider() : null, c4455Dn != null ? c4455Dn.f30043a : null);
        String str = this.f31913h.f30763c;
        C4984a0 c4984a0 = this.f31910e;
        String str2 = c4984a0.f31232a;
        Long lValueOf3 = Long.valueOf(c4984a0.f31233b);
        Integer numValueOf3 = Integer.valueOf(this.f31913h.f30767g);
        Context context = this.f31906a;
        SafePackageManager safePackageManager = AbstractC4949Yd.f31112a;
        Integer num = (Integer) AbstractC4949Yd.f31115d.m20862a((EnumC4925Xd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC4925Xd.UNDEFINED, new C4901Wd()));
        num.intValue();
        String strM20565b = m20565b();
        EnumC4465E8 enumC4465E8 = this.f31909d.f32759b;
        C4821T5 c4821t5 = this.f31913h;
        return new C5091e7(numValueOf, name, value, lValueOf, c5216j7, str, str2, lValueOf3, numValueOf3, num, strM20565b, enumC4465E8, c4821t5.f30768h, c4821t5.f30771k, c4821t5.f30772l, c4821t5.f30774n, c4821t5.f30775o, this.f31911f.fromModel(c4821t5.f30776p));
    }

    public /* synthetic */ C5191i7(Context context, C4907Wj c4907Wj, int i, C4729P8 c4729p8, C5542w8 c5542w8, C4473Eg c4473Eg, C4984a0 c4984a0) {
        this(context, c4907Wj, i, c4729p8, c5542w8, c4984a0, new C4489F8(), new C5266l7(c4473Eg));
    }
}
