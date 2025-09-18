package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class R32 extends AbstractC4257hz1 {
    public final C5826m71 c;
    public final HashMap d;

    public R32(C5826m71 c5826m71) {
        super("require");
        this.d = new HashMap();
        this.c = c5826m71;
    }

    @Override // defpackage.AbstractC4257hz1
    public final InterfaceC0877Kz1 a(C6860rY0 c6860rY0, List list) {
        InterfaceC0877Kz1 interfaceC0877Kz1;
        AbstractC6955s22.l(1, "require", list);
        String strZzf = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(0)).zzf();
        HashMap map = this.d;
        if (map.containsKey(strZzf)) {
            return (InterfaceC0877Kz1) map.get(strZzf);
        }
        HashMap map2 = (HashMap) this.c.b;
        if (map2.containsKey(strZzf)) {
            try {
                interfaceC0877Kz1 = (InterfaceC0877Kz1) ((Callable) map2.get(strZzf)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(AbstractC8235ym.v("Failed to create API implementation: ", strZzf));
            }
        } else {
            interfaceC0877Kz1 = InterfaceC0877Kz1.i1;
        }
        if (interfaceC0877Kz1 instanceof AbstractC4257hz1) {
            map.put(strZzf, (AbstractC4257hz1) interfaceC0877Kz1);
        }
        return interfaceC0877Kz1;
    }
}
