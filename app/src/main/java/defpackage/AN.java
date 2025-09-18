package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

/* loaded from: classes.dex */
public final class AN extends AbstractC7711w02 {
    public final C8350zN a;

    public AN(TextView textView) {
        this.a = new C8350zN(textView);
    }

    @Override // defpackage.AbstractC7711w02
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !EmojiCompat.isConfigured() ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // defpackage.AbstractC7711w02
    public final boolean b() {
        return this.a.c;
    }

    @Override // defpackage.AbstractC7711w02
    public final void c(boolean z) {
        if (EmojiCompat.isConfigured()) {
            this.a.c(z);
        }
    }

    @Override // defpackage.AbstractC7711w02
    public final void d(boolean z) {
        boolean zIsConfigured = EmojiCompat.isConfigured();
        C8350zN c8350zN = this.a;
        if (zIsConfigured) {
            c8350zN.d(z);
        } else {
            c8350zN.c = z;
        }
    }

    @Override // defpackage.AbstractC7711w02
    public final TransformationMethod e(TransformationMethod transformationMethod) {
        return !EmojiCompat.isConfigured() ? transformationMethod : this.a.e(transformationMethod);
    }
}
