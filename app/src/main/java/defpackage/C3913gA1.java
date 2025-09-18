package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: gA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3913gA1 implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3913gA1(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((C1812Wz1) this.c).a.length()) {
                }
                break;
            case 1:
                if (this.b < ((C1812Wz1) this.c).a.length()) {
                }
                break;
            default:
                if (this.b < ((C7321ty1) this.c).r()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.a) {
            case 0:
                int i = this.b;
                C1812Wz1 c1812Wz1 = (C1812Wz1) this.c;
                if (i >= c1812Wz1.a.length()) {
                    throw new NoSuchElementException();
                }
                String str = c1812Wz1.a;
                int i2 = this.b;
                this.b = i2 + 1;
                return new C1812Wz1(String.valueOf(str.charAt(i2)));
            case 1:
                if (this.b >= ((C1812Wz1) this.c).a.length()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.b;
                this.b = i3 + 1;
                return new C1812Wz1(String.valueOf(i3));
            default:
                int i4 = this.b;
                C7321ty1 c7321ty1 = (C7321ty1) this.c;
                if (i4 >= c7321ty1.r()) {
                    throw new NoSuchElementException(AbstractC7209tN0.u(this.b, "Out of bounds index: "));
                }
                int i5 = this.b;
                this.b = i5 + 1;
                return c7321ty1.i(i5);
        }
    }
}
