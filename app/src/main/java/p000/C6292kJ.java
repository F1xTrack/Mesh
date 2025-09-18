package p000;

import com.p019vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;

/* renamed from: kJ */
/* loaded from: classes2.dex */
public final class C6292kJ extends AbstractC1571Yy {

    /* renamed from: a */
    public DeviceIdRemoteDataSource f36417a;

    /* renamed from: b */
    public /* synthetic */ Object f36418b;

    /* renamed from: c */
    public final /* synthetic */ DeviceIdRemoteDataSource f36419c;

    /* renamed from: d */
    public int f36420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6292kJ(DeviceIdRemoteDataSource deviceIdRemoteDataSource, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f36419c = deviceIdRemoteDataSource;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f36418b = obj;
        this.f36420d |= Integer.MIN_VALUE;
        return this.f36419c.m13738a(null, this);
    }
}
