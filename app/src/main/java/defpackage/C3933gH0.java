package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import java.util.Map;

/* renamed from: gH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3933gH0 extends ActionMode.Callback2 {
    public final /* synthetic */ ActionMode.Callback a;
    public final /* synthetic */ C4315iH0 b;

    public C3933gH0(C4315iH0 c4315iH0, ActionMode.Callback callback) {
        this.b = c4315iH0;
        this.a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.b.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C3742fH0(this, menuItem, Arguments.createMap(), actionMode));
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        int i = 0;
        while (true) {
            C4315iH0 c4315iH0 = this.b;
            if (i >= c4315iH0.n.size()) {
                return true;
            }
            menu.add(0, i, i, (CharSequence) ((Map) c4315iH0.n.get(i)).get("label"));
            i++;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        ActionMode.Callback callback = this.a;
        if (callback instanceof ActionMode.Callback2) {
            ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
        } else {
            super.onGetContentRect(actionMode, view, rect);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
