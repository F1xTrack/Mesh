package defpackage;

/* loaded from: classes.dex */
public final class F41 {
    public volatile boolean a;

    public final void a() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
