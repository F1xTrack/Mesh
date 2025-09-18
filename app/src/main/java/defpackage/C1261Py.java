package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: Py, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1261Py extends CancellationException {
    public C1261Py() {
        super("App context destroyed. All coroutines are cancelled.");
    }
}
