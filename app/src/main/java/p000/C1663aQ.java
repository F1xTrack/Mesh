package p000;

import java.io.IOException;
import java.util.List;

/* renamed from: aQ */
/* loaded from: classes2.dex */
public final class C1663aQ extends AbstractC10930rd1 {

    /* renamed from: a */
    public AbstractC10930rd1 f15495a;

    /* renamed from: b */
    public final /* synthetic */ boolean f15496b;

    /* renamed from: c */
    public final /* synthetic */ boolean f15497c;

    /* renamed from: d */
    public final /* synthetic */ C1753aw f15498d;

    /* renamed from: e */
    public final /* synthetic */ C11698xe1 f15499e;

    /* renamed from: f */
    public final /* synthetic */ C1846cQ f15500f;

    public C1663aQ(C1846cQ c1846cQ, boolean z, boolean z2, C1753aw c1753aw, C11698xe1 c11698xe1) {
        this.f15500f = c1846cQ;
        this.f15496b = z;
        this.f15497c = z2;
        this.f15498d = c1753aw;
        this.f15499e = c11698xe1;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) throws IOException {
        if (this.f15496b) {
            c11820yc0.m26200v0();
            return null;
        }
        AbstractC10930rd1 abstractC10930rd1 = this.f15495a;
        if (abstractC10930rd1 == null) {
            C11698xe1 c11698xe1 = this.f15499e;
            C1753aw c1753aw = this.f15498d;
            List<InterfaceC11186td1> list = (List) c1753aw.f16687g;
            InterfaceC11186td1 interfaceC11186td1 = this.f15500f;
            if (!list.contains(interfaceC11186td1)) {
                interfaceC11186td1 = (C7041vu) c1753aw.f16686f;
            }
            boolean z = false;
            for (InterfaceC11186td1 interfaceC11186td12 : list) {
                if (z) {
                    AbstractC10930rd1 abstractC10930rd1Mo1562a = interfaceC11186td12.mo1562a(c1753aw, c11698xe1);
                    if (abstractC10930rd1Mo1562a != null) {
                        this.f15495a = abstractC10930rd1Mo1562a;
                        abstractC10930rd1 = abstractC10930rd1Mo1562a;
                    }
                } else if (interfaceC11186td12 == interfaceC11186td1) {
                    z = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c11698xe1);
        }
        return abstractC10930rd1.mo480a(c11820yc0);
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        if (this.f15497c) {
            c7838Kc0.m4680J();
            return;
        }
        AbstractC10930rd1 abstractC10930rd1 = this.f15495a;
        if (abstractC10930rd1 == null) {
            C11698xe1 c11698xe1 = this.f15499e;
            C1753aw c1753aw = this.f15498d;
            List<InterfaceC11186td1> list = (List) c1753aw.f16687g;
            InterfaceC11186td1 interfaceC11186td1 = this.f15500f;
            if (!list.contains(interfaceC11186td1)) {
                interfaceC11186td1 = (C7041vu) c1753aw.f16686f;
            }
            boolean z = false;
            for (InterfaceC11186td1 interfaceC11186td12 : list) {
                if (z) {
                    AbstractC10930rd1 abstractC10930rd1Mo1562a = interfaceC11186td12.mo1562a(c1753aw, c11698xe1);
                    if (abstractC10930rd1Mo1562a != null) {
                        this.f15495a = abstractC10930rd1Mo1562a;
                        abstractC10930rd1 = abstractC10930rd1Mo1562a;
                    }
                } else if (interfaceC11186td12 == interfaceC11186td1) {
                    z = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c11698xe1);
        }
        abstractC10930rd1.mo481b(c7838Kc0, obj);
    }
}
