package p000;

import java.util.Date;
import java.util.HashMap;

/* renamed from: nc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10415nc0 implements InterfaceC4050fO {

    /* renamed from: f */
    public static final C10159lc0 f38403f;

    /* renamed from: g */
    public static final C10159lc0 f38404g;

    /* renamed from: a */
    public final HashMap f38406a;

    /* renamed from: b */
    public final HashMap f38407b;

    /* renamed from: c */
    public final C10031kc0 f38408c;

    /* renamed from: d */
    public boolean f38409d;

    /* renamed from: e */
    public static final C10031kc0 f38402e = new C10031kc0(0);

    /* renamed from: h */
    public static final C10287mc0 f38405h = new C10287mc0();

    /* JADX WARN: Type inference failed for: r0v1, types: [lc0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [lc0] */
    static {
        final int i = 0;
        f38403f = new InterfaceC8213Rh1() { // from class: lc0
            @Override // p000.InterfaceC1844cO
            /* renamed from: a */
            public final void mo104a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC8265Sh1) obj2).mo4360b((String) obj);
                        break;
                    default:
                        ((InterfaceC8265Sh1) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f38404g = new InterfaceC8213Rh1() { // from class: lc0
            @Override // p000.InterfaceC1844cO
            /* renamed from: a */
            public final void mo104a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((InterfaceC8265Sh1) obj2).mo4360b((String) obj);
                        break;
                    default:
                        ((InterfaceC8265Sh1) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C10415nc0() {
        HashMap map = new HashMap();
        this.f38406a = map;
        HashMap map2 = new HashMap();
        this.f38407b = map2;
        this.f38408c = f38402e;
        this.f38409d = false;
        map2.put(String.class, f38403f);
        map.remove(String.class);
        map2.put(Boolean.class, f38404g);
        map.remove(Boolean.class);
        map2.put(Date.class, f38405h);
        map.remove(Date.class);
    }

    @Override // p000.InterfaceC4050fO
    /* renamed from: a */
    public final InterfaceC4050fO mo884a(Class cls, InterfaceC8502Ww0 interfaceC8502Ww0) {
        this.f38406a.put(cls, interfaceC8502Ww0);
        this.f38407b.remove(cls);
        return this;
    }
}
