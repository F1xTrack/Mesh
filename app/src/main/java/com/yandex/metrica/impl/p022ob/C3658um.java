package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import p000.AbstractC7038vr;
import p000.D51;
import p000.O90;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;

/* renamed from: com.yandex.metrica.impl.ob.um */
/* loaded from: classes2.dex */
public final class C3658um {

    /* renamed from: a */
    private final Context f24968a;

    /* renamed from: b */
    private final C3232ec f24969b;

    /* renamed from: c */
    private final C3336ic f24970c;

    public C3658um(Context context, C3232ec c3232ec, C3336ic c3336ic) {
        this.f24968a = context;
        this.f24969b = c3232ec;
        this.f24970c = c3336ic;
    }

    /* renamed from: b */
    private final String m16938b() {
        String string = UUID.randomUUID().toString();
        O90.m5967e(string, "UUID.randomUUID().toString()");
        String strM1554m = D51.m1554m(string, "-", "");
        Locale locale = Locale.US;
        O90.m5967e(locale, "Locale.US");
        String lowerCase = strM1554m.toLowerCase(locale);
        O90.m5967e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: a */
    public final String m16939a() {
        byte[] bArrDigest;
        C3284gc c3284gcM15838a = this.f24969b.m15838a(this.f24968a, new C3492oc(5, 500));
        O90.m5967e(c3284gcM15838a, "advertisingIdGetter.getI…sedRetryStrategy(5, 500))");
        C3154bc c3154bcM15992c = c3284gcM15838a.m15992c();
        O90.m5967e(c3154bcM15992c, "advertisingIdGetter.getI…yStrategy(5, 500)).yandex");
        if (!c3154bcM15992c.m15682a()) {
            String strM16042a = this.f24970c.m16087a().m16042a();
            if (strM16042a != null && strM16042a.length() != 0) {
                try {
                    UUID.fromString(strM16042a);
                    if (!strM16042a.equals(DeviceIdUtils.NULL_UUID)) {
                        return D51.m1554m(strM16042a, "-", "");
                    }
                } catch (Throwable unused) {
                }
            }
            return m16938b();
        }
        C3128ac c3128ac = c3154bcM15992c.f23129a;
        O90.m5965c(c3128ac);
        String str = c3128ac.f23041b;
        O90.m5965c(str);
        byte[] bytes = str.getBytes(AbstractC7038vr.f44561a);
        O90.m5967e(bytes, "(this as java.lang.String).getBytes(charset)");
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(bytes);
        } catch (NoSuchAlgorithmException unused2) {
            bArrDigest = new byte[0];
        }
        String strM14687a = C2819O2.m14687a(bArrDigest);
        O90.m5967e(strM14687a, "StringUtils.toHexString(…!.advId!!.toByteArray()))");
        return strM14687a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3658um(Context context) {
        C2842P0 c2842p0M14728i = C2842P0.m14728i();
        O90.m5967e(c2842p0M14728i, "GlobalServiceLocator.getInstance()");
        C3232ec c3232ecM14749t = c2842p0M14728i.m14749t();
        O90.m5967e(c3232ecM14749t, "GlobalServiceLocator.get…ternalAdvertisingIdGetter");
        C2842P0 c2842p0M14728i2 = C2842P0.m14728i();
        O90.m5967e(c2842p0M14728i2, "GlobalServiceLocator.getInstance()");
        C3336ic c3336icM14732b = c2842p0M14728i2.m14732b();
        O90.m5967e(c3336icM14732b, "GlobalServiceLocator.getInstance().appSetIdGetter");
        this(context, c3232ecM14749t, c3336icM14732b);
    }
}
