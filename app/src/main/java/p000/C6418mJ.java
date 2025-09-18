package p000;

import com.p019vk.push.core.deviceid.DeviceIdRepositoryImpl;

/* renamed from: mJ */
/* loaded from: classes2.dex */
public final class C6418mJ extends AbstractC1571Yy {

    /* renamed from: a */
    public String f37622a;

    /* renamed from: b */
    public /* synthetic */ Object f37623b;

    /* renamed from: c */
    public final /* synthetic */ DeviceIdRepositoryImpl f37624c;

    /* renamed from: d */
    public int f37625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6418mJ(DeviceIdRepositoryImpl deviceIdRepositoryImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f37624c = deviceIdRepositoryImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f37623b = obj;
        this.f37625d |= Integer.MIN_VALUE;
        return DeviceIdRepositoryImpl.access$generateDeviceId(this.f37624c, this);
    }
}
