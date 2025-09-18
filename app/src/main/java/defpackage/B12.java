package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class B12 {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        boolean z = false;
        if (!interfaceFutureC0750Jj0.isDone()) {
            throw new IllegalStateException(AbstractC5319jT1.f("Future was expected to be done: %s", interfaceFutureC0750Jj0));
        }
        while (true) {
            try {
                interfaceFutureC0750Jj0.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
