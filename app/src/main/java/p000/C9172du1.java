package p000;

import java.io.File;
import java.io.FileOutputStream;

/* renamed from: du1 */
/* loaded from: classes2.dex */
public final class C9172du1 {

    /* renamed from: a */
    public final C8262Sg0 f26386a;

    /* renamed from: b */
    public final C9937jt0 f26387b;

    public C9172du1(C8262Sg0 c8262Sg0, C9937jt0 c9937jt0) {
        O90.m5968f(c8262Sg0, "fileSystemWrapper");
        this.f26386a = c8262Sg0;
        this.f26387b = c9937jt0;
    }

    /* renamed from: a */
    public final C11476vu1 m17774a() {
        synchronized (this) {
            C7546Em0 c7546Em0M25309a = AbstractC11367v22.m25309a(this.f26386a.m7417a());
            if (c7546Em0M25309a == null) {
                return null;
            }
            return this.f26387b.m22118n(D51.m1549h(AbstractC6366lU.m22434d(c7546Em0M25309a.f2897a)));
        }
    }

    /* renamed from: b */
    public final void m17775b(C11476vu1 c11476vu1) {
        synchronized (this) {
            C8262Sg0 c8262Sg0 = this.f26386a;
            String strValueOf = String.valueOf(c11476vu1.f44599c.f43427a);
            c8262Sg0.getClass();
            O90.m5968f(strValueOf, "fileName");
            File file = new File((File) c8262Sg0.f10906a.getValue(), strValueOf);
            file.delete();
            file.createNewFile();
            byte[] bytes = this.f26387b.m22119o(c11476vu1).getBytes(AbstractC7038vr.f44561a);
            O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                AbstractC8729aT1.m9749a(fileOutputStream, null);
            } finally {
            }
        }
    }
}
