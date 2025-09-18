package defpackage;

import androidx.lifecycle.a;

/* renamed from: Am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0056Am implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;

    public RunnableC0056Am(a aVar, EnumC0123Bi0 enumC0123Bi0) {
        this.a = 1;
        O90.f(aVar, "registry");
        O90.f(enumC0123Bi0, "event");
        this.c = aVar;
        this.d = enumC0123Bi0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ExecutorC5715lY0) this.c).execute(new G4(11, this));
                break;
            default:
                if (!this.b) {
                    ((a) this.c).e((EnumC0123Bi0) this.d);
                    this.b = true;
                    break;
                }
                break;
        }
    }

    public RunnableC0056Am(C0134Bm c0134Bm, ExecutorC5715lY0 executorC5715lY0) {
        this.a = 0;
        this.d = c0134Bm;
        this.b = false;
        this.c = executorC5715lY0;
    }
}
