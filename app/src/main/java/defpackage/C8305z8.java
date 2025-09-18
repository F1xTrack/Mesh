package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: z8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8305z8 extends AbstractC7735w8 {
    public Object[] a;
    public int b;

    @Override // defpackage.AbstractC7735w8
    public final int b() {
        return this.b;
    }

    @Override // defpackage.AbstractC7735w8
    public final void d(int i, L5 l5) {
        Object[] objArr = this.a;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            Object[] objArrCopyOf = Arrays.copyOf(this.a, length);
            O90.e(objArrCopyOf, "copyOf(...)");
            this.a = objArrCopyOf;
        }
        Object[] objArr2 = this.a;
        if (objArr2[i] == null) {
            this.b++;
        }
        objArr2[i] = l5;
    }

    @Override // defpackage.AbstractC7735w8
    public final Object get(int i) {
        return J8.r(i, this.a);
    }

    @Override // defpackage.AbstractC7735w8, java.lang.Iterable
    public final Iterator iterator() {
        return new C8115y8(this);
    }
}
