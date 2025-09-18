package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: Px */
/* loaded from: classes.dex */
public final class C1258Px {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;

    public C1258Px(ConstraintLayout constraintLayout) {
        this.g = constraintLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.C3488dy r18, defpackage.C1285Qg r19) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1258Px.a(dy, Qg):void");
    }

    public boolean b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.g = MA1.c[3 - i3];
        int i6 = MA1.d[i5];
        this.c = i6;
        if (i2 == 2) {
            this.c = i6 / 2;
        } else if (i2 == 0) {
            this.c = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? MA1.e[i4 - 1] : MA1.f[i4 - 1];
            this.e = i9;
            this.b = (((i9 * 12) / this.c) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? MA1.g[i4 - 1] : MA1.h[i4 - 1];
                this.e = i10;
                this.b = ((i10 * 144) / this.c) + i7;
            } else {
                int i11 = MA1.i[i4 - 1];
                this.e = i11;
                this.b = (((i3 == 1 ? 72 : 144) * i11) / this.c) + i7;
            }
        }
        this.d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
