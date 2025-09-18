package defpackage;

/* loaded from: classes2.dex */
public final class Z81 extends O81 {
    public final Runnable c;

    public Z81(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC8130yD.c(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return F91.v(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
