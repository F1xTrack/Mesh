package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: n10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10338n10 {

    /* renamed from: b */
    public ByteBuffer f38042b;

    /* renamed from: c */
    public C10210m10 f38043c;

    /* renamed from: a */
    public final byte[] f38041a = new byte[256];

    /* renamed from: d */
    public int f38044d = 0;

    /* renamed from: a */
    public final boolean m23036a() {
        return this.f38043c.f37397b != 0;
    }

    /* renamed from: b */
    public final C10210m10 m23037b() {
        byte[] bArr;
        if (this.f38042b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m23036a()) {
            return this.f38043c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m23038c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f38043c.f37401f = this.f38042b.getShort();
            this.f38043c.f37402g = this.f38042b.getShort();
            int iM23038c = m23038c();
            C10210m10 c10210m10 = this.f38043c;
            c10210m10.f37403h = (iM23038c & 128) != 0;
            c10210m10.f37404i = (int) Math.pow(2.0d, (iM23038c & 7) + 1);
            this.f38043c.f37405j = m23038c();
            C10210m10 c10210m102 = this.f38043c;
            m23038c();
            c10210m102.getClass();
            if (this.f38043c.f37403h && !m23036a()) {
                C10210m10 c10210m103 = this.f38043c;
                c10210m103.f37396a = m23040e(c10210m103.f37404i);
                C10210m10 c10210m104 = this.f38043c;
                c10210m104.f37406k = c10210m104.f37396a[c10210m104.f37405j];
            }
        } else {
            this.f38043c.f37397b = 1;
        }
        if (!m23036a()) {
            boolean z = false;
            while (!z && !m23036a() && this.f38043c.f37398c <= Integer.MAX_VALUE) {
                int iM23038c2 = m23038c();
                if (iM23038c2 == 33) {
                    int iM23038c3 = m23038c();
                    if (iM23038c3 == 1) {
                        m23041f();
                    } else if (iM23038c3 == 249) {
                        this.f38043c.f37399d = new C9570h10();
                        m23038c();
                        int iM23038c4 = m23038c();
                        C9570h10 c9570h10 = this.f38043c.f37399d;
                        int i2 = (iM23038c4 & 28) >> 2;
                        c9570h10.f28160g = i2;
                        if (i2 == 0) {
                            c9570h10.f28160g = 1;
                        }
                        c9570h10.f28159f = (iM23038c4 & 1) != 0;
                        short s = this.f38042b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C9570h10 c9570h102 = this.f38043c.f37399d;
                        c9570h102.f28162i = s * 10;
                        c9570h102.f28161h = m23038c();
                        m23038c();
                    } else if (iM23038c3 == 254) {
                        m23041f();
                    } else if (iM23038c3 != 255) {
                        m23041f();
                    } else {
                        m23039d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f38041a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m23039d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f38043c.getClass();
                                }
                                if (this.f38044d > 0) {
                                }
                            } while (!m23036a());
                        } else {
                            m23041f();
                        }
                    }
                } else if (iM23038c2 == 44) {
                    C10210m10 c10210m105 = this.f38043c;
                    if (c10210m105.f37399d == null) {
                        c10210m105.f37399d = new C9570h10();
                    }
                    c10210m105.f37399d.f28154a = this.f38042b.getShort();
                    this.f38043c.f37399d.f28155b = this.f38042b.getShort();
                    this.f38043c.f37399d.f28156c = this.f38042b.getShort();
                    this.f38043c.f37399d.f28157d = this.f38042b.getShort();
                    int iM23038c5 = m23038c();
                    boolean z2 = (iM23038c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM23038c5 & 7) + 1);
                    C9570h10 c9570h103 = this.f38043c.f37399d;
                    c9570h103.f28158e = (iM23038c5 & 64) != 0;
                    if (z2) {
                        c9570h103.f28164k = m23040e(iPow);
                    } else {
                        c9570h103.f28164k = null;
                    }
                    this.f38043c.f37399d.f28163j = this.f38042b.position();
                    m23038c();
                    m23041f();
                    if (!m23036a()) {
                        C10210m10 c10210m106 = this.f38043c;
                        c10210m106.f37398c++;
                        c10210m106.f37400e.add(c10210m106.f37399d);
                    }
                } else if (iM23038c2 != 59) {
                    this.f38043c.f37397b = 1;
                } else {
                    z = true;
                }
            }
            C10210m10 c10210m107 = this.f38043c;
            if (c10210m107.f37398c < 0) {
                c10210m107.f37397b = 1;
            }
        }
        return this.f38043c;
    }

    /* renamed from: c */
    public final int m23038c() {
        try {
            return this.f38042b.get() & 255;
        } catch (Exception unused) {
            this.f38043c.f37397b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final void m23039d() {
        int iM23038c = m23038c();
        this.f38044d = iM23038c;
        if (iM23038c <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.f38044d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.f38042b.get(this.f38041a, i, i3);
                i += i3;
            } catch (Exception unused) {
                this.f38043c.f37397b = 1;
                return;
            }
        }
    }

    /* renamed from: e */
    public final int[] m23040e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f38042b.get(bArr);
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
            this.f38043c.f37397b = 1;
        }
        return iArr;
    }

    /* renamed from: f */
    public final void m23041f() {
        int iM23038c;
        do {
            iM23038c = m23038c();
            this.f38042b.position(Math.min(this.f38042b.position() + iM23038c, this.f38042b.limit()));
        } while (iM23038c > 0);
    }
}
