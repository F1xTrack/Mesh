package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: a01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2050a01 extends AbstractC2241b01 {
    public float b;
    public float c;

    @Override // defpackage.AbstractC2241b01
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
