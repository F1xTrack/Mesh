package p000;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: sn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11078sn1 {
    /* renamed from: a */
    public static boolean m24790a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* renamed from: b */
    public static ActionMode m24791b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
