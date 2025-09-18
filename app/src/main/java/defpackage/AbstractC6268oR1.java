package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* renamed from: oR1 */
/* loaded from: classes.dex */
public abstract class AbstractC6268oR1 implements InterfaceC7424uV0 {
    public static String a(C8051xo c8051xo, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) c8051xo.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) c8051xo.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    public Matrix b(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        c(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
        return matrix;
    }

    public abstract void c(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
}
