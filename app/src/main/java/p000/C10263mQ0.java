package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: mQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10263mQ0 implements InterfaceC7235yz {

    /* renamed from: a */
    public final float f37676a;

    public C10263mQ0(float f) {
        this.f37676a = f;
    }

    @Override // p000.InterfaceC7235yz
    /* renamed from: a */
    public final float mo22818a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f37676a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10263mQ0) && this.f37676a == ((C10263mQ0) obj).f37676a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f37676a)});
    }
}
