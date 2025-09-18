package defpackage;

import com.vk.push.core.deviceid.storage.DeviceIdFileDataSource;

/* renamed from: hJ */
/* loaded from: classes2.dex */
public final class C4129hJ extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ DeviceIdFileDataSource b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4129hJ(DeviceIdFileDataSource deviceIdFileDataSource, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = deviceIdFileDataSource;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objMo74getDeviceIdIoAF18A = this.b.mo74getDeviceIdIoAF18A(this);
        return objMo74getDeviceIdIoAF18A == EnumC1030Mz.a ? objMo74getDeviceIdIoAF18A : new PS0(objMo74getDeviceIdIoAF18A);
    }
}
