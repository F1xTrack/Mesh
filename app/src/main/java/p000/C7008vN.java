package p000;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: vN */
/* loaded from: classes.dex */
public final class C7008vN extends InputConnectionWrapper {

    /* renamed from: a */
    public final EditText f44347a;

    /* renamed from: b */
    public final S20 f44348b;

    public C7008vN(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        S20 s20 = new S20(13);
        super(inputConnection, false);
        this.f44347a = editText;
        this.f44348b = s20;
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f44347a.getEditableText();
        this.f44348b.getClass();
        return EmojiCompat.handleDeleteSurroundingText(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f44347a.getEditableText();
        this.f44348b.getClass();
        return EmojiCompat.handleDeleteSurroundingText(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
