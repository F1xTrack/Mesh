package p000;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Gk */
/* loaded from: classes2.dex */
public final class C0425Gk extends OutputStream {

    /* renamed from: f */
    public static final byte[] f3864f = new byte[0];

    /* renamed from: c */
    public int f3867c;

    /* renamed from: e */
    public int f3869e;

    /* renamed from: a */
    public final int f3865a = 128;

    /* renamed from: b */
    public final ArrayList f3866b = new ArrayList();

    /* renamed from: d */
    public byte[] f3868d = new byte[128];

    /* renamed from: a */
    public final void m3144a(int i) {
        this.f3866b.add(new C8580Yj0(this.f3868d));
        int length = this.f3867c + this.f3868d.length;
        this.f3867c = length;
        this.f3868d = new byte[Math.max(this.f3865a, Math.max(i, length >>> 1))];
        this.f3869e = 0;
    }

    /* renamed from: m */
    public final void m3145m() {
        int i = this.f3869e;
        byte[] bArr = this.f3868d;
        int length = bArr.length;
        ArrayList arrayList = this.f3866b;
        if (i >= length) {
            arrayList.add(new C8580Yj0(this.f3868d));
            this.f3868d = f3864f;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new C8580Yj0(bArr2));
        }
        this.f3867c += this.f3869e;
        this.f3869e = 0;
    }

    /* renamed from: n */
    public final synchronized AbstractC0488Hk m3146n() {
        ArrayList arrayList;
        m3145m();
        arrayList = this.f3866b;
        if (!(arrayList instanceof Collection)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC0488Hk) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC0488Hk.f4481a : AbstractC0488Hk.m3570b(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f3867c + this.f3869e;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f3869e == this.f3868d.length) {
                m3144a(1);
            }
            byte[] bArr = this.f3868d;
            int i2 = this.f3869e;
            this.f3869e = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.f3868d;
            int length = bArr2.length;
            int i3 = this.f3869e;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f3869e += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m3144a(i4);
                System.arraycopy(bArr, i + length2, this.f3868d, 0, i4);
                this.f3869e = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
