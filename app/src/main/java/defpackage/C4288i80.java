package defpackage;

/* renamed from: i80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4288i80 extends AbstractC7452ue1 {
    public final InterfaceC5925me1[] b;
    public final AbstractC6689qe1[] c;
    public final boolean d;

    public C4288i80(InterfaceC5925me1[] interfaceC5925me1Arr, AbstractC6689qe1[] abstractC6689qe1Arr, boolean z) {
        O90.f(interfaceC5925me1Arr, "parameters");
        O90.f(abstractC6689qe1Arr, "arguments");
        this.b = interfaceC5925me1Arr;
        this.c = abstractC6689qe1Arr;
        this.d = z;
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.AbstractC7452ue1
    public final AbstractC6689qe1 d(AbstractC0663Ig0 abstractC0663Ig0) {
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        InterfaceC5925me1 interfaceC5925me1 = interfaceC1087NsA instanceof InterfaceC5925me1 ? (InterfaceC5925me1) interfaceC1087NsA : null;
        if (interfaceC5925me1 == null) {
            return null;
        }
        int index = interfaceC5925me1.getIndex();
        InterfaceC5925me1[] interfaceC5925me1Arr = this.b;
        if (index >= interfaceC5925me1Arr.length || !O90.a(interfaceC5925me1Arr[index].v(), interfaceC5925me1.v())) {
            return null;
        }
        return this.c[index];
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean e() {
        return this.c.length == 0;
    }
}
