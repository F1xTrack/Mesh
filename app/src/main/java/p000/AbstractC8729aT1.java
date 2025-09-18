package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Closeable;
import java.text.DecimalFormat;

/* renamed from: aT1 */
/* loaded from: classes.dex */
public abstract class AbstractC8729aT1 {
    /* renamed from: a */
    public static final void m9749a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                I02.m3687a(th, th2);
            }
        }
    }

    /* renamed from: b */
    public static final void m9750b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Bytes cannot be negative");
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = j;
        int i = 0;
        double d2 = d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            decimalFormat.format(d2);
            String str = strArr[i];
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (-1 < i) {
            double dPow = Math.pow(1024.0d, i);
            double dFloor = Math.floor(d / dPow);
            if (dFloor > ConfigValue.DOUBLE_DEFAULT_VALUE) {
                sb.append(decimalFormat.format(dFloor));
                sb.append(" ");
                sb.append(strArr[i]);
                sb.append(" ");
                d -= dFloor * dPow;
            }
            i--;
        }
        AbstractC11374v51.m25350Y(sb).toString();
    }
}
