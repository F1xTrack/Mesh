package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: n10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5995n10 {
    public ByteBuffer b;
    public C5804m10 c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public final C5804m10 b() {
        byte[] bArr;
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.c.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int iC = c();
            C5804m10 c5804m10 = this.c;
            c5804m10.h = (iC & 128) != 0;
            c5804m10.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.c.j = c();
            C5804m10 c5804m102 = this.c;
            c();
            c5804m102.getClass();
            if (this.c.h && !a()) {
                C5804m10 c5804m103 = this.c;
                c5804m103.a = e(c5804m103.i);
                C5804m10 c5804m104 = this.c;
                c5804m104.k = c5804m104.a[c5804m104.j];
            }
        } else {
            this.c.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.c.d = new C4073h10();
                        c();
                        int iC4 = c();
                        C4073h10 c4073h10 = this.c.d;
                        int i2 = (iC4 & 28) >> 2;
                        c4073h10.g = i2;
                        if (i2 == 0) {
                            c4073h10.g = 1;
                        }
                        c4073h10.f = (iC4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C4073h10 c4073h102 = this.c.d;
                        c4073h102.i = s * 10;
                        c4073h102.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    C5804m10 c5804m105 = this.c;
                    if (c5804m105.d == null) {
                        c5804m105.d = new C4073h10();
                    }
                    c5804m105.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int iC5 = c();
                    boolean z2 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    C4073h10 c4073h103 = this.c.d;
                    c4073h103.e = (iC5 & 64) != 0;
                    if (z2) {
                        c4073h103.k = e(iPow);
                    } else {
                        c4073h103.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        C5804m10 c5804m106 = this.c;
                        c5804m106.c++;
                        c5804m106.e.add(c5804m106.d);
                    }
                } else if (iC2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            C5804m10 c5804m107 = this.c;
            if (c5804m107.c < 0) {
                c5804m107.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.c.b = 1;
        }
        return iArr;
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.b.position(Math.min(this.b.position() + iC, this.b.limit()));
        } while (iC > 0);
    }
}
