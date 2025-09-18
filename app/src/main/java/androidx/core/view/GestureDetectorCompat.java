package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

@Deprecated
/* loaded from: classes.dex */
public final class GestureDetectorCompat {

    /* renamed from: a */
    public final GestureDetector f16109a;

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f16109a = new GestureDetector(context, onGestureListener, handler);
    }
}
