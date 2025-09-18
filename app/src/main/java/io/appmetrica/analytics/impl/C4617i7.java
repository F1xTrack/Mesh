package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import defpackage.TO0;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.i7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4617i7 {
    public final Context a;
    public final int b;
    public final P8 c;
    public final C4952w8 d;
    public final C4414a0 e;
    public final F8 f;
    public final C4688l7 g;
    public final T5 h;

    public C4617i7(Context context, Wj wj, int i, P8 p8, C4952w8 c4952w8, C4414a0 c4414a0, F8 f8, C4688l7 c4688l7) {
        this.a = context;
        this.b = i;
        this.c = p8;
        this.d = c4952w8;
        this.e = c4414a0;
        this.f = f8;
        this.g = c4688l7;
        this.h = c4952w8.a;
    }

    public static String b() {
        TO0 to0 = new TO0();
        C4679km c4679kmZ = C4667ka.C.z();
        C4593h7 c4593h7 = new C4593h7(to0);
        synchronized (c4679kmZ) {
            c4679kmZ.b.a(c4593h7);
        }
        return (String) to0.a;
    }

    public final C4521e7 a() throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        Dn dn;
        Location location;
        Integer numValueOf = Integer.valueOf(this.h.e);
        String name = this.h.getName();
        String value = this.h.getValue();
        P8 p8 = this.c;
        int i = this.b;
        tn tnVar = p8.a.a;
        synchronized (tnVar) {
            jSONObjectOptJSONObject = tnVar.a.a().optJSONObject("numbers_of_type");
        }
        long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong(String.valueOf(i)) : 0L;
        p8.a.a(i, 1 + jOptLong);
        Long lValueOf = Long.valueOf(jOptLong);
        C4688l7 c4688l7 = this.g;
        Eg eg = c4688l7.a;
        Location location2 = eg.e;
        if (location2 != null) {
            int i2 = Dn.b;
            Location location3 = new Location(location2);
            String provider = location3.getProvider();
            location3.setProvider("");
            dn = new Dn(location3, provider);
        } else {
            dn = (!eg.d || (location = C4667ka.C.j().getLocation()) == null) ? null : new Dn(new Location(location), "");
        }
        boolean z = c4688l7.a.d;
        Double dValueOf = dn != null ? Double.valueOf(dn.getLatitude()) : null;
        Double dValueOf2 = dn != null ? Double.valueOf(dn.getLongitude()) : null;
        Long lValueOf2 = dn != null ? Long.valueOf(dn.getTime()) : null;
        Integer numValueOf2 = dn != null ? Integer.valueOf((int) dn.getAccuracy()) : null;
        C4640j7 c4640j7 = new C4640j7(Boolean.valueOf(z), dValueOf2, dValueOf, dn != null ? Integer.valueOf((int) dn.getAltitude()) : null, dn != null ? Integer.valueOf((int) dn.getBearing()) : null, numValueOf2, dn != null ? Integer.valueOf((int) dn.getSpeed()) : null, lValueOf2, dn != null ? dn.getProvider() : null, dn != null ? dn.a : null);
        String str = this.h.c;
        C4414a0 c4414a0 = this.e;
        String str2 = c4414a0.a;
        Long lValueOf3 = Long.valueOf(c4414a0.b);
        Integer numValueOf3 = Integer.valueOf(this.h.g);
        Context context = this.a;
        SafePackageManager safePackageManager = Yd.a;
        Integer num = (Integer) Yd.d.a((Xd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Xd.UNDEFINED, new Wd()));
        num.intValue();
        String strB = b();
        E8 e8 = this.d.b;
        T5 t5 = this.h;
        return new C4521e7(numValueOf, name, value, lValueOf, c4640j7, str, str2, lValueOf3, numValueOf3, num, strB, e8, t5.h, t5.k, t5.l, t5.n, t5.o, this.f.fromModel(t5.p));
    }

    public /* synthetic */ C4617i7(Context context, Wj wj, int i, P8 p8, C4952w8 c4952w8, Eg eg, C4414a0 c4414a0) {
        this(context, wj, i, p8, c4952w8, c4414a0, new F8(), new C4688l7(eg));
    }
}
