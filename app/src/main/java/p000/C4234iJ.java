package p000;

import com.p019vk.push.core.deviceid.storage.DeviceIdFileDataSource;

/* renamed from: iJ */
/* loaded from: classes2.dex */
public final class C4234iJ extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f29068a;

    /* renamed from: b */
    public final /* synthetic */ DeviceIdFileDataSource f29069b;

    /* renamed from: c */
    public int f29070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4234iJ(DeviceIdFileDataSource deviceIdFileDataSource, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f29069b = deviceIdFileDataSource;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f29068a = obj;
        this.f29070c |= Integer.MIN_VALUE;
        Object objMo26667setDeviceIdgIAlus = this.f29069b.mo26667setDeviceIdgIAlus(null, this);
        return objMo26667setDeviceIdgIAlus == EnumC0817Mz.f7418a ? objMo26667setDeviceIdgIAlus : new PS0(objMo26667setDeviceIdgIAlus);
    }
}
