package p000;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: Cl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7441Cl1 {
    /* renamed from: a */
    public static void m1308a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: b */
    public static void m1309b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: c */
    public static void m1310c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
