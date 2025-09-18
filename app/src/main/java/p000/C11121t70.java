package p000;

import android.content.Context;
import android.net.Uri;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Objects;

/* renamed from: t70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11121t70 {

    /* renamed from: a */
    public final String f42839a;

    /* renamed from: b */
    public final Uri f42840b;

    /* renamed from: c */
    public final double f42841c;

    /* renamed from: d */
    public final boolean f42842d;

    public C11121t70(Context context, String str, double d, double d2) {
        Uri uriM24001c;
        O90.m5968f(context, "context");
        this.f42839a = str;
        try {
            uriM24001c = Uri.parse(str);
            if (uriM24001c.getScheme() == null) {
                this.f42842d = true;
                uriM24001c = C10779qS0.f40878b.m24001c(context, str);
            }
        } catch (NullPointerException unused) {
            this.f42842d = true;
            uriM24001c = C10779qS0.f40878b.m24001c(context, this.f42839a);
        }
        this.f42840b = uriM24001c;
        this.f42841c = d * d2;
    }

    /* renamed from: a */
    public static final C11121t70 m24840a(Context context) {
        O90.m5968f(context, "context");
        return new C11121t70(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C11121t70.class.equals(obj.getClass())) {
            return false;
        }
        C11121t70 c11121t70 = (C11121t70) obj;
        return Double.compare(c11121t70.f42841c, this.f42841c) == 0 && this.f42842d == c11121t70.f42842d && O90.m5963a(this.f42840b, c11121t70.f42840b) && O90.m5963a(this.f42839a, c11121t70.f42839a);
    }

    public final int hashCode() {
        return Objects.hash(this.f42840b, this.f42839a, Double.valueOf(this.f42841c), Boolean.valueOf(this.f42842d));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11121t70(Context context, String str) {
        this(context, str, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
        O90.m5968f(context, "context");
    }
}
