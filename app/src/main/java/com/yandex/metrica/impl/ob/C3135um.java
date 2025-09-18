package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.AbstractC7680vr;
import defpackage.D51;
import defpackage.O90;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* renamed from: com.yandex.metrica.impl.ob.um, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3135um {
    private final Context a;
    private final C2727ec b;
    private final C2827ic c;

    public C3135um(Context context, C2727ec c2727ec, C2827ic c2827ic) {
        this.a = context;
        this.b = c2727ec;
        this.c = c2827ic;
    }

    private final String b() {
        String string = UUID.randomUUID().toString();
        O90.e(string, "UUID.randomUUID().toString()");
        String strM = D51.m(string, "-", "");
        Locale locale = Locale.US;
        O90.e(locale, "Locale.US");
        String lowerCase = strM.toLowerCase(locale);
        O90.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final String a() {
        byte[] bArrDigest;
        C2777gc c2777gcA = this.b.a(this.a, new C2976oc(5, 500));
        O90.e(c2777gcA, "advertisingIdGetter.getI…sedRetryStrategy(5, 500))");
        C2652bc c2652bcC = c2777gcA.c();
        O90.e(c2652bcC, "advertisingIdGetter.getI…yStrategy(5, 500)).yandex");
        if (!c2652bcC.a()) {
            String strA = this.c.a().a();
            if (strA != null && strA.length() != 0) {
                try {
                    UUID.fromString(strA);
                    if (!strA.equals(DeviceIdUtils.NULL_UUID)) {
                        return D51.m(strA, "-", "");
                    }
                } catch (Throwable unused) {
                }
            }
            return b();
        }
        C2627ac c2627ac = c2652bcC.a;
        O90.c(c2627ac);
        String str = c2627ac.b;
        O90.c(str);
        byte[] bytes = str.getBytes(AbstractC7680vr.a);
        O90.e(bytes, "(this as java.lang.String).getBytes(charset)");
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(bytes);
        } catch (NoSuchAlgorithmException unused2) {
            bArrDigest = new byte[0];
        }
        String strA2 = O2.a(bArrDigest);
        O90.e(strA2, "StringUtils.toHexString(…!.advId!!.toByteArray()))");
        return strA2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3135um(Context context) {
        P0 p0I = P0.i();
        O90.e(p0I, "GlobalServiceLocator.getInstance()");
        C2727ec c2727ecT = p0I.t();
        O90.e(c2727ecT, "GlobalServiceLocator.get…ternalAdvertisingIdGetter");
        P0 p0I2 = P0.i();
        O90.e(p0I2, "GlobalServiceLocator.getInstance()");
        C2827ic c2827icB = p0I2.b();
        O90.e(c2827icB, "GlobalServiceLocator.getInstance().appSetIdGetter");
        this(context, c2727ecT, c2827icB);
    }
}
