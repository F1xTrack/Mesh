package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class J9 implements InterfaceC5744li {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public J9() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public static int c(int i, int i2) {
        return f(i2) + k(i);
    }

    public static int e(int i, int i2) {
        return f(i2) + k(i);
    }

    public static int f(int i) {
        if (i >= 0) {
            return i(i);
        }
        return 10;
    }

    public static int g(int i, K0 k0) {
        return h(k0) + k(i);
    }

    public static int h(K0 k0) {
        int iB = k0.b();
        return i(iB) + iB;
    }

    public static int i(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int k(int i) {
        return i(i << 3);
    }

    public static J9 n(OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        J9 j9 = new J9();
        j9.d = outputStream;
        j9.c = bArr;
        j9.b = 0;
        j9.a = bArr.length;
        return j9;
    }

    public void A(int i) throws IOException {
        byte b = (byte) i;
        if (this.b == this.a) {
            s();
        }
        int i2 = this.b;
        this.b = i2 + 1;
        ((byte[]) this.c)[i2] = b;
    }

    public void B(AbstractC0596Hk abstractC0596Hk) throws IOException {
        int size = abstractC0596Hk.size();
        int i = this.b;
        int i2 = this.a;
        int i3 = i2 - i;
        byte[] bArr = (byte[]) this.c;
        if (i3 >= size) {
            abstractC0596Hk.h(0, bArr, i, size);
            this.b += size;
            return;
        }
        abstractC0596Hk.h(0, bArr, i, i3);
        int i4 = size - i3;
        this.b = i2;
        s();
        if (i4 <= i2) {
            abstractC0596Hk.h(i3, bArr, 0, i4);
            this.b = i4;
            return;
        }
        if (i3 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i5 = i3 + i4;
        if (i5 <= abstractC0596Hk.size()) {
            if (i4 > 0) {
                abstractC0596Hk.A((OutputStream) this.d, i3, i4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public void C(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.a;
        int i3 = i2 - i;
        byte[] bArr2 = (byte[]) this.c;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.b += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.b = i2;
        s();
        if (i4 > i2) {
            ((OutputStream) this.d).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.b = i4;
        }
    }

    public void D(int i) throws IOException {
        A(i & KotlinVersion.MAX_COMPONENT_VALUE);
        A((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        A((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        A((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void E(long j) throws IOException {
        A(((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
        A(((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        A(((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        A(((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        A(((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        A(((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        A(((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        A(((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void F(int i) throws IOException {
        while ((i & (-128)) != 0) {
            A((i & 127) | 128);
            i >>>= 7;
        }
        A(i);
    }

    public void G(long j) throws IOException {
        while (((-128) & j) != 0) {
            A((((int) j) & 127) | 128);
            j >>>= 7;
        }
        A((int) j);
    }

    public void H(int i, int i2) throws IOException {
        F((i << 3) | i2);
    }

    public synchronized void a(long j, Object obj) {
        if (this.b > 0) {
            if (j <= ((long[]) this.c)[((this.a + r0) - 1) % ((Object[]) this.d).length]) {
                b();
            }
        }
        l();
        int i = this.a;
        int i2 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i + i2) % objArr.length;
        ((long[]) this.c)[length] = j;
        objArr[length] = obj;
        this.b = i2 + 1;
    }

    public synchronized void b() {
        this.a = 0;
        this.b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    @Override // defpackage.InterfaceC7986xS0
    public void d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ((CC0) this.c).getClass();
        O90.f(bitmap, "bitmap");
        int iD = AbstractC6699qi.d(bitmap);
        if (iD <= this.a) {
            ((C0474Fv0) this.d).getClass();
            ((CC0) this.c).i1(bitmap);
            synchronized (this) {
                this.b += iD;
            }
        }
    }

    @Override // defpackage.InterfaceC2470cC0
    public Object get(int i) {
        Bitmap bitmapP0;
        synchronized (this) {
            try {
                if (this.b > 0) {
                    u();
                }
                bitmapP0 = ((CC0) this.c).P0(i);
                if (bitmapP0 != null) {
                    ((CC0) this.c).getClass();
                    this.b -= AbstractC6699qi.d(bitmapP0);
                    ((C0474Fv0) this.d).getClass();
                } else {
                    ((C0474Fv0) this.d).getClass();
                    bitmapP0 = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bitmapP0;
    }

    public void l() {
        int length = ((Object[]) this.d).length;
        if (this.b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.d, this.a, objArr, 0, i3);
        int i4 = this.a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.d, 0, objArr, i3, this.a);
        }
        this.c = jArr;
        this.d = objArr;
        this.a = 0;
    }

    public void m() throws IOException {
        if (((OutputStream) this.d) != null) {
            s();
        }
    }

    public Object o(long j, boolean z) {
        Object objR = null;
        long j2 = Long.MAX_VALUE;
        while (this.b > 0) {
            long j3 = j - ((long[]) this.c)[this.a];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objR = r();
            j2 = j3;
        }
        return objR;
    }

    public synchronized Object p() {
        return this.b == 0 ? null : r();
    }

    public synchronized Object q(long j) {
        return o(j, true);
    }

    public Object r() {
        YN1.f(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = (i + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public void s() throws IOException {
        OutputStream outputStream = (OutputStream) this.d;
        if (outputStream == null) {
            throw new C6353ou("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.c, 0, this.b);
        this.b = 0;
    }

    public synchronized int t() {
        return this.b;
    }

    public synchronized void u() {
        Bitmap bitmap;
        while (this.b > 0 && (bitmap = (Bitmap) ((CC0) this.c).g1()) != null) {
            ((CC0) this.c).getClass();
            this.b -= AbstractC6699qi.d(bitmap);
            ((C0474Fv0) this.d).getClass();
        }
    }

    public void v(int i, int i2) throws IOException {
        H(i, 0);
        x(i2);
    }

    public void w(int i, int i2) throws IOException {
        H(i, 0);
        x(i2);
    }

    public void x(int i) throws IOException {
        if (i >= 0) {
            F(i);
        } else {
            G(i);
        }
    }

    public void y(int i, K0 k0) throws IOException {
        H(i, 2);
        z(k0);
    }

    public void z(K0 k0) throws IOException {
        F(k0.b());
        k0.f(this);
    }

    public J9(int i, float[] fArr, float[] fArr2, int i2) {
        this.a = i;
        YN1.c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.c = fArr;
        this.d = fArr2;
        this.b = i2;
    }

    public J9(J9 j9) {
        float[] fArr = (float[]) j9.c;
        this.a = fArr.length / 3;
        this.c = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        float[] fArr2 = (float[]) j9.d;
        this.d = (FloatBuffer) ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2).flip();
        int i = j9.b;
        if (i == 1) {
            this.b = 5;
        } else if (i != 2) {
            this.b = 4;
        } else {
            this.b = 6;
        }
    }
}
