package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: Bt */
/* loaded from: classes.dex */
public abstract class AbstractC0119Bt {

    /* renamed from: a */
    public static final Logger f1069a = Logger.getLogger(AbstractC0119Bt.class.getName());

    /* renamed from: a */
    public static void m899a(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            f1069a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    /* renamed from: b */
    public static void m900b(InputStream inputStream) {
        try {
            m899a(inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
