package p000;

import com.p019vk.push.core.deviceid.storage.DeviceIdFileDataSource;

/* renamed from: hJ */
/* loaded from: classes2.dex */
public final class C4171hJ extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f28372a;

    /* renamed from: b */
    public final /* synthetic */ DeviceIdFileDataSource f28373b;

    /* renamed from: c */
    public int f28374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4171hJ(DeviceIdFileDataSource deviceIdFileDataSource, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f28373b = deviceIdFileDataSource;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f28372a = obj;
        this.f28374c |= Integer.MIN_VALUE;
        Object objMo26668getDeviceIdIoAF18A = this.f28373b.mo26668getDeviceIdIoAF18A(this);
        return objMo26668getDeviceIdIoAF18A == EnumC0817Mz.f7418a ? objMo26668getDeviceIdIoAF18A : new PS0(objMo26668getDeviceIdIoAF18A);
    }
}
