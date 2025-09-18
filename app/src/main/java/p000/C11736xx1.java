package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* renamed from: xx1 */
/* loaded from: classes.dex */
public final class C11736xx1 implements Api.ApiOptions.Optional {

    /* renamed from: c */
    public static final C11736xx1 f45914c;

    /* renamed from: a */
    public final boolean f45915a;

    /* renamed from: b */
    public final String f45916b;

    static {
        C0827N8 c0827n8 = new C0827N8(27, false);
        c0827n8.f7523b = Boolean.FALSE;
        f45914c = new C11736xx1(c0827n8);
    }

    public C11736xx1(C0827N8 c0827n8) {
        this.f45915a = ((Boolean) c0827n8.f7523b).booleanValue();
        this.f45916b = (String) c0827n8.f7524c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11736xx1)) {
            return false;
        }
        C11736xx1 c11736xx1 = (C11736xx1) obj;
        c11736xx1.getClass();
        return Objects.equal(null, null) && this.f45915a == c11736xx1.f45915a && Objects.equal(this.f45916b, c11736xx1.f45916b);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.f45915a), this.f45916b);
    }
}
