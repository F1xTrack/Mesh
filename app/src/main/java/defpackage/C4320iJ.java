package defpackage;

import com.vk.push.core.deviceid.storage.DeviceIdFileDataSource;

/* renamed from: iJ */
/* loaded from: classes2.dex */
public final class C4320iJ extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ DeviceIdFileDataSource b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4320iJ(DeviceIdFileDataSource deviceIdFileDataSource, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = deviceIdFileDataSource;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objMo73setDeviceIdgIAlus = this.b.mo73setDeviceIdgIAlus(null, this);
        return objMo73setDeviceIdgIAlus == EnumC1030Mz.a ? objMo73setDeviceIdgIAlus : new PS0(objMo73setDeviceIdgIAlus);
    }
}
