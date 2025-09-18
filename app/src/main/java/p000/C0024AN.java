package p000;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: AN */
/* loaded from: classes.dex */
public final class C0024AN extends AbstractC11489w02 {

    /* renamed from: a */
    public final C7260zN f176a;

    public C0024AN(TextView textView) {
        this.f176a = new C7260zN(textView);
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: a */
    public final InputFilter[] mo166a(InputFilter[] inputFilterArr) {
        return !EmojiCompat.isConfigured() ? inputFilterArr : this.f176a.mo166a(inputFilterArr);
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: b */
    public final boolean mo167b() {
        return this.f176a.f46808c;
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: c */
    public final void mo168c(boolean z) {
        if (EmojiCompat.isConfigured()) {
            this.f176a.mo168c(z);
        }
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: d */
    public final void mo169d(boolean z) {
        boolean zIsConfigured = EmojiCompat.isConfigured();
        C7260zN c7260zN = this.f176a;
        if (zIsConfigured) {
            c7260zN.mo169d(z);
        } else {
            c7260zN.f46808c = z;
        }
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: e */
    public final TransformationMethod mo170e(TransformationMethod transformationMethod) {
        return !EmojiCompat.isConfigured() ? transformationMethod : this.f176a.mo170e(transformationMethod);
    }
}
