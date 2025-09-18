package defpackage;

/* loaded from: classes2.dex */
public abstract class KP extends AbstractC0485Fz {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public C6018n8 e;

    public abstract long A();

    public final boolean D() {
        C6018n8 c6018n8 = this.e;
        if (c6018n8 == null) {
            return false;
        }
        AbstractC8341zK abstractC8341zK = (AbstractC8341zK) (c6018n8.isEmpty() ? null : c6018n8.y());
        if (abstractC8341zK == null) {
            return false;
        }
        abstractC8341zK.run();
        return true;
    }

    public void J(long j, HP hp) {
        RunnableC6993sF.j.b0(j, hp);
    }

    public final void p(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public abstract Thread w();

    public final void x(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }
}
