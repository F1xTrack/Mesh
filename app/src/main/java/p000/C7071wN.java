package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* renamed from: wN */
/* loaded from: classes.dex */
public final class C7071wN extends EmojiCompat.InitCallback {

    /* renamed from: a */
    public final WeakReference f44841a;

    /* renamed from: b */
    public final WeakReference f44842b;

    public C7071wN(TextView textView, C7134xN c7134xN) {
        this.f44841a = new WeakReference(textView);
        this.f44842b = new WeakReference(c7134xN);
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onInitialized() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence charSequenceProcess;
        super.onInitialized();
        TextView textView = (TextView) this.f44841a.get();
        InputFilter inputFilter = (InputFilter) this.f44842b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (!textView.isAttachedToWindow() || text == (charSequenceProcess = EmojiCompat.get().process((text = textView.getText())))) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(charSequenceProcess);
                int selectionEnd = Selection.getSelectionEnd(charSequenceProcess);
                textView.setText(charSequenceProcess);
                if (charSequenceProcess instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequenceProcess;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                        return;
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                        return;
                    } else {
                        if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }
}
