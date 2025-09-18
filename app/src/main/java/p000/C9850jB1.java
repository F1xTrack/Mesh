package p000;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: jB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9850jB1 extends SQ1 {

    /* renamed from: d */
    public long f34968d;

    /* renamed from: e */
    public String f34969e;

    /* renamed from: A1 */
    public final String m21984A1() {
        m7367w1();
        return this.f34969e;
    }

    @Override // p000.SQ1
    /* renamed from: y1 */
    public final boolean mo6035y1() {
        Calendar calendar = Calendar.getInstance();
        this.f34968d = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f34969e = AbstractC1374Vq.m8589h(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    /* renamed from: z1 */
    public final long m21985z1() {
        m7367w1();
        return this.f34968d;
    }
}
