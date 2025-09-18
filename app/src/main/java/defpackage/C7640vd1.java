package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;

/* renamed from: vd1 */
/* loaded from: classes2.dex */
public final class C7640vd1 extends AbstractC6876rd1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public C7640vd1(C2226aw c2226aw, AbstractC6876rd1 abstractC6876rd1, Type type) {
        this.a = 0;
        this.b = c2226aw;
        this.c = abstractC6876rd1;
        this.d = type;
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) {
        switch (this.a) {
            case 0:
                return ((AbstractC6876rd1) this.c).a(c8206yc0);
            default:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                String strN0 = c8206yc0.n0();
                Enum r0 = (Enum) ((HashMap) this.b).get(strN0);
                return r0 == null ? (Enum) ((HashMap) this.c).get(strN0) : r0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0063  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // defpackage.AbstractC6876rd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C0807Kc0 r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.a
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
            java.lang.Object r0 = r4.d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.d0(r6)
            return
        L19:
            java.lang.Object r0 = r4.d
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
            java.lang.Object r2 = r4.c
            rd1 r2 = (defpackage.AbstractC6876rd1) r2
            if (r1 == r0) goto L64
            xe1 r0 = new xe1
            r0.<init>(r1)
            java.lang.Object r1 = r4.b
            aw r1 = (defpackage.C2226aw) r1
            rd1 r0 = r1.g(r0)
            boolean r1 = r0 instanceof defpackage.UP0
            if (r1 != 0) goto L45
            goto L63
        L45:
            r1 = r2
        L46:
            boolean r3 = r1 instanceof defpackage.C2438c20
            if (r3 == 0) goto L5e
            r3 = r1
            c20 r3 = (defpackage.C2438c20) r3
            rd1 r3 = r3.a
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
            boolean r1 = r1 instanceof defpackage.UP0
            if (r1 != 0) goto L63
            goto L64
        L63:
            r2 = r0
        L64:
            r2.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7640vd1.b(Kc0, java.lang.Object):void");
    }

    public C7640vd1(Class cls) {
        this.a = 1;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C0109Bd1(0, cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC6097nY0 interfaceC6097nY0 = (InterfaceC6097nY0) field.getAnnotation(InterfaceC6097nY0.class);
                if (interfaceC6097nY0 != null) {
                    strName = interfaceC6097nY0.value();
                    for (String str : interfaceC6097nY0.alternate()) {
                        ((HashMap) this.b).put(str, r4);
                    }
                }
                ((HashMap) this.b).put(strName, r4);
                ((HashMap) this.c).put(string, r4);
                ((HashMap) this.d).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
