package defpackage;

import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class BN extends EmojiCompat.InitCallback {
    public final WeakReference a;

    public BN(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onInitialized() {
        super.onInitialized();
        CN.a((EditText) this.a.get(), 1);
    }
}
