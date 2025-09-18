package defpackage;

/* renamed from: mB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5837mB0 extends AbstractC5762lo {
    public C5837mB0(String str) {
        super("format", "format-required", AbstractC8235ym.k("The prop \"", str, "\" requires a format to be set, but format was null!"), null);
    }

    public C5837mB0(int i) {
        super("system", "view-not-found", AbstractC8235ym.g(i, "The given view (ID ", ") was not found in the view manager."), null);
    }

    public C5837mB0(Throwable th) {
        String message;
        super("unknown", "unknown", (th == null || (message = th.getMessage()) == null) ? "An unknown camera error occured." : message, th);
    }
}
