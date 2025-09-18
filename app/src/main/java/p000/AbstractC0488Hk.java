package p000;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: Hk */
/* loaded from: classes2.dex */
public abstract class AbstractC0488Hk implements Iterable {

    /* renamed from: a */
    public static final C8580Yj0 f4481a = new C8580Yj0(new byte[0]);

    /* renamed from: b */
    public static AbstractC0488Hk m3570b(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC0488Hk) it.next();
        }
        int i2 = i >>> 1;
        return m3570b(it, i2).m3573d(m3570b(it, i - i2));
    }

    /* renamed from: s */
    public static C0425Gk m3571s() {
        return new C0425Gk();
    }

    /* renamed from: A */
    public abstract void mo3572A(OutputStream outputStream, int i, int i2);

    /* renamed from: d */
    public final AbstractC0488Hk m3573d(AbstractC0488Hk abstractC0488Hk) {
        AbstractC0488Hk c11802yT0;
        int size = size();
        int size2 = abstractC0488Hk.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = C11802yT0.f46264h;
        C11802yT0 c11802yT02 = this instanceof C11802yT0 ? (C11802yT0) this : null;
        if (abstractC0488Hk.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC0488Hk;
        }
        int size3 = abstractC0488Hk.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC0488Hk.size();
            byte[] bArr = new byte[size4 + size5];
            m3574h(0, bArr, 0, size4);
            abstractC0488Hk.m3574h(0, bArr, size4, size5);
            return new C8580Yj0(bArr);
        }
        if (c11802yT02 != null) {
            AbstractC0488Hk abstractC0488Hk2 = c11802yT02.f46267d;
            if (abstractC0488Hk.size() + abstractC0488Hk2.size() < 128) {
                int size6 = abstractC0488Hk2.size();
                int size7 = abstractC0488Hk.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC0488Hk2.m3574h(0, bArr2, 0, size6);
                abstractC0488Hk.m3574h(0, bArr2, size6, size7);
                return new C11802yT0(c11802yT02.f46266c, new C8580Yj0(bArr2));
            }
        }
        if (c11802yT02 != null) {
            AbstractC0488Hk abstractC0488Hk3 = c11802yT02.f46266c;
            int iMo3576k = abstractC0488Hk3.mo3576k();
            AbstractC0488Hk abstractC0488Hk4 = c11802yT02.f46267d;
            if (iMo3576k > abstractC0488Hk4.mo3576k()) {
                if (c11802yT02.f46269f > abstractC0488Hk.mo3576k()) {
                    return new C11802yT0(abstractC0488Hk3, new C11802yT0(abstractC0488Hk4, abstractC0488Hk));
                }
            }
        }
        if (size3 >= C11802yT0.f46264h[Math.max(mo3576k(), abstractC0488Hk.mo3576k()) + 1]) {
            c11802yT0 = new C11802yT0(this, abstractC0488Hk);
        } else {
            C9432fw1 c9432fw1 = new C9432fw1(29);
            c9432fw1.m18333d(this);
            c9432fw1.m18333d(abstractC0488Hk);
            Stack stack = (Stack) c9432fw1.f27505b;
            c11802yT0 = (AbstractC0488Hk) stack.pop();
            while (!stack.isEmpty()) {
                c11802yT0 = new C11802yT0((AbstractC0488Hk) stack.pop(), c11802yT0);
            }
        }
        return c11802yT0;
    }

    /* renamed from: h */
    public final void m3574h(int i, byte[] bArr, int i2, int i3) {
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
                mo3575i(i, bArr, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* renamed from: i */
    public abstract void mo3575i(int i, byte[] bArr, int i2, int i3);

    /* renamed from: k */
    public abstract int mo3576k();

    /* renamed from: q */
    public abstract boolean mo3577q();

    /* renamed from: r */
    public abstract boolean mo3578r();

    public abstract int size();

    /* renamed from: t */
    public abstract int mo3579t(int i, int i2, int i3);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: u */
    public abstract int mo3580u(int i, int i2, int i3);

    /* renamed from: v */
    public abstract int mo3581v();

    /* renamed from: y */
    public abstract String mo3582y();

    /* renamed from: z */
    public final String m3583z() {
        try {
            return mo3582y();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
