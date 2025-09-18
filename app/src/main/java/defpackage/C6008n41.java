package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* renamed from: n41 */
/* loaded from: classes.dex */
public final class C6008n41 implements InterfaceC3310d10 {
    public int[] a;
    public final C0999Mo1 c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public C5804m10 l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public C6008n41(C0999Mo1 c0999Mo1, C5804m10 c5804m10, ByteBuffer byteBuffer, int i) {
        this.c = c0999Mo1;
        this.l = new C5804m10();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = c5804m10;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = c5804m10.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C4073h10) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = iHighestOneBit;
                int i2 = c5804m10.f;
                this.r = i2 / iHighestOneBit;
                int i3 = c5804m10.g;
                this.q = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C8426zm0 c8426zm0 = (C8426zm0) this.c.b;
                this.i = c8426zm0 == null ? new byte[i4] : (byte[]) c8426zm0.d(i4, byte[].class);
                C0999Mo1 c0999Mo12 = this.c;
                int i5 = this.r * this.q;
                C8426zm0 c8426zm02 = (C8426zm0) c0999Mo12.b;
                this.j = c8426zm02 == null ? new int[i5] : (int[]) c8426zm02.d(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC3310d10
    public final synchronized Bitmap a() {
        try {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("n41", 3)) {
                    int i = this.l.c;
                }
                this.o = 1;
            }
            int i2 = this.o;
            if (i2 != 1 && i2 != 2) {
                this.o = 0;
                if (this.e == null) {
                    C8426zm0 c8426zm0 = (C8426zm0) this.c.b;
                    this.e = c8426zm0 == null ? new byte[KotlinVersion.MAX_COMPONENT_VALUE] : (byte[]) c8426zm0.d(KotlinVersion.MAX_COMPONENT_VALUE, byte[].class);
                }
                C4073h10 c4073h10 = (C4073h10) this.l.e.get(this.k);
                int i3 = this.k - 1;
                C4073h10 c4073h102 = i3 >= 0 ? (C4073h10) this.l.e.get(i3) : null;
                int[] iArr = c4073h10.k;
                if (iArr == null) {
                    iArr = this.l.a;
                }
                this.a = iArr;
                if (iArr == null) {
                    this.o = 1;
                    return null;
                }
                if (c4073h10.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[c4073h10.h] = 0;
                    if (c4073h10.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return e(c4073h10, c4073h102);
            }
            return null;
        } finally {
        }
    }

    public final void b() {
        this.k = (this.k + 1) % this.l.c;
    }

    public final Bitmap c() {
        Boolean bool = this.s;
        Bitmap bitmapH = ((InterfaceC5935mi) this.c.a).h(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapH.setHasAlpha(true);
        return bitmapH;
    }

    public final void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:304:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e(defpackage.C4073h10 r34, defpackage.C4073h10 r35) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6008n41.e(h10, h10):android.graphics.Bitmap");
    }
}
