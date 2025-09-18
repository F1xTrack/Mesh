package p000;

import android.database.MatrixCursor;
import com.p019vk.push.core.DeviceIdRepository;
import com.p019vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher;
import kotlin.jvm.functions.Function2;

/* renamed from: hm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9668hm1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public MatrixCursor.RowBuilder f28574a;

    /* renamed from: b */
    public String f28575b;

    /* renamed from: c */
    public int f28576c;

    /* renamed from: d */
    public final /* synthetic */ MatrixCursor f28577d;

    /* renamed from: e */
    public final /* synthetic */ DeviceIdRepository f28578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9668hm1(MatrixCursor matrixCursor, DeviceIdRepository deviceIdRepository, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f28577d = matrixCursor;
        this.f28578e = deviceIdRepository;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C9668hm1(this.f28577d, this.f28578e, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9668hm1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        MatrixCursor.RowBuilder rowBuilderNewRow;
        String str;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f28576c;
        if (i == 0) {
            RQ1.m7017d(obj);
            rowBuilderNewRow = this.f28577d.newRow();
            String virtualColumnName = DeviceIdUriMatcher.INSTANCE.getVirtualColumnName();
            this.f28574a = rowBuilderNewRow;
            this.f28575b = virtualColumnName;
            this.f28576c = 1;
            Object deviceId = this.f28578e.getDeviceId(this);
            if (deviceId == enumC0817Mz) {
                return enumC0817Mz;
            }
            str = virtualColumnName;
            obj = deviceId;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f28575b;
            rowBuilderNewRow = this.f28574a;
            RQ1.m7017d(obj);
        }
        return rowBuilderNewRow.add(str, obj);
    }
}
