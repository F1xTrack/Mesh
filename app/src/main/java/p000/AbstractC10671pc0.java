package p000;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: pc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10671pc0 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C7890Lc0 c7890Lc0 = new C7890Lc0(stringWriter);
            c7890Lc0.f6766e = true;
            C11823yd1 c11823yd1 = AbstractC7477Dd1.f2093a;
            C7774Iw0.m4086b(c7890Lc0, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
