package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: QC */
/* loaded from: classes.dex */
public final class C1020QC extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public Iterator f9531a;

    /* renamed from: b */
    public Object f9532b;

    /* renamed from: c */
    public int f9533c;

    /* renamed from: d */
    public /* synthetic */ Object f9534d;

    /* renamed from: e */
    public final /* synthetic */ List f9535e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f9536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1020QC(List list, ArrayList arrayList, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f9535e = list;
        this.f9536f = arrayList;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C1020QC c1020qc = new C1020QC(this.f9535e, this.f9536f, interfaceC1382Vy);
        c1020qc.f9534d = obj;
        return c1020qc;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1020QC) create(obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f9533c;
        if (i == 0) {
            RQ1.m7017d(obj);
            obj = this.f9534d;
            it = this.f9535e.iterator();
            list = this.f9536f;
        } else if (i == 1) {
            Object obj2 = this.f9532b;
            Iterator it2 = this.f9531a;
            List list2 = (List) this.f9534d;
            RQ1.m7017d(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0957PC(1, null));
                this.f9534d = list2;
                this.f9531a = it2;
                this.f9532b = null;
                this.f9533c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f9531a;
            list = (List) this.f9534d;
            RQ1.m7017d(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f9534d = list;
        this.f9531a = it;
        this.f9532b = obj;
        this.f9533c = 1;
        throw null;
    }
}
