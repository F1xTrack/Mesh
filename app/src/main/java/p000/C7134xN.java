package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: xN */
/* loaded from: classes.dex */
public final class C7134xN implements InputFilter {

    /* renamed from: a */
    public final TextView f45565a;

    /* renamed from: b */
    public C7071wN f45566b;

    public C7134xN(TextView textView) {
        this.f45565a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f45565a;
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
        if (this.f45566b == null) {
            this.f45566b = new C7071wN(textView, this);
        }
        emojiCompat.registerInitCallback(this.f45566b);
        return charSequence;
    }
}
