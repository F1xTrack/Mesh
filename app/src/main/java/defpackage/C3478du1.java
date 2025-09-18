package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* renamed from: du1 */
/* loaded from: classes2.dex */
public final class C3478du1 {
    public final C1442Sg0 a;
    public final C5396jt0 b;

    public C3478du1(C1442Sg0 c1442Sg0, C5396jt0 c5396jt0) {
        O90.f(c1442Sg0, "fileSystemWrapper");
        this.a = c1442Sg0;
        this.b = c5396jt0;
    }

    public final C7691vu1 a() {
        synchronized (this) {
            C0369Em0 c0369Em0A = AbstractC7528v22.a(this.a.a());
            if (c0369Em0A == null) {
                return null;
            }
            return this.b.n(D51.h(AbstractC5702lU.d(c0369Em0A.a)));
        }
    }

    public final void b(C7691vu1 c7691vu1) {
        synchronized (this) {
            C1442Sg0 c1442Sg0 = this.a;
            String strValueOf = String.valueOf(c7691vu1.c.a);
            c1442Sg0.getClass();
            O90.f(strValueOf, "fileName");
            File file = new File((File) c1442Sg0.a.getValue(), strValueOf);
            file.delete();
            file.createNewFile();
            byte[] bytes = this.b.o(c7691vu1).getBytes(AbstractC7680vr.a);
            O90.e(bytes, "this as java.lang.String).getBytes(charset)");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                AbstractC2141aT1.a(fileOutputStream, null);
            } finally {
            }
        }
    }
}
