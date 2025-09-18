package defpackage;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: eB1 */
/* loaded from: classes.dex */
public abstract class AbstractC3534eB1 {
    public static final C1538Tm0 a = new C1538Tm0(19);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(defpackage.AZ r5, int r6) {
        /*
            r0 = 1
            r1 = r6 & 1
            r2 = 0
            if (r1 == 0) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r2
        L9:
            r6 = r6 & 2
            if (r6 == 0) goto Le
            goto Lf
        Le:
            r0 = r2
        Lf:
            java.lang.String r6 = "<this>"
            defpackage.O90.f(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r0 == 0) goto L35
            boolean r0 = r5 instanceof defpackage.InterfaceC6174ny
            if (r0 == 0) goto L22
            java.lang.String r0 = "<init>"
            goto L32
        L22:
            r0 = r5
            DD r0 = (defpackage.DD) r0
            Tt0 r0 = r0.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "asString(...)"
            defpackage.O90.e(r0, r2)
        L32:
            r6.append(r0)
        L35:
            java.lang.String r0 = "("
            r6.append(r0)
            rh0 r0 = r5.t0()
            OZ r2 = defpackage.OZ.e
            if (r0 == 0) goto L51
            Ig0 r0 = r0.getType()
            le1 r3 = defpackage.C5734le1.k
            java.lang.Object r0 = defpackage.CZ1.j(r0, r3, r2)
            Nd0 r0 = (defpackage.AbstractC1043Nd0) r0
            r6.append(r0)
        L51:
            java.util.List r0 = r5.f0()
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r0.next()
            Wh1 r3 = (defpackage.C1758Wh1) r3
            fi1 r3 = (defpackage.AbstractC3824fi1) r3
            Ig0 r3 = r3.getType()
            java.lang.String r4 = "getType(...)"
            defpackage.O90.e(r3, r4)
            le1 r4 = defpackage.C5734le1.k
            java.lang.Object r3 = defpackage.CZ1.j(r3, r4, r2)
            Nd0 r3 = (defpackage.AbstractC1043Nd0) r3
            r6.append(r3)
            goto L59
        L7c:
            java.lang.String r0 = ")"
            r6.append(r0)
            if (r1 == 0) goto Lc2
            boolean r0 = r5 instanceof defpackage.InterfaceC6174ny
            if (r0 == 0) goto L88
            goto Laa
        L88:
            Ig0 r0 = r5.getReturnType()
            defpackage.O90.c(r0)
            Tt0 r1 = defpackage.AbstractC8408zg0.e
            MX r1 = defpackage.AbstractC6390p41.d
            boolean r0 = defpackage.AbstractC8408zg0.D(r0, r1)
            if (r0 == 0) goto Lb0
            Ig0 r0 = r5.getReturnType()
            defpackage.O90.c(r0)
            boolean r0 = defpackage.AbstractC0112Be1.e(r0)
            if (r0 != 0) goto Lb0
            boolean r0 = r5 instanceof defpackage.FE0
            if (r0 != 0) goto Lb0
        Laa:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lc2
        Lb0:
            Ig0 r5 = r5.getReturnType()
            defpackage.O90.c(r5)
            le1 r0 = defpackage.C5734le1.k
            java.lang.Object r5 = defpackage.CZ1.j(r5, r0, r2)
            Nd0 r5 = (defpackage.AbstractC1043Nd0) r5
            r6.append(r5)
        Lc2:
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "toString(...)"
            defpackage.O90.e(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3534eB1.a(AZ, int):java.lang.String");
    }

    public static final String b(InterfaceC7662vl interfaceC7662vl) {
        O90.f(interfaceC7662vl, "<this>");
        if (AbstractC7002sI.o(interfaceC7662vl)) {
            return null;
        }
        CD cdI = interfaceC7662vl.i();
        InterfaceC7492us interfaceC7492us = cdI instanceof InterfaceC7492us ? (InterfaceC7492us) cdI : null;
        if (interfaceC7492us == null || interfaceC7492us.getName().b) {
            return null;
        }
        InterfaceC7662vl interfaceC7662vlX1 = interfaceC7662vl.x1();
        U01 u01 = interfaceC7662vlX1 instanceof U01 ? (U01) interfaceC7662vlX1 : null;
        if (u01 == null) {
            return null;
        }
        return AbstractC2278bB1.a(interfaceC7492us, a(u01, 3));
    }

    public static void c(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r17, java.util.concurrent.Executor r18, defpackage.WD0 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3534eB1.d(android.content.Context, java.util.concurrent.Executor, WD0, boolean):void");
    }
}
