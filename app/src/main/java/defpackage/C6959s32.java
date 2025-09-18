package defpackage;

import java.util.HashSet;

/* renamed from: s32 */
/* loaded from: classes.dex */
public final class C6959s32 extends AbstractC3985gY1 {
    public String e;
    public HashSet f;
    public C7925x8 g;
    public Long h;
    public Long i;

    @Override // defpackage.AbstractC3985gY1
    public final boolean B1() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:782:0x08e1, code lost:
    
        r0 = n();
        r1 = defpackage.OL1.B1(r58.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x08ef, code lost:
    
        if (r10.u() == false) goto L785;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x08f1, code lost:
    
        r3 = java.lang.Integer.valueOf(r10.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x08fa, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x08fb, code lost:
    
        r0.j.b(r1, java.lang.String.valueOf(r3), "Invalid property filter ID. appId, id");
        r10 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:521:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x019d A[Catch: all -> 0x01a9, SQLiteException -> 0x01ad, TRY_LEAVE, TryCatch #7 {all -> 0x01a9, blocks: (B:525:0x0197, B:527:0x019d, B:533:0x01b1, B:534:0x01b6, B:535:0x01c0, B:536:0x01d0, B:541:0x01f4, B:538:0x01dd, B:540:0x01e9, B:551:0x020f), top: B:847:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x01b1 A[Catch: all -> 0x01a9, SQLiteException -> 0x01ad, TRY_ENTER, TryCatch #7 {all -> 0x01a9, blocks: (B:525:0x0197, B:527:0x019d, B:533:0x01b1, B:534:0x01b6, B:535:0x01c0, B:536:0x01d0, B:541:0x01f4, B:538:0x01dd, B:540:0x01e9, B:551:0x020f), top: B:847:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x0aef  */
    /* JADX WARN: Type inference failed for: r4v41, types: [L01] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList C1(java.lang.String r59, java.util.List r60, java.util.List r61, java.lang.Long r62, java.lang.Long r63, boolean r64) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6959s32.C1(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final S32 D1(Integer num) {
        if (this.g.containsKey(num)) {
            return (S32) this.g.getOrDefault(num, null);
        }
        S32 s32 = new S32(this, this.e);
        this.g.put(num, s32);
        return s32;
    }
}
