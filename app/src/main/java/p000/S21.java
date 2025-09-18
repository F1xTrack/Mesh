package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class S21 implements InterfaceC6832sa {

    /* renamed from: b */
    public int f10546b;

    /* renamed from: c */
    public float f10547c;

    /* renamed from: d */
    public float f10548d;

    /* renamed from: e */
    public C6689qa f10549e;

    /* renamed from: f */
    public C6689qa f10550f;

    /* renamed from: g */
    public C6689qa f10551g;

    /* renamed from: h */
    public C6689qa f10552h;

    /* renamed from: i */
    public boolean f10553i;

    /* renamed from: j */
    public R21 f10554j;

    /* renamed from: k */
    public ByteBuffer f10555k;

    /* renamed from: l */
    public ShortBuffer f10556l;

    /* renamed from: m */
    public ByteBuffer f10557m;

    /* renamed from: n */
    public long f10558n;

    /* renamed from: o */
    public long f10559o;

    /* renamed from: p */
    public boolean f10560p;

    @Override // p000.InterfaceC6832sa
    /* renamed from: d */
    public final void mo7054d() {
        this.f10547c = 1.0f;
        this.f10548d = 1.0f;
        C6689qa c6689qa = C6689qa.f41025e;
        this.f10549e = c6689qa;
        this.f10550f = c6689qa;
        this.f10551g = c6689qa;
        this.f10552h = c6689qa;
        ByteBuffer byteBuffer = InterfaceC6832sa.f42484a;
        this.f10555k = byteBuffer;
        this.f10556l = byteBuffer.asShortBuffer();
        this.f10557m = byteBuffer;
        this.f10546b = -1;
        this.f10553i = false;
        this.f10554j = null;
        this.f10558n = 0L;
        this.f10559o = 0L;
        this.f10560p = false;
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: e */
    public final ByteBuffer mo7055e() {
        R21 r21 = this.f10554j;
        if (r21 != null) {
            int i = r21.f9941m;
            int i2 = r21.f9930b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.f10555k.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.f10555k = byteBufferOrder;
                    this.f10556l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f10555k.clear();
                    this.f10556l.clear();
                }
                ShortBuffer shortBuffer = this.f10556l;
                int iMin = Math.min(shortBuffer.remaining() / i2, r21.f9941m);
                int i4 = iMin * i2;
                shortBuffer.put(r21.f9940l, 0, i4);
                int i5 = r21.f9941m - iMin;
                r21.f9941m = i5;
                short[] sArr = r21.f9940l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.f10559o += i3;
                this.f10555k.limit(i3);
                this.f10557m = this.f10555k;
            }
        }
        ByteBuffer byteBuffer = this.f10557m;
        this.f10557m = InterfaceC6832sa.f42484a;
        return byteBuffer;
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: f */
    public final void mo3682f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            R21 r21 = this.f10554j;
            r21.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f10558n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = r21.f9930b;
            int i2 = iRemaining2 / i;
            short[] sArrM6884c = r21.m6884c(r21.f9938j, r21.f9939k, i2);
            r21.f9938j = sArrM6884c;
            shortBufferAsShortBuffer.get(sArrM6884c, r21.f9939k * i, ((i2 * i) * 2) / 2);
            r21.f9939k += i2;
            r21.m6886f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // p000.InterfaceC6832sa
    public final void flush() {
        if (isActive()) {
            C6689qa c6689qa = this.f10549e;
            this.f10551g = c6689qa;
            C6689qa c6689qa2 = this.f10550f;
            this.f10552h = c6689qa2;
            if (this.f10553i) {
                this.f10554j = new R21(c6689qa.f41026a, c6689qa.f41027b, this.f10547c, this.f10548d, c6689qa2.f41026a);
            } else {
                R21 r21 = this.f10554j;
                if (r21 != null) {
                    r21.f9939k = 0;
                    r21.f9941m = 0;
                    r21.f9943o = 0;
                    r21.f9944p = 0;
                    r21.f9945q = 0;
                    r21.f9946r = 0;
                    r21.f9947s = 0;
                    r21.f9948t = 0;
                    r21.f9949u = 0;
                    r21.f9950v = 0;
                }
            }
        }
        this.f10557m = InterfaceC6832sa.f42484a;
        this.f10558n = 0L;
        this.f10559o = 0L;
        this.f10560p = false;
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: g */
    public final C6689qa mo7056g(C6689qa c6689qa) throws C6752ra {
        if (c6689qa.f41028c != 2) {
            throw new C6752ra(c6689qa);
        }
        int i = this.f10546b;
        if (i == -1) {
            i = c6689qa.f41026a;
        }
        this.f10549e = c6689qa;
        C6689qa c6689qa2 = new C6689qa(i, c6689qa.f41027b, 2);
        this.f10550f = c6689qa2;
        this.f10553i = true;
        return c6689qa2;
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: h */
    public final void mo7057h() {
        R21 r21 = this.f10554j;
        if (r21 != null) {
            int i = r21.f9939k;
            float f = r21.f9931c;
            float f2 = r21.f9932d;
            int i2 = r21.f9941m + ((int) ((((i / (f / f2)) + r21.f9943o) / (r21.f9933e * f2)) + 0.5f));
            short[] sArr = r21.f9938j;
            int i3 = r21.f9936h * 2;
            r21.f9938j = r21.m6884c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = r21.f9930b;
                if (i4 >= i3 * i5) {
                    break;
                }
                r21.f9938j[(i5 * i) + i4] = 0;
                i4++;
            }
            r21.f9939k = i3 + r21.f9939k;
            r21.m6886f();
            if (r21.f9941m > i2) {
                r21.f9941m = i2;
            }
            r21.f9939k = 0;
            r21.f9946r = 0;
            r21.f9943o = 0;
        }
        this.f10560p = true;
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: i */
    public final boolean mo7058i() {
        R21 r21;
        return this.f10560p && ((r21 = this.f10554j) == null || (r21.f9941m * r21.f9930b) * 2 == 0);
    }

    @Override // p000.InterfaceC6832sa
    public final boolean isActive() {
        return this.f10550f.f41026a != -1 && (Math.abs(this.f10547c - 1.0f) >= 1.0E-4f || Math.abs(this.f10548d - 1.0f) >= 1.0E-4f || this.f10550f.f41026a != this.f10549e.f41026a);
    }
}
