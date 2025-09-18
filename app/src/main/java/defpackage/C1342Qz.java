package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.jvm.functions.Function2;

/* renamed from: Qz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342Qz extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ CoroutineWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342Qz(CoroutineWorker coroutineWorker, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = coroutineWorker;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C1342Qz(this.b, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1342Qz) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        CoroutineWorker coroutineWorker = this.b;
        try {
            if (i == 0) {
                RQ1.d(obj);
                this.a = 1;
                obj = coroutineWorker.a(this);
                if (obj == enumC1030Mz) {
                    return enumC1030Mz;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.d(obj);
            }
            coroutineWorker.b.j((AbstractC1061Nj0) obj);
        } catch (Throwable th) {
            coroutineWorker.b.k(th);
        }
        return C1518Tf1.a;
    }
}
