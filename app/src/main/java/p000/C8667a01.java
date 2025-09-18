package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: a01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8667a01 extends AbstractC8795b01 {

    /* renamed from: b */
    public float f15279b;

    /* renamed from: c */
    public float f15280c;

    @Override // p000.AbstractC8795b01
    /* renamed from: a */
    public final void mo9548a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f16704a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f15279b, this.f15280c);
        path.transform(matrix);
    }
}
