package p000;

import androidx.lifecycle.C1742a;

/* renamed from: Am */
/* loaded from: classes.dex */
public final class RunnableC0049Am implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f357a;

    /* renamed from: b */
    public boolean f358b;

    /* renamed from: c */
    public final Object f359c;

    /* renamed from: d */
    public final Object f360d;

    public RunnableC0049Am(C1742a c1742a, EnumC7382Bi0 enumC7382Bi0) {
        this.f357a = 1;
        O90.m5968f(c1742a, "registry");
        O90.m5968f(enumC7382Bi0, "event");
        this.f359c = c1742a;
        this.f360d = enumC7382Bi0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f357a) {
            case 0:
                ((ExecutorC10151lY0) this.f359c).execute(new RunnableC0383G4(11, this));
                break;
            default:
                if (!this.f358b) {
                    ((C1742a) this.f359c).m10126e((EnumC7382Bi0) this.f360d);
                    this.f358b = true;
                    break;
                }
                break;
        }
    }

    public RunnableC0049Am(C0112Bm c0112Bm, ExecutorC10151lY0 executorC10151lY0) {
        this.f357a = 0;
        this.f360d = c0112Bm;
        this.f358b = false;
        this.f359c = executorC10151lY0;
    }
}
