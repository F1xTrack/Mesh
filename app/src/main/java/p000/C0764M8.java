package p000;

import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: M8 */
/* loaded from: classes2.dex */
public final class C0764M8 implements InterfaceC9127dY0 {

    /* renamed from: a */
    public final /* synthetic */ int f6998a;

    /* renamed from: b */
    public final Object f6999b;

    public /* synthetic */ C0764M8(int i, Object obj) {
        this.f6998a = i;
        this.f6999b = obj;
    }

    @Override // p000.InterfaceC9127dY0
    public final Iterator iterator() {
        switch (this.f6998a) {
            case 0:
                return HN1.m3386a((Object[]) this.f6999b);
            case 1:
                return ((Iterable) this.f6999b).iterator();
            case 2:
                return new C9149dj0(this);
            case 3:
                return (Iterator) this.f6999b;
            case 4:
                return new C7078wU(this);
            default:
                return new C6653q0(3, (ViewGroup) this.f6999b);
        }
    }
}
