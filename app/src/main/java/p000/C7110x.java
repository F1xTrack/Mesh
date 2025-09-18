package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: x */
/* loaded from: classes.dex */
public final class C7110x implements InterfaceC7235yz {

    /* renamed from: a */
    public final float f45246a;

    public C7110x(float f) {
        this.f45246a = f;
    }

    @Override // p000.InterfaceC7235yz
    /* renamed from: a */
    public final float mo22818a(RectF rectF) {
        return this.f45246a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7110x) && this.f45246a == ((C7110x) obj).f45246a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f45246a)});
    }
}
