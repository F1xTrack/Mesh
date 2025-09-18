package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class QC extends AbstractC4286i71 implements Function2 {
    public Iterator a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QC(List list, ArrayList arrayList, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.e = list;
        this.f = arrayList;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        QC qc = new QC(this.e, this.f, interfaceC1729Vy);
        qc.d = obj;
        return qc;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QC) create(obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.c;
        if (i == 0) {
            RQ1.d(obj);
            obj = this.d;
            it = this.e.iterator();
            list = this.f;
        } else if (i == 1) {
            Object obj2 = this.b;
            Iterator it2 = this.a;
            List list2 = (List) this.d;
            RQ1.d(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new PC(1, null));
                this.d = list2;
                this.a = it2;
                this.b = null;
                this.c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.a;
            list = (List) this.d;
            RQ1.d(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.d = list;
        this.a = it;
        this.b = obj;
        this.c = 1;
        throw null;
    }
}
