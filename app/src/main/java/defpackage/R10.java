package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class R10 extends AbstractC6503pg0 {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R10(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new C7233tV0();
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Q10 q10 = (Q10) ((C6312og0) list.get(i2)).b;
                    if (q10 != null) {
                        iMax = Math.max(iMax, q10.b.length);
                    }
                }
                this.j = new Q10(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // defpackage.AbstractC5738lg
    public final Object f(C6312og0 c6312og0, float f) {
        Object obj;
        switch (this.i) {
            case 0:
                Q10 q10 = (Q10) c6312og0.b;
                Q10 q102 = (Q10) c6312og0.c;
                Q10 q103 = (Q10) this.j;
                q103.getClass();
                if (q10.equals(q102) || f <= 0.0f) {
                    q103.a(q10);
                } else if (f >= 1.0f) {
                    q103.a(q102);
                } else {
                    int[] iArr = q10.b;
                    int length = iArr.length;
                    int[] iArr2 = q102.b;
                    if (length != iArr2.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(AbstractC1705Vq.j(sb, iArr2.length, ")"));
                    }
                    int i = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = q103.b;
                        float[] fArr = q103.a;
                        if (i < length2) {
                            fArr[i] = AbstractC2215as0.e(q10.a[i], q102.a[i], f);
                            iArr3[i] = C12.d(iArr[i], f, iArr2[i]);
                            i++;
                        } else {
                            for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                fArr[length3] = fArr[iArr.length - 1];
                                iArr3[length3] = iArr3[iArr.length - 1];
                            }
                        }
                    }
                }
                return q103;
            case 1:
                return k(c6312og0, f, f, f);
            default:
                Object obj2 = c6312og0.b;
                if (obj2 == null || (obj = c6312og0.c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C7233tV0 c7233tV0 = (C7233tV0) obj2;
                C7233tV0 c7233tV02 = (C7233tV0) obj;
                ES1 es1 = this.e;
                if (es1 != null) {
                    C7233tV0 c7233tV03 = (C7233tV0) es1.z(c6312og0.g, c6312og0.h.floatValue(), c7233tV0, c7233tV02, f, d(), this.d);
                    if (c7233tV03 != null) {
                        return c7233tV03;
                    }
                }
                float fE = AbstractC2215as0.e(c7233tV0.a, c7233tV02.a, f);
                float fE2 = AbstractC2215as0.e(c7233tV0.b, c7233tV02.b, f);
                C7233tV0 c7233tV04 = (C7233tV0) this.j;
                c7233tV04.a = fE;
                c7233tV04.b = fE2;
                return c7233tV04;
        }
    }

    @Override // defpackage.AbstractC5738lg
    public /* bridge */ /* synthetic */ Object g(C6312og0 c6312og0, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return k(c6312og0, f, f2, f3);
            default:
                return super.g(c6312og0, f, f2, f3);
        }
    }

    public PointF k(C6312og0 c6312og0, float f, float f2, float f3) {
        Object obj;
        Object obj2 = c6312og0.b;
        if (obj2 == null || (obj = c6312og0.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        ES1 es1 = this.e;
        if (es1 != null) {
            PointF pointF3 = (PointF) es1.z(c6312og0.g, c6312og0.h.floatValue(), pointF, pointF2, f, d(), this.d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.j;
        float f4 = pointF.x;
        float fD = AbstractC1705Vq.d(pointF2.x, f4, f2, f4);
        float f5 = pointF.y;
        pointF4.set(fD, AbstractC1705Vq.d(pointF2.y, f5, f3, f5));
        return pointF4;
    }
}
