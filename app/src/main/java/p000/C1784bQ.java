package p000;

import java.io.IOException;
import java.util.List;

/* renamed from: bQ */
/* loaded from: classes.dex */
public final class C1784bQ extends AbstractC11058sd1 {

    /* renamed from: a */
    public AbstractC11058sd1 f17006a;

    /* renamed from: b */
    public final /* synthetic */ boolean f17007b;

    /* renamed from: c */
    public final /* synthetic */ C9189e20 f17008c;

    /* renamed from: d */
    public final /* synthetic */ C11825ye1 f17009d;

    /* renamed from: e */
    public final /* synthetic */ C3927dQ f17010e;

    public C1784bQ(C3927dQ c3927dQ, boolean z, C9189e20 c9189e20, C11825ye1 c11825ye1) {
        this.f17010e = c3927dQ;
        this.f17007b = z;
        this.f17008c = c9189e20;
        this.f17009d = c11825ye1;
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        if (this.f17007b) {
            c7890Lc0.m5034J();
            return;
        }
        AbstractC11058sd1 abstractC11058sd1 = this.f17006a;
        if (abstractC11058sd1 == null) {
            C11825ye1 c11825ye1 = this.f17009d;
            C9189e20 c9189e20 = this.f17008c;
            List<InterfaceC11314ud1> list = c9189e20.f26508e;
            InterfaceC11314ud1 interfaceC11314ud1 = this.f17010e;
            if (!list.contains(interfaceC11314ud1)) {
                interfaceC11314ud1 = c9189e20.f26507d;
            }
            boolean z = false;
            for (InterfaceC11314ud1 interfaceC11314ud12 : list) {
                if (z) {
                    AbstractC11058sd1 abstractC11058sd1Mo2052a = interfaceC11314ud12.mo2052a(c9189e20, c11825ye1);
                    if (abstractC11058sd1Mo2052a != null) {
                        this.f17006a = abstractC11058sd1Mo2052a;
                        abstractC11058sd1 = abstractC11058sd1Mo2052a;
                    }
                } else if (interfaceC11314ud12 == interfaceC11314ud1) {
                    z = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c11825ye1);
        }
        abstractC11058sd1.mo246a(c7890Lc0, obj);
    }
}
