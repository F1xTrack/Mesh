package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class IS0 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC7433Ch1.m1275d(mo3385w());
    }

    /* renamed from: m */
    public final InputStream m3876m() {
        return mo3385w().mo4706l0();
    }

    /* renamed from: n */
    public final byte[] m3877n() {
        long jMo3383o = mo3383o();
        if (jMo3383o > 2147483647L) {
            throw new IOException(AbstractC0852NX.m5758g(jMo3383o, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0676Kj interfaceC0676KjMo3385w = mo3385w();
        try {
            byte[] bArrMo4708y = interfaceC0676KjMo3385w.mo4708y();
            AbstractC8729aT1.m9749a(interfaceC0676KjMo3385w, null);
            int length = bArrMo4708y.length;
            if (jMo3383o == -1 || jMo3383o == length) {
                return bArrMo4708y;
            }
            throw new IOException("Content-Length (" + jMo3383o + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    /* renamed from: o */
    public abstract long mo3383o();

    /* renamed from: p */
    public abstract C8540Xp0 mo3384p();

    /* renamed from: w */
    public abstract InterfaceC0676Kj mo3385w();

    /* renamed from: x */
    public final String m3878x() {
        Charset charsetM9156a;
        InterfaceC0676Kj interfaceC0676KjMo3385w = mo3385w();
        try {
            C8540Xp0 c8540Xp0Mo3384p = mo3384p();
            if (c8540Xp0Mo3384p == null || (charsetM9156a = c8540Xp0Mo3384p.m9156a(AbstractC7038vr.f44561a)) == null) {
                charsetM9156a = AbstractC7038vr.f44561a;
            }
            String strMo4704N = interfaceC0676KjMo3385w.mo4704N(AbstractC7433Ch1.m1291t(interfaceC0676KjMo3385w, charsetM9156a));
            AbstractC8729aT1.m9749a(interfaceC0676KjMo3385w, null);
            return strMo4704N;
        } finally {
        }
    }
}
