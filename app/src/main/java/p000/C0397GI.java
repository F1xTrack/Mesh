package p000;

import java.util.List;

/* renamed from: GI */
/* loaded from: classes2.dex */
public final class C0397GI extends AbstractC0252E {

    /* renamed from: c */
    public final /* synthetic */ int f3676c = 0;

    /* renamed from: d */
    public final C8426Vk0 f3677d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC0189D f3678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397GI(C11957zh0 c11957zh0) {
        super((C8582Yk0) ((C9773ib0) c11957zh0.f46934j.f38228b).f29338a);
        this.f3678e = c11957zh0;
        C8582Yk0 c8582Yk0 = (C8582Yk0) ((C9773ib0) c11957zh0.f46934j.f38228b).f29338a;
        C11830yh0 c11830yh0 = new C11830yh0(c11957zh0, 0);
        c8582Yk0.getClass();
        this.f3677d = new C8426Vk0(c8582Yk0, c11830yh0);
    }

    @Override // p000.AbstractC0252E, p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final InterfaceC0873Ns mo1962a() {
        switch (this.f3676c) {
            case 0:
                return (C0460HI) this.f3678e;
            default:
                return (C11957zh0) this.f3678e;
        }
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        switch (this.f3676c) {
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
    @Override // p000.AbstractC6337l1
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection mo3024e() {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0397GI.mo3024e():java.util.Collection");
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: g */
    public final C7564Ev0 mo3025g() {
        switch (this.f3676c) {
            case 0:
                return C7564Ev0.f2965h;
            default:
                return (C7564Ev0) ((C9773ib0) ((C11957zh0) this.f3678e).f46934j.f38228b).f29350m;
        }
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        switch (this.f3676c) {
        }
        return (List) this.f3677d.invoke();
    }

    @Override // p000.AbstractC0252E
    /* renamed from: m */
    public final InterfaceC6976us mo1962a() {
        switch (this.f3676c) {
            case 0:
                return (C0460HI) this.f3678e;
            default:
                return (C11957zh0) this.f3678e;
        }
    }

    public final String toString() {
        switch (this.f3676c) {
            case 0:
                String str = ((C0460HI) this.f3678e).getName().f11577a;
                O90.m5967e(str, "toString(...)");
                return str;
            default:
                String strM7801b = ((C11957zh0) this.f3678e).getName().m7801b();
                O90.m5967e(strM7801b, "asString(...)");
                return strM7801b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397GI(C0460HI c0460hi) {
        super(((C7129xI) c0460hi.f4211l.f12662c).f45518a);
        this.f3678e = c0460hi;
        Z41 z41 = ((C7129xI) c0460hi.f4211l.f12662c).f45518a;
        C0334FI c0334fi = new C0334FI(c0460hi, 0);
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        c8582Yk0.getClass();
        this.f3677d = new C8426Vk0(c8582Yk0, c0334fi);
    }
}
