package p000;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class R10 extends AbstractC10679pg0 {

    /* renamed from: i */
    public final /* synthetic */ int f9927i;

    /* renamed from: j */
    public final Object f9928j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R10(List list, int i) {
        super(list);
        this.f9927i = i;
        switch (i) {
            case 1:
                super(list);
                this.f9928j = new PointF();
                break;
            case 2:
                super(list);
                this.f9928j = new C11169tV0();
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Q10 q10 = (Q10) ((C10551og0) list.get(i2)).f39159b;
                    if (q10 != null) {
                        iMax = Math.max(iMax, q10.f9404b.length);
                    }
                }
                this.f9928j = new Q10(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: f */
    public final Object mo3189f(C10551og0 c10551og0, float f) {
        Object obj;
        switch (this.f9927i) {
            case 0:
                Q10 q10 = (Q10) c10551og0.f39159b;
                Q10 q102 = (Q10) c10551og0.f39160c;
                Q10 q103 = (Q10) this.f9928j;
                q103.getClass();
                if (q10.equals(q102) || f <= 0.0f) {
                    q103.m6545a(q10);
                } else if (f >= 1.0f) {
                    q103.m6545a(q102);
                } else {
                    int[] iArr = q10.f9404b;
                    int length = iArr.length;
                    int[] iArr2 = q102.f9404b;
                    if (length != iArr2.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(AbstractC1374Vq.m8591j(sb, iArr2.length, ")"));
                    }
                    int i = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = q103.f9404b;
                        float[] fArr = q103.f9403a;
                        if (i < length2) {
                            fArr[i] = AbstractC8778as0.m10353e(q10.f9403a[i], q102.f9403a[i], f);
                            iArr3[i] = C12.m950d(iArr[i], f, iArr2[i]);
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
                return m6877k(c10551og0, f, f, f);
            default:
                Object obj2 = c10551og0.f39159b;
                if (obj2 == null || (obj = c10551og0.f39160c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C11169tV0 c11169tV0 = (C11169tV0) obj2;
                C11169tV0 c11169tV02 = (C11169tV0) obj;
                ES1 es1 = this.f37232e;
                if (es1 != null) {
                    C11169tV0 c11169tV03 = (C11169tV0) es1.m2303z(c10551og0.f39164g, c10551og0.f39165h.floatValue(), c11169tV0, c11169tV02, f, m22529d(), this.f37231d);
                    if (c11169tV03 != null) {
                        return c11169tV03;
                    }
                }
                float fM10353e = AbstractC8778as0.m10353e(c11169tV0.f43097a, c11169tV02.f43097a, f);
                float fM10353e2 = AbstractC8778as0.m10353e(c11169tV0.f43098b, c11169tV02.f43098b, f);
                C11169tV0 c11169tV04 = (C11169tV0) this.f9928j;
                c11169tV04.f43097a = fM10353e;
                c11169tV04.f43098b = fM10353e2;
                return c11169tV04;
        }
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: g */
    public /* bridge */ /* synthetic */ Object mo6876g(C10551og0 c10551og0, float f, float f2, float f3) {
        switch (this.f9927i) {
            case 1:
                return m6877k(c10551og0, f, f2, f3);
            default:
                return super.mo6876g(c10551og0, f, f2, f3);
        }
    }

    /* renamed from: k */
    public PointF m6877k(C10551og0 c10551og0, float f, float f2, float f3) {
        Object obj;
        Object obj2 = c10551og0.f39159b;
        if (obj2 == null || (obj = c10551og0.f39160c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        ES1 es1 = this.f37232e;
        if (es1 != null) {
            PointF pointF3 = (PointF) es1.m2303z(c10551og0.f39164g, c10551og0.f39165h.floatValue(), pointF, pointF2, f, m22529d(), this.f37231d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f9928j;
        float f4 = pointF.x;
        float fM8585d = AbstractC1374Vq.m8585d(pointF2.x, f4, f2, f4);
        float f5 = pointF.y;
        pointF4.set(fM8585d, AbstractC1374Vq.m8585d(pointF2.y, f5, f3, f5));
        return pointF4;
    }
}
