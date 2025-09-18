package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: Gu */
/* loaded from: classes.dex */
public final class C0548Gu extends AbstractC6503pg0 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0548Gu(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // defpackage.AbstractC5738lg
    public final Object f(C6312og0 c6312og0, float f) {
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(k(c6312og0, f));
            case 1:
                return Integer.valueOf(k(c6312og0, f));
            default:
                ES1 es1 = this.e;
                Object obj2 = c6312og0.b;
                if (es1 == null) {
                    return (f != 1.0f || (obj = c6312og0.c) == null) ? (SK) obj2 : (SK) obj;
                }
                Float f2 = c6312og0.h;
                float fFloatValue = f2 == null ? Float.MAX_VALUE : f2.floatValue();
                SK sk = (SK) obj2;
                Object obj3 = c6312og0.c;
                return (SK) es1.z(c6312og0.g, fFloatValue, sk, obj3 == null ? sk : (SK) obj3, f, c(), this.d);
        }
    }

    public int k(C6312og0 c6312og0, float f) {
        Float f2;
        int i;
        switch (this.i) {
            case 0:
                if (c6312og0.b == null || c6312og0.c == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                ES1 es1 = this.e;
                Object obj = c6312og0.b;
                if (es1 != null && (f2 = c6312og0.h) != null) {
                    Integer num = (Integer) es1.z(c6312og0.g, f2.floatValue(), (Integer) obj, (Integer) c6312og0.c, f, d(), this.d);
                    if (num != null) {
                        return num.intValue();
                    }
                }
                return C12.d(((Integer) obj).intValue(), AbstractC2215as0.b(f, 0.0f, 1.0f), ((Integer) c6312og0.c).intValue());
            default:
                Object obj2 = c6312og0.b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = c6312og0.c;
                if (obj3 == null) {
                    if (c6312og0.k == 784923401) {
                        c6312og0.k = ((Integer) obj2).intValue();
                    }
                    i = c6312og0.k;
                } else {
                    if (c6312og0.l == 784923401) {
                        c6312og0.l = ((Integer) obj3).intValue();
                    }
                    i = c6312og0.l;
                }
                ES1 es12 = this.e;
                Object obj4 = c6312og0.b;
                if (es12 != null) {
                    Integer num2 = (Integer) es12.z(c6312og0.g, c6312og0.h.floatValue(), (Integer) obj4, Integer.valueOf(i), f, d(), this.d);
                    if (num2 != null) {
                        return num2.intValue();
                    }
                }
                if (c6312og0.k == 784923401) {
                    c6312og0.k = ((Integer) obj4).intValue();
                }
                int i2 = c6312og0.k;
                PointF pointF = AbstractC2215as0.a;
                return (int) ((f * (i - i2)) + i2);
        }
    }
}
