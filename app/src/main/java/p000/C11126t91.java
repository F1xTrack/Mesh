package p000;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* renamed from: t91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11126t91 implements TextWatcher {

    /* renamed from: a */
    public int f42889a;

    /* renamed from: b */
    public final /* synthetic */ EditText f42890b;

    /* renamed from: c */
    public final /* synthetic */ TextInputLayout f42891c;

    public C11126t91(TextInputLayout textInputLayout, EditText editText) {
        this.f42891c = textInputLayout;
        this.f42890b = editText;
        this.f42889a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.f42891c;
        textInputLayout.m11273u(!textInputLayout.f18285L1, false);
        if (textInputLayout.f18313k) {
            textInputLayout.m11266n(editable);
        }
        if (textInputLayout.f18323s) {
            textInputLayout.m11274v(editable);
        }
        EditText editText = this.f42890b;
        int lineCount = editText.getLineCount();
        int i = this.f42889a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f18271E1;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f42889a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
