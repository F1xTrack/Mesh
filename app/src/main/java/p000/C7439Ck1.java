package p000;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function2;

/* renamed from: Ck1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7439Ck1 extends NS0 implements Function2 {

    /* renamed from: b */
    public int f1603b;

    /* renamed from: c */
    public /* synthetic */ Object f1604c;

    /* renamed from: d */
    public final /* synthetic */ View f1605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7439Ck1(View view, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f1605d = view;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C7439Ck1 c7439Ck1 = new C7439Ck1(this.f1605d, interfaceC1382Vy);
        c7439Ck1.f1604c = obj;
        return c7439Ck1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7439Ck1) create((C9255eY0) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = EnumC0817Mz.f7418a;
        int i = this.f1603b;
        View view = this.f1605d;
        if (i == 0) {
            RQ1.m7017d(obj);
            C9255eY0 c9255eY0 = (C9255eY0) this.f1604c;
            this.f1604c = c9255eY0;
            this.f1603b = 1;
            c9255eY0.f26745b = view;
            c9255eY0.f26744a = 3;
            c9255eY0.f26747d = this;
            return obj3;
        }
        Object obj4 = C8313Tf1.f11463a;
        if (i == 1) {
            C9255eY0 c9255eY02 = (C9255eY0) this.f1604c;
            RQ1.m7017d(obj);
            if (view instanceof ViewGroup) {
                this.f1604c = null;
                this.f1603b = 2;
                c9255eY02.getClass();
                C11948zc1 c11948zc1 = new C11948zc1(new C6653q0(3, (ViewGroup) view));
                if (c11948zc1.f46897b.hasNext()) {
                    c9255eY02.f26746c = c11948zc1;
                    c9255eY02.f26744a = 2;
                    c9255eY02.f26747d = this;
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
            RQ1.m7017d(obj);
        }
        return obj4;
    }
}
