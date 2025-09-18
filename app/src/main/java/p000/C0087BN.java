package p000;

import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* renamed from: BN */
/* loaded from: classes.dex */
public final class C0087BN extends EmojiCompat.InitCallback {

    /* renamed from: a */
    public final WeakReference f773a;

    public C0087BN(EditText editText) {
        this.f773a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onInitialized() {
        super.onInitialized();
        C0150CN.m1158a((EditText) this.f773a.get(), 1);
    }
}
