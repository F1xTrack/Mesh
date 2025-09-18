package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import p000.AbstractC8065Ol1;
import p000.C1050Qg;
import p000.C3960dy;
import p000.C6685qW;
import p000.TG0;

/* loaded from: classes.dex */
public class Flow extends AbstractC8065Ol1 {

    /* renamed from: i */
    public final C6685qW f16050i;

    public Flow(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f7409a = new int[32];
        this.f7414f = new HashMap();
        this.f7411c = context;
        super.mo5485e(attributeSet);
        C6685qW c6685qW = new C6685qW();
        c6685qW.f40929f0 = 0;
        c6685qW.f40930g0 = 0;
        c6685qW.f40931h0 = 0;
        c6685qW.f40932i0 = 0;
        c6685qW.f40933j0 = 0;
        c6685qW.f40934k0 = 0;
        c6685qW.f40935l0 = false;
        c6685qW.f40936m0 = 0;
        c6685qW.f40937n0 = 0;
        c6685qW.f40938o0 = new C1050Qg();
        c6685qW.f40939p0 = null;
        c6685qW.f40940q0 = -1;
        c6685qW.f40941r0 = -1;
        c6685qW.f40942s0 = -1;
        c6685qW.f40943t0 = -1;
        c6685qW.f40944u0 = -1;
        c6685qW.f40945v0 = -1;
        c6685qW.f40946w0 = 0.5f;
        c6685qW.f40947x0 = 0.5f;
        c6685qW.f40948y0 = 0.5f;
        c6685qW.f40949z0 = 0.5f;
        c6685qW.f40914A0 = 0.5f;
        c6685qW.f40915B0 = 0.5f;
        c6685qW.f40916C0 = 0;
        c6685qW.f40917D0 = 0;
        c6685qW.f40918E0 = 2;
        c6685qW.f40919F0 = 2;
        c6685qW.f40920G0 = 0;
        c6685qW.f40921H0 = -1;
        c6685qW.f40922I0 = 0;
        c6685qW.f40923J0 = new ArrayList();
        c6685qW.f40924K0 = null;
        c6685qW.f40925L0 = null;
        c6685qW.f40926M0 = null;
        c6685qW.f40928O0 = 0;
        this.f16050i = c6685qW;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, TG0.f11273b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f16050i.f40922I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C6685qW c6685qW2 = this.f16050i;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c6685qW2.f40929f0 = dimensionPixelSize;
                    c6685qW2.f40930g0 = dimensionPixelSize;
                    c6685qW2.f40931h0 = dimensionPixelSize;
                    c6685qW2.f40932i0 = dimensionPixelSize;
                } else if (index == 11) {
                    C6685qW c6685qW3 = this.f16050i;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c6685qW3.f40931h0 = dimensionPixelSize2;
                    c6685qW3.f40933j0 = dimensionPixelSize2;
                    c6685qW3.f40934k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f16050i.f40932i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f16050i.f40933j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f16050i.f40929f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f16050i.f40934k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f16050i.f40930g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f16050i.f40920G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f16050i.f40940q0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f16050i.f40941r0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f16050i.f40942s0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f16050i.f40944u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f16050i.f40943t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f16050i.f40945v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f16050i.f40946w0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f16050i.f40948y0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f16050i.f40914A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f16050i.f40949z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f16050i.f40915B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f16050i.f40947x0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f16050i.f40918E0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f16050i.f40919F0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f16050i.f40916C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f16050i.f40917D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f16050i.f40921H0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f7412d = this.f16050i;
        m5486g();
    }

    @Override // p000.AbstractC0815Mx
    /* renamed from: f */
    public final void mo3961f(C3960dy c3960dy, boolean z) {
        C6685qW c6685qW = this.f16050i;
        int i = c6685qW.f40931h0;
        if (i > 0 || c6685qW.f40932i0 > 0) {
            if (z) {
                c6685qW.f40933j0 = c6685qW.f40932i0;
                c6685qW.f40934k0 = i;
            } else {
                c6685qW.f40933j0 = i;
                c6685qW.f40934k0 = c6685qW.f40932i0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00d4 A[EDGE_INSN: B:338:0x00d4->B:63:0x00d4 BREAK  A[LOOP:1: B:57:0x00c0->B:62:0x00d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    @Override // p000.AbstractC8065Ol1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6136h(p000.C6685qW r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo6136h(qW, int, int):void");
    }

    @Override // p000.AbstractC0815Mx, android.view.View
    public final void onMeasure(int i, int i2) {
        mo6136h(this.f16050i, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f16050i.f40948y0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f16050i.f40942s0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f16050i.f40949z0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f16050i.f40943t0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f16050i.f40918E0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f16050i.f40946w0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f16050i.f40916C0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f16050i.f40940q0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f16050i.f40921H0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f16050i.f40922I0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C6685qW c6685qW = this.f16050i;
        c6685qW.f40929f0 = i;
        c6685qW.f40930g0 = i;
        c6685qW.f40931h0 = i;
        c6685qW.f40932i0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f16050i.f40930g0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f16050i.f40933j0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f16050i.f40934k0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f16050i.f40929f0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f16050i.f40919F0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f16050i.f40947x0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f16050i.f40917D0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f16050i.f40941r0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f16050i.f40920G0 = i;
        requestLayout();
    }
}
