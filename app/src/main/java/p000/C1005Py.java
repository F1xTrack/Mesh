package p000;

import java.util.concurrent.CancellationException;

/* renamed from: Py */
/* loaded from: classes2.dex */
public final class C1005Py extends CancellationException {
    public C1005Py() {
        super("App context destroyed. All coroutines are cancelled.");
    }
}
