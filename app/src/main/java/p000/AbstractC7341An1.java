package p000;

import android.view.WindowInsets;
import java.util.List;

/* renamed from: An1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7341An1 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    WindowInsets mDispachedInsets;
    private final int mDispatchMode;

    public AbstractC7341An1(int i) {
        this.mDispatchMode = i;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public abstract void onEnd(C7705Hn1 c7705Hn1);

    public abstract C8433Vn1 onProgress(C8433Vn1 c8433Vn1, List list);

    public abstract C11970zn1 onStart(C7705Hn1 c7705Hn1, C11970zn1 c11970zn1);

    public void onPrepare(C7705Hn1 c7705Hn1) {
    }
}
