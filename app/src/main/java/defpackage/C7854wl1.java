package defpackage;

import expo.modules.kotlin.jni.ExpectedType;

/* renamed from: wl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7854wl1 extends AbstractC1512Td1 {
    public final InterfaceC7454uf0 a;

    public C7854wl1(InterfaceC7454uf0 interfaceC7454uf0) {
        O90.f(interfaceC7454uf0, "type");
        this.a = interfaceC7454uf0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // defpackage.AbstractC1512Td1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, defpackage.C7 r6) throws defpackage.C1319Qr0, defpackage.C7143t2 {
        /*
            r4 = this;
            if (r6 == 0) goto La6
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            r2 = 0
            if (r0 != r1) goto L7c
            uf0 r0 = r4.a
            if (r5 != 0) goto L23
            boolean r5 = r0.e()
            if (r5 == 0) goto L1c
            goto L7b
        L1c:
            Qr0 r5 = new Qr0
            r6 = 3
            r5.<init>(r6)
            throw r5
        L23:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.ref.WeakReference r6 = r6.b
            java.lang.Object r6 = r6.get()
            com.facebook.react.bridge.ReactApplicationContext r6 = (com.facebook.react.bridge.ReactApplicationContext) r6
            if (r6 != 0) goto L35
        L33:
            r6 = r2
            goto L4a
        L35:
            int r1 = defpackage.R02.b(r5)
            r3 = 1
            com.facebook.react.bridge.UIManager r6 = defpackage.OZ1.f(r6, r1, r3)
            if (r6 == 0) goto L45
            android.view.View r6 = r6.resolveView(r5)
            goto L46
        L45:
            r6 = r2
        L46:
            boolean r1 = r6 instanceof android.view.View
            if (r1 == 0) goto L33
        L4a:
            boolean r1 = r0.e()
            if (r1 != 0) goto L7a
            if (r6 == 0) goto L53
            goto L7a
        L53:
            t2 r6 = new t2
            ie0 r0 = r0.i()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.reflect.KClass<*>"
            defpackage.O90.d(r0, r1)
            Vd0 r0 = (defpackage.InterfaceC1667Vd0) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to find the "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = " view with tag "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r6.<init>(r5, r2)
            throw r6
        L7a:
            r2 = r6
        L7b:
            return r2
        L7c:
            t2 r5 = new t2
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = "getName(...)"
            defpackage.O90.e(r6, r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = r1.getName()
            defpackage.O90.e(r1, r0)
            java.lang.String r0 = "Expected to run on "
            java.lang.String r3 = " thread, but was run on "
            java.lang.String r6 = defpackage.AbstractC1705Vq.i(r0, r1, r3, r6)
            r5.<init>(r6, r2)
            throw r5
        La6:
            t2 r5 = new t2
            r6 = 6
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7854wl1.a(java.lang.Object, C7):java.lang.Object");
    }

    @Override // defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        return new ExpectedType(EnumC2044Zz.d, EnumC2044Zz.r);
    }

    @Override // defpackage.AbstractC1512Td1
    public final boolean c() {
        return false;
    }
}
