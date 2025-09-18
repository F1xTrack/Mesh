package defpackage;

/* loaded from: classes2.dex */
public final class DL0 implements Runnable {
    public final /* synthetic */ int a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                throw new RuntimeException("Crash Test");
            case 1:
                return;
            case 2:
                WO1.i.incrementAndGet();
                return;
            default:
                WO1.i.incrementAndGet();
                return;
        }
    }

    private final void a() {
    }
}
