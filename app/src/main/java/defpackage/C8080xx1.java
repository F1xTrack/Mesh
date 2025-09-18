package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* renamed from: xx1 */
/* loaded from: classes.dex */
public final class C8080xx1 implements Api.ApiOptions.Optional {
    public static final C8080xx1 c;
    public final boolean a;
    public final String b;

    static {
        N8 n8 = new N8(27, false);
        n8.b = Boolean.FALSE;
        c = new C8080xx1(n8);
    }

    public C8080xx1(N8 n8) {
        this.a = ((Boolean) n8.b).booleanValue();
        this.b = (String) n8.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8080xx1)) {
            return false;
        }
        C8080xx1 c8080xx1 = (C8080xx1) obj;
        c8080xx1.getClass();
        return Objects.equal(null, null) && this.a == c8080xx1.a && Objects.equal(this.b, c8080xx1.b);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.a), this.b);
    }
}
