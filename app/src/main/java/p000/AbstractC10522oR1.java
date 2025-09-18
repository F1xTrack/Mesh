package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* renamed from: oR1 */
/* loaded from: classes.dex */
public abstract class AbstractC10522oR1 implements InterfaceC11297uV0 {
    /* renamed from: a */
    public static String m23402a(C7161xo c7161xo, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) c7161xo.m25939b("0").m3155a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) c7161xo.m25939b("1").m3155a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    /* renamed from: b */
    public Matrix m23403b(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        mo23404c(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
        return matrix;
    }

    /* renamed from: c */
    public abstract void mo23404c(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
}
