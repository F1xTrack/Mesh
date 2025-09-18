package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function2;

/* renamed from: Ck1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208Ck1 extends NS0 implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208Ck1(View view, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = view;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C0208Ck1 c0208Ck1 = new C0208Ck1(this.d, interfaceC1729Vy);
        c0208Ck1.c = obj;
        return c0208Ck1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0208Ck1) create((C3602eY0) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = EnumC1030Mz.a;
        int i = this.b;
        View view = this.d;
        if (i == 0) {
            RQ1.d(obj);
            C3602eY0 c3602eY0 = (C3602eY0) this.c;
            this.c = c3602eY0;
            this.b = 1;
            c3602eY0.b = view;
            c3602eY0.a = 3;
            c3602eY0.d = this;
            return obj3;
        }
        Object obj4 = C1518Tf1.a;
        if (i == 1) {
            C3602eY0 c3602eY02 = (C3602eY0) this.c;
            RQ1.d(obj);
            if (view instanceof ViewGroup) {
                this.c = null;
                this.b = 2;
                c3602eY02.getClass();
                C8397zc1 c8397zc1 = new C8397zc1(new C6563q0(3, (ViewGroup) view));
                if (c8397zc1.b.hasNext()) {
                    c3602eY02.c = c8397zc1;
                    c3602eY02.a = 2;
                    c3602eY02.d = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return obj4;
    }
}
