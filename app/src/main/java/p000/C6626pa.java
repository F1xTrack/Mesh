package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: pa */
/* loaded from: classes.dex */
public final class C6626pa {

    /* renamed from: a */
    public final C9367fQ0 f40215a;

    /* renamed from: b */
    public final ArrayList f40216b = new ArrayList();

    /* renamed from: c */
    public ByteBuffer[] f40217c = new ByteBuffer[0];

    /* renamed from: d */
    public boolean f40218d;

    public C6626pa(C9367fQ0 c9367fQ0) {
        this.f40215a = c9367fQ0;
        C6689qa c6689qa = C6689qa.f41025e;
        this.f40218d = false;
    }

    /* renamed from: a */
    public final C6689qa m23815a(C6689qa c6689qa) throws C6752ra {
        if (c6689qa.equals(C6689qa.f41025e)) {
            throw new C6752ra(c6689qa);
        }
        int i = 0;
        while (true) {
            C9367fQ0 c9367fQ0 = this.f40215a;
            if (i >= c9367fQ0.size()) {
                return c6689qa;
            }
            InterfaceC6832sa interfaceC6832sa = (InterfaceC6832sa) c9367fQ0.get(i);
            C6689qa c6689qaMo7056g = interfaceC6832sa.mo7056g(c6689qa);
            if (interfaceC6832sa.isActive()) {
                YN1.m9281f(!c6689qaMo7056g.equals(C6689qa.f41025e));
                c6689qa = c6689qaMo7056g;
            }
            i++;
        }
    }

    /* renamed from: b */
    public final void m23816b() {
        ArrayList arrayList = this.f40216b;
        arrayList.clear();
        this.f40218d = false;
        int i = 0;
        while (true) {
            C9367fQ0 c9367fQ0 = this.f40215a;
            if (i >= c9367fQ0.size()) {
                break;
            }
            InterfaceC6832sa interfaceC6832sa = (InterfaceC6832sa) c9367fQ0.get(i);
            interfaceC6832sa.flush();
            if (interfaceC6832sa.isActive()) {
                arrayList.add(interfaceC6832sa);
            }
            i++;
        }
        this.f40217c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m23817c(); i2++) {
            this.f40217c[i2] = ((InterfaceC6832sa) arrayList.get(i2)).mo7055e();
        }
    }

    /* renamed from: c */
    public final int m23817c() {
        return this.f40217c.length - 1;
    }

    /* renamed from: d */
    public final boolean m23818d() {
        return this.f40218d && ((InterfaceC6832sa) this.f40216b.get(m23817c())).mo7058i() && !this.f40217c[m23817c()].hasRemaining();
    }

    /* renamed from: e */
    public final boolean m23819e() {
        return !this.f40216b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6626pa)) {
            return false;
        }
        C6626pa c6626pa = (C6626pa) obj;
        C9367fQ0 c9367fQ0 = this.f40215a;
        if (c9367fQ0.size() != c6626pa.f40215a.size()) {
            return false;
        }
        for (int i = 0; i < c9367fQ0.size(); i++) {
            if (c9367fQ0.get(i) != c6626pa.f40215a.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m23820f(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= m23817c()) {
                if (!this.f40217c[i].hasRemaining()) {
                    ArrayList arrayList = this.f40216b;
                    InterfaceC6832sa interfaceC6832sa = (InterfaceC6832sa) arrayList.get(i);
                    if (!interfaceC6832sa.mo7058i()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f40217c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC6832sa.f42484a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC6832sa.mo3682f(byteBuffer2);
                        this.f40217c[i] = interfaceC6832sa.mo7055e();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f40217c[i].hasRemaining();
                    } else if (!this.f40217c[i].hasRemaining() && i < m23817c()) {
                        ((InterfaceC6832sa) arrayList.get(i + 1)).mo7057h();
                    }
                }
                i++;
            }
        }
    }

    public final int hashCode() {
        return this.f40215a.hashCode();
    }
}
