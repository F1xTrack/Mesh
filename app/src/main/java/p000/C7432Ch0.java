package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: Ch0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7432Ch0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f1575e;

    /* renamed from: f */
    public final /* synthetic */ C7484Dh0 f1576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7432Ch0(C7484Dh0 c7484Dh0, int i) {
        super(0);
        this.f1575e = i;
        this.f1576f = c7484Dh0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f1575e) {
            case 0:
                Collection collectionM18512b = this.f1576f.f2159o.m18512b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionM18512b) {
                    if (((C10261mP0) obj).f37670a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(arrayList));
                if (iM24983b < 16) {
                    iM24983b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((C10261mP0) next).m23388c(), next);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = this.f1576f.f2159o.f27782a.getDeclaredClasses();
                O90.m5967e(declaredClasses, "getDeclaredClasses(...)");
                return AbstractC7167xu.m25987g0(AbstractC9639hY0.m18835n(AbstractC9639hY0.m18834m(new C7141xU(AbstractC0576J8.m4177d(declaredClasses), false, C9393fd0.f27276F), C9393fd0.f27277G)));
            default:
                C7484Dh0 c7484Dh0 = this.f1576f;
                return AbstractC11433vZ0.m25452c(c7484Dh0.mo6677b(), c7484Dh0.mo6678f());
        }
    }
}
