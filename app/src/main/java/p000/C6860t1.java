package p000;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: t1 */
/* loaded from: classes.dex */
public final class C6860t1 {

    /* renamed from: g */
    public static final String[] f42757g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    public static final SimpleDateFormat f42758h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    public final String f42759a;

    /* renamed from: b */
    public final String f42760b;

    /* renamed from: c */
    public final String f42761c;

    /* renamed from: d */
    public final Date f42762d;

    /* renamed from: e */
    public final long f42763e;

    /* renamed from: f */
    public final long f42764f;

    public C6860t1(String str, String str2, String str3, Date date, long j, long j2) {
        this.f42759a = str;
        this.f42760b = str2;
        this.f42761c = str3;
        this.f42762d = date;
        this.f42763e = j;
        this.f42764f = j2;
    }

    /* renamed from: a */
    public final C1073R3 m24825a() {
        C1073R3 c1073r3 = new C1073R3();
        c1073r3.f9952a = "frc";
        c1073r3.f9964m = this.f42762d.getTime();
        c1073r3.f9953b = this.f42759a;
        c1073r3.f9954c = this.f42760b;
        String str = this.f42761c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        c1073r3.f9955d = str;
        c1073r3.f9956e = this.f42763e;
        c1073r3.f9961j = this.f42764f;
        return c1073r3;
    }
}
