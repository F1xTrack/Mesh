package defpackage;

import java.util.List;

/* renamed from: e30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3508e30 extends AbstractC6693qg {
    public final List d;
    public final long e;

    public C3508e30(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // defpackage.InterfaceC0375Eo0
    public final long e() {
        a();
        return this.e + ((AbstractC6194o30) this.d.get((int) this.c)).e;
    }

    @Override // defpackage.InterfaceC0375Eo0
    public final long h() {
        a();
        AbstractC6194o30 abstractC6194o30 = (AbstractC6194o30) this.d.get((int) this.c);
        return this.e + abstractC6194o30.e + abstractC6194o30.c;
    }
}
