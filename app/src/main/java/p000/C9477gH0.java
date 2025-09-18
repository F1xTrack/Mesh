package p000;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import java.util.Map;

/* renamed from: gH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9477gH0 extends ActionMode.Callback2 {

    /* renamed from: a */
    public final /* synthetic */ ActionMode.Callback f27661a;

    /* renamed from: b */
    public final /* synthetic */ C9733iH0 f27662b;

    public C9477gH0(C9733iH0 c9733iH0, ActionMode.Callback callback) {
        this.f27662b = c9733iH0;
        this.f27661a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f27662b.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C9349fH0(this, menuItem, Arguments.createMap(), actionMode));
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        int i = 0;
        while (true) {
            C9733iH0 c9733iH0 = this.f27662b;
            if (i >= c9733iH0.f29042n.size()) {
                return true;
            }
            menu.add(0, i, i, (CharSequence) ((Map) c9733iH0.f29042n.get(i)).get("label"));
            i++;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        ActionMode.Callback callback = this.f27661a;
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
