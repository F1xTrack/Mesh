package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1715c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16144a;

    /* renamed from: b */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f16145b;

    public /* synthetic */ RunnableC1715c(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i) {
        this.f16144a = i;
        this.f16145b = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16144a) {
            case 0:
                this.f16145b.createMetadata();
                break;
            default:
                this.f16145b.loadInternal();
                break;
        }
    }
}
