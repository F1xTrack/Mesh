package p000;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: Mz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7988Mz0 {

    /* renamed from: a */
    public final int f7422a;

    /* renamed from: b */
    public final Bitmap f7423b;

    /* renamed from: c */
    public final RectF f7424c;

    /* renamed from: d */
    public final boolean f7425d;

    /* renamed from: e */
    public int f7426e;

    public C7988Mz0(int i, Bitmap bitmap, RectF rectF, boolean z, int i2) {
        this.f7422a = i;
        this.f7423b = bitmap;
        this.f7424c = rectF;
        this.f7425d = z;
        this.f7426e = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7988Mz0)) {
            return false;
        }
        C7988Mz0 c7988Mz0 = (C7988Mz0) obj;
        if (c7988Mz0.f7422a != this.f7422a) {
            return false;
        }
        RectF rectF = c7988Mz0.f7424c;
        float f = rectF.left;
        RectF rectF2 = this.f7424c;
        return f == rectF2.left && rectF.right == rectF2.right && rectF.top == rectF2.top && rectF.bottom == rectF2.bottom;
    }
}
