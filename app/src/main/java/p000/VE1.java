package p000;

import java.text.SimpleDateFormat;
import java.util.Locale;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public abstract class VE1 {

    /* renamed from: a */
    public static final StringBuilder f12459a;

    static {
        Locale locale = Locale.ROOT;
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f12459a = new StringBuilder(33);
    }

    /* renamed from: a */
    public static void m8337a(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append(UcumUtils.UCUM_DAYS);
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append(UcumUtils.UCUM_HOURS);
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append(UcumUtils.UCUM_SECONDS);
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append(UcumUtils.UCUM_MILLISECODS);
        }
    }
}
