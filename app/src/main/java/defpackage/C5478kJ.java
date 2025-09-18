package defpackage;

import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;

/* renamed from: kJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5478kJ extends AbstractC1963Yy {
    public DeviceIdRemoteDataSource a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DeviceIdRemoteDataSource c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5478kJ(DeviceIdRemoteDataSource deviceIdRemoteDataSource, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = deviceIdRemoteDataSource;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
