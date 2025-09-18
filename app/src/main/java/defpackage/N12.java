package defpackage;

import android.graphics.Color;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class N12 {
    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        int i2 = AbstractC0277Dh1.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static void b(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC7209tN0.u(i2, "at index "));
            }
        }
    }
}
