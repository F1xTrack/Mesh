package p000;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10554oh1 {

    /* renamed from: a */
    public static final AtomicReference f39182a = new AtomicReference();

    /* renamed from: a */
    public static long m23520a(long j) {
        Calendar calendarM23526g = m23526g(null);
        calendarM23526g.setTimeInMillis(j);
        return m23523d(calendarM23526g).getTimeInMillis();
    }

    /* renamed from: b */
    public static int m23521b(int i, String str, int i2, String str2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: c */
    public static DateFormat m23522c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    /* renamed from: d */
    public static Calendar m23523d(Calendar calendar) {
        Calendar calendarM23526g = m23526g(calendar);
        Calendar calendarM23526g2 = m23526g(null);
        calendarM23526g2.set(calendarM23526g.get(1), calendarM23526g.get(2), calendarM23526g.get(5));
        return calendarM23526g2;
    }

    /* renamed from: e */
    public static java.text.DateFormat m23524e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    /* renamed from: f */
    public static Calendar m23525f() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: g */
    public static Calendar m23526g(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
