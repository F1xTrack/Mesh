package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: CN */
/* loaded from: classes.dex */
public final class C0150CN implements TextWatcher {

    /* renamed from: a */
    public final EditText f1342a;

    /* renamed from: b */
    public C0087BN f1343b;

    /* renamed from: c */
    public boolean f1344c = true;

    public C0150CN(EditText editText) {
        this.f1342a = editText;
    }

    /* renamed from: a */
    public static void m1158a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.get().process(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f1342a;
        if (!editText.isInEditMode() && this.f1344c && EmojiCompat.isConfigured() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int loadState = EmojiCompat.get().getLoadState();
            if (loadState != 0) {
                if (loadState == 1) {
                    EmojiCompat.get().process((Spannable) charSequence, i, i + i3, Integer.MAX_VALUE, 0);
                    return;
                } else if (loadState != 3) {
                    return;
                }
            }
            EmojiCompat emojiCompat = EmojiCompat.get();
            if (this.f1343b == null) {
                this.f1343b = new C0087BN(editText);
            }
            emojiCompat.registerInitCallback(this.f1343b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
