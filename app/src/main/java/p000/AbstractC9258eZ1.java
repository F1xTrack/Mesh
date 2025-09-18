package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: eZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9258eZ1 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m18008a(java.util.List r6, p000.A11 r7, p000.AbstractC1571Yy r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p000.C0894OC
            if (r0 == 0) goto L13
            r0 = r8
            OC r0 = (p000.C0894OC) r0
            int r1 = r0.f8272d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8272d = r1
            goto L18
        L13:
            OC r0 = new OC
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8271c
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f8272d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f8270b
            java.io.Serializable r7 = r0.f8269a
            TO0 r7 = (p000.TO0) r7
            p000.RQ1.m7017d(r8)     // Catch: java.lang.Throwable -> L30
            goto L67
        L30:
            r8 = move-exception
            goto L80
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f8269a
            java.util.List r6 = (java.util.List) r6
            p000.RQ1.m7017d(r8)
            goto L5c
        L42:
            p000.RQ1.m7017d(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            QC r2 = new QC
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f8269a = r8
            r0.f8272d = r4
            java.lang.Object r6 = r7.m17a(r2, r0)
            if (r6 != r1) goto L5b
            goto L95
        L5b:
            r6 = r8
        L5c:
            TO0 r7 = new TO0
            r7.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()
            nZ r8 = (p000.InterfaceC6497nZ) r8
            r0.f8269a = r7     // Catch: java.lang.Throwable -> L30
            r0.f8270b = r6     // Catch: java.lang.Throwable -> L30
            r0.f8272d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L67
            goto L95
        L80:
            java.lang.Object r2 = r7.f11337a
            if (r2 != 0) goto L87
            r7.f11337a = r8
            goto L67
        L87:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            p000.I02.m3687a(r2, r8)
            goto L67
        L8d:
            java.lang.Object r6 = r7.f11337a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L96
            Tf1 r1 = p000.C8313Tf1.f11463a
        L95:
            return r1
        L96:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC9258eZ1.m18008a(java.util.List, A11, Yy):java.lang.Object");
    }

    /* renamed from: b */
    public static T71 m18009b(T71 t71, InterfaceC7633Gd1 interfaceC7633Gd1, List list) {
        O90.m5968f(interfaceC7633Gd1, "typeAliasDescriptor");
        List parameters = ((C1340VI) interfaceC7633Gd1).f12497i.getParameters();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(parameters));
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10292me1) it.next()).mo2089x1());
        }
        return new T71(t71, interfaceC7633Gd1, list, AbstractC11077sn0.m24786n(AbstractC7167xu.m25989i0(arrayList, list)));
    }
}
