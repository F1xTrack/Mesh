package defpackage;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: jB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5265jB1 extends SQ1 {
    public long d;
    public String e;

    public final String A1() {
        w1();
        return this.e;
    }

    @Override // defpackage.SQ1
    public final boolean y1() {
        Calendar calendar = Calendar.getInstance();
        this.d = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.e = AbstractC1705Vq.h(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long z1() {
        w1();
        return this.d;
    }
}
