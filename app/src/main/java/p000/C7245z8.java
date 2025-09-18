package p000;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: z8 */
/* loaded from: classes2.dex */
public final class C7245z8 extends AbstractC7056w8 {

    /* renamed from: a */
    public Object[] f46641a;

    /* renamed from: b */
    public int f46642b;

    @Override // p000.AbstractC7056w8
    /* renamed from: b */
    public final int mo3381b() {
        return this.f46642b;
    }

    @Override // p000.AbstractC7056w8
    /* renamed from: d */
    public final void mo3382d(int i, C0699L5 c0699l5) {
        Object[] objArr = this.f46641a;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            Object[] objArrCopyOf = Arrays.copyOf(this.f46641a, length);
            O90.m5967e(objArrCopyOf, "copyOf(...)");
            this.f46641a = objArrCopyOf;
        }
        Object[] objArr2 = this.f46641a;
        if (objArr2[i] == null) {
            this.f46642b++;
        }
        objArr2[i] = c0699l5;
    }

    @Override // p000.AbstractC7056w8
    public final Object get(int i) {
        return AbstractC0576J8.m4191r(i, this.f46641a);
    }

    @Override // p000.AbstractC7056w8, java.lang.Iterable
    public final Iterator iterator() {
        return new C7182y8(this);
    }
}
