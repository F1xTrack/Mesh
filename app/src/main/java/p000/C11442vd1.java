package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;

/* renamed from: vd1 */
/* loaded from: classes2.dex */
public final class C11442vd1 extends AbstractC10930rd1 {

    /* renamed from: a */
    public final /* synthetic */ int f44457a;

    /* renamed from: b */
    public final Object f44458b;

    /* renamed from: c */
    public final Object f44459c;

    /* renamed from: d */
    public final Object f44460d;

    public C11442vd1(C1753aw c1753aw, AbstractC10930rd1 abstractC10930rd1, Type type) {
        this.f44457a = 0;
        this.f44458b = c1753aw;
        this.f44459c = abstractC10930rd1;
        this.f44460d = type;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) {
        switch (this.f44457a) {
            case 0:
                return ((AbstractC10930rd1) this.f44459c).mo480a(c11820yc0);
            default:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                String strM26190n0 = c11820yc0.m26190n0();
                Enum r0 = (Enum) ((HashMap) this.f44458b).get(strM26190n0);
                return r0 == null ? (Enum) ((HashMap) this.f44459c).get(strM26190n0) : r0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0063  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo481b(p000.C7838Kc0 r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f44457a
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
            java.lang.Object r0 = r4.f44460d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.m4686d0(r6)
            return
        L19:
            java.lang.Object r0 = r4.f44460d
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
            java.lang.Object r2 = r4.f44459c
            rd1 r2 = (p000.AbstractC10930rd1) r2
            if (r1 == r0) goto L64
            xe1 r0 = new xe1
            r0.<init>(r1)
            java.lang.Object r1 = r4.f44458b
            aw r1 = (p000.C1753aw) r1
            rd1 r0 = r1.m10388g(r0)
            boolean r1 = r0 instanceof p000.UP0
            if (r1 != 0) goto L45
            goto L63
        L45:
            r1 = r2
        L46:
            boolean r3 = r1 instanceof p000.C8928c20
            if (r3 == 0) goto L5e
            r3 = r1
            c20 r3 = (p000.C8928c20) r3
            rd1 r3 = r3.f17264a
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
            boolean r1 = r1 instanceof p000.UP0
            if (r1 != 0) goto L63
            goto L64
        L63:
            r2 = r0
        L64:
            r2.mo481b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11442vd1.mo481b(Kc0, java.lang.Object):void");
    }

    public C11442vd1(Class cls) {
        this.f44457a = 1;
        this.f44458b = new HashMap();
        this.f44459c = new HashMap();
        this.f44460d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C7373Bd1(0, cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC10407nY0 interfaceC10407nY0 = (InterfaceC10407nY0) field.getAnnotation(InterfaceC10407nY0.class);
                if (interfaceC10407nY0 != null) {
                    strName = interfaceC10407nY0.value();
                    for (String str : interfaceC10407nY0.alternate()) {
                        ((HashMap) this.f44458b).put(str, r4);
                    }
                }
                ((HashMap) this.f44458b).put(strName, r4);
                ((HashMap) this.f44459c).put(string, r4);
                ((HashMap) this.f44460d).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
