package p000;

/* loaded from: classes2.dex */
public final class Z81 extends O81 {

    /* renamed from: c */
    public final Runnable f14760c;

    public Z81(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f14760c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14760c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f14760c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC7187yD.m26097c(runnable));
        sb.append(", ");
        sb.append(this.f8258a);
        sb.append(", ");
        return F91.m2539v(sb, this.f8259b ? "Blocking" : "Non-blocking", ']');
    }
}
