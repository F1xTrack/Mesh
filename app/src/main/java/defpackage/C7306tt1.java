package defpackage;

/* renamed from: tt1 */
/* loaded from: classes.dex */
public final class C7306tt1 {
    public final TJ b;
    public final Object d;
    public final /* synthetic */ int a = 0;
    public final Object c = new Object();

    public C7306tt1(TJ tj, InterfaceC1025Mx0 interfaceC1025Mx0) {
        this.d = interfaceC1025Mx0;
        this.b = tj;
    }

    public final void a(C1797Wu1 c1797Wu1) {
        switch (this.a) {
            case 0:
                this.b.execute(new WZ(this, c1797Wu1, false, 20));
                break;
            case 1:
                if (!c1797Wu1.g()) {
                    this.b.execute(new XZ(this, c1797Wu1, false, 24));
                    break;
                }
                break;
            default:
                if (c1797Wu1.g()) {
                    this.b.execute(new WZ(this, c1797Wu1, false, 21));
                    break;
                }
                break;
        }
    }

    public C7306tt1(TJ tj, InterfaceC1415Rx0 interfaceC1415Rx0) {
        this.d = interfaceC1415Rx0;
        this.b = tj;
    }

    public C7306tt1(TJ tj, InterfaceC3299cy0 interfaceC3299cy0) {
        this.d = interfaceC3299cy0;
        this.b = tj;
    }
}
