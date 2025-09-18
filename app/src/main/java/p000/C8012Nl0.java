package p000;

import java.lang.ref.WeakReference;

/* renamed from: Nl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8012Nl0 implements InterfaceC10819qm0 {

    /* renamed from: a */
    public final /* synthetic */ int f7986a;

    /* renamed from: b */
    public final WeakReference f7987b;

    public C8012Nl0(C8064Ol0 c8064Ol0, int i) {
        this.f7986a = i;
        switch (i) {
            case 1:
                this.f7987b = new WeakReference(c8064Ol0);
                break;
            default:
                this.f7987b = new WeakReference(c8064Ol0);
                break;
        }
    }

    @Override // p000.InterfaceC10819qm0
    public final void onResult(Object obj) {
        switch (this.f7986a) {
            case 0:
                Throwable th = (Throwable) obj;
                C8064Ol0 c8064Ol0 = (C8064Ol0) this.f7987b.get();
                if (c8064Ol0 != null) {
                    int i = c8064Ol0.f8600g;
                    if (i != 0) {
                        c8064Ol0.setImageResource(i);
                    }
                    InterfaceC10819qm0 interfaceC10819qm0 = c8064Ol0.f8599f;
                    if (interfaceC10819qm0 == null) {
                        interfaceC10819qm0 = C8064Ol0.f8596q;
                    }
                    interfaceC10819qm0.onResult(th);
                    break;
                }
                break;
            default:
                C8532Xl0 c8532Xl0 = (C8532Xl0) obj;
                C8064Ol0 c8064Ol02 = (C8064Ol0) this.f7987b.get();
                if (c8064Ol02 != null) {
                    c8064Ol02.setComposition(c8532Xl0);
                    break;
                }
                break;
        }
    }
}
