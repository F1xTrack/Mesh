package p000;

import android.text.SpannableStringBuilder;

/* renamed from: eh */
/* loaded from: classes.dex */
public final class C4006eh {

    /* renamed from: b */
    public static final String f26805b;

    /* renamed from: c */
    public static final String f26806c;

    /* renamed from: d */
    public static final C4006eh f26807d;

    /* renamed from: e */
    public static final C4006eh f26808e;

    /* renamed from: a */
    public final boolean f26809a;

    static {
        C0926Oi c0926Oi = AbstractC10102l91.f36926c;
        f26805b = Character.toString((char) 8206);
        f26806c = Character.toString((char) 8207);
        f26807d = new C4006eh(false);
        f26808e = new C4006eh(true);
    }

    public C4006eh(boolean z) {
        C0926Oi c0926Oi = AbstractC10102l91.f36924a;
        this.f26809a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r0.f26216c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        switch(r0.m17726a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m18018a(java.lang.CharSequence r9) {
        /*
            dh r0 = new dh
            r0.<init>(r9)
            r9 = 0
            r0.f26216c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f26216c
            int r5 = r0.f26215b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L70
            if (r1 != 0) goto L70
            java.lang.CharSequence r5 = r0.f26214a
            char r4 = r5.charAt(r4)
            r0.f26217d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f26216c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f26216c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f26216c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f26216c
            int r4 = r4 + r6
            r0.f26216c = r4
            char r4 = r0.f26217d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = p000.C3944dh.f26213e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L6a
            if (r4 == r6) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6e
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L66:
            if (r3 != 0) goto L6e
        L68:
            r9 = r6
            goto L8f
        L6a:
            if (r3 != 0) goto L6e
        L6c:
            r9 = r7
            goto L8f
        L6e:
            r1 = r3
            goto Lb
        L70:
            if (r1 != 0) goto L73
            goto L8f
        L73:
            if (r2 == 0) goto L77
            r9 = r2
            goto L8f
        L77:
            int r2 = r0.f26216c
            if (r2 <= 0) goto L8f
            byte r2 = r0.m17726a()
            switch(r2) {
                case 14: goto L8c;
                case 15: goto L8c;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r3 = r3 + 1
            goto L77
        L86:
            if (r1 != r3) goto L89
            goto L68
        L89:
            int r3 = r3 + (-1)
            goto L77
        L8c:
            if (r1 != r3) goto L89
            goto L6c
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4006eh.m18018a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        return 1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m18019b(java.lang.CharSequence r7) {
        /*
            dh r0 = new dh
            r0.<init>(r7)
            int r7 = r0.f26215b
            r0.f26216c = r7
            r7 = 0
            r1 = r7
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f26216c
            if (r3 <= 0) goto L41
            byte r3 = r0.m17726a()
            r4 = -1
            if (r3 == 0) goto L3b
            r5 = 1
            if (r3 == r5) goto L35
            r6 = 2
            if (r3 == r6) goto L35
            r6 = 9
            if (r3 == r6) goto Lc
            switch(r3) {
                case 14: goto L31;
                case 15: goto L31;
                case 16: goto L2a;
                case 17: goto L2a;
                case 18: goto L27;
                default: goto L24;
            }
        L24:
            if (r2 != 0) goto Lc
            goto L40
        L27:
            int r1 = r1 + 1
            goto Lc
        L2a:
            if (r2 != r1) goto L2e
        L2c:
            r7 = r5
            goto L41
        L2e:
            int r1 = r1 + (-1)
            goto Lc
        L31:
            if (r2 != r1) goto L2e
        L33:
            r7 = r4
            goto L41
        L35:
            if (r1 != 0) goto L38
            goto L2c
        L38:
            if (r2 != 0) goto Lc
            goto L40
        L3b:
            if (r1 != 0) goto L3e
            goto L33
        L3e:
            if (r2 != 0) goto Lc
        L40:
            goto Lb
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4006eh.m18019b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public final SpannableStringBuilder m18020c(CharSequence charSequence) {
        C0926Oi c0926Oi = AbstractC10102l91.f36926c;
        if (charSequence == null) {
            return null;
        }
        boolean zM6124j = c0926Oi.m6124j(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM6124j2 = (zM6124j ? AbstractC10102l91.f36925b : AbstractC10102l91.f36924a).m6124j(charSequence.length(), charSequence);
        String str = "";
        String str2 = f26806c;
        String str3 = f26805b;
        boolean z = this.f26809a;
        spannableStringBuilder.append((CharSequence) ((z || !(zM6124j2 || m18018a(charSequence) == 1)) ? (!z || (zM6124j2 && m18018a(charSequence) != -1)) ? "" : str2 : str3));
        if (zM6124j != z) {
            spannableStringBuilder.append(zM6124j ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM6124j3 = (zM6124j ? AbstractC10102l91.f36925b : AbstractC10102l91.f36924a).m6124j(charSequence.length(), charSequence);
        if (!z && (zM6124j3 || m18019b(charSequence) == 1)) {
            str = str3;
        } else if (z && (!zM6124j3 || m18019b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
