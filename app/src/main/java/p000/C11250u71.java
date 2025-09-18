package p000;

import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* renamed from: u71 */
/* loaded from: classes.dex */
public final class C11250u71 extends EmojiCompat.InitCallback {

    /* renamed from: a */
    public final WeakReference f43530a;

    public C11250u71(AbstractC11378v71 abstractC11378v71) {
        this.f43530a = new WeakReference(abstractC11378v71);
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onFailed(Throwable th) {
        AbstractC11378v71 abstractC11378v71 = (AbstractC11378v71) this.f43530a.get();
        if (abstractC11378v71 != null) {
            abstractC11378v71.m25367c();
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onInitialized() {
        AbstractC11378v71 abstractC11378v71 = (AbstractC11378v71) this.f43530a.get();
        if (abstractC11378v71 != null) {
            abstractC11378v71.m25367c();
        }
    }
}
