package defpackage;

import java.util.Date;
import java.util.HashMap;

/* renamed from: nc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6109nc0 implements InterfaceC3762fO {
    public static final C5727lc0 f;
    public static final C5727lc0 g;
    public final HashMap a;
    public final HashMap b;
    public final C5536kc0 c;
    public boolean d;
    public static final C5536kc0 e = new C5536kc0(0);
    public static final C5918mc0 h = new C5918mc0();

    /* JADX WARN: Type inference failed for: r0v1, types: [lc0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lc0] */
    static {
        final int i = 0;
        f = new InterfaceC1368Rh1() { // from class: lc0
            @Override // defpackage.InterfaceC2505cO
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC1446Sh1) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC1446Sh1) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new InterfaceC1368Rh1() { // from class: lc0
            @Override // defpackage.InterfaceC2505cO
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((InterfaceC1446Sh1) obj2).b((String) obj);
                        break;
                    default:
                        ((InterfaceC1446Sh1) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C6109nc0() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    @Override // defpackage.InterfaceC3762fO
    public final InterfaceC3762fO a(Class cls, InterfaceC1802Ww0 interfaceC1802Ww0) {
        this.a.put(cls, interfaceC1802Ww0);
        this.b.remove(cls);
        return this;
    }
}
