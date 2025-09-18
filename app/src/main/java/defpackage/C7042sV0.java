package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: sV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7042sV0 extends AbstractC6268oR1 {
    public static final C7042sV0 b = new C7042sV0(0);
    public static final C7042sV0 c = new C7042sV0(1);
    public static final C7042sV0 d = new C7042sV0(2);
    public static final C7042sV0 e = new C7042sV0(3);
    public static final C7042sV0 f = new C7042sV0(4);
    public static final C7042sV0 g = new C7042sV0(5);
    public final /* synthetic */ int a;

    public /* synthetic */ C7042sV0(int i) {
        this.a = i;
    }

    @Override // defpackage.AbstractC6268oR1
    public final void c(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        float fWidth;
        float fHeight;
        switch (this.a) {
            case 0:
                O90.f(matrix, "outTransform");
                O90.f(rect, "parentRect");
                float fMin = Math.min(f4, f5);
                if (fMin > 1.0f) {
                    fMin = 1.0f;
                }
                float f6 = rect.left;
                float f7 = rect.top;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate(Math.round(f6), Math.round(f7));
                break;
            case 1:
                matrix.setTranslate((int) (((rect.width() - i) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i2) * 0.5f) + rect.top + 0.5f));
                break;
            case 2:
                if (f5 > f4) {
                    fWidth = ((rect.width() - (i * f5)) * 0.5f) + rect.left;
                    fHeight = rect.top;
                    f4 = f5;
                } else {
                    fWidth = rect.left;
                    fHeight = ((rect.height() - (i2 * f4)) * 0.5f) + rect.top;
                }
                matrix.setScale(f4, f4);
                matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
                break;
            case 3:
                float fMin2 = Math.min(Math.min(f4, f5), 1.0f);
                float fWidth2 = ((rect.width() - (i * fMin2)) * 0.5f) + rect.left;
                float fHeight2 = ((rect.height() - (i2 * fMin2)) * 0.5f) + rect.top;
                matrix.setScale(fMin2, fMin2);
                matrix.postTranslate((int) (fWidth2 + 0.5f), (int) (fHeight2 + 0.5f));
                break;
            case 4:
                float fMin3 = Math.min(f4, f5);
                float fWidth3 = ((rect.width() - (i * fMin3)) * 0.5f) + rect.left;
                float fHeight3 = ((rect.height() - (i2 * fMin3)) * 0.5f) + rect.top;
                matrix.setScale(fMin3, fMin3);
                matrix.postTranslate((int) (fWidth3 + 0.5f), (int) (fHeight3 + 0.5f));
                break;
            default:
                float f8 = rect.left;
                float f9 = rect.top;
                matrix.setScale(f4, f5);
                matrix.postTranslate((int) (f8 + 0.5f), (int) (f9 + 0.5f));
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "start_inside";
            case 1:
                return "center";
            case 2:
                return "center_crop";
            case 3:
                return "center_inside";
            case 4:
                return "fit_center";
            default:
                return "fit_xy";
        }
    }
}
