package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Objects;

/* renamed from: t70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7161t70 {
    public final String a;
    public final Uri b;
    public final double c;
    public final boolean d;

    public C7161t70(Context context, String str, double d, double d2) {
        Uri uriC;
        O90.f(context, "context");
        this.a = str;
        try {
            uriC = Uri.parse(str);
            if (uriC.getScheme() == null) {
                this.d = true;
                uriC = C6652qS0.b.c(context, str);
            }
        } catch (NullPointerException unused) {
            this.d = true;
            uriC = C6652qS0.b.c(context, this.a);
        }
        this.b = uriC;
        this.c = d * d2;
    }

    public static final C7161t70 a(Context context) {
        O90.f(context, "context");
        return new C7161t70(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C7161t70.class.equals(obj.getClass())) {
            return false;
        }
        C7161t70 c7161t70 = (C7161t70) obj;
        return Double.compare(c7161t70.c, this.c) == 0 && this.d == c7161t70.d && O90.a(this.b, c7161t70.b) && O90.a(this.a, c7161t70.a);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, Double.valueOf(this.c), Boolean.valueOf(this.d));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7161t70(Context context, String str) {
        this(context, str, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
        O90.f(context, "context");
    }
}
