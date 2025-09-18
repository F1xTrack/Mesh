package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: Uk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8375Uk1 {

    /* renamed from: a */
    public final HashMap f12019a = new HashMap();

    /* renamed from: b */
    public final LinkedHashSet f12020b = new LinkedHashSet();

    /* renamed from: c */
    public volatile boolean f12021c = false;

    /* renamed from: a */
    public static void m8137a(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    public void mo8138b() {
    }
}
