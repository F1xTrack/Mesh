package p000;

/* loaded from: classes.dex */
public final class T81 {

    /* renamed from: a */
    public final C8499Wu1 f11181a = new C8499Wu1();

    /* renamed from: a */
    public final void m7576a(Exception exc) {
        C8499Wu1 c8499Wu1 = this.f11181a;
        synchronized (c8499Wu1.f13448a) {
            try {
                if (!c8499Wu1.f13449b) {
                    c8499Wu1.f13449b = true;
                    c8499Wu1.f13451d = exc;
                    c8499Wu1.f13448a.notifyAll();
                    c8499Wu1.m8879i();
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final void m7577b(Object obj) {
        C8499Wu1 c8499Wu1 = this.f11181a;
        synchronized (c8499Wu1.f13448a) {
            try {
                if (!c8499Wu1.f13449b) {
                    c8499Wu1.f13449b = true;
                    c8499Wu1.f13450c = obj;
                    c8499Wu1.f13448a.notifyAll();
                    c8499Wu1.m8879i();
                }
            } finally {
            }
        }
    }
}
