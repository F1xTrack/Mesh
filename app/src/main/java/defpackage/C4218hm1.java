package defpackage;

import android.database.MatrixCursor;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher;
import kotlin.jvm.functions.Function2;

/* renamed from: hm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4218hm1 extends AbstractC4286i71 implements Function2 {
    public MatrixCursor.RowBuilder a;
    public String b;
    public int c;
    public final /* synthetic */ MatrixCursor d;
    public final /* synthetic */ DeviceIdRepository e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4218hm1(MatrixCursor matrixCursor, DeviceIdRepository deviceIdRepository, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.d = matrixCursor;
        this.e = deviceIdRepository;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C4218hm1(this.d, this.e, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4218hm1) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        MatrixCursor.RowBuilder rowBuilderNewRow;
        String str;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.c;
        if (i == 0) {
            RQ1.d(obj);
            rowBuilderNewRow = this.d.newRow();
            String virtualColumnName = DeviceIdUriMatcher.INSTANCE.getVirtualColumnName();
            this.a = rowBuilderNewRow;
            this.b = virtualColumnName;
            this.c = 1;
            Object deviceId = this.e.getDeviceId(this);
            if (deviceId == enumC1030Mz) {
                return enumC1030Mz;
            }
            str = virtualColumnName;
            obj = deviceId;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.b;
            rowBuilderNewRow = this.a;
            RQ1.d(obj);
        }
        return rowBuilderNewRow.add(str, obj);
    }
}
