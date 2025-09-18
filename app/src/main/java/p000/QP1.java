package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class QP1 {
    /* JADX WARN: Removed duplicated region for block: B:62:0x0050  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List m6686e(com.facebook.react.bridge.ReadableArray r8) {
        /*
            if (r8 != 0) goto L5
            MN r8 = p000.C0779MN.f7117a
            return r8
        L5:
            r0 = 0
            int r1 = r8.size()
            g90 r0 = p000.AbstractC10132lO1.m22423h(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17:
            r2 = r0
            f90 r2 = (p000.C9333f90) r2
            boolean r2 = r2.f27092c
            if (r2 == 0) goto L72
            r2 = r0
            f90 r2 = (p000.C9333f90) r2
            int r2 = r2.m18193a()
            com.facebook.react.bridge.ReadableMap r2 = r8.getMap(r2)
            r3 = 0
            if (r2 == 0) goto L33
            java.lang.String r4 = "key"
            java.lang.String r4 = r2.getString(r4)
            goto L34
        L33:
            r4 = r3
        L34:
            java.lang.String r5 = "value"
            if (r2 == 0) goto L3d
            com.facebook.react.bridge.ReadableType r6 = r2.getType(r5)
            goto L3e
        L3d:
            r6 = r3
        L3e:
            if (r6 != 0) goto L42
            r6 = -1
            goto L4a
        L42:
            int[] r7 = p000.AbstractC1054Qk.f9758a
            int r6 = r6.ordinal()
            r6 = r7[r6]
        L4a:
            r7 = 1
            if (r6 == r7) goto L59
            r7 = 2
            if (r6 == r7) goto L52
        L50:
            r2 = r3
            goto L63
        L52:
            if (r2 == 0) goto L50
            java.lang.String r2 = r2.getString(r5)
            goto L63
        L59:
            if (r2 == 0) goto L50
            double r5 = r2.getDouble(r5)
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
        L63:
            if (r4 == 0) goto L6c
            if (r2 == 0) goto L6c
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r4, r2)
        L6c:
            if (r3 == 0) goto L17
            r1.add(r3)
            goto L17
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.QP1.m6686e(com.facebook.react.bridge.ReadableArray):java.util.List");
    }

    /* renamed from: a */
    public abstract Method mo4965a(Class cls, Field field);

    /* renamed from: b */
    public abstract Constructor mo4966b(Class cls);

    /* renamed from: c */
    public abstract String[] mo4967c(Class cls);

    /* renamed from: d */
    public abstract boolean mo4968d(Class cls);
}
