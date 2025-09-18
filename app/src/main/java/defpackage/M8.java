package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class M8 implements InterfaceC3412dY0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ M8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC3412dY0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return HN1.a((Object[]) this.b);
            case 1:
                return ((Iterable) this.b).iterator();
            case 2:
                return new C3445dj0(this);
            case 3:
                return (Iterator) this.b;
            case 4:
                return new C7801wU(this);
            default:
                return new C6563q0(3, (ViewGroup) this.b);
        }
    }
}
