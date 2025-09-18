package p000;

import android.net.Uri;
import com.p019vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import kotlin.jvm.functions.Function2;

/* renamed from: lJ */
/* loaded from: classes2.dex */
public final class C6355lJ extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f37000a;

    /* renamed from: b */
    public final /* synthetic */ DeviceIdRemoteDataSource f37001b;

    /* renamed from: c */
    public final /* synthetic */ Uri f37002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6355lJ(DeviceIdRemoteDataSource deviceIdRemoteDataSource, Uri uri, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f37001b = deviceIdRemoteDataSource;
        this.f37002c = uri;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6355lJ(this.f37001b, this.f37002c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6355lJ) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f37000a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C7053w5 c7053w5 = new C7053w5(this.f37001b, 6, this.f37002c);
            this.f37000a = 1;
            obj = AbstractC9366fP1.m18233e(C0591JN.f5499a, new K90(c7053w5, null), this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return obj;
    }
}
