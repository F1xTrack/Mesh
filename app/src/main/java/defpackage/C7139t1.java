package defpackage;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7139t1 {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public C7139t1(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    public final R3 a() {
        R3 r3 = new R3();
        r3.a = "frc";
        r3.m = this.d.getTime();
        r3.b = this.a;
        r3.c = this.b;
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        r3.d = str;
        r3.e = this.e;
        r3.j = this.f;
        return r3;
    }
}
