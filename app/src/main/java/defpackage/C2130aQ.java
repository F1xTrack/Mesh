package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: aQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2130aQ extends AbstractC6876rd1 {
    public AbstractC6876rd1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ C2226aw d;
    public final /* synthetic */ C8023xe1 e;
    public final /* synthetic */ C2511cQ f;

    public C2130aQ(C2511cQ c2511cQ, boolean z, boolean z2, C2226aw c2226aw, C8023xe1 c8023xe1) {
        this.f = c2511cQ;
        this.b = z;
        this.c = z2;
        this.d = c2226aw;
        this.e = c8023xe1;
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) throws IOException {
        if (this.b) {
            c8206yc0.v0();
            return null;
        }
        AbstractC6876rd1 abstractC6876rd1 = this.a;
        if (abstractC6876rd1 == null) {
            C8023xe1 c8023xe1 = this.e;
            C2226aw c2226aw = this.d;
            List<InterfaceC7258td1> list = (List) c2226aw.g;
            InterfaceC7258td1 interfaceC7258td1 = this.f;
            if (!list.contains(interfaceC7258td1)) {
                interfaceC7258td1 = (C7689vu) c2226aw.f;
            }
            boolean z = false;
            for (InterfaceC7258td1 interfaceC7258td12 : list) {
                if (z) {
                    AbstractC6876rd1 abstractC6876rd1A = interfaceC7258td12.a(c2226aw, c8023xe1);
                    if (abstractC6876rd1A != null) {
                        this.a = abstractC6876rd1A;
                        abstractC6876rd1 = abstractC6876rd1A;
                    }
                } else if (interfaceC7258td12 == interfaceC7258td1) {
                    z = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c8023xe1);
        }
        return abstractC6876rd1.a(c8206yc0);
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        if (this.c) {
            c0807Kc0.J();
            return;
        }
        AbstractC6876rd1 abstractC6876rd1 = this.a;
        if (abstractC6876rd1 == null) {
            C8023xe1 c8023xe1 = this.e;
            C2226aw c2226aw = this.d;
            List<InterfaceC7258td1> list = (List) c2226aw.g;
            InterfaceC7258td1 interfaceC7258td1 = this.f;
            if (!list.contains(interfaceC7258td1)) {
                interfaceC7258td1 = (C7689vu) c2226aw.f;
            }
            boolean z = false;
            for (InterfaceC7258td1 interfaceC7258td12 : list) {
                if (z) {
                    AbstractC6876rd1 abstractC6876rd1A = interfaceC7258td12.a(c2226aw, c8023xe1);
                    if (abstractC6876rd1A != null) {
                        this.a = abstractC6876rd1A;
                        abstractC6876rd1 = abstractC6876rd1A;
                    }
                } else if (interfaceC7258td12 == interfaceC7258td1) {
                    z = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c8023xe1);
        }
        abstractC6876rd1.b(c0807Kc0, obj);
    }
}
