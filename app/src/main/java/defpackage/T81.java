package defpackage;

/* loaded from: classes.dex */
public final class T81 {
    public final C1797Wu1 a = new C1797Wu1();

    public final void a(Exception exc) {
        C1797Wu1 c1797Wu1 = this.a;
        synchronized (c1797Wu1.a) {
            try {
                if (!c1797Wu1.b) {
                    c1797Wu1.b = true;
                    c1797Wu1.d = exc;
                    c1797Wu1.a.notifyAll();
                    c1797Wu1.i();
                }
            } finally {
            }
        }
    }

    public final void b(Object obj) {
        C1797Wu1 c1797Wu1 = this.a;
        synchronized (c1797Wu1.a) {
            try {
                if (!c1797Wu1.b) {
                    c1797Wu1.b = true;
                    c1797Wu1.c = obj;
                    c1797Wu1.a.notifyAll();
                    c1797Wu1.i();
                }
            } finally {
            }
        }
    }
}
