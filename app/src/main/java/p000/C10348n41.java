package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* renamed from: n41 */
/* loaded from: classes.dex */
public final class C10348n41 implements InterfaceC9058d10 {

    /* renamed from: a */
    public int[] f38070a;

    /* renamed from: c */
    public final C7967Mo1 f38072c;

    /* renamed from: d */
    public ByteBuffer f38073d;

    /* renamed from: e */
    public byte[] f38074e;

    /* renamed from: f */
    public short[] f38075f;

    /* renamed from: g */
    public byte[] f38076g;

    /* renamed from: h */
    public byte[] f38077h;

    /* renamed from: i */
    public byte[] f38078i;

    /* renamed from: j */
    public final int[] f38079j;

    /* renamed from: k */
    public int f38080k;

    /* renamed from: l */
    public C10210m10 f38081l;

    /* renamed from: m */
    public Bitmap f38082m;

    /* renamed from: n */
    public final boolean f38083n;

    /* renamed from: o */
    public int f38084o;

    /* renamed from: p */
    public final int f38085p;

    /* renamed from: q */
    public final int f38086q;

    /* renamed from: r */
    public final int f38087r;

    /* renamed from: s */
    public Boolean f38088s;

    /* renamed from: b */
    public final int[] f38071b = new int[256];

    /* renamed from: t */
    public Bitmap.Config f38089t = Bitmap.Config.ARGB_8888;

    public C10348n41(C7967Mo1 c7967Mo1, C10210m10 c10210m10, ByteBuffer byteBuffer, int i) {
        this.f38072c = c7967Mo1;
        this.f38081l = new C10210m10();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f38084o = 0;
                this.f38081l = c10210m10;
                this.f38080k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f38073d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f38073d.order(ByteOrder.LITTLE_ENDIAN);
                this.f38083n = false;
                Iterator it = c10210m10.f37400e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C9570h10) it.next()).f28160g == 3) {
                        this.f38083n = true;
                        break;
                    }
                }
                this.f38085p = iHighestOneBit;
                int i2 = c10210m10.f37401f;
                this.f38087r = i2 / iHighestOneBit;
                int i3 = c10210m10.f37402g;
                this.f38086q = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C11967zm0 c11967zm0 = (C11967zm0) this.f38072c.f7363b;
                this.f38078i = c11967zm0 == null ? new byte[i4] : (byte[]) c11967zm0.m26542d(i4, byte[].class);
                C7967Mo1 c7967Mo12 = this.f38072c;
                int i5 = this.f38087r * this.f38086q;
                C11967zm0 c11967zm02 = (C11967zm0) c7967Mo12.f7363b;
                this.f38079j = c11967zm02 == null ? new int[i5] : (int[]) c11967zm02.m26542d(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC9058d10
    /* renamed from: a */
    public final synchronized Bitmap mo8139a() {
        try {
            if (this.f38081l.f37398c <= 0 || this.f38080k < 0) {
                if (Log.isLoggable("n41", 3)) {
                    int i = this.f38081l.f37398c;
                }
                this.f38084o = 1;
            }
            int i2 = this.f38084o;
            if (i2 != 1 && i2 != 2) {
                this.f38084o = 0;
                if (this.f38074e == null) {
                    C11967zm0 c11967zm0 = (C11967zm0) this.f38072c.f7363b;
                    this.f38074e = c11967zm0 == null ? new byte[KotlinVersion.MAX_COMPONENT_VALUE] : (byte[]) c11967zm0.m26542d(KotlinVersion.MAX_COMPONENT_VALUE, byte[].class);
                }
                C9570h10 c9570h10 = (C9570h10) this.f38081l.f37400e.get(this.f38080k);
                int i3 = this.f38080k - 1;
                C9570h10 c9570h102 = i3 >= 0 ? (C9570h10) this.f38081l.f37400e.get(i3) : null;
                int[] iArr = c9570h10.f28164k;
                if (iArr == null) {
                    iArr = this.f38081l.f37396a;
                }
                this.f38070a = iArr;
                if (iArr == null) {
                    this.f38084o = 1;
                    return null;
                }
                if (c9570h10.f28159f) {
                    System.arraycopy(iArr, 0, this.f38071b, 0, iArr.length);
                    int[] iArr2 = this.f38071b;
                    this.f38070a = iArr2;
                    iArr2[c9570h10.f28161h] = 0;
                    if (c9570h10.f28160g == 2 && this.f38080k == 0) {
                        this.f38088s = Boolean.TRUE;
                    }
                }
                return m23072e(c9570h10, c9570h102);
            }
            return null;
        } finally {
        }
    }

    /* renamed from: b */
    public final void m23069b() {
        this.f38080k = (this.f38080k + 1) % this.f38081l.f37398c;
    }

    /* renamed from: c */
    public final Bitmap m23070c() {
        Boolean bool = this.f38088s;
        Bitmap bitmapMo318h = ((InterfaceC6443mi) this.f38072c.f7362a).mo318h(this.f38087r, this.f38086q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f38089t);
        bitmapMo318h.setHasAlpha(true);
        return bitmapMo318h;
    }

    /* renamed from: d */
    public final void m23071d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f38089t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:304:0x0047  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m23072e(p000.C9570h10 r34, p000.C9570h10 r35) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10348n41.m23072e(h10, h10):android.graphics.Bitmap");
    }
}
