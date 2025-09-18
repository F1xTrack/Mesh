package p000;

/* renamed from: i80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9715i80 extends AbstractC11316ue1 {

    /* renamed from: b */
    public final InterfaceC10292me1[] f28833b;

    /* renamed from: c */
    public final AbstractC10804qe1[] f28834c;

    /* renamed from: d */
    public final boolean f28835d;

    public C9715i80(InterfaceC10292me1[] interfaceC10292me1Arr, AbstractC10804qe1[] abstractC10804qe1Arr, boolean z) {
        O90.m5968f(interfaceC10292me1Arr, "parameters");
        O90.m5968f(abstractC10804qe1Arr, "arguments");
        this.f28833b = interfaceC10292me1Arr;
        this.f28834c = abstractC10804qe1Arr;
        this.f28835d = z;
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: b */
    public final boolean mo9252b() {
        return this.f28835d;
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: d */
    public final AbstractC10804qe1 mo7400d(AbstractC7742Ig0 abstractC7742Ig0) {
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        InterfaceC10292me1 interfaceC10292me1 = interfaceC0873NsMo1962a instanceof InterfaceC10292me1 ? (InterfaceC10292me1) interfaceC0873NsMo1962a : null;
        if (interfaceC10292me1 == null) {
            return null;
        }
        int index = interfaceC10292me1.getIndex();
        InterfaceC10292me1[] interfaceC10292me1Arr = this.f28833b;
        if (index >= interfaceC10292me1Arr.length || !O90.m5963a(interfaceC10292me1Arr[index].mo1439v(), interfaceC10292me1.mo1439v())) {
            return null;
        }
        return this.f28834c[index];
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: e */
    public final boolean mo7050e() {
        return this.f28834c.length == 0;
    }
}
