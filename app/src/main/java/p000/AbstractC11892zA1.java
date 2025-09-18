package p000;

/* renamed from: zA1 */
/* loaded from: classes.dex */
public abstract class AbstractC11892zA1 {
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005b, code lost:
    
        throw new java.lang.IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.UA1 m26325a(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            int r2 = r11.length()
            int r2 = r2 + r2
            if (r2 < 0) goto L98
            r2 = r10
            uB1 r2 = (p000.C11258uB1) r2
            boolean r3 = r2.f43585c
            int r4 = r2.f43584b
            java.security.MessageDigest r2 = r2.f43583a
            if (r3 == 0) goto L20
            Si r3 = new Si     // Catch: java.lang.CloneNotSupportedException -> L20
            java.lang.Object r5 = r2.clone()     // Catch: java.lang.CloneNotSupportedException -> L20
            java.security.MessageDigest r5 = (java.security.MessageDigest) r5     // Catch: java.lang.CloneNotSupportedException -> L20
            r3.<init>(r5, r4)     // Catch: java.lang.CloneNotSupportedException -> L20
            goto L2d
        L20:
            Si r3 = new Si
            java.lang.String r2 = r2.getAlgorithm()
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> L91
            r3.<init>(r2, r4)
        L2d:
            int r2 = r11.length()
            r4 = r0
        L32:
            java.lang.String r5 = "Cannot re-use a Hasher after calling hash() on it"
            java.lang.Object r6 = r3.f10916e
            java.security.MessageDigest r6 = (java.security.MessageDigest) r6
            if (r4 >= r2) goto L61
            char r7 = r11.charAt(r4)
            java.lang.Object r8 = r3.f10915d
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            r8.putChar(r7)
            byte[] r7 = r8.array()     // Catch: java.lang.Throwable -> L5c
            boolean r9 = r3.f10914c     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L56
            r5 = 2
            r6.update(r7, r0, r5)     // Catch: java.lang.Throwable -> L5c
            r8.clear()
            int r4 = r4 + r1
            goto L32
        L56:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5c
            r11.<init>(r5)     // Catch: java.lang.Throwable -> L5c
            throw r11     // Catch: java.lang.Throwable -> L5c
        L5c:
            r11 = move-exception
            r8.clear()
            throw r11
        L61:
            boolean r11 = r3.f10914c
            if (r11 != 0) goto L8b
            r3.f10914c = r1
            int r11 = r6.getDigestLength()
            int r0 = r3.f10913b
            if (r0 != r11) goto L7b
            byte[] r11 = r6.digest()
            char[] r0 = p000.YA1.f14191a
            UA1 r0 = new UA1
            r0.<init>(r11)
            goto L8a
        L7b:
            byte[] r11 = r6.digest()
            byte[] r11 = java.util.Arrays.copyOf(r11, r0)
            char[] r0 = p000.YA1.f14191a
            UA1 r0 = new UA1
            r0.<init>(r11)
        L8a:
            return r0
        L8b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r5)
            throw r11
        L91:
            r11 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r11)
            throw r0
        L98:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            java.lang.String r0 = "expectedInputSize must be >= 0 but was %s"
            java.lang.String r0 = p000.I12.m3732b(r0, r1)
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11892zA1.m26325a(java.lang.String):UA1");
    }
}
