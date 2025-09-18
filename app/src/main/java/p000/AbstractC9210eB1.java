package p000;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: eB1 */
/* loaded from: classes.dex */
public abstract class AbstractC9210eB1 {

    /* renamed from: a */
    public static final C8326Tm0 f26588a = new C8326Tm0(19);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00aa  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m17874a(p000.InterfaceC0036AZ r5, int r6) {
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
            p000.O90.m5968f(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r0 == 0) goto L35
            boolean r0 = r5 instanceof p000.InterfaceC6522ny
            if (r0 == 0) goto L22
            java.lang.String r0 = "<init>"
            goto L32
        L22:
            r0 = r5
            DD r0 = (p000.AbstractC0203DD) r0
            Tt0 r0 = r0.getName()
            java.lang.String r0 = r0.m7801b()
            java.lang.String r2 = "asString(...)"
            p000.O90.m5967e(r0, r2)
        L32:
            r6.append(r0)
        L35:
            java.lang.String r0 = "("
            r6.append(r0)
            rh0 r0 = r5.mo121t0()
            OZ r2 = p000.C0917OZ.f8488e
            if (r0 == 0) goto L51
            Ig0 r0 = r0.getType()
            le1 r3 = p000.C10164le1.f37212k
            java.lang.Object r0 = p000.CZ1.m1234j(r0, r3, r2)
            Nd0 r0 = (p000.AbstractC7996Nd0) r0
            r6.append(r0)
        L51:
            java.util.List r0 = r5.mo1221f0()
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r0.next()
            Wh1 r3 = (p000.C8473Wh1) r3
            fi1 r3 = (p000.AbstractC9404fi1) r3
            Ig0 r3 = r3.getType()
            java.lang.String r4 = "getType(...)"
            p000.O90.m5967e(r3, r4)
            le1 r4 = p000.C10164le1.f37212k
            java.lang.Object r3 = p000.CZ1.m1234j(r3, r4, r2)
            Nd0 r3 = (p000.AbstractC7996Nd0) r3
            r6.append(r3)
            goto L59
        L7c:
            java.lang.String r0 = ")"
            r6.append(r0)
            if (r1 == 0) goto Lc2
            boolean r0 = r5 instanceof p000.InterfaceC6522ny
            if (r0 == 0) goto L88
            goto Laa
        L88:
            Ig0 r0 = r5.getReturnType()
            p000.O90.m5965c(r0)
            Tt0 r1 = p000.AbstractC11955zg0.f46926e
            MX r1 = p000.AbstractC10604p41.f39806d
            boolean r0 = p000.AbstractC11955zg0.m26485D(r0, r1)
            if (r0 == 0) goto Lb0
            Ig0 r0 = r5.getReturnType()
            p000.O90.m5965c(r0)
            boolean r0 = p000.AbstractC7375Be1.m787e(r0)
            if (r0 != 0) goto Lb0
            boolean r0 = r5 instanceof p000.FE0
            if (r0 != 0) goto Lb0
        Laa:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lc2
        Lb0:
            Ig0 r5 = r5.getReturnType()
            p000.O90.m5965c(r5)
            le1 r0 = p000.C10164le1.f37212k
            java.lang.Object r5 = p000.CZ1.m1234j(r5, r0, r2)
            Nd0 r5 = (p000.AbstractC7996Nd0) r5
            r6.append(r5)
        Lc2:
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "toString(...)"
            p000.O90.m5967e(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC9210eB1.m17874a(AZ, int):java.lang.String");
    }

    /* renamed from: b */
    public static final String m17875b(InterfaceC7032vl interfaceC7032vl) {
        O90.m5968f(interfaceC7032vl, "<this>");
        if (AbstractC6814sI.m24703o(interfaceC7032vl)) {
            return null;
        }
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC7032vl.mo423i();
        InterfaceC6976us interfaceC6976us = interfaceC0140CDMo423i instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0140CDMo423i : null;
        if (interfaceC6976us == null || interfaceC6976us.getName().f11578b) {
            return null;
        }
        InterfaceC7032vl interfaceC7032vlMo2089x1 = interfaceC7032vl.mo2089x1();
        U01 u01 = interfaceC7032vlMo2089x1 instanceof U01 ? (U01) interfaceC7032vlMo2089x1 : null;
        if (u01 == null) {
            return null;
        }
        return AbstractC8821bB1.m10433a(interfaceC6976us, m17874a(u01, 3));
    }

    /* renamed from: c */
    public static void m17876c(PackageInfo packageInfo, File file) throws IOException {
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m17877d(android.content.Context r17, java.util.concurrent.Executor r18, p000.WD0 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC9210eB1.m17877d(android.content.Context, java.util.concurrent.Executor, WD0, boolean):void");
    }
}
