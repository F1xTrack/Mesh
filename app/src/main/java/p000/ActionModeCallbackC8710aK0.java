package p000;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: aK0 */
/* loaded from: classes.dex */
public final class ActionModeCallbackC8710aK0 implements ActionMode.Callback {

    /* renamed from: a */
    public final /* synthetic */ C9099dK0 f15464a;

    public ActionModeCallbackC8710aK0(C9099dK0 c9099dK0) {
        this.f15464a = c9099dK0;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (this.f15464a.f25948F) {
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
