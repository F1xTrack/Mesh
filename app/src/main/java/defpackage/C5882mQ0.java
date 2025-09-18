package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: mQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5882mQ0 implements InterfaceC8274yz {
    public final float a;

    public C5882mQ0(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC8274yz
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5882mQ0) && this.a == ((C5882mQ0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
