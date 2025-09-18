package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes2.dex */
public final class LU0 extends C5742lh0 {
    public final float[] A;
    public final float[] B;
    public boolean C;
    public IU0 z;

    public LU0() {
        int[] iArr = AbstractC7091sl1.a;
        this.A = new float[9];
        this.B = new float[9];
        for (int i = 0; i < 9; i++) {
            this.A[i] = Float.NaN;
            this.B[i] = Float.NaN;
        }
    }

    public static float J(GU0 gu0, float f, float f2) {
        return gu0 == GU0.a ? f2 : gu0 == GU0.c ? Math.max(f, f2) : f + f2;
    }

    public final void K() {
        IU0 iu0 = this.z;
        if (iu0 == null) {
            return;
        }
        KU0 ku0 = KU0.a;
        KU0 ku02 = iu0.b;
        float[] fArr = ku02 == ku0 ? this.A : this.B;
        float f = fArr[8];
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = f;
        float f3 = f2;
        float f4 = f3;
        float f5 = fArr[7];
        if (!Float.isNaN(f5)) {
            f = f5;
            f3 = f;
        }
        float f6 = fArr[6];
        if (!Float.isNaN(f6)) {
            f2 = f6;
            f4 = f2;
        }
        float f7 = fArr[1];
        if (!Float.isNaN(f7)) {
            f = f7;
        }
        float f8 = fArr[2];
        if (!Float.isNaN(f8)) {
            f2 = f8;
        }
        float f9 = fArr[3];
        if (!Float.isNaN(f9)) {
            f3 = f9;
        }
        float f10 = fArr[0];
        if (!Float.isNaN(f10)) {
            f4 = f10;
        }
        float fB = AbstractC7586vL1.b(f);
        float fB2 = AbstractC7586vL1.b(f2);
        float fB3 = AbstractC7586vL1.b(f3);
        float fB4 = AbstractC7586vL1.b(f4);
        HU0 hu0 = iu0.c;
        GU0 gu0 = hu0.d;
        GU0 gu02 = hu0.c;
        GU0 gu03 = hu0.b;
        GU0 gu04 = hu0.a;
        WM wm = iu0.a;
        if (ku02 == ku0) {
            E(J(gu04, wm.a, fB), 1);
            E(J(gu03, wm.b, fB2), 2);
            E(J(gu02, wm.c, fB3), 3);
            E(J(gu0, wm.d, fB4), 0);
            return;
        }
        C(J(gu04, wm.a, fB), 1);
        C(J(gu03, wm.b, fB2), 2);
        C(J(gu02, wm.c, fB3), 3);
        C(J(gu0, wm.d, fB4), 0);
    }

    @Override // defpackage.EM0, defpackage.DM0
    public final void b(C6846rT1 c6846rT1) {
        O90.f(c6846rT1, "nativeViewHierarchyOptimizer");
        if (this.C) {
            this.C = false;
            K();
        }
    }

    @Override // defpackage.EM0, defpackage.DM0
    public final void e(Object obj) {
        KU0 ku0;
        O90.f(obj, "data");
        if (obj instanceof IU0) {
            IU0 iu0 = this.z;
            if (iu0 != null && (ku0 = iu0.b) != ((IU0) obj).b) {
                if (ku0 == KU0.a) {
                    float[] fArr = this.A;
                    E(fArr[1], 1);
                    E(fArr[2], 2);
                    E(fArr[3], 3);
                    E(fArr[0], 0);
                } else {
                    float[] fArr2 = this.B;
                    C(fArr2[1], 1);
                    C(fArr2[2], 2);
                    C(fArr2[3], 3);
                    C(fArr2[0], 0);
                }
                t();
            }
            this.z = (IU0) obj;
            this.C = false;
            K();
        }
    }

    @Override // defpackage.C5742lh0
    @InterfaceC5488kM0(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        O90.f(dynamic, "margin");
        this.B[AbstractC7091sl1.b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i, dynamic);
        this.C = true;
    }

    @Override // defpackage.C5742lh0
    @InterfaceC5488kM0(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        O90.f(dynamic, "padding");
        this.A[AbstractC7091sl1.b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i, dynamic);
        this.C = true;
    }
}
