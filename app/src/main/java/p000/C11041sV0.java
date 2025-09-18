package p000;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: sV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11041sV0 extends AbstractC10522oR1 {

    /* renamed from: b */
    public static final C11041sV0 f42459b = new C11041sV0(0);

    /* renamed from: c */
    public static final C11041sV0 f42460c = new C11041sV0(1);

    /* renamed from: d */
    public static final C11041sV0 f42461d = new C11041sV0(2);

    /* renamed from: e */
    public static final C11041sV0 f42462e = new C11041sV0(3);

    /* renamed from: f */
    public static final C11041sV0 f42463f = new C11041sV0(4);

    /* renamed from: g */
    public static final C11041sV0 f42464g = new C11041sV0(5);

    /* renamed from: a */
    public final /* synthetic */ int f42465a;

    public /* synthetic */ C11041sV0(int i) {
        this.f42465a = i;
    }

    @Override // p000.AbstractC10522oR1
    /* renamed from: c */
    public final void mo23404c(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fWidth;
        float fHeight;
        switch (this.f42465a) {
            case 0:
                O90.m5968f(matrix, "outTransform");
                O90.m5968f(rect, "parentRect");
                float fMin = Math.min(f3, f4);
                if (fMin > 1.0f) {
                    fMin = 1.0f;
                }
                float f5 = rect.left;
                float f6 = rect.top;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate(Math.round(f5), Math.round(f6));
                break;
            case 1:
                matrix.setTranslate((int) (((rect.width() - i) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i2) * 0.5f) + rect.top + 0.5f));
                break;
            case 2:
                if (f4 > f3) {
                    fWidth = ((rect.width() - (i * f4)) * 0.5f) + rect.left;
                    fHeight = rect.top;
                    f3 = f4;
                } else {
                    fWidth = rect.left;
                    fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
                }
                matrix.setScale(f3, f3);
                matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
                break;
            case 3:
                float fMin2 = Math.min(Math.min(f3, f4), 1.0f);
                float fWidth2 = ((rect.width() - (i * fMin2)) * 0.5f) + rect.left;
                float fHeight2 = ((rect.height() - (i2 * fMin2)) * 0.5f) + rect.top;
                matrix.setScale(fMin2, fMin2);
                matrix.postTranslate((int) (fWidth2 + 0.5f), (int) (fHeight2 + 0.5f));
                break;
            case 4:
                float fMin3 = Math.min(f3, f4);
                float fWidth3 = ((rect.width() - (i * fMin3)) * 0.5f) + rect.left;
                float fHeight3 = ((rect.height() - (i2 * fMin3)) * 0.5f) + rect.top;
                matrix.setScale(fMin3, fMin3);
                matrix.postTranslate((int) (fWidth3 + 0.5f), (int) (fHeight3 + 0.5f));
                break;
            default:
                float f7 = rect.left;
                float f8 = rect.top;
                matrix.setScale(f3, f4);
                matrix.postTranslate((int) (f7 + 0.5f), (int) (f8 + 0.5f));
                break;
        }
    }

    public final String toString() {
        switch (this.f42465a) {
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
