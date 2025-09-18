package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6484pa {
    public final C3769fQ0 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public C6484pa(C3769fQ0 c3769fQ0) {
        this.a = c3769fQ0;
        C6675qa c6675qa = C6675qa.e;
        this.d = false;
    }

    public final C6675qa a(C6675qa c6675qa) throws C6865ra {
        if (c6675qa.equals(C6675qa.e)) {
            throw new C6865ra(c6675qa);
        }
        int i = 0;
        while (true) {
            C3769fQ0 c3769fQ0 = this.a;
            if (i >= c3769fQ0.size()) {
                return c6675qa;
            }
            InterfaceC7056sa interfaceC7056sa = (InterfaceC7056sa) c3769fQ0.get(i);
            C6675qa c6675qaG = interfaceC7056sa.g(c6675qa);
            if (interfaceC7056sa.isActive()) {
                YN1.f(!c6675qaG.equals(C6675qa.e));
                c6675qa = c6675qaG;
            }
            i++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            C3769fQ0 c3769fQ0 = this.a;
            if (i >= c3769fQ0.size()) {
                break;
            }
            InterfaceC7056sa interfaceC7056sa = (InterfaceC7056sa) c3769fQ0.get(i);
            interfaceC7056sa.flush();
            if (interfaceC7056sa.isActive()) {
                arrayList.add(interfaceC7056sa);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((InterfaceC7056sa) arrayList.get(i2)).e();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final boolean d() {
        return this.d && ((InterfaceC7056sa) this.b.get(c())).i() && !this.c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6484pa)) {
            return false;
        }
        C6484pa c6484pa = (C6484pa) obj;
        C3769fQ0 c3769fQ0 = this.a;
        if (c3769fQ0.size() != c6484pa.a.size()) {
            return false;
        }
        for (int i = 0; i < c3769fQ0.size(); i++) {
            if (c3769fQ0.get(i) != c6484pa.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= c()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    InterfaceC7056sa interfaceC7056sa = (InterfaceC7056sa) arrayList.get(i);
                    if (!interfaceC7056sa.i()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC7056sa.a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC7056sa.f(byteBuffer2);
                        this.c[i] = interfaceC7056sa.e();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((InterfaceC7056sa) arrayList.get(i + 1)).h();
                    }
                }
                i++;
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
