package p000;

import com.p019vk.push.core.deviceid.contentprovider.C2418xfbc11c84;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fU */
/* loaded from: classes2.dex */
public final class C4056fU implements InterfaceC9127dY0 {

    /* renamed from: a */
    public final /* synthetic */ int f27214a = 0;

    /* renamed from: b */
    public final Object f27215b;

    /* renamed from: c */
    public final Object f27216c;

    public C4056fU(File file) {
        EnumC6303kU enumC6303kU = EnumC6303kU.f36507a;
        O90.m5968f(file, "start");
        this.f27215b = file;
        this.f27216c = enumC6303kU;
    }

    @Override // p000.InterfaceC9127dY0
    public final Iterator iterator() {
        switch (this.f27214a) {
            case 0:
                return new C3931dU(this);
            case 1:
                return new C00(this);
            default:
                C7141xU c7141xU = (C7141xU) this.f27215b;
                ArrayList arrayList = new ArrayList();
                Iterator it = c7141xU.iterator();
                while (true) {
                    C7078wU c7078wU = (C7078wU) it;
                    if (!c7078wU.hasNext()) {
                        AbstractC0183Cu.m1455l(arrayList, (C2418xfbc11c84) this.f27216c);
                        return arrayList.iterator();
                    }
                    arrayList.add(c7078wU.next());
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4056fU(InterfaceC6434mZ interfaceC6434mZ, InterfaceC6497nZ interfaceC6497nZ) {
        this.f27215b = (AbstractC8418Vg0) interfaceC6434mZ;
        this.f27216c = interfaceC6497nZ;
    }

    public C4056fU(C7141xU c7141xU, C2418xfbc11c84 c2418xfbc11c84) {
        this.f27215b = c7141xU;
        this.f27216c = c2418xfbc11c84;
    }
}
