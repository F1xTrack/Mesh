package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: Mz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031Mz0 {
    public final int a;
    public final Bitmap b;
    public final RectF c;
    public final boolean d;
    public int e;

    public C1031Mz0(int i, Bitmap bitmap, RectF rectF, boolean z, int i2) {
        this.a = i;
        this.b = bitmap;
        this.c = rectF;
        this.d = z;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1031Mz0)) {
            return false;
        }
        C1031Mz0 c1031Mz0 = (C1031Mz0) obj;
        if (c1031Mz0.a != this.a) {
            return false;
        }
        RectF rectF = c1031Mz0.c;
        float f = rectF.left;
        RectF rectF2 = this.c;
        return f == rectF2.left && rectF.right == rectF2.right && rectF.top == rectF2.top && rectF.bottom == rectF2.bottom;
    }
}
