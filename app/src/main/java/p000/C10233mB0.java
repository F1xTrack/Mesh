package p000;

/* renamed from: mB0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10233mB0 extends AbstractC6386lo {
    public C10233mB0(String str) {
        super("format", "format-required", AbstractC7222ym.m26234k("The prop \"", str, "\" requires a format to be set, but format was null!"), null);
    }

    public C10233mB0(int i) {
        super("system", "view-not-found", AbstractC7222ym.m26230g(i, "The given view (ID ", ") was not found in the view manager."), null);
    }

    public C10233mB0(Throwable th) {
        String message;
        super("unknown", "unknown", (th == null || (message = th.getMessage()) == null) ? "An unknown camera error occured." : message, th);
    }
}
