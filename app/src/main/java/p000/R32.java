package p000;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class R32 extends AbstractC9694hz1 {

    /* renamed from: c */
    public final C10226m71 f9989c;

    /* renamed from: d */
    public final HashMap f9990d;

    public R32(C10226m71 c10226m71) {
        super("require");
        this.f9990d = new HashMap();
        this.f9989c = c10226m71;
    }

    @Override // p000.AbstractC9694hz1
    /* renamed from: a */
    public final InterfaceC7885Kz1 mo6842a(C10919rY0 c10919rY0, List list) {
        InterfaceC7885Kz1 interfaceC7885Kz1;
        AbstractC10983s22.m24590l(1, "require", list);
        String strZzf = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(0)).zzf();
        HashMap map = this.f9990d;
        if (map.containsKey(strZzf)) {
            return (InterfaceC7885Kz1) map.get(strZzf);
        }
        HashMap map2 = (HashMap) this.f9989c.f37493b;
        if (map2.containsKey(strZzf)) {
            try {
                interfaceC7885Kz1 = (InterfaceC7885Kz1) ((Callable) map2.get(strZzf)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(AbstractC7222ym.m26245v("Failed to create API implementation: ", strZzf));
            }
        } else {
            interfaceC7885Kz1 = InterfaceC7885Kz1.f6417i1;
        }
        if (interfaceC7885Kz1 instanceof AbstractC9694hz1) {
            map.put(strZzf, (AbstractC9694hz1) interfaceC7885Kz1);
        }
        return interfaceC7885Kz1;
    }
}
