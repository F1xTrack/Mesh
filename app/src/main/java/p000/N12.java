package p000;

import android.graphics.Color;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class N12 {
    /* renamed from: a */
    public static String m5521a(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        int i2 = AbstractC7485Dh1.f2166a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    /* renamed from: b */
    public static void m5522b(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC11153tN0.m24909u(i2, "at index "));
            }
        }
    }
}
