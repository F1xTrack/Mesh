package defpackage;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: aK0 */
/* loaded from: classes.dex */
public final class ActionModeCallbackC2113aK0 implements ActionMode.Callback {
    public final /* synthetic */ C3370dK0 a;

    public ActionModeCallbackC2113aK0(C3370dK0 c3370dK0) {
        this.a = c3370dK0;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (this.a.F) {
            return false;
        }
        menu.removeItem(R.id.pasteAsPlainText);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
