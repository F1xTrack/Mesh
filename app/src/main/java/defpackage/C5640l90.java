package defpackage;

import com.google.android.gms.common.api.ApiException;

/* renamed from: l90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5640l90 extends ApiException {
    public final Exception a;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5640l90(int r6, java.lang.Exception r7) {
        /*
            r5 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.ROOT
            java.util.HashMap r1 = defpackage.AbstractC3469dr1.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L3f
            java.util.HashMap r3 = defpackage.AbstractC3469dr1.b
            boolean r4 = r3.containsKey(r2)
            if (r4 != 0) goto L19
            goto L3f
        L19:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L41
        L3f:
            java.lang.String r1 = ""
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Integrity API error ("
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = "): "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r6, r1)
            r5.<init>(r0)
            if (r6 == 0) goto L67
            r5.a = r7
            return
        L67:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "ErrorCode should not be 0."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5640l90.<init>(int, java.lang.Exception):void");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }
}
