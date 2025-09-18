package defpackage;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: Hk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0596Hk implements Iterable {
    public static final C1919Yj0 a = new C1919Yj0(new byte[0]);

    public static AbstractC0596Hk b(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC0596Hk) it.next();
        }
        int i2 = i >>> 1;
        return b(it, i2).d(b(it, i - i2));
    }

    public static C0518Gk s() {
        return new C0518Gk();
    }

    public abstract void A(OutputStream outputStream, int i, int i2);

    public final AbstractC0596Hk d(AbstractC0596Hk abstractC0596Hk) {
        AbstractC0596Hk c8179yT0;
        int size = size();
        int size2 = abstractC0596Hk.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = C8179yT0.h;
        C8179yT0 c8179yT02 = this instanceof C8179yT0 ? (C8179yT0) this : null;
        if (abstractC0596Hk.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC0596Hk;
        }
        int size3 = abstractC0596Hk.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC0596Hk.size();
            byte[] bArr = new byte[size4 + size5];
            h(0, bArr, 0, size4);
            abstractC0596Hk.h(0, bArr, size4, size5);
            return new C1919Yj0(bArr);
        }
        if (c8179yT02 != null) {
            AbstractC0596Hk abstractC0596Hk2 = c8179yT02.d;
            if (abstractC0596Hk.size() + abstractC0596Hk2.size() < 128) {
                int size6 = abstractC0596Hk2.size();
                int size7 = abstractC0596Hk.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC0596Hk2.h(0, bArr2, 0, size6);
                abstractC0596Hk.h(0, bArr2, size6, size7);
                return new C8179yT0(c8179yT02.c, new C1919Yj0(bArr2));
            }
        }
        if (c8179yT02 != null) {
            AbstractC0596Hk abstractC0596Hk3 = c8179yT02.c;
            int iK = abstractC0596Hk3.k();
            AbstractC0596Hk abstractC0596Hk4 = c8179yT02.d;
            if (iK > abstractC0596Hk4.k()) {
                if (c8179yT02.f > abstractC0596Hk.k()) {
                    return new C8179yT0(abstractC0596Hk3, new C8179yT0(abstractC0596Hk4, abstractC0596Hk));
                }
            }
        }
        if (size3 >= C8179yT0.h[Math.max(k(), abstractC0596Hk.k()) + 1]) {
            c8179yT0 = new C8179yT0(this, abstractC0596Hk);
        } else {
            C3866fw1 c3866fw1 = new C3866fw1(29);
            c3866fw1.d(this);
            c3866fw1.d(abstractC0596Hk);
            Stack stack = (Stack) c3866fw1.b;
            c8179yT0 = (AbstractC0596Hk) stack.pop();
            while (!stack.isEmpty()) {
                c8179yT0 = new C8179yT0((AbstractC0596Hk) stack.pop(), c8179yT0);
            }
        }
        return c8179yT0;
    }

    public final void h(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                i(i, bArr, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void i(int i, byte[] bArr, int i2, int i3);

    public abstract int k();

    public abstract boolean q();

    public abstract boolean r();

    public abstract int size();

    public abstract int t(int i, int i2, int i3);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int u(int i, int i2, int i3);

    public abstract int v();

    public abstract String y();

    public final String z() {
        try {
            return y();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
