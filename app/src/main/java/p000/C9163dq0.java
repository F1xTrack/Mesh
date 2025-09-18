package p000;

import java.util.List;

/* renamed from: dq0 */
/* loaded from: classes2.dex */
public final class C9163dq0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ C9547gq0 f26329e;

    /* renamed from: f */
    public final /* synthetic */ boolean f26330f;

    /* renamed from: g */
    public final /* synthetic */ C10753qF0 f26331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9163dq0(C9547gq0 c9547gq0, boolean z, C10753qF0 c10753qF0) {
        super(0);
        this.f26329e = c9547gq0;
        this.f26330f = z;
        this.f26331g = c10753qF0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        List listM25982b0;
        C9547gq0 c9547gq0 = this.f26329e;
        AbstractC7598Fm0 abstractC7598Fm0M18662a = c9547gq0.m18662a((InterfaceC0140CD) c9547gq0.f28057a.f12664e);
        if (abstractC7598Fm0M18662a != null) {
            C1361Vd c1361Vd = c9547gq0.f28057a;
            boolean z = this.f26330f;
            C10753qF0 c10753qF0 = this.f26331g;
            listM25982b0 = z ? AbstractC7167xu.m25982b0(((C7129xI) c1361Vd.f12662c).f45522e.mo47i(abstractC7598Fm0M18662a, c10753qF0)) : AbstractC7167xu.m25982b0(((C7129xI) c1361Vd.f12662c).f45522e.mo42b(abstractC7598Fm0M18662a, c10753qF0));
        } else {
            listM25982b0 = null;
        }
        return listM25982b0 == null ? C0779MN.f7117a : listM25982b0;
    }
}
