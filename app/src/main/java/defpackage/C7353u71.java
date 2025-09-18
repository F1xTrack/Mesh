package defpackage;

import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* renamed from: u71 */
/* loaded from: classes.dex */
public final class C7353u71 extends EmojiCompat.InitCallback {
    public final WeakReference a;

    public C7353u71(AbstractC7544v71 abstractC7544v71) {
        this.a = new WeakReference(abstractC7544v71);
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onFailed(Throwable th) {
        AbstractC7544v71 abstractC7544v71 = (AbstractC7544v71) this.a.get();
        if (abstractC7544v71 != null) {
            abstractC7544v71.c();
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onInitialized() {
        AbstractC7544v71 abstractC7544v71 = (AbstractC7544v71) this.a.get();
        if (abstractC7544v71 != null) {
            abstractC7544v71.c();
        }
    }
}
