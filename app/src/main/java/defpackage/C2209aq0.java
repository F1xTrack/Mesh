package defpackage;

import java.util.Comparator;

/* renamed from: aq0 */
/* loaded from: classes2.dex */
public final class C2209aq0 implements Comparator {
    public static final C2209aq0 b = new C2209aq0(0);
    public static final /* synthetic */ C2209aq0 c = new C2209aq0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C2209aq0(int i) {
        this.a = i;
    }

    public static int a(CD cd) {
        if (AbstractC7002sI.m(cd)) {
            return 8;
        }
        if (cd instanceof InterfaceC6174ny) {
            return 7;
        }
        if (cd instanceof CE0) {
            return ((CE0) cd).t0() == null ? 6 : 5;
        }
        if (cd instanceof AZ) {
            return ((AZ) cd).t0() == null ? 4 : 3;
        }
        if (cd instanceof InterfaceC7492us) {
            return 2;
        }
        return cd instanceof InterfaceC0499Gd1 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x0256, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014c  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2209aq0.compare(java.lang.Object, java.lang.Object):int");
    }
}
