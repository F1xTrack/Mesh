package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: J9 */
/* loaded from: classes.dex */
public final class C0577J9 implements InterfaceC6380li {

    /* renamed from: a */
    public int f5357a;

    /* renamed from: b */
    public int f5358b;

    /* renamed from: c */
    public Object f5359c;

    /* renamed from: d */
    public Object f5360d;

    public C0577J9() {
        this.f5359c = new long[10];
        this.f5360d = new Object[10];
    }

    /* renamed from: c */
    public static int m4204c(int i, int i2) {
        return m4206f(i2) + m4211k(i);
    }

    /* renamed from: e */
    public static int m4205e(int i, int i2) {
        return m4206f(i2) + m4211k(i);
    }

    /* renamed from: f */
    public static int m4206f(int i) {
        if (i >= 0) {
            return m4209i(i);
        }
        return 10;
    }

    /* renamed from: g */
    public static int m4207g(int i, AbstractC0631K0 abstractC0631K0) {
        return m4208h(abstractC0631K0) + m4211k(i);
    }

    /* renamed from: h */
    public static int m4208h(AbstractC0631K0 abstractC0631K0) {
        int iMo128b = abstractC0631K0.mo128b();
        return m4209i(iMo128b) + iMo128b;
    }

    /* renamed from: i */
    public static int m4209i(int i) {
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

    /* renamed from: j */
    public static int m4210j(long j) {
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

    /* renamed from: k */
    public static int m4211k(int i) {
        return m4209i(i << 3);
    }

    /* renamed from: n */
    public static C0577J9 m4212n(OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        C0577J9 c0577j9 = new C0577J9();
        c0577j9.f5360d = outputStream;
        c0577j9.f5359c = bArr;
        c0577j9.f5358b = 0;
        c0577j9.f5357a = bArr.length;
        return c0577j9;
    }

    /* renamed from: A */
    public void m4213A(int i) throws IOException {
        byte b = (byte) i;
        if (this.f5358b == this.f5357a) {
            m4229s();
        }
        int i2 = this.f5358b;
        this.f5358b = i2 + 1;
        ((byte[]) this.f5359c)[i2] = b;
    }

    /* renamed from: B */
    public void m4214B(AbstractC0488Hk abstractC0488Hk) throws IOException {
        int size = abstractC0488Hk.size();
        int i = this.f5358b;
        int i2 = this.f5357a;
        int i3 = i2 - i;
        byte[] bArr = (byte[]) this.f5359c;
        if (i3 >= size) {
            abstractC0488Hk.m3574h(0, bArr, i, size);
            this.f5358b += size;
            return;
        }
        abstractC0488Hk.m3574h(0, bArr, i, i3);
        int i4 = size - i3;
        this.f5358b = i2;
        m4229s();
        if (i4 <= i2) {
            abstractC0488Hk.m3574h(i3, bArr, 0, i4);
            this.f5358b = i4;
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
        if (i5 <= abstractC0488Hk.size()) {
            if (i4 > 0) {
                abstractC0488Hk.mo3572A((OutputStream) this.f5360d, i3, i4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: C */
    public void m4215C(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f5358b;
        int i2 = this.f5357a;
        int i3 = i2 - i;
        byte[] bArr2 = (byte[]) this.f5359c;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.f5358b += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = length - i3;
        this.f5358b = i2;
        m4229s();
        if (i4 > i2) {
            ((OutputStream) this.f5360d).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.f5358b = i4;
        }
    }

    /* renamed from: D */
    public void m4216D(int i) throws IOException {
        m4213A(i & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: E */
    public void m4217E(long j) throws IOException {
        m4213A(((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A(((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A(((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A(((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A(((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A(((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A(((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m4213A(((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: F */
    public void m4218F(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m4213A((i & 127) | 128);
            i >>>= 7;
        }
        m4213A(i);
    }

    /* renamed from: G */
    public void m4219G(long j) throws IOException {
        while (((-128) & j) != 0) {
            m4213A((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m4213A((int) j);
    }

    /* renamed from: H */
    public void m4220H(int i, int i2) throws IOException {
        m4218F((i << 3) | i2);
    }

    /* renamed from: a */
    public synchronized void m4221a(long j, Object obj) {
        if (this.f5358b > 0) {
            if (j <= ((long[]) this.f5359c)[((this.f5357a + r0) - 1) % ((Object[]) this.f5360d).length]) {
                m4222b();
            }
        }
        m4223l();
        int i = this.f5357a;
        int i2 = this.f5358b;
        Object[] objArr = (Object[]) this.f5360d;
        int length = (i + i2) % objArr.length;
        ((long[]) this.f5359c)[length] = j;
        objArr[length] = obj;
        this.f5358b = i2 + 1;
    }

    /* renamed from: b */
    public synchronized void m4222b() {
        this.f5357a = 0;
        this.f5358b = 0;
        Arrays.fill((Object[]) this.f5360d, (Object) null);
    }

    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public void mo2828d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ((CC0) this.f5359c).getClass();
        O90.m5968f(bitmap, "bitmap");
        int iM24051d = AbstractC6697qi.m24051d(bitmap);
        if (iM24051d <= this.f5357a) {
            ((C7616Fv0) this.f5360d).getClass();
            ((CC0) this.f5359c).m1079i1(bitmap);
            synchronized (this) {
                this.f5358b += iM24051d;
            }
        }
    }

    @Override // p000.InterfaceC8950cC0
    public Object get(int i) {
        Bitmap bitmapM1035P0;
        synchronized (this) {
            try {
                if (this.f5358b > 0) {
                    m4231u();
                }
                bitmapM1035P0 = ((CC0) this.f5359c).m1035P0(i);
                if (bitmapM1035P0 != null) {
                    ((CC0) this.f5359c).getClass();
                    this.f5358b -= AbstractC6697qi.m24051d(bitmapM1035P0);
                    ((C7616Fv0) this.f5360d).getClass();
                } else {
                    ((C7616Fv0) this.f5360d).getClass();
                    bitmapM1035P0 = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bitmapM1035P0;
    }

    /* renamed from: l */
    public void m4223l() {
        int length = ((Object[]) this.f5360d).length;
        if (this.f5358b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f5357a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.f5359c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.f5360d, this.f5357a, objArr, 0, i3);
        int i4 = this.f5357a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.f5359c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.f5360d, 0, objArr, i3, this.f5357a);
        }
        this.f5359c = jArr;
        this.f5360d = objArr;
        this.f5357a = 0;
    }

    /* renamed from: m */
    public void m4224m() throws IOException {
        if (((OutputStream) this.f5360d) != null) {
            m4229s();
        }
    }

    /* renamed from: o */
    public Object m4225o(long j, boolean z) {
        Object objM4228r = null;
        long j2 = Long.MAX_VALUE;
        while (this.f5358b > 0) {
            long j3 = j - ((long[]) this.f5359c)[this.f5357a];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM4228r = m4228r();
            j2 = j3;
        }
        return objM4228r;
    }

    /* renamed from: p */
    public synchronized Object m4226p() {
        return this.f5358b == 0 ? null : m4228r();
    }

    /* renamed from: q */
    public synchronized Object m4227q(long j) {
        return m4225o(j, true);
    }

    /* renamed from: r */
    public Object m4228r() {
        YN1.m9281f(this.f5358b > 0);
        Object[] objArr = (Object[]) this.f5360d;
        int i = this.f5357a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f5357a = (i + 1) % objArr.length;
        this.f5358b--;
        return obj;
    }

    /* renamed from: s */
    public void m4229s() throws IOException {
        OutputStream outputStream = (OutputStream) this.f5360d;
        if (outputStream == null) {
            throw new C6583ou("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f5359c, 0, this.f5358b);
        this.f5358b = 0;
    }

    /* renamed from: t */
    public synchronized int m4230t() {
        return this.f5358b;
    }

    /* renamed from: u */
    public synchronized void m4231u() {
        Bitmap bitmap;
        while (this.f5358b > 0 && (bitmap = (Bitmap) ((CC0) this.f5359c).m1073g1()) != null) {
            ((CC0) this.f5359c).getClass();
            this.f5358b -= AbstractC6697qi.m24051d(bitmap);
            ((C7616Fv0) this.f5360d).getClass();
        }
    }

    /* renamed from: v */
    public void m4232v(int i, int i2) throws IOException {
        m4220H(i, 0);
        m4234x(i2);
    }

    /* renamed from: w */
    public void m4233w(int i, int i2) throws IOException {
        m4220H(i, 0);
        m4234x(i2);
    }

    /* renamed from: x */
    public void m4234x(int i) throws IOException {
        if (i >= 0) {
            m4218F(i);
        } else {
            m4219G(i);
        }
    }

    /* renamed from: y */
    public void m4235y(int i, AbstractC0631K0 abstractC0631K0) throws IOException {
        m4220H(i, 2);
        m4236z(abstractC0631K0);
    }

    /* renamed from: z */
    public void m4236z(AbstractC0631K0 abstractC0631K0) throws IOException {
        m4218F(abstractC0631K0.mo128b());
        abstractC0631K0.mo132f(this);
    }

    public C0577J9(int i, float[] fArr, float[] fArr2, int i2) {
        this.f5357a = i;
        YN1.m9278c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f5359c = fArr;
        this.f5360d = fArr2;
        this.f5358b = i2;
    }

    public C0577J9(C0577J9 c0577j9) {
        float[] fArr = (float[]) c0577j9.f5359c;
        this.f5357a = fArr.length / 3;
        this.f5359c = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        float[] fArr2 = (float[]) c0577j9.f5360d;
        this.f5360d = (FloatBuffer) ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2).flip();
        int i = c0577j9.f5358b;
        if (i == 1) {
            this.f5358b = 5;
        } else if (i != 2) {
            this.f5358b = 4;
        } else {
            this.f5358b = 6;
        }
    }
}
