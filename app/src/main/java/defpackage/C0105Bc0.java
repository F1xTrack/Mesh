package defpackage;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: Bc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0105Bc0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105Bc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = jsonSerializableFileDataStoreImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0105Bc0(this.b, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0105Bc0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            this.a = 1;
            if (this.b.clear(this) == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return C1518Tf1.a;
    }
}
