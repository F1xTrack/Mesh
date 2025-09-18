package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader b;

    public /* synthetic */ c(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i) {
        this.a = i;
        this.b = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.createMetadata();
                break;
            default:
                this.b.loadInternal();
                break;
        }
    }
}
