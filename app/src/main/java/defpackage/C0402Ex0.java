package defpackage;

import androidx.activity.a;
import java.util.ListIterator;

/* renamed from: Ex0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402Ex0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0402Ex0(a aVar, int i) {
        super(1);
        this.e = i;
        this.f = aVar;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.e) {
            case 0:
                O90.f((C7262tf) obj, "backEvent");
                a aVar = this.f;
                C6018n8 c6018n8 = aVar.b;
                ListIterator listIterator = c6018n8.listIterator(c6018n8.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((MB) objPrevious).a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                MB mb = (MB) objPrevious;
                if (aVar.c != null) {
                    aVar.b();
                }
                aVar.c = mb;
                break;
            default:
                O90.f((C7262tf) obj, "backEvent");
                a aVar2 = this.f;
                if (aVar2.c == null) {
                    C6018n8 c6018n82 = aVar2.b;
                    ListIterator listIterator2 = c6018n82.listIterator(c6018n82.b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((MB) objPrevious2).a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                }
                break;
        }
        return C1518Tf1.a;
    }
}
