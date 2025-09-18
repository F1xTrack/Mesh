package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.EmojiCompat;
import p000.AbstractC8508Wz0;
import p000.AbstractC8612Yz0;

/* loaded from: classes.dex */
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {
    private static final int PAINT_TEXT_SIZE = 10;
    private static final ThreadLocal<StringBuilder> sStringBuilder = new ThreadLocal<>();
    private final TextPaint mTextPaint;

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.mTextPaint = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder getStringBuilder() {
        ThreadLocal<StringBuilder> threadLocal = sStringBuilder;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder stringBuilder = getStringBuilder();
        stringBuilder.setLength(0);
        while (i < i2) {
            stringBuilder.append(charSequence.charAt(i));
            i++;
        }
        TextPaint textPaint = this.mTextPaint;
        String string = stringBuilder.toString();
        int i4 = AbstractC8612Yz0.f14631a;
        return AbstractC8508Wz0.m8905a(textPaint, string);
    }
}
