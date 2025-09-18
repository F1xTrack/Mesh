package defpackage;

import android.view.WindowInsets;
import java.util.List;

/* renamed from: An1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0061An1 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    WindowInsets mDispachedInsets;
    private final int mDispatchMode;

    public AbstractC0061An1(int i) {
        this.mDispatchMode = i;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public abstract void onEnd(C0607Hn1 c0607Hn1);

    public abstract C1698Vn1 onProgress(C1698Vn1 c1698Vn1, List list);

    public abstract C8430zn1 onStart(C0607Hn1 c0607Hn1, C8430zn1 c8430zn1);

    public void onPrepare(C0607Hn1 c0607Hn1) {
    }
}
