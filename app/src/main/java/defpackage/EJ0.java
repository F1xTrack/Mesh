package defpackage;

import ru.mes.dnevnik.MainActivity;

/* loaded from: classes2.dex */
public final class EJ0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ GJ0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EJ0(GJ0 gj0, int i) {
        super(1);
        this.e = i;
        this.f = gj0;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                GJ0 gj0 = this.f;
                MainActivity mainActivity = gj0.f;
                gj0.getReactNativeHost();
                throw null;
            case 1:
                if (obj != null) {
                    throw new ClassCastException();
                }
                MainActivity mainActivity2 = this.f.f;
                throw null;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                MainActivity mainActivity3 = this.f.f;
                throw null;
        }
    }
}
