package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;

/* renamed from: wd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7830wd1 extends AbstractC7067sd1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public C7830wd1(C3504e20 c3504e20, AbstractC7067sd1 abstractC7067sd1, Type type) {
        this.a = 0;
        this.b = c3504e20;
        this.c = abstractC7067sd1;
        this.d = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // defpackage.AbstractC7067sd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.C0885Lc0 r5, java.lang.Object r6) throws java.io.IOException {
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
            sd1 r2 = (defpackage.AbstractC7067sd1) r2
            if (r1 == r0) goto L64
            ye1 r0 = new ye1
            r0.<init>(r1)
            java.lang.Object r1 = r4.b
            e20 r1 = (defpackage.C3504e20) r1
            sd1 r0 = r1.b(r0)
            boolean r1 = r0 instanceof defpackage.VP0
            if (r1 != 0) goto L45
            goto L63
        L45:
            r1 = r2
        L46:
            boolean r3 = r1 instanceof defpackage.C3314d20
            if (r3 == 0) goto L5e
            r3 = r1
            d20 r3 = (defpackage.C3314d20) r3
            sd1 r3 = r3.a
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
            boolean r1 = r1 instanceof defpackage.VP0
            if (r1 != 0) goto L63
            goto L64
        L63:
            r2 = r0
        L64:
            r2.a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7830wd1.a(Lc0, java.lang.Object):void");
    }

    public C7830wd1(Class cls) {
        this.a = 1;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C0109Bd1(1, cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC6288oY0 interfaceC6288oY0 = (InterfaceC6288oY0) field.getAnnotation(InterfaceC6288oY0.class);
                if (interfaceC6288oY0 != null) {
                    strName = interfaceC6288oY0.value();
                    for (String str : interfaceC6288oY0.alternate()) {
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
