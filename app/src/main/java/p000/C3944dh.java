package p000;

/* renamed from: dh */
/* loaded from: classes.dex */
public final class C3944dh {

    /* renamed from: e */
    public static final byte[] f26213e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f26214a;

    /* renamed from: b */
    public final int f26215b;

    /* renamed from: c */
    public int f26216c;

    /* renamed from: d */
    public char f26217d;

    static {
        for (int i = 0; i < 1792; i++) {
            f26213e[i] = Character.getDirectionality(i);
        }
    }

    public C3944dh(CharSequence charSequence) {
        this.f26214a = charSequence;
        this.f26215b = charSequence.length();
    }

    /* renamed from: a */
    public final byte m17726a() {
        int i = this.f26216c - 1;
        CharSequence charSequence = this.f26214a;
        char cCharAt = charSequence.charAt(i);
        this.f26217d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f26216c);
            this.f26216c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f26216c--;
        char c = this.f26217d;
        return c < 1792 ? f26213e[c] : Character.getDirectionality(c);
    }
}
