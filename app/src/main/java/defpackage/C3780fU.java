package defpackage;

import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3780fU implements InterfaceC3412dY0 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public C3780fU(File file) {
        EnumC5511kU enumC5511kU = EnumC5511kU.a;
        O90.f(file, "start");
        this.b = file;
        this.c = enumC5511kU;
    }

    @Override // defpackage.InterfaceC3412dY0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C3399dU(this);
            case 1:
                return new C00(this);
            default:
                C7991xU c7991xU = (C7991xU) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = c7991xU.iterator();
                while (true) {
                    C7801wU c7801wU = (C7801wU) it;
                    if (!c7801wU.hasNext()) {
                        AbstractC0236Cu.l(arrayList, (DeviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1) this.c);
                        return arrayList.iterator();
                    }
                    arrayList.add(c7801wU.next());
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3780fU(InterfaceC5908mZ interfaceC5908mZ, InterfaceC6099nZ interfaceC6099nZ) {
        this.b = (AbstractC1676Vg0) interfaceC5908mZ;
        this.c = interfaceC6099nZ;
    }

    public C3780fU(C7991xU c7991xU, DeviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1 deviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1) {
        this.b = c7991xU;
        this.c = deviceIdRemoteDataSource$getDeviceId_IoAF18A$lambda$2$$inlined$sortedBy$1;
    }
}
