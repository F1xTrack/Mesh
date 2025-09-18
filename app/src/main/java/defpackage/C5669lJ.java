package defpackage;

import android.net.Uri;
import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import kotlin.jvm.functions.Function2;

/* renamed from: lJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5669lJ extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ DeviceIdRemoteDataSource b;
    public final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5669lJ(DeviceIdRemoteDataSource deviceIdRemoteDataSource, Uri uri, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = deviceIdRemoteDataSource;
        this.c = uri;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C5669lJ(this.b, this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5669lJ) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            C7726w5 c7726w5 = new C7726w5(this.b, 6, this.c);
            this.a = 1;
            obj = AbstractC3767fP1.e(JN.a, new K90(c7726w5, null), this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return obj;
    }
}
