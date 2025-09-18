package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: pc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6491pc0 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0885Lc0 c0885Lc0 = new C0885Lc0(stringWriter);
            c0885Lc0.e = true;
            C8210yd1 c8210yd1 = AbstractC0265Dd1.a;
            C0711Iw0.b(c0885Lc0, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
