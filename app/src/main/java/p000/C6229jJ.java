package p000;

import com.p019vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import java.util.Iterator;

/* renamed from: jJ */
/* loaded from: classes2.dex */
public final class C6229jJ extends AbstractC1571Yy {

    /* renamed from: a */
    public DeviceIdRemoteDataSource f35051a;

    /* renamed from: b */
    public Iterator f35052b;

    /* renamed from: c */
    public /* synthetic */ Object f35053c;

    /* renamed from: d */
    public final /* synthetic */ DeviceIdRemoteDataSource f35054d;

    /* renamed from: e */
    public int f35055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6229jJ(DeviceIdRemoteDataSource deviceIdRemoteDataSource, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f35054d = deviceIdRemoteDataSource;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f35053c = obj;
        this.f35055e |= Integer.MIN_VALUE;
        Object objMo26668getDeviceIdIoAF18A = this.f35054d.mo26668getDeviceIdIoAF18A(this);
        return objMo26668getDeviceIdIoAF18A == EnumC0817Mz.f7418a ? objMo26668getDeviceIdIoAF18A : new PS0(objMo26668getDeviceIdIoAF18A);
    }
}
