package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

/* renamed from: jP1 */
/* loaded from: classes.dex */
public abstract class AbstractC5307jP1 {
    /* JADX WARN: Removed duplicated region for block: B:49:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C1840Xj a(defpackage.KX r8, defpackage.Z41 r9, defpackage.InterfaceC0153Bs0 r10, java.io.InputStream r11) {
        /*
            java.lang.String r0 = "fqName"
            defpackage.O90.f(r8, r0)
            java.lang.String r0 = "storageManager"
            defpackage.O90.f(r9, r0)
            java.lang.String r0 = "module"
            defpackage.O90.f(r10, r0)
            Sj r0 = defpackage.C1450Sj.f     // Catch: java.lang.Throwable -> L70
            Sj r6 = defpackage.AbstractC3958gP1.c(r11)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "ourVersion"
            Sj r1 = defpackage.C1450Sj.f     // Catch: java.lang.Throwable -> L70
            defpackage.O90.f(r1, r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r6.c     // Catch: java.lang.Throwable -> L70
            int r2 = r1.c     // Catch: java.lang.Throwable -> L70
            int r3 = r1.b     // Catch: java.lang.Throwable -> L70
            int r4 = r6.b     // Catch: java.lang.Throwable -> L70
            r5 = 0
            r7 = 1
            if (r4 != 0) goto L2f
            if (r3 != 0) goto L2d
            if (r0 != r2) goto L2d
            goto L33
        L2d:
            r7 = r5
            goto L33
        L2f:
            if (r4 != r3) goto L2d
            if (r0 > r2) goto L2d
        L33:
            r0 = 0
            if (r7 == 0) goto L72
            DR r2 = new DR     // Catch: java.lang.Throwable -> L70
            r2.<init>()     // Catch: java.lang.Throwable -> L70
            defpackage.AbstractC1918Yj.a(r2)     // Catch: java.lang.Throwable -> L70
            xd0 r3 = defpackage.C6231oF0.k     // Catch: java.lang.Throwable -> L70
            r3.getClass()     // Catch: java.lang.Throwable -> L70
            lu r4 = new lu     // Catch: java.lang.Throwable -> L70
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r2 = r3.a(r4, r2)     // Catch: java.lang.Throwable -> L70
            K0 r2 = (defpackage.K0) r2     // Catch: java.lang.Throwable -> L70
            r4.a(r5)     // Catch: defpackage.Y90 -> L6c java.lang.Throwable -> L70
            boolean r3 = r2.e()     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L5b
            oF0 r2 = (defpackage.C6231oF0) r2     // Catch: java.lang.Throwable -> L70
            r5 = r2
            goto L73
        L5b:
            sg r8 = new sg     // Catch: java.lang.Throwable -> L70
            r8.<init>()     // Catch: java.lang.Throwable -> L70
            Y90 r9 = new Y90     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L70
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L70
            r9.a = r2     // Catch: java.lang.Throwable -> L70
            throw r9     // Catch: java.lang.Throwable -> L70
        L6c:
            r8 = move-exception
            r8.a = r2     // Catch: java.lang.Throwable -> L70
            throw r8     // Catch: java.lang.Throwable -> L70
        L70:
            r8 = move-exception
            goto La3
        L72:
            r5 = r0
        L73:
            defpackage.AbstractC2141aT1.a(r11, r0)
            if (r5 == 0) goto L82
            Xj r11 = new Xj
            r1 = r11
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        L82:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Kotlin built-in definition format version is not supported: expected "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r10 = ", actual "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r10 = ". Please update Kotlin"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La3:
            throw r8     // Catch: java.lang.Throwable -> La4
        La4:
            r9 = move-exception
            defpackage.AbstractC2141aT1.a(r11, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5307jP1.a(KX, Z41, Bs0, java.io.InputStream):Xj");
    }

    public static final WO0 b(Annotation[] annotationArr, KX kx) {
        Annotation annotation;
        O90.f(annotationArr, "<this>");
        O90.f(kx, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (VO0.a(P22.b(P22.a(annotation))).b().equals(kx)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new WO0(annotation);
        }
        return null;
    }

    public static final ArrayList c(Annotation[] annotationArr) {
        O90.f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new WO0(annotation));
        }
        return arrayList;
    }
}
