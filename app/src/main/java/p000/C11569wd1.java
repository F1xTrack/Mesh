package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;

/* renamed from: wd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11569wd1 extends AbstractC11058sd1 {

    /* renamed from: a */
    public final /* synthetic */ int f45004a;

    /* renamed from: b */
    public final Object f45005b;

    /* renamed from: c */
    public final Object f45006c;

    /* renamed from: d */
    public final Object f45007d;

    public C11569wd1(C9189e20 c9189e20, AbstractC11058sd1 abstractC11058sd1, Type type) {
        this.f45004a = 0;
        this.f45005b = c9189e20;
        this.f45006c = abstractC11058sd1;
        this.f45007d = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo246a(p000.C7890Lc0 r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f45004a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto Lb
            r6 = 0
            goto L15
        Lb:
            java.lang.Object r0 = r4.f45007d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.m5040d0(r6)
            return
        L19:
            java.lang.Object r0 = r4.f45007d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L2c
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L2c
        L27:
            java.lang.Class r1 = r6.getClass()
            goto L2d
        L2c:
            r1 = r0
        L2d:
            java.lang.Object r2 = r4.f45006c
            sd1 r2 = (p000.AbstractC11058sd1) r2
            if (r1 == r0) goto L64
            ye1 r0 = new ye1
            r0.<init>(r1)
            java.lang.Object r1 = r4.f45005b
            e20 r1 = (p000.C9189e20) r1
            sd1 r0 = r1.m17821b(r0)
            boolean r1 = r0 instanceof p000.VP0
            if (r1 != 0) goto L45
            goto L63
        L45:
            r1 = r2
        L46:
            boolean r3 = r1 instanceof p000.C9061d20
            if (r3 == 0) goto L5e
            r3 = r1
            d20 r3 = (p000.C9061d20) r3
            sd1 r3 = r3.f25768a
            if (r3 == 0) goto L56
            if (r3 != r1) goto L54
            goto L5e
        L54:
            r1 = r3
            goto L46
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            r5.<init>(r6)
            throw r5
        L5e:
            boolean r1 = r1 instanceof p000.VP0
            if (r1 != 0) goto L63
            goto L64
        L63:
            r2 = r0
        L64:
            r2.mo246a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11569wd1.mo246a(Lc0, java.lang.Object):void");
    }

    public C11569wd1(Class cls) {
        this.f45004a = 1;
        this.f45005b = new HashMap();
        this.f45006c = new HashMap();
        this.f45007d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C7373Bd1(1, cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC10535oY0 interfaceC10535oY0 = (InterfaceC10535oY0) field.getAnnotation(InterfaceC10535oY0.class);
                if (interfaceC10535oY0 != null) {
                    strName = interfaceC10535oY0.value();
                    for (String str : interfaceC10535oY0.alternate()) {
                        ((HashMap) this.f45005b).put(str, r4);
                    }
                }
                ((HashMap) this.f45005b).put(strName, r4);
                ((HashMap) this.f45006c).put(string, r4);
                ((HashMap) this.f45007d).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
