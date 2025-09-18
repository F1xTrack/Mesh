package defpackage;

import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import java.util.Iterator;

/* renamed from: jJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5287jJ extends AbstractC1963Yy {
    public DeviceIdRemoteDataSource a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ DeviceIdRemoteDataSource d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5287jJ(DeviceIdRemoteDataSource deviceIdRemoteDataSource, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = deviceIdRemoteDataSource;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objMo74getDeviceIdIoAF18A = this.d.mo74getDeviceIdIoAF18A(this);
        return objMo74getDeviceIdIoAF18A == EnumC1030Mz.a ? objMo74getDeviceIdIoAF18A : new PS0(objMo74getDeviceIdIoAF18A);
    }
}
