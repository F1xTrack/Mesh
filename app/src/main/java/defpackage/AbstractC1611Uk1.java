package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: Uk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1611Uk1 {
    public final HashMap a = new HashMap();
    public final LinkedHashSet b = new LinkedHashSet();
    public volatile boolean c = false;

    public static void a(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void b() {
    }
}
