package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class GI extends E {
    public final /* synthetic */ int c = 0;
    public final C1688Vk0 d;
    public final /* synthetic */ D e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GI(C8411zh0 c8411zh0) {
        super((C1922Yk0) ((C4375ib0) c8411zh0.j.b).a);
        this.e = c8411zh0;
        C1922Yk0 c1922Yk0 = (C1922Yk0) ((C4375ib0) c8411zh0.j.b).a;
        C8221yh0 c8221yh0 = new C8221yh0(c8411zh0, 0);
        c1922Yk0.getClass();
        this.d = new C1688Vk0(c1922Yk0, c8221yh0);
    }

    @Override // defpackage.E, defpackage.InterfaceC1200Pd1
    public final InterfaceC1087Ns a() {
        switch (this.c) {
            case 0:
                return (HI) this.e;
            default:
                return (C8411zh0) this.e;
        }
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        switch (this.c) {
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02b0  */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v39 */
    @Override // defpackage.AbstractC5612l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection e() {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GI.e():java.util.Collection");
    }

    @Override // defpackage.AbstractC5612l1
    public final C0396Ev0 g() {
        switch (this.c) {
            case 0:
                return C0396Ev0.h;
            default:
                return (C0396Ev0) ((C4375ib0) ((C8411zh0) this.e).j.b).m;
        }
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        switch (this.c) {
        }
        return (List) this.d.invoke();
    }

    @Override // defpackage.E
    /* renamed from: m */
    public final InterfaceC7492us a() {
        switch (this.c) {
            case 0:
                return (HI) this.e;
            default:
                return (C8411zh0) this.e;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                String str = ((HI) this.e).getName().a;
                O90.e(str, "toString(...)");
                return str;
            default:
                String strB = ((C8411zh0) this.e).getName().b();
                O90.e(strB, "asString(...)");
                return strB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GI(HI hi) {
        super(((C7955xI) hi.l.c).a);
        this.e = hi;
        Z41 z41 = ((C7955xI) hi.l.c).a;
        FI fi = new FI(hi, 0);
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        c1922Yk0.getClass();
        this.d = new C1688Vk0(c1922Yk0, fi);
    }
}
