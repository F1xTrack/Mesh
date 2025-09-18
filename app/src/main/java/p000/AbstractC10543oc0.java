package p000;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: oc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10543oc0 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C7838Kc0 c7838Kc0 = new C7838Kc0(stringWriter);
            c7838Kc0.f6232e = true;
            C11696xd1 c11696xd1 = AbstractC7425Cd1.f1505a;
            C7722Hw0.m3654d(c7838Kc0, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
