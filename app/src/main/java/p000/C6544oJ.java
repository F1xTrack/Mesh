package p000;

import com.p019vk.push.core.deviceid.DeviceIdRepositoryImpl;

/* renamed from: oJ */
/* loaded from: classes2.dex */
public final class C6544oJ extends AbstractC1571Yy {

    /* renamed from: a */
    public DeviceIdRepositoryImpl f38942a;

    /* renamed from: b */
    public Object f38943b;

    /* renamed from: c */
    public /* synthetic */ Object f38944c;

    /* renamed from: d */
    public final /* synthetic */ DeviceIdRepositoryImpl f38945d;

    /* renamed from: e */
    public int f38946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6544oJ(DeviceIdRepositoryImpl deviceIdRepositoryImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f38945d = deviceIdRepositoryImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f38944c = obj;
        this.f38946e |= Integer.MIN_VALUE;
        return DeviceIdRepositoryImpl.access$saveToLocal(this.f38945d, null, this);
    }
}
