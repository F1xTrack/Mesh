package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: xN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7970xN implements InputFilter {
    public final TextView a;
    public C7780wN b;

    public C7970xN(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int loadState = EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            if (loadState == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.get().process(charSequence, 0, charSequence.length());
            }
            if (loadState != 3) {
                return charSequence;
            }
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (this.b == null) {
            this.b = new C7780wN(textView, this);
        }
        emojiCompat.registerInitCallback(this.b);
        return charSequence;
    }
}
