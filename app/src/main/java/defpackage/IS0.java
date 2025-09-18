package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class IS0 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0199Ch1.d(w());
    }

    public final InputStream m() {
        return w().l0();
    }

    public final byte[] n() {
        long jO = o();
        if (jO > 2147483647L) {
            throw new IOException(NX.g(jO, "Cannot buffer entire body for content length: "));
        }
        InterfaceC0827Kj interfaceC0827KjW = w();
        try {
            byte[] bArrY = interfaceC0827KjW.y();
            AbstractC2141aT1.a(interfaceC0827KjW, null);
            int length = bArrY.length;
            if (jO == -1 || jO == length) {
                return bArrY;
            }
            throw new IOException("Content-Length (" + jO + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public abstract long o();

    public abstract C1859Xp0 p();

    public abstract InterfaceC0827Kj w();

    public final String x() {
        Charset charsetA;
        InterfaceC0827Kj interfaceC0827KjW = w();
        try {
            C1859Xp0 c1859Xp0P = p();
            if (c1859Xp0P == null || (charsetA = c1859Xp0P.a(AbstractC7680vr.a)) == null) {
                charsetA = AbstractC7680vr.a;
            }
            String strN = interfaceC0827KjW.N(AbstractC0199Ch1.t(interfaceC0827KjW, charsetA));
            AbstractC2141aT1.a(interfaceC0827KjW, null);
            return strN;
        } finally {
        }
    }
}
