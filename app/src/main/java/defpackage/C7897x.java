package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7897x implements InterfaceC8274yz {
    public final float a;

    public C7897x(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC8274yz
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7897x) && this.a == ((C7897x) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
