package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: th */
/* loaded from: classes2.dex */
public abstract class AbstractC6902th {

    /* renamed from: a */
    public final int[] f43216a;

    /* renamed from: b */
    public final int f43217b;

    /* renamed from: c */
    public final int f43218c;

    /* renamed from: d */
    public final int f43219d;

    /* renamed from: e */
    public final List f43220e;

    public AbstractC6902th(int... iArr) {
        List listM25982b0;
        O90.m5968f(iArr, "numbers");
        this.f43216a = iArr;
        Integer numM4190q = AbstractC0576J8.m4190q(0, iArr);
        this.f43217b = numM4190q != null ? numM4190q.intValue() : -1;
        Integer numM4190q2 = AbstractC0576J8.m4190q(1, iArr);
        this.f43218c = numM4190q2 != null ? numM4190q2.intValue() : -1;
        Integer numM4190q3 = AbstractC0576J8.m4190q(2, iArr);
        this.f43219d = numM4190q3 != null ? numM4190q3.intValue() : -1;
        if (iArr.length <= 3) {
            listM25982b0 = C0779MN.f7117a;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(AbstractC7222ym.m26235l(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listM25982b0 = AbstractC7167xu.m25982b0(new C0639K8(iArr).subList(3, iArr.length));
        }
        this.f43220e = listM25982b0;
    }

    /* renamed from: a */
    public final boolean m24967a(int i, int i2, int i3) {
        int i4 = this.f43217b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f43218c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f43219d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            AbstractC6902th abstractC6902th = (AbstractC6902th) obj;
            if (this.f43217b == abstractC6902th.f43217b && this.f43218c == abstractC6902th.f43218c && this.f43219d == abstractC6902th.f43219d && O90.m5963a(this.f43220e, abstractC6902th.f43220e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f43217b;
        int i2 = (i * 31) + this.f43218c + i;
        int i3 = (i2 * 31) + this.f43219d + i2;
        return this.f43220e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.f43216a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC7167xu.m25962H(arrayList, ".", null, null, null, 62);
    }
}
