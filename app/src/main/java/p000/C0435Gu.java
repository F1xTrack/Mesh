package p000;

import android.graphics.PointF;
import java.util.List;

/* renamed from: Gu */
/* loaded from: classes.dex */
public final class C0435Gu extends AbstractC10679pg0 {

    /* renamed from: i */
    public final /* synthetic */ int f3950i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0435Gu(List list, int i) {
        super(list);
        this.f3950i = i;
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: f */
    public final Object mo3189f(C10551og0 c10551og0, float f) {
        Object obj;
        switch (this.f3950i) {
            case 0:
                return Integer.valueOf(m3190k(c10551og0, f));
            case 1:
                return Integer.valueOf(m3190k(c10551og0, f));
            default:
                ES1 es1 = this.f37232e;
                Object obj2 = c10551og0.f39159b;
                if (es1 == null) {
                    return (f != 1.0f || (obj = c10551og0.f39160c) == null) ? (C1153SK) obj2 : (C1153SK) obj;
                }
                Float f2 = c10551og0.f39165h;
                float fFloatValue = f2 == null ? Float.MAX_VALUE : f2.floatValue();
                C1153SK c1153sk = (C1153SK) obj2;
                Object obj3 = c10551og0.f39160c;
                return (C1153SK) es1.m2303z(c10551og0.f39164g, fFloatValue, c1153sk, obj3 == null ? c1153sk : (C1153SK) obj3, f, m22528c(), this.f37231d);
        }
    }

    /* renamed from: k */
    public int m3190k(C10551og0 c10551og0, float f) {
        Float f2;
        int i;
        switch (this.f3950i) {
            case 0:
                if (c10551og0.f39159b == null || c10551og0.f39160c == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                ES1 es1 = this.f37232e;
                Object obj = c10551og0.f39159b;
                if (es1 != null && (f2 = c10551og0.f39165h) != null) {
                    Integer num = (Integer) es1.m2303z(c10551og0.f39164g, f2.floatValue(), (Integer) obj, (Integer) c10551og0.f39160c, f, m22529d(), this.f37231d);
                    if (num != null) {
                        return num.intValue();
                    }
                }
                return C12.m950d(((Integer) obj).intValue(), AbstractC8778as0.m10350b(f, 0.0f, 1.0f), ((Integer) c10551og0.f39160c).intValue());
            default:
                Object obj2 = c10551og0.f39159b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = c10551og0.f39160c;
                if (obj3 == null) {
                    if (c10551og0.f39168k == 784923401) {
                        c10551og0.f39168k = ((Integer) obj2).intValue();
                    }
                    i = c10551og0.f39168k;
                } else {
                    if (c10551og0.f39169l == 784923401) {
                        c10551og0.f39169l = ((Integer) obj3).intValue();
                    }
                    i = c10551og0.f39169l;
                }
                ES1 es12 = this.f37232e;
                Object obj4 = c10551og0.f39159b;
                if (es12 != null) {
                    Integer num2 = (Integer) es12.m2303z(c10551og0.f39164g, c10551og0.f39165h.floatValue(), (Integer) obj4, Integer.valueOf(i), f, m22529d(), this.f37231d);
                    if (num2 != null) {
                        return num2.intValue();
                    }
                }
                if (c10551og0.f39168k == 784923401) {
                    c10551og0.f39168k = ((Integer) obj4).intValue();
                }
                int i2 = c10551og0.f39168k;
                PointF pointF = AbstractC8778as0.f16638a;
                return (int) ((f * (i - i2)) + i2);
        }
    }
}
