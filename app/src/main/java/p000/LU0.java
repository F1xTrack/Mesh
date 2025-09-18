package p000;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes2.dex */
public final class LU0 extends C10169lh0 {

    /* renamed from: A */
    public final float[] f6663A;

    /* renamed from: B */
    public final float[] f6664B;

    /* renamed from: C */
    public boolean f6665C;

    /* renamed from: z */
    public IU0 f6666z;

    public LU0() {
        int[] iArr = AbstractC11074sl1.f42585a;
        this.f6663A = new float[9];
        this.f6664B = new float[9];
        for (int i = 0; i < 9; i++) {
            this.f6663A[i] = Float.NaN;
            this.f6664B[i] = Float.NaN;
        }
    }

    /* renamed from: J */
    public static float m5006J(GU0 gu0, float f, float f2) {
        return gu0 == GU0.f3759a ? f2 : gu0 == GU0.f3761c ? Math.max(f, f2) : f + f2;
    }

    /* renamed from: K */
    public final void m5007K() {
        IU0 iu0 = this.f6666z;
        if (iu0 == null) {
            return;
        }
        KU0 ku0 = KU0.f6125a;
        KU0 ku02 = iu0.f4955b;
        float[] fArr = ku02 == ku0 ? this.f6663A : this.f6664B;
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
        float fM25403b = AbstractC11406vL1.m25403b(f);
        float fM25403b2 = AbstractC11406vL1.m25403b(f2);
        float fM25403b3 = AbstractC11406vL1.m25403b(f3);
        float fM25403b4 = AbstractC11406vL1.m25403b(f4);
        HU0 hu0 = iu0.f4956c;
        GU0 gu0 = hu0.f4323d;
        GU0 gu02 = hu0.f4322c;
        GU0 gu03 = hu0.f4321b;
        GU0 gu04 = hu0.f4320a;
        C1407WM c1407wm = iu0.f4954a;
        if (ku02 == ku0) {
            mo2174E(m5006J(gu04, c1407wm.f13142a, fM25403b), 1);
            mo2174E(m5006J(gu03, c1407wm.f13143b, fM25403b2), 2);
            mo2174E(m5006J(gu02, c1407wm.f13144c, fM25403b3), 3);
            mo2174E(m5006J(gu0, c1407wm.f13145d, fM25403b4), 0);
            return;
        }
        m2172C(m5006J(gu04, c1407wm.f13142a, fM25403b), 1);
        m2172C(m5006J(gu03, c1407wm.f13143b, fM25403b2), 2);
        m2172C(m5006J(gu02, c1407wm.f13144c, fM25403b3), 3);
        m2172C(m5006J(gu0, c1407wm.f13145d, fM25403b4), 0);
    }

    @Override // p000.EM0, p000.DM0
    /* renamed from: b */
    public final void mo1652b(C10910rT1 c10910rT1) {
        O90.m5968f(c10910rT1, "nativeViewHierarchyOptimizer");
        if (this.f6665C) {
            this.f6665C = false;
            m5007K();
        }
    }

    @Override // p000.EM0, p000.DM0
    /* renamed from: e */
    public final void mo1655e(Object obj) {
        KU0 ku0;
        O90.m5968f(obj, "data");
        if (obj instanceof IU0) {
            IU0 iu0 = this.f6666z;
            if (iu0 != null && (ku0 = iu0.f4955b) != ((IU0) obj).f4955b) {
                if (ku0 == KU0.f6125a) {
                    float[] fArr = this.f6663A;
                    mo2174E(fArr[1], 1);
                    mo2174E(fArr[2], 2);
                    mo2174E(fArr[3], 3);
                    mo2174E(fArr[0], 0);
                } else {
                    float[] fArr2 = this.f6664B;
                    m2172C(fArr2[1], 1);
                    m2172C(fArr2[2], 2);
                    m2172C(fArr2[3], 3);
                    m2172C(fArr2[0], 0);
                }
                mo2191t();
            }
            this.f6666z = (IU0) obj;
            this.f6665C = false;
            m5007K();
        }
    }

    @Override // p000.C10169lh0
    @InterfaceC9999kM0(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        O90.m5968f(dynamic, "margin");
        this.f6664B[AbstractC11074sl1.f42586b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i, dynamic);
        this.f6665C = true;
    }

    @Override // p000.C10169lh0
    @InterfaceC9999kM0(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        O90.m5968f(dynamic, "padding");
        this.f6663A[AbstractC11074sl1.f42586b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i, dynamic);
        this.f6665C = true;
    }
}
