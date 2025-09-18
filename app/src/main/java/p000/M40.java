package p000;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class M40 implements InterfaceC10775qQ0 {

    /* renamed from: a */
    public final InterfaceC10775qQ0 f6983a;

    /* renamed from: b */
    public final F71 f6984b = AbstractC0705LB.m4915b(C1225TT.f11381q);

    public M40(InterfaceC10775qQ0 interfaceC10775qQ0) {
        this.f6983a = interfaceC10775qQ0;
    }

    @Override // p000.InterfaceC10775qQ0
    /* renamed from: a */
    public final void mo1679a(C11415vQ0 c11415vQ0) {
        ((Handler) this.f6984b.getValue()).post(new RunnableC1096RQ(this, 8, c11415vQ0));
    }

    @Override // p000.InterfaceC10775qQ0
    /* renamed from: b */
    public final void mo1680b() {
        ((Handler) this.f6984b.getValue()).post(new L40(this, 1));
    }

    @Override // p000.InterfaceC10775qQ0
    /* renamed from: c */
    public final void mo1681c() {
        ((Handler) this.f6984b.getValue()).post(new L40(this, 2));
    }

    @Override // p000.InterfaceC10775qQ0
    /* renamed from: d */
    public final void mo1682d() {
        ((Handler) this.f6984b.getValue()).post(new L40(this, 0));
    }
}
