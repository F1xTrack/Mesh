package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: oc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6300oc0 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0807Kc0 c0807Kc0 = new C0807Kc0(stringWriter);
            c0807Kc0.e = true;
            C8020xd1 c8020xd1 = AbstractC0187Cd1.a;
            C0633Hw0.d(c0807Kc0, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
